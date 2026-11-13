package com.learning.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.learning.model.Employee;

public class TreeMapDemo {

	public static void printMap() {
		Map<Integer, String> tm = new TreeMap<>();
		tm.put(4, "D");
		tm.put(2, "E");
		tm.put(1, "C");
		tm.put(3, "B");
		tm.put(5, "A");

		System.out.println(tm);
	}

	public static void printMapWithComparator() {
		Comparator<Integer> comp = (o1, o2) -> o2.compareTo(o1);
		Map<Integer, String> tm = new TreeMap<>(comp);
		tm.put(4, "D");
		tm.put(2, "E");
		tm.put(1, "C");
		tm.put(3, "B");
		tm.put(5, "A");

		System.out.println(tm);
	}

	public static void printMapWithEmployeeComparator(Comparator<Employee> employeeComparator) {
		Map<Employee, String> tm = new TreeMap<>(employeeComparator);
		Employee e1 = new Employee(3, "Babli", 200d);
		Employee e2 = new Employee(1, "Celina", 300d);
		Employee e3 = new Employee(2, "Anant", 100d);

		tm.put(e1, "First");
		tm.put(e2, "Second");
		tm.put(e3, "Third");

		System.out.println(tm);
	}

	public static void useEmployeeComparators() {
		System.out.println("Age in Descending Order:");
		Comparator<Employee> empAgeDescendingComp = (e1, e2) -> e1.getAge() > e2.getAge() ? -1
				: e1.getAge() < e2.getAge() ? 1 : 0;
		
		printMapWithEmployeeComparator(empAgeDescendingComp);

		System.out.println("\nAge in Ascending Order:");
		Comparator<Employee> empAgeAscendingComp = (e1, e2) -> e1.getAge() > e2.getAge() ? 1
				: e1.getAge() < e2.getAge() ? -1 : 0;
		printMapWithEmployeeComparator(empAgeAscendingComp);

		System.out.println("\nName in Ascending Order:");
		Comparator<Employee> empNameAscendingComp = (e1, e2) -> e1.getName().compareTo(e2.getName());
		printMapWithEmployeeComparator(empNameAscendingComp);

		System.out.println("\nName in Descending Order:");
		Comparator<Employee> empNameDescendingComp = (e1, e2) -> e2.getName().compareTo(e1.getName());
		printMapWithEmployeeComparator(empNameDescendingComp);

		System.out.println("\nSalary in Descending Order:");
		Comparator<Employee> empSalaryDescendingComp = (e1, e2) -> e1.getSalary() > e2.getSalary() ? -1
				: e1.getSalary() < e2.getSalary() ? 1 : 0;
		printMapWithEmployeeComparator(empSalaryDescendingComp);

		System.out.println("\nSalary in Ascending Order:");
		Comparator<Employee> empSalaryAscendingComp = (e1, e2) -> e1.getSalary() > e2.getSalary() ? 1
				: e1.getSalary() < e2.getSalary() ? -1 : 0;
		printMapWithEmployeeComparator(empSalaryAscendingComp);
	}

	public static void main(String[] args) {
		// printMap();
		// printMapWithComparator();
		useEmployeeComparators();
	}

}
