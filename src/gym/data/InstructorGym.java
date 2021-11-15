package gym.data;

import exceptionContainer.ReceiveSalaryException;

public class InstructorGym extends Instructor {
	public InstructorGym(int id, String name, int salary) {
		super(id, name, salary);
	}

	@Override
	public final void receiveSalary() {
		salaryEarned =+ getSalary();
		try{
			if(Gym.getTotalMoneyEarned() < salary) {
				Gym.updateTotalMoneySpent(getSalary());
			}
			else{
				throw new ReceiveSalaryException();
			}
		}
		catch(ReceiveSalaryException e){
			e.getMessage();
		}
	}

}
