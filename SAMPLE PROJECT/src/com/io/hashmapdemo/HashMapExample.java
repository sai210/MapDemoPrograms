package com.io.hashmapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample
{
    public static void main(String [] args)
    {
        Map<Integer, String> map = new HashMap<Integer, String>();
        //Adding elements to HashMap
        map.put(11, "AB");
        map.put(2, "CD");
        map.put(33, "EF");
        map.put(9, "GH");
        map.put(3, "IJ");

        System.out.println(map);
        System.out.println(map.size());

        System.out.println("After Iteration");
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
             Map.Entry me = (Map.Entry) iterator.next();
          
        System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        } 
    }
}