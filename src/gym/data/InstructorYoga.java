package gym.data;

import java.util.ArrayList;
import java.util.List;

import exceptionContainer.ReceiveSalaryException;

public class InstructorYoga extends Instructor{
	List<Client> clients = new ArrayList<>();
	public InstructorYoga(int id, String name, int salary, List<Client> clients) {
		super(id, name, salary);
		this.clients = clients;
	}

	@Override
	public final void receiveSalary() {
		int length = clients.size();
		int total = length*getSalary();
		try {
			if(Gym.getTotalMoneyEarned() >= total) {
				salaryEarned =+ total;
				Gym.updateTotalMoneySpent(total);
			}
			else {
				throw new ReceiveSalaryException();
			}
		}
		catch(ReceiveSalaryException e){
			e.getMessage();
		}
		
	}
	
}
