package ru.itis;


public class Main {

    public static void main(String[] args) {

        String[] arrayA = new String[]{"ab", "afccfa", "dab", "fer", "poz", "yod", "zxc"};
        String[] arrayB = new String[]{"abcd", "dba", "edr", "hyt", "pt", "pzz", "zxc"};
        WordSet dictionaryA = WordSet.createList(arrayA);
        WordSet dictionaryB = WordSet.createList(arrayB);
        dictionaryA.removePalindrom();
        dictionaryA.insert("poz");
        WordSet[] sets = dictionaryA.vowelDivide();
        sets[0].print();
        sets[1].print();
        dictionaryB.delete("pzz");
        WordSet result = WordSet.merge(dictionaryA, dictionaryB);
        result = result.newWordSetByWordLength(3);
        result.outToFile("C:\\Users\\pc\\Desktop\\MASALIMOVA_11_702\\Semestrovka\\src\\ru\\itis\\file");

    }
}

