public class Formulas2 {
	public static void main(String[] args) {
		double a = 25.5;
		double b = 50.67;
		double c = 2.0;
		double d = 10.5;
		double e = -2.5;
		double f = 13.6;
		double g = 2.2;
		double h = Math.PI;
		
		// Formula 1
		
		double arrel = Math.sqrt(a);
		double potb = Math.pow(b, 4.0);
		double potc = Math.pow(c, 3.0);
		double formula1 = arrel*((potb-potc)/2*d);
		
		// Formula 2
		
		double pote = Math.pow(e, 2.0);
		double potf = Math.pow(f, 3.0);
		double arrelg = Math.sqrt(g);
		double formula2 = ((3*pote)-potf) / h*arrelg;
		
		System.out.println("Formula 1 = " + formula1);
		System.out.println("Formula 2 = " + formula2);
	}
}