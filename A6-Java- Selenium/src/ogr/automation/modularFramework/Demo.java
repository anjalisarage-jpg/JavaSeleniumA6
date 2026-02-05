package ogr.automation.modularFramework;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		
		Random random = new Random();
		int rn = random.nextInt(1000, 9999); // uses origin 
		System.out.println(rn);
	}
	

}
