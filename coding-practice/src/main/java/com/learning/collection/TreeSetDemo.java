package com.learning.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.learning.model.Employee;

public class TreeSetDemo {

	public static void printTreeSet() {
		Set<Integer> ts = new TreeSet<>();
		ts.add(4);
		ts.add(2);
		ts.add(1);
		ts.add(3);
		ts.add(5);

		System.out.println(ts);
	}

	public static void printTreeSetWithComparator() {
		Comparator<Integer> descendingComp = (i1, i2) -> i2.compareTo(i1);

		Set<Integer> ts = new TreeSet<>(descendingComp);
		ts.add(4);
		ts.add(2);
		ts.add(1);
		ts.add(3);
		ts.add(5);

		System.out.println(ts);
	}

	public static void printTreeSetWithEmployeeComparator(Comparator<Employee> employeeComparator) {
		Set<Employee> ts = new TreeSet<>(employeeComparator);

		Employee e1 = new Employee(3, "Babli", 200d);
		Employee e2 = new Employee(1, "Celina", 300d);
		Employee e3 = new Employee(2, "Anant", 100d);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);

		System.out.println(ts);
	}

	public static void useEmployeeComparators() {
		System.out.println("Age in Descending Order:");
		Comparator<Employee> empAgeDescendingComp = (e1, e2) -> e1.getAge() > e2.getAge() ? -1
				: e1.getAge() < e2.getAge() ? 1 : 0;
		
		printTreeSetWithEmployeeComparator(empAgeDescendingComp);

		System.out.println("\nAge in Ascending Order:");
		Comparator<Employee> empAgeAscendingComp = (e1, e2) -> e1.getAge() > e2.getAge() ? 1
				: e1.getAge() < e2.getAge() ? -1 : 0;
		printTreeSetWithEmployeeComparator(empAgeAscendingComp);

		System.out.println("\nName in Ascending Order:");
		Comparator<Employee> empNameAscendingComp = (e1, e2) -> e1.getName().compareTo(e2.getName());
		printTreeSetWithEmployeeComparator(empNameAscendingComp);

		System.out.println("\nName in Descending Order:");
		Comparator<Employee> empNameDescendingComp = (e1, e2) -> e2.getName().compareTo(e1.getName());
		printTreeSetWithEmployeeComparator(empNameDescendingComp);

		System.out.println("\nSalary in Descending Order:");
		Comparator<Employee> empSalaryDescendingComp = (e1, e2) -> e1.getSalary() > e2.getSalary() ? -1
				: e1.getSalary() < e2.getSalary() ? 1 : 0;
		printTreeSetWithEmployeeComparator(empSalaryDescendingComp);

		System.out.println("\nSalary in Ascending Order:");
		Comparator<Employee> empSalaryAscendingComp = (e1, e2) -> e1.getSalary() > e2.getSalary() ? 1
				: e1.getSalary() < e2.getSalary() ? -1 : 0;
		printTreeSetWithEmployeeComparator(empSalaryAscendingComp);
	}
	
	public static void main(String[] args) {
		printTreeSet();
		printTreeSetWithComparator();
		useEmployeeComparators();
	}

}
