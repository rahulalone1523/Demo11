package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DriverClass {
	public static void main(String[] args) {
		
		List<Employee>empList=new ArrayList<>();
		
//		Employee e1=new Employee("101", "Rahul", 15000,new Address("Pandurang wadi", 400063));
//		Employee e2=new Employee("105", "Sandy", 25770,new Address("Array milk Coloney", 400067));
//		Employee e3=new Employee("107", "Gauri", 54778,new Address("Malad East", 400066));
//		Employee e4=new Employee("109", "Gaurav", 65889,new Address("Andheri East", 400060));
//		Employee e5=new Employee("102", "Nyira", 47885,new Address("Kurla", 400064));
//		Employee e6=new Employee("110", "Prachitee", 32556,new Address("Dahisar", 400061));
		
		Employee e1=new Employee(101, "Rahul", 15000);
		Employee e2=new Employee(105, "Sandy", 25770);
		Employee e3=new Employee(107, "Gauri", 54778);
		Employee e4=new Employee(109, "Gaurav", 65889);
		Employee e5=new Employee(102, "Nyira", 47885);
		Employee e6=new Employee(110, "Prachitee", 32556);
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		System.out.println("By Using Comparable natural sorting order");
		Collections.sort(empList);
		System.out.println("Employee List :"+empList+ " Length of empList :"+empList.size());
		System.out.println("By Using Comparator Multiple sorting NameComparator");
		Collections.sort(empList, new NameComparator());
		System.out.println("Employee List :"+empList+ " Length of empList :"+empList.size());
		System.out.println("By Using Comparator Multiple sorting SalaryComparator");
		Collections.sort(empList, new SalaryComparator());
		System.out.println("Employee List :"+empList+ " Length of empList :"+empList.size());
		

	}
}
