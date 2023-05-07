package sample;

import lsieun.utils.BitUtils;
import lsieun.utils.HexUtils;
import lsieun.utils.UTFUtils;

public class HelloWorld {
    public static void main(String[] args) {
        String str = "\u0000";

        byte[] modified_bytes = UTFUtils.getModifiedBytes(str);
        System.out.println(modified_bytes.length);
        System.out.println(HexUtils.toHex(modified_bytes));
        for (byte b : modified_bytes) {
            System.out.println(BitUtils.fromByte(b));
        }

        byte[] standard_bytes = UTFUtils.getStandardBytes(str);
        System.out.println(standard_bytes.length);
        System.out.println(HexUtils.toHex(standard_bytes));
        for (byte b : standard_bytes) {
            System.out.println(BitUtils.fromByte(b));
        }
    }
}
