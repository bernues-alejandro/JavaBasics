import java.util.Scanner;

public class SplitElectricityBill {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		// Entrada
		
		System.out.println("Number of people:");
		int npeople = src.nextInt();
		
		System.out.println("Enter electricity consumption (kWh):");
		double elecons = src.nextDouble();
		
		System.out.println("Enter price per kWh (€):");
		double kwh = src.nextDouble();
		
		System.out.println("Enter fixed monthly charge (€):");
		double moncha = src.nextDouble();
		
		System.out.println("Enter tax (%):");
		double tax = src.nextDouble();
		
		// Calculs
		
		double encos = elecons*kwh;
		double subtotal = encos + moncha;
		double impostos = (subtotal*tax)/100;
		double costotal = subtotal + impostos;
		double quantitat = costotal/npeople;
		
		
		// Sortida
		
		System.out.printf("Energy cost = %.2f € %n" , encos);
		System.out.printf("Fixed charge = %.2f € %n" , moncha);
		System.out.printf("Subtotal = %.2f € %n" , subtotal);
		System.out.printf("Tax = %.2f € %n" , impostos);
		System.out.printf("Total = %.2f € %n" , costotal);	
		System.out.printf("Total per person = %.2f € %n" , quantitat);
	}
}