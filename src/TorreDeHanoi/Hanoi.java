package TorreDeHanoi;

public class Hanoi {
//M(n) = M(n-1) + 1 + M(n-1) = 2M(n-1) + 1
	public static void main(String[] args) {
		int discos = 4;
		//n 2^n - 1
		
		hanoi(discos, 'A', 'B', 'C');

	}

private static void hanoi(int discos, char origem, char auxiliar, char destino) {

	if (discos > 0) {
		hanoi(discos-1, origem, destino, auxiliar); //origem para o auxiliar (n-1 discos)
		
		    System.out.printf("Mover da %s para o %s\n", origem, destino); //movimento da origem para o destino
	    hanoi(discos-1, auxiliar, origem, destino); //auxiliar para o destino
		
}
}
}
