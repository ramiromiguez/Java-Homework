package gym.data;


import exceptionContainer.ReceiveSalaryException;

public interface IInstructorInfo {
	public int getId();
	public void setId(int id);
	public String getName();
	public void setName(String name);
	public int getSalary();
	public void setSalary(int salary);
	public int getSalaryEarned();
	void receiveSalary() throws ReceiveSalaryException;
}
