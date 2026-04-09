package com.learning.collection;

import java.util.Comparator;
import java.util.List;

import com.learning.model.Employee;

/** ASC means ASCENDING ORDER and DESC means DESCENDING ORDER. */

public class ComparatorDemo {

	static List<Employee> employees = Employee.findEmployees();

	public static void sortByAge() {
		System.out.println("------------------------sortByAge (ASC)----------------------------------");
		Comparator<Employee> ageAsc = Comparator.comparing(Employee::getAge);

		employees.stream().sorted(ageAsc).forEach(System.out::println);

		System.out.println("\n------------------------sortByAge (DESC)----------------------------------");
		Comparator<Employee> ageDesc = Comparator.comparing(Employee::getAge).reversed();

		employees.stream().sorted(ageDesc).forEach(System.out::println);
		System.out.println("------------------------------------------------------------");
	}

	public static void sortByName() {
		System.out.println("------------------------sortByName (ASC)----------------------------------");
		Comparator<Employee> nameAsc = Comparator.comparing(Employee::getName);
		employees.stream().sorted(nameAsc).forEach(System.out::println);

		System.out.println("\n------------------------sortByName (DESC)----------------------------------");
		Comparator<Employee> nameDesc = Comparator.comparing(Employee::getName).reversed();
		employees.stream().sorted(nameDesc).forEach(System.out::println);
		System.out.println("------------------------------------------------------------");
	}

	public static void sortBySalary() {
		System.out.println("------------------------sortBySalary (ASC)----------------------------------");
		Comparator<Employee> salaryAsc = Comparator.comparing(Employee::getSalary);

		employees.stream().sorted(salaryAsc).forEach(System.out::println);

		System.out.println("\n------------------------sortBySalary (DESC)----------------------------------");
		Comparator<Employee> salaryDesc = Comparator.comparing(Employee::getSalary).reversed();

		employees.stream().sorted(salaryDesc).forEach(System.out::println);
		System.out.println("------------------------------------------------------------");
	}

	public static void main(String[] args) {
		Employee.printEmployees();
		sortByName();
		sortByAge();
		sortBySalary();
	}

}
