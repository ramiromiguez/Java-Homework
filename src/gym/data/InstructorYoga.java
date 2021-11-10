package gym.data;

import java.util.ArrayList;
import java.util.List;

public class InstructorYoga extends Instructor implements IInstructorSalary{
	List<Client> clients = new ArrayList<>();
	public InstructorYoga(int id, String name, int salary, List<Client> clients) {
		super(id, name, salary);
		this.clients = clients;
	}

	@Override
	public void receiveSalary() {
		int length = clients.size();
		int total = length*getSalary();
		salaryEarned =+ total;
		Gym.updateTotalMoneySpent(total);
	}
	
}
