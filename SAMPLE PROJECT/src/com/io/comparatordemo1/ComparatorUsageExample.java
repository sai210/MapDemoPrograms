package com.io.comparatordemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Employee{
   String name;
   String id;
  
   public Employee() {}
  
   public Employee(String name, String id) {
       this.name = name;
       this.id = id;
   }
  
  
   @Override
   public String toString() {
       return"Employee{" + "name=" + name + ", id=" + id  + '}';
   }
  
}
class ComparatorName implements Comparator<Employee>{
  @Override
   public int compare(Employee obj1, Employee obj2) {
      //sort Employee on basis of name(ascending order)
      //return obj1.name.compareTo(obj2.name);
      
    //sort Employee on basis of name(Descending order)
      return obj2.name.compareTo(obj1.name);
   }
  
}
class ComparatorId implements Comparator<Employee>{
  @Override
   public int compare(Employee obj1, Employee obj2) {
      //sort Employee on basis of id(ascending order)
      //return obj1.id.compareTo(obj2.id);
      
    //sort Employee on basis of id(Descending order)
      return obj2.id.compareTo(obj1.id);
   }
  
}
/**
* @author AnkitMittal
* Copyright (c), AnkitMittal JavaMadeSoEasy.com
* Main class
*/
public class ComparatorUsageExample {
   public static void main(String[] args) {
       Employee emp1=new Employee("sam","4");
       Employee emp2=new Employee("amy","2");
       Employee emp3=new Employee("brad","1");

       ArrayList<Employee> list=new ArrayList<Employee>();
       list.add(emp1);
       list.add(emp2);
       list.add(emp3);
     
       System.out.println("list Before sorting : \n"+list);
       Collections.sort(list,new ComparatorName());
       //System.out.println("\nlist after sorting on basis of name(ascending order) : \n"+list);
       System.out.println("\nlist after sorting on basis of name(Descending order) : \n"+list);
       
       Collections.sort(list,new ComparatorId());
       //System.out.println("\nlist after sorting on basis of id(ascending order) : \n"+list);
       System.out.println("\nlist after sorting on basis of id(Descending order) : \n"+list);
   }
}
