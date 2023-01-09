package exercJava;

import java.util.Scanner;

public class CaracPsico {

	public static void main(String[] args) {
		
		int limite = 3,cont = 1;
		int idade,pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, nervosas40=0, calmas18=0;
		byte sexo,tipoHumor;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Pesquisa de características psicológicas");
		
		while (cont <= limite) {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			System.out.print("Escolha: [1] Feminino\t[2] Masculino\t[3] Outros \nSua opção: ");
			sexo = leia.nextByte();
			
			System.out.print("Digite para cada tipo de pessoa: \n\t[1] Calma \n\t[2] Nervosa \n\t[3] Agressiva \nSua opção: ");
			tipoHumor = leia.nextByte();

			if (tipoHumor == 1) {
				pessoasCalmas++;
			}
			if ((tipoHumor == 2) && (sexo == 1)) {
				mulheresNervosas++;
			}
			if ((tipoHumor == 3) && (sexo == 2)) {
				homensAgressivos++;
			}
			if ((tipoHumor == 1) && (sexo == 3)) {
				outrosCalmos++;
			}
			if ((tipoHumor == 2) && (idade > 40)) {
				nervosas40++;
			}
			if ((tipoHumor == 1) && (idade < 18)) {
				calmas18++;
			}
			cont++;
		}
		System.out.println("Total de pessoas calmas: "+pessoasCalmas);
		System.out.println("Total de mulheres nervosas: "+mulheresNervosas);
		System.out.println("Total de homens agressivos: "+homensAgressivos);
		System.out.println("Total de outros calmos: "+outrosCalmos);
		System.out.println("Total de pessoas nervosas com +40 anos: "+nervosas40);
		System.out.println("Total de pessoas calmas com -18 anos: "+calmas18);
		leia.close();
		}
	}