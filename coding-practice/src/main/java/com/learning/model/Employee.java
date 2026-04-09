package com.learning.model;

import java.util.List;

public class Employee {

	private int age;
	private String name;
	private double salary;

	public Employee() {
	}

	public Employee(int age, String name, double salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

	public static List<Employee> findEmployees() {
		Employee emp1 = new Employee(34, "Zakir", 45000d);
		Employee emp2 = new Employee(25, "Adam", 35000d);
		Employee emp3 = new Employee(45, "Celina", 70000d);

		return List.of(emp1, emp2, emp3);
	}

	public static void printEmployees() {
		System.out.println("-----------------printEmployees--------------------------------------------");
		System.out.println(findEmployees());
		System.out.println("-------------------------------------------------------------");
	}

}
