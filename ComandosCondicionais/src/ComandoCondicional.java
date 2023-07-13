
public class ComandoCondicional {

	public static void main(String[] args) {
		// IF
		
		int num1 = 10, num2 = 30;
		if (num1 < num2) {
			System.out.println("if normal - Número 1 é menor que número 2");
		}
		
		if (num1 > num2) {
			System.out.println("if com else - N�mero 1 � maior que n�mero 2");			
		} else {
			System.out.println("if com else - N�mero 1 � menor que n�mero 2");
		}
		
		// condi��o composta - situa��o num1 < num2
		if (num1 > num2) {
			System.out.println("Condi��o composta 1 - N�mero 1 � maior que n�mero 2");	
		} else if (num1 < num2) {
			System.out.println("Condi��o composta 1 - N�mero 1 � menor que n�mero 2");	
		} else {
			System.out.println("Condi��o composta 1 - N�mero 1 � igual ao n�mero 2");
		}

		// condi��o composta - situa��o num1 = num2
		num1 = 10;
		num2 = 10;
		if (num1 > num2) {
			System.out.println("Condi��o composta 2 - N�mero 1 � maior que n�mero 2");	
		} else if (num1 < num2) {
			System.out.println("Condi��o composta 2 - N�mero 1 � menor que n�mero 2");	
		} else {
			System.out.println("Condi��o composta 2 - N�mero 1 � igual ao n�mero 2");
		}

		// comando condicional SWITCH

		char opcao = '4';

		switch (opcao) {
			case '1': {
				System.out.println("Chame programa de Inclus�o");
				break;
			}
			case '2': {
				System.out.println("Chame programa de Altera��o");
				break;
			}
			case '3': {
				System.out.println("Chame programa de Exclus�o");
				break;
			}
			case '4': {
				System.out.println("Chame programa de Consulta");
				break;
			}
		}
	}
}
