package com.io.concurrenthashmapdemo;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	
	    public static void main(String[] args) 
	    { 
	        ConcurrentHashMap<Integer,String> m = new ConcurrentHashMap<>(); 
	        m.put(100, "Source"); 
	        m.put(101, "Edit"); 
	        m.put(102, "Ok"); 
	        
	        System.out.println(m);
	        System.out.println(m.size());
	  
	        m.remove(102, "Ok"); 
	  	
	        m.putIfAbsent(101, "Hello"); 
	  
	        m.putIfAbsent(103, "Good"); 
	  
	        System.out.println(m); 
	    } 
	    
} 

