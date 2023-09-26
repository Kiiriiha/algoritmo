package BinariosRecursivo;

public class GeradorDeBinarios {

	public static void main(String[] args) {
		binario("", 3);

	}

	private static void binario(String s, int n) {
		if(n == 0) {
			System.out.println(s);
		} else {
				binario(s + "0", n-1);
				binario(s + "1", n-1);
			}
		}
		
	}


