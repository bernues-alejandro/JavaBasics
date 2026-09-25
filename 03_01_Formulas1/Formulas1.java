public class Formulas1 {
	public static void main(String[] args) {
		double a = 25.5;
		double b = 50.67;
		double c = 2.0;
		double d = 10.5;
		double e = -2.5;
		double f = 13.6;
		double h = Math.PI; 
		
		// Formula 1
		double arrel = Math.sqrt(a);
		double potencia = Math.pow(b,4.0);
		double formula1 = arrel + potencia/c;
		
		// Formula 2
		double potenciad = Math.pow(d,3.0);
		double potenciae = Math.pow(e,4.0);
		double multiplicacio = 2*h;
		double multup = potenciad - potenciae;
		double resta = f-h;
		double formula2 = multiplicacio * multup/resta;
		
		// Sortida
		System.out.println("Formula 1 = " + formula1);
		System.out.println("Formula 2 = " + formula2);
	}
}