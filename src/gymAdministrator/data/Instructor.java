package gymAdministrator.data;

import java.util.Objects;

public class Instructor {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	public Instructor(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalaryEarned() {
		return salaryEarned;
	}
	
	public void receiveSalary(int salary) {
		salaryEarned =+ salary;
		Gym.updateTotalMoneySpent(salary);;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", salary=" + salary + ", salaryEarned=" + salaryEarned
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary, salaryEarned);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instructor other = (Instructor) obj;
		return id == other.id && Objects.equals(name, other.name) && salary == other.salary
				&& salaryEarned == other.salaryEarned;
	}
	
	
 }