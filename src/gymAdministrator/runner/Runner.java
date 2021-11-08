package gymAdministrator.runner;


import java.util.ArrayList;
import java.util.List;

import gymAdministrator.*;
import gymAdministrator.data.Client;
import gymAdministrator.data.Gym;
import gymAdministrator.data.Instructor;

public class Runner {
	public static void main(String[] args) {
		Instructor sergei = new Instructor(1, "Sergei",1000);
		Instructor axel = new Instructor(2, "Axel", 800);
		
		List<Instructor> instructorsList = new ArrayList<>();
		instructorsList.add(sergei);
		instructorsList.add(axel);
		
		Client ramiro = new Client(1, "Ramiro");
		Client manuel = new Client(2, "Manuel");
		
		List<Client> clientsList = new ArrayList<>();
		clientsList.add(ramiro);
		clientsList.add(manuel);
		
		Gym adrenaline = new Gym(instructorsList, clientsList);
		ramiro.payFees(100);
		System.out.println(adrenaline.getTotalMoneyEarned());
		manuel.payFees(100);
		System.out.println(adrenaline.getTotalMoneyEarned());
		sergei.receiveSalary(100);
		System.out.println(sergei.getSalaryEarned());
		System.out.println("Adrenaline gym has spent: " + adrenaline.getTotalMoneySpent());
		
		System.out.println(ramiro);
		System.out.println(ramiro.equals(manuel));
		System.out.println(ramiro.hashCode());
	}
}