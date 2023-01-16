package com.practice;

//if we want to perform natural single sorting then we will go for Comparable interface (compareTo ())
//if we want to perform sorting with multiple attribute then we will go for Comparator interface(compare ())

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	

	@Override
	public int compareTo(Employee o) {
		
		return this.id-o.getId();
	}

}
