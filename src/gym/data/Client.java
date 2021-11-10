package gym.data;

import java.util.Objects;

public abstract class Client implements IClientInfo {
	private int id;
	private String name;
	private int feesPaid;
	
	public Client(int id, String name) {
		this.id = id;
		this.name = name;
		feesPaid = 0;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}
	
	public void payFees(int fees) {
		feesPaid += fees;
		Gym.updateTOtalMoneyEarned(feesPaid);
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", feesPaid=" + feesPaid + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(feesPaid, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return feesPaid == other.feesPaid && id == other.id && Objects.equals(name, other.name);
	}
	
	
}
