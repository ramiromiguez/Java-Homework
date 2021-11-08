package gymAdministrator.data;

import java.util.List;

public class Gym {
	
	private List<Client> clients;
	private List<Instructor> instructors;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	public Gym(List<Instructor> instructors, List<Client> clients) {
		this.clients = clients;
		this.instructors = instructors;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}
	
	public List<Instructor> getInstructors(){
		return instructors;
	}
	
	public void addInstructor(Instructor instructor) {
		instructors.add(instructor);
	}
	
	public List<Client> getCliens(){
		return clients;
	}
	
	public void addClients(Client client) {
		clients.add(client);
	}
	
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	public static void updateTOtalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}
	
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent;
		totalMoneySpent += moneySpent;
	}
}
