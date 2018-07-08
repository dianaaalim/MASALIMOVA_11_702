package ru.itis.Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        ComparatorForNumbers comparator = new ComparatorForNumbers();
        list.add("123");
        list.add("121212");
        list.add("123456");
        list.add("6666");
        list.add("12344556807643");
        list.sort(comparator);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
