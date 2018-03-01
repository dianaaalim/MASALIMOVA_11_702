package ru.itis.OOPrationalNums;

public class RationalNumber {
    private int numerator;
    private int detonator;  // am batman
    private int intPart;

    public RationalNumber(int intPart) {
        this.intPart = 0;
    }
    public RationalNumber(int numerator, int detonator, int intPart) {
        this(intPart);
        this.numerator = numerator;
        setDetonator(detonator);
    }

    public String makingGood(){   // я знаю, что надо right
        if(numerator >= detonator){
            intPart = numerator / detonator;
            numerator -= intPart * detonator;
            return intPart + "+" + numerator + "/" + detonator;
        } else {
            return "дробь уже правильная";
        }
    }

//    public String diff(int numer1, int denom1, int numer2, int denom2){
//        int denom;
//        int numer;
//        if (denom1 == denom2){
//            numer = numer1 - numer2;
//            denom = denom1;
//        } else {
//            denom = denom1*denom2;
//            numer = numer1*denom2 - numer2*denom1;
//        }   return numer + "/" + denom;
//    }

    public void setDetonator(int detonator) {
        if(detonator > 0) {
            this.detonator = detonator;
        }
    }
    public void setIntPart(int intPart) {
        if(getNumerator() < 0) {
            this.intPart = -1 * intPart;
            setNumerator(-1 * getNumerator());
        }
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }
    public int getDetonator() {
        return detonator;
    }
    public int getIntPart() {
        return intPart;
    }
}
