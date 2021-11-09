package gym.runner;

import java.util.ArrayList;
import java.util.List;

import gym.data.Client;
import gym.data.ClientYoga;
import gym.data.Gym;
import gym.data.Instructor;
import gym.data.InstructorGym;
import gym.data.InstructorYoga;

public class Runner {
	public static void main(String[] args) {
		ClientYoga ramiro = new ClientYoga(1, "Ramiro");
		Client manuel = new ClientYoga(2, "Manuel");
		
		List<Client> clientsList = new ArrayList<>();
		clientsList.add(ramiro);
		clientsList.add(manuel);
		
		InstructorYoga sergei = new InstructorYoga(1, "Sergei",200, clientsList);
		InstructorGym axel = new InstructorGym(2, "Axel", 800);
		
		List<Instructor> instructorsList = new ArrayList<>();
		instructorsList.add(sergei);
		instructorsList.add(axel);
		
		
		Gym adrenaline = new Gym(instructorsList, clientsList);
		
		ramiro.payFees(200);
		manuel.payFees(200);
		System.out.println("ramiro paid: "+ramiro.getFeesPaid());
		System.out.println("ramiro paid: "+manuel.getFeesPaid());
		System.out.println("The gym earned: "+adrenaline.getTotalMoneyEarned());
		sergei.receiveSalary();
		System.out.println("Sergei earned: $"+sergei.getSalaryEarned()); 
		System.out.println("Adrenaline gym has spent: " + adrenaline.getTotalMoneySpent());
		System.out.println("Adrenaline gym total money is: $"+adrenaline.getTotalMoneyEarned());
		

		System.out.println(ramiro);
		System.out.println(manuel);
		System.out.println(sergei);
		System.out.println(ramiro.equals(manuel));
		System.out.println(ramiro.hashCode());
	}
}