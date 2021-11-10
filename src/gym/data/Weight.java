package gym.data;

public class Weight {
	private static int fiveKgQuantity = 20;
	private static int tenKgQuantity = 20;
	private static int fifteenKgQuantity = 20;
	private static int twentyKgQuantity = 20;
	private static int quantity;
	
	public Weight() {
	}

	public static int getFiveKgQuantity() {
		return fiveKgQuantity;
	}

	public static void setFiveKgQuantity(int fiveKgQuantity) {
		Weight.fiveKgQuantity = fiveKgQuantity;
	}

	public static int getTenKgQuantity() {
		return tenKgQuantity;
	}

	public static void setTenKgQuantity(int tenKg) {
		Weight.tenKgQuantity = tenKg;
	}

	public static int getFifteenKgQuantity() {
		return fifteenKgQuantity;
	}

	public static void setFifteenKgQuantity(int fifteenKg) {
		Weight.fifteenKgQuantity = fifteenKg;
	}

	public static int getTwentyKgQuantity() {
		return twentyKgQuantity;
	}

	public static void setTwentyKgQuantity(int twentyKg) {
		Weight.twentyKgQuantity = twentyKg;
	}

	public static int getQuantity() {
		return quantity;
	}

	public static void setQuantity(int quantity) {
		Weight.quantity = quantity;
	}

	public static void pick5kg(int quantity) {
		if (Weight.fiveKgQuantity >= quantity) {
			Weight.setFiveKgQuantity(Weight.fifteenKgQuantity - quantity);
			System.out.println("You have just picked " + quantity + "plates of 5 kg");
			return;
		}
		if (Weight.fiveKgQuantity < quantity) {
			System.out.println("The weight is not available for the moment, sorry :(");
		}
	}

	public static void leave5kg(int quantity) {
		Weight.setFiveKgQuantity(quantity + Weight.getFiveKgQuantity());
	}

	public static void pick10kg(int tenKg) {
	}
}