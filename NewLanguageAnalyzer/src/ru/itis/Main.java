package ru.itis;

public class Main {

    public static void main(String[] args) {
        String input = "X1:=128q;Y2:=13;Z1:=X1+Y2;";
        Analyzer analyzer = new Analyzer();
        analyzer.analyze(input);
    }
}
