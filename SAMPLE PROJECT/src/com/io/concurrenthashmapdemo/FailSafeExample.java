package com.io.concurrenthashmapdemo;

import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample {
	 public static void main(String args[]){
	     
	    Map<Integer,String> map=new ConcurrentHashMap<Integer,String>();
	 
	    //maintains natural order of keys
	    map.put(100, "Source"); 
	    map.put(101, "Edit"); 
	    map.put(102, "Ok"); 
        
	    System.out.println(map);
	 
	    System.out.println("Iterate on keys, by obtaining iterator on keySet---");
	    Iterator<Integer> keyIterator=map.keySet().iterator();
	    while(keyIterator.hasNext()){
	    	   map.put(103, "value");
	           System.out.println(keyIterator.next());
	    }
//	    
	    
//	    System.out.println("Iterate on values, by obtaining iterator on keySet---");
//	    Iterator<String> valueIterator=map.values().iterator();
//	    while(valueIterator.hasNext()){
//	           System.out.println(valueIterator.next());
//	    }
//	 
//	 
//	    System.out.println("Iterate on entry, by obtaining iterator on entrySet---");
//	    Iterator<Map.Entry<Integer, String>> entryIterator=map.entrySet().iterator(); 
//	    while(entryIterator.hasNext()){
//	           System.out.println(entryIterator.next());
//	    }
	 } 
	 
}