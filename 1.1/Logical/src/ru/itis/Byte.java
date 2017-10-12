package ru.itis;

public class Byte {

    public void zeroOne(byte p, byte q) {
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");                  // "\t" - табуляция.
        System.out.print((p ^ q) + "\t");
        if (p == 1) {
            p = 0;
        } else {
            p = 1;
        }
        System.out.println(p);
    }
}
