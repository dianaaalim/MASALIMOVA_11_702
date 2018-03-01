package ru.itis.ParseDouble;

public class ParseDoubler {

    public String removeComma(String str) {
        StringBuilder result = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ',') continue;
            result.append(c);
        }
        return result.toString();
    }

}
