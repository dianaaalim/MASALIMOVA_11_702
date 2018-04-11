package ru.itis;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Marsel", 24);
        System.out.println(map.getValue("Marsel"));
        map.put("Diana", 18);
        System.out.println(map.getValue("Diana"));
        map.put("Maksim", 18);
        System.out.println(map.getValue("Maksim"));
        map.put("Maksim", 19);
        System.out.println(map.getValue("Maksim"));
        map.put("Irina", 17);
        System.out.println(map.getValue("Irina"));
        }
}
