package ru.itis.ParseDouble;

public class Main {
    public static void main(String[] args) {
        String str = "qwe,efwe,dfsw,qew,12s,scw13,3e21rc";
        ParseDoubler parseDoubler = new ParseDoubler();
        str = parseDoubler.removeComma(str);
        System.out.println(str);
    }
}
