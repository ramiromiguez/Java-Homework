package gym.data;

public class InstructorGym extends Instructor implements IInstructorSalary{
	public InstructorGym(int id, String name, int salary) {
		super(id, name, salary);
	}
	
	@Override
	public void receiveSalary() {
		salaryEarned =+ getSalary();
		Gym.updateTotalMoneySpent(getSalary());
	}
	
}
