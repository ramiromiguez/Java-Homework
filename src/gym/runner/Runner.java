package gym.runner;

import java.util.ArrayList;
import java.util.List;

import gym.data.Client;
import gym.data.ClientYoga;
import gym.data.Gym;
import gym.data.Instructor;
import gym.data.InstructorGym;
import gym.data.InstructorYoga;
import gym.data.Weight;

public class Runner {
	public static void main(String[] args) {
		ClientYoga ramiro = new ClientYoga(1, "Ramiro");
		Client sergei = new ClientYoga(2, "Sergei");
		
		List<Client> clientsList = new ArrayList<>();
		clientsList.add(ramiro);
		clientsList.add(sergei);
		
		InstructorYoga manuel = new InstructorYoga(1, "manuel",100, clientsList);
		InstructorGym axel = new InstructorGym(2, "Axel", 800);
		
		List<Instructor> instructorsList = new ArrayList<>();
		instructorsList.add(manuel);
		instructorsList.add(axel);
		
		Gym adrenaline = new Gym(instructorsList, clientsList);
		
		ramiro.payFees(300);
		sergei.payFees(300);
		System.out.println("ramiro paid: "+ramiro.getFeesPaid());
		System.out.println("ramiro paid: "+sergei.getFeesPaid());
		System.out.println("The gym earned: "+adrenaline.getTotalMoneyEarned());
		manuel.receiveSalary();
		System.out.println("Sergei earned: $"+manuel.getSalaryEarned()); 
		System.out.println("Adrenaline gym has spent: " + adrenaline.getTotalMoneySpent());
		System.out.println("Adrenaline gym total money is: $"+adrenaline.getTotalMoneyEarned());
		Gym.updateTotalMoneySpent(50);
		System.out.println("Adrenaline buy a product for $50 now the total money is: $"+adrenaline.getTotalMoneyEarned());
		Weight.pick5kg(10);
		Weight.pick5kg(10);
		Weight.pick5kg(20);
		Weight.leave5kg(10);
		Weight.pick10kg(5);
	}
}