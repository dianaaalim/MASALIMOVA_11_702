package ru.itis;

import java.io.FileWriter;
import java.io.IOException;

public class WordSet {

    private class Word {
        String value;
        Word next;

        Word(String value) {
            this.value = value;
        }
    }

    //ссылка на первое слово
    private Word head;
    //ссылка на последнее слово
    private Word tail;
    //размер словаря(количество слов)
    private int count;

    public WordSet() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }


    //Вспомогательные методы

    public int size() {
        return count;
    }

    public void add(String element) {
        Word newWord = new Word(element);
        if (head == null) {
            head = newWord;
            tail = newWord;
        } else {
            tail.next = newWord;
            tail = newWord;
        }
        this.count++;
    }

    public String get(int index) {
        Word element = this.head;
        if (index >= 0 && index < count) {
            for (int i = 0; i < index; i++) {
                element = element.next;
            }
        } else {
            throw new IllegalArgumentException();
        }
        return element.value;
    }

    public void print() {
        Word word = this.head;
        while (word != this.tail) {
            System.out.print(word.value + " ");
            word = word.next;
        }
        System.out.println(word.value);
    }

    //Задания семестровки

    public static WordSet createList(String[] array) {
        WordSet words = new WordSet();
        for (int i = 0; i < array.length; i++) {
            words.add(array[i]);
        }
        return words;
    }

    //Слияние двух списков
    public static WordSet merge(WordSet sortedA, WordSet sortedB) {
        WordSet linkedList = new WordSet();
        Word wordA = sortedA.head;
        Word wordB = sortedB.head;
        int index = sortedA.size() + sortedB.size();
        while (wordA != null && wordB != null) {
            if ((wordA.value.compareTo(wordB.value)) < 0) {
                linkedList.add(wordA.value);
                wordA = wordA.next;
            } else {
                linkedList.add(wordB.value);
                wordB = wordB.next;
            }
            index--;
        }

        while (index > 0) {
            if (wordA == null) {
                linkedList.add(wordB.value);
                wordB = wordB.next;
            } else {
                linkedList.add(wordA.value);
                wordA = wordA.next;
            }
            index--;
        }

        return linkedList;
    }

    //Вывод списка слов в файл
    public void outToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename, false)) {
            Word current = head;
            while (current != null) {
                String word = current.value.toString();
                writer.write(word);
                writer.append(' ');
                current = current.next;
            }

        } catch (IOException ex) {
        }
    }

    //Вставка слова, если его нет в словаре
    public void insert(String word) {
        Word current = this.head;
        Word newWord = new Word(word);

        while (current.next.value.compareTo(word) < 0) {
            current = current.next;
        }
        if (current.next.value.compareTo(word) == 0) return;
        newWord.next = current.next;
        current.next = newWord;
    }

    //Удаление слова
    public void delete(String word) {
        Word previous = null;
        Word current = this.head;

        while (current != null) {
            if (current.value.equals(word)) {
                if (previous != null) {
                    previous.next = current.next;
                    if (current.next == null) {
                        this.tail = previous;
                    }

                } else {
                    this.head = this.head.next;
                    if (this.head == null) {
                        this.tail = null;
                    }
                }
                count--;
            }
            previous = current;
            current = current.next;

        }

    }

    //Составление списка слов определенной длины
    public WordSet newWordSetByWordLength(int length) {
        WordSet result = new WordSet();
        Word current = head;
        while (current != null) {
            String word = current.value.toString();
            if (word.length() == length) {
                result.add(word);
            }
            current = current.next;
        }
        return result;
    }

    //Составление двух списков, в одном слова н агласные, в другом на согласные
    public WordSet[] vowelDivide() {
        WordSet vowelsLetters = new WordSet();
        WordSet consonantsLetters = new WordSet();
        WordSet[] linksOfHead = new WordSet[2];
        Word word = this.head;
        String vowels = "aeiouy";
        while (word != null) {
            if (vowels.indexOf(word.value.charAt(0)) != -1) {
                vowelsLetters.add(word.value);
            } else {
                consonantsLetters.add(word.value);
            }
            word = word.next;
        }
        linksOfHead[0] = vowelsLetters;
        linksOfHead[1] = consonantsLetters;

        return linksOfHead;
    }

    //Удаление палиндрома
    public void removePalindrom() {
        Word current = this.head;
        Word previous = null;

        while (current != null) {
            char[] charArray = current.value.toCharArray();
            char[] newCharArray = new char[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                newCharArray[(charArray.length - 1) - i] = charArray[i];
            }
            String a = new String(charArray);
            String b = new String(newCharArray);
            if (a.equals(b)) {
                if (previous != null) {
                    previous.next = current.next;
                    if (current.next == null) {
                        this.tail = previous;
                    }
                } else {
                    this.head = this.head.next;
                    if (this.head == null) {
                        this.tail = null;
                    }
                }
                count--;
            }
            previous = current;
            current = current.next;
        }
    }
}
