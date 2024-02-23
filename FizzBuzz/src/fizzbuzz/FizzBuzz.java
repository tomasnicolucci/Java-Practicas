package fizzbuzz;

import java.util.Scanner;
import java.util.Arrays;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de números aleatorios a generar: ");
		int n = scanner.nextInt();
		Integer [] numeros = new Integer[n];
		
		for(int i=0; i<n; i++) {
			numeros[i] = (int)((Math.random() * n) + 1);
		}
		System.out.println("El array generado es: " + Arrays.toString(numeros));
		
		for(int numero : numeros) {
			String resultado = "";
			if((numero%3)==0) {
				resultado += "Fizz";
			}
			if((numero%5==0)) {
				resultado += "Buzz";
			}
			System.out.println(!resultado.isEmpty() ? resultado : numero);
		}
		scanner.close();
	}
}
