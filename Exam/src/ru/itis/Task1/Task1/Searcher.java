package ru.itis.Task1.Task1;

public class Searcher {
    public String searcherLines(String array[]){
        String firstLine = "";
        String lastString = "";
        char firstLetter = 'z';
        char lastLetter = 'a';
        for (int i = 0 ; i < array.length; i++){
            for (int j = 0; j < array[i].length(); j++) {
                char c = array[i].charAt(1);
                if (c < firstLetter){
                    firstLetter = c;
                    firstLine = array[i];
                }
            }


        }
        return "Самая ранняя строка" + firstLine;
    }
}
