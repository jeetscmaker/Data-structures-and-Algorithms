package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Employee> l = new ArrayList<>();
		// find the name of second highest salary holder
		Employee e1 = new Employee("John", 3000);
		Employee e2 = new Employee("Sean", 4000);
		Employee e3 = new Employee("Palmer", 1000);
		Employee e4 = new Employee("Beiji", 9000);
		Employee e5 = new Employee("Alberto", 3000);
		Employee e6 = new Employee("Jones", 5000);

		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		List<Employee> list = l.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println(list);
		// Employee with highest salary, 1st approach
		System.out.println(list.get(0));
		// // Employee with highest salary, 2nd approach
		int k = 1;
		Optional<Employee> a = l.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.skip(k - 1).findFirst();
		System.out.println(a.get());
	}
}

class Employee {
	String name;
	int salary;

	public Employee() {
	}

	public Employee(String n, int sal) {
		name = n;
		salary = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " " + salary;
	}
}
