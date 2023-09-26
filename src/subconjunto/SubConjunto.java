package subconjunto;

public class SubConjunto {

	public static void main(String[] args) {
		subset("","abcd");

	}

	private static void subset(String s, String r) {
	if(r.equals(""))
		System.out.println(s);
	else {
		subset(s + r.charAt(0), r.substring(1)); //caracter
		subset(s, r.substring(1)); // s caracter
	}
	}

}
