package com.io.comparatordemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.io.comparatordemo.Employee;

class Employee implements Comparator<Employee>{
   String name;
   String id;
  
   public Employee() {}
  
   public Employee(String name, String id) {
       this.name = name;
       this.id = id;
   }
  
//   @Override
//  public int compare(Employee obj1, Employee obj2) //sort Employee on basis of name(ascending order)
//   {
//      return obj1.name.compareTo(obj2.name);
//  }
//   
   
   @Override
  public int compare(Employee obj1, Employee obj2) // sort Employee on basis of name(descending order)
  {
      return obj2.name.compareTo(obj1.name);
   }

  
   @Override
   public String toString() {
       return"Employee{" + "name=" + name + ", id=" + id  + '}';
   }
  
  
}

public class ComparatorUsageExample 
 {
   public static void main(String[] args) {
       Employee emp1=new Employee("sam","4");
       Employee emp2=new Employee("amy","2");
       Employee emp3=new Employee("brad","1");

       ArrayList<Employee> list=new ArrayList<Employee>();
       list.add(emp1);
       list.add(emp2);
       list.add(emp3);
     
       System.out.println("list Before sorting : \n"+list);
       Collections.sort(list,new Employee());
      // System.out.println("\nlist after sorting on basis of name(Ascending order) : \n"+list);
       System.out.println("\nlist after sorting on basis of name(Descending order) : \n"+list);
   }
}
