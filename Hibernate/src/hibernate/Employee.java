package hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Employee {

	@Id
	private int Id;
	private String name;
	private int salary;
	
	
	/**
	 * No argument constructor
	 */
	public Employee() {
	}


	/**
	 * @param name
	 * @param salary
	 */
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}


	/**
	 * @return the Id
	 */
	public int getId() {
		return Id;
	}


	/**
	 * @param memberId the memberId to set
	 */
	public void setId(int Id) {
		this.Id = Id;
	}


	/**
	 * @return the Name
	 */
	public String getname() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setname(String name) {
		this.name = name;
	}


	/**
	 * @return the salary
	 */
	public int getsalary() {
		return salary;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.name = lastName;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [Id=" + name + ", name=" + name
				+ ", salary=" + salary + "]";
	}
	
	
}