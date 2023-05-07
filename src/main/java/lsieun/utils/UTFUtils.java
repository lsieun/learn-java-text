package lsieun.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class UTFUtils {
    public static String toModifiedUTF8(byte[] bytes) {
        int length = bytes.length;
        char[] chars = new char[length];
        int strLength = 0;
        for (int i = 0; i < length; ) {
            byte b = bytes[i++];
            if ((b & 0x80) == 0) {
                chars[strLength++] = (char) (b & 0x7F);
            }
            else if ((b & 0xE0) == 0xC0) {
                chars[strLength++] = (char) (((b & 0x1F) << 6) + (bytes[i++] & 0x3F));
            }
            else {
                chars[strLength++] = (char) (((b & 0xF) << 12) + ((bytes[i++] & 0x3F) << 6) + (bytes[i++] & 0x3F));
            }
        }
        return new String(chars, 0, strLength);
    }

    public static byte[] getModifiedBytes(String str) {
        try {
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            int charLength = str.length();
            for (int i = 0; i < charLength; ++i) {
                char charValue = str.charAt(i);
                if (charValue >= 0x0001 && charValue <= 0x007F) {
                    byte[] bytes = new byte[1];
                    bytes[0] = (byte) charValue;
                    bao.write(bytes);
                }
                else if (charValue <= 0x07FF) {
                    byte[] bytes = new byte[2];
                    bytes[0] = (byte) (0xC0 | charValue >> 6 & 0x1F);
                    bytes[1] = (byte) (0x80 | charValue & 0x3F);
                    bao.write(bytes);
                }
                else {
                    byte[] bytes = new byte[3];
                    bytes[0] = (byte) (0xE0 | charValue >> 12 & 0xF);
                    bytes[1] = (byte) (0x80 | charValue >> 6 & 0x3F);
                    bytes[2] = (byte) (0x80 | charValue & 0x3F);
                    bao.write(bytes);
                }
            }
            return bao.toByteArray();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String toStandardUTF8(byte[] bytes) {
        return new String(bytes, StandardCharsets.UTF_8);
    }

    public static byte[] getStandardBytes(String str) {
        if (str == null) return new byte[0];
        return str.getBytes(StandardCharsets.UTF_8);
    }
}
