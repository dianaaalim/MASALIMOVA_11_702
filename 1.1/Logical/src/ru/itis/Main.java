package ru.itis;

public class Main {

    public static void main(String[] args) {
        Byte byteObject = new Byte();
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        byte p = 1;
        byte q = 1;

        byteObject.zeroOne(p, q);

        p = 1;
        q = 0;

        byteObject.zeroOne(p, q);

        p = 0;
        q = 1;

        byteObject.zeroOne(p, q);

        p = 0;
        q = 0;

        byteObject.zeroOne(p, q);
    }
}
