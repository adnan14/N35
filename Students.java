import java.util.Random;


public class Students {

	private String[] names = new String[] {
			"Sanela",
			"Jesenko",
			"Selma",
			"Nermin",
			"Vedad",
			"Selma",
			"Haris"
	};
	
	public String getRandomStudent() {
		Random r = new Random();
		return names[r.nextInt(names.length)];
	}

}
