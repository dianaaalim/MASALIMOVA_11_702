package ru.itis.AscendingStrings;

//Создать программу, определяющую, есть ли в массиве String такая строка,
// в которой все символы упорядочены по возрастанию
public class HaveAscendingString {
    public boolean haveStr(String[] array) {
        boolean checker = false;
        for (int i = 0; i < array.length && !checker; i++) {
            boolean finish = false;
            for (int j = 0; j < array[i].length() - 1 && !finish; j++) {
                if (array[i].charAt(j) > array[i].charAt(j + 1)) {
                    finish = true;
                }
            }
            if (!finish) {
                checker = true;
            }
        }
        return checker;
    }
}
