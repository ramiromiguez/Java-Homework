package gym.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import exceptionContainer.NameContainNumberException;
import exceptionContainer.NullNameException;
import gym.data.Client;
import gym.data.ClientGym;
import gym.data.ClientYoga;
import gym.data.Gym;
import gym.data.Instructor;
import gym.data.InstructorGym;
import gym.data.InstructorYoga;
import gym.data.WeightStorage;

public class Runner {
	public static void main(String[] args) throws NullNameException, NameContainNumberException {
		
		Logger LOG = Logger.getLogger(WeightStorage.class.getName());
		
		ClientYoga ramiro = new ClientYoga(1, "Ramiro");
		ClientYoga sergei = new ClientYoga(2, "Sergei");
		ClientGym nina = new ClientGym(1, "Nina");
		ClientGym teo = new ClientGym(2,"Teo");
		
		List<Client> clientsList = new ArrayList<>();
		clientsList.add(ramiro);
		clientsList.add(sergei);
		
		InstructorYoga manuel = new InstructorYoga(1, "manuel", 100, clientsList);
		InstructorGym axel = new InstructorGym(2, "Axel", 800);
		
		List<Instructor> instructorsList = new ArrayList<>();
		instructorsList.add(manuel);
		instructorsList.add(axel);
		
		Gym adrenaline = new Gym(instructorsList, clientsList);
		
		ramiro.payFees(300);
		sergei.payFees(300);
		LOG.log(Level.INFO,"ramiro paid: "+ramiro.getFeesPaid());
		LOG.log(Level.INFO,"ramiro paid: "+sergei.getFeesPaid());
		LOG.log(Level.INFO,"The gym earned: "+Gym.getTotalMoneyEarned());
		manuel.receiveSalary();
		LOG.log(Level.INFO,"Sergei earned: $"+manuel.getSalaryEarned()); 
		LOG.log(Level.INFO,"Adrenaline gym has spent: " + adrenaline.getTotalMoneySpent());
		LOG.log(Level.INFO,"Adrenaline gym total money is: $"+Gym.getTotalMoneyEarned());
		Gym.updateTotalMoneySpent(50);
		LOG.log(Level.INFO,"Adrenaline buy a product for $50 now the total money is: $"+Gym.getTotalMoneyEarned());
		nina.pick5kg(15);
		teo.pick5kg(6);
		nina.leave5kg(10);
		teo.pick5kg(6);
	}
}