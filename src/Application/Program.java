package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] vetor = new String[n];
		double[] vetor2 = new double[n];
		double[] vetor3 = new double[n];
		double[] vetor4 = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite o nome, primeira e segunda nota do aluno: ");
			vetor[i] = sc.nextLine();
			vetor2[i] = sc.nextDouble();
			vetor3[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma = vetor2[i] + vetor3[i];
			vetor4[i] = soma;
		}
		
		System.out.println();
		System.out.println("Alunos aprovados: ");
		
		double divisao;
		for (int i=0; i<n; i++) {
			divisao = vetor4[i]/2;
			if (divisao >= 6.0) {
				System.out.printf("%s%n", vetor[i]);
			}
		}
		
		
		
		
	}

}
