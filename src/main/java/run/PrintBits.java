package run;

import lsieun.utils.BitUtils;

public class PrintBits {
    public static void main(String[] args) {
        System.out.println("E0: " + BitUtils.fromByte((byte)0xE0));
        System.out.println("C0: " + BitUtils.fromByte((byte)0xC0));
        System.out.println("80: " + BitUtils.fromByte((byte)0x80));
        System.out.println("7F: " + BitUtils.fromByte((byte)0x7F));
        System.out.println("3F: " + BitUtils.fromByte((byte)0x3F));
        System.out.println("1F: " + BitUtils.fromByte((byte)0x1F));
        System.out.println("0F: " + BitUtils.fromByte((byte)0x0F));
    }
}
