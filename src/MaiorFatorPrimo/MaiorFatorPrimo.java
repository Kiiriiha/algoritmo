package MaiorFatorPrimo;

import java.util.Scanner;

public class MaiorFatorPrimo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o numero: ");
		long n = teclado.nextInt();
		long r = maior_fator_primo(n);
		System.out.println(r);
	}

	private static long maior_fator_primo(long a) {

		long r = a;

		for (long i = 2; i < Math.sqrt(a); i++)
			if (a % i == 0)
				return maior_fator_primo(a / i);

		return r;
	}

}
