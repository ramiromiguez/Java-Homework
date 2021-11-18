package gym.data;

import exceptionContainer.ReceiveSalaryException;

public interface IInstructorSalary {
	void receiveSalary() throws ReceiveSalaryException;
}
