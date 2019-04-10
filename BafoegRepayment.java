public class BafoegRepayment {
	public static void main(String[] args) {
		final int a = Integer.parseInt(args[0]);
		final int b = Integer.parseInt(args[1]);
	
	int quarter = 0;
	int debt = a;

	while(debt>=b){
	debt -= b;
	quarter++;
	};

	int year = quarter/4;
	int restq = quarter % 4;

	System.out.println("angesammelte Schulden: " + a + " Euro");
	System.out.println("vierteljaehrlich zu zahlende Rate: " + b + " Euro");
	System.out.println("Anzahl Jahre fuer die Rueckzahlung: "+ year);
	System.out.println("verbleibende Vierteljahre: " + restq);
	System.out.println("Restbetrag: " + debt + " Euro");
	}
}
