package ru.itis;

public class Main {

    public static void main(String[] args) {
        HashMapImpl<String, Integer> map = new HashMapImpl<>();
        map.put("Marsel", 24);
        System.out.println(map.get("Marsel"));
        map.put("Diana", 18);
        System.out.println(map.get("Diana"));
        map.put("Maksim", 18);
        System.out.println(map.get("Maksim"));
        map.put("Maksim", 19);
        System.out.println(map.get("Maksim"));
    }
}
