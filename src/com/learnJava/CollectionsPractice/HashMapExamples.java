package com.learnJava.CollectionsPractice;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapExamples {
    public static void main(String[] args) {


        HashMap<String, Cricketer> map = new HashMap();

        map.put("Sachin", new Cricketer("Sachin", 100));
        map.put("Gill", new Cricketer("Gill", 80));
        map.put("Muraleedaran", new Cricketer("Muraleedaran", 70));
        map.put("Morkel", new Cricketer("Morkel", 50));
        map.put("Pollard", new Cricketer("Pollard", 200));


        System.out.println(map.get("Sachin"));
        System.out.println(map.get("Virat"));
        map.containsKey("Morkel");
        System.out.println(map); // hash does not guarantee order

        TreeMap<Integer, Cricketer> treeMap = new TreeMap<>();
        treeMap.put(100, new Cricketer("Sachin", 100));
        treeMap.put(80, new Cricketer("Gill", 80));
        treeMap.put(70, new Cricketer("Muraleedaran", 70));
        treeMap.put(50, new Cricketer("Morkel", 50));
        treeMap.put(200, new Cricketer("Pollard", 200));

        System.out.println(treeMap.lowerEntry(100));
        System.out.println(treeMap.lowerKey(100)); // find the highest key lower than 100
        System.out.println(treeMap.higherKey(70));// find the lowest key higher than 70
        System.out.println(treeMap);
    }
}
