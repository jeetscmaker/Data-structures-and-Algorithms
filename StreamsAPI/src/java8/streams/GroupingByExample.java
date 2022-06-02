package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Jitendra
 */
public class GroupingByExample {
	public static void main(String[] args) {
		Emp e1 = new Emp("A", "B", "CS");
		Emp e2 = new Emp("Ab", "Bb", "CS");
		Emp e3 = new Emp("Robert", "Beda", "CS");
		Emp e4 = new Emp("Jash", "Bos", "HR");
		Emp e5 = new Emp("John", "Rabada", "HR");
		Emp e6 = new Emp("Pist", "Duna", "HR");
		Emp e7 = new Emp("Sek", "Dan", "IT");
		Emp e8 = new Emp("Poly", "Dul", "IT");

		List<Emp> l = new ArrayList<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		l.add(e7);
		l.add(e8);
		Map<String, Integer> deptWiseEmpCount = new HashMap<String, Integer>();
		l.stream().collect(Collectors.groupingBy(Emp::getDept))
				.forEach((dept, employeeList) -> deptWiseEmpCount.put(dept, employeeList.size()));
		deptWiseEmpCount.forEach((dept, empCount) -> System.out.println(dept + " " + empCount));
	}
}

class Emp {
	private String fName;
	private String lName;
	private String dept;

	public Emp() {
	}

	public Emp(String f, String l, String d) {
		fName = f;
		lName = l;
		dept = d;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "[" + fName + " " + lName + ", " + dept + "]";
	}

}