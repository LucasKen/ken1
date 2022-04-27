package exercicio1;

import java.util.Scanner;

import filas.FilaInt;

public class Exer {

	public static void main(String[] args) {
		
		FilaInt  fila = new FilaInt();
		fila.init();
		
		Scanner le = new Scanner(System.in);
		int valor;
		System.out.println("Informe valor inteiro positivo para enfileirar ou" + "negativo para encerrar");
		valor = le.nextInt();
		while (valor >= 0) {
			/* insere valor na fila */
			fila.enqueue(valor);
			System.out.println("Informe valor inteiro positivo para enfileirar ou" + "negativo para encerrar");
			valor = le.nextInt();
		}
		while (!fila.isEmpty())
			System.out.println("Valor retirado: " + fila.dequeue());
		le.close();

	}

}