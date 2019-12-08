package menu;

import java.util.Scanner;

public class Menu {
	//method declared as static to be used in all methods
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// declaration of variable
		int opcao = 0;
		int digit;
        int calculated;
        String ean;
        String checkSum = "131313131313";
        int sum = 0;
		String codeBar, codigodeBarra;
		
		// loop where will stop when the value of the variable equals zero
		do {
			cleanScreen();
			System.out.println("-------------------------------");
			System.out.println("           VAREJO S/A ");
			System.out.println("    Código GTIN-13/upc/ean-13 ");
			System.out.println("-------------------------------");
			System.out.println("  1)Validar código GTIN-13 ");
			System.out.println("  2)Identificar País       ");
			System.out.println("  0)Sair                   ");
			System.out.println("-------------------------------");
			
			System.out.print("  Digite uma opção: ");
			opcao = leia.nextInt();

			System.out.print("\n");
			
			switch (opcao) {
			case 1:
				cleanScreen();
				System.out.println("-------------------------------");
				System.out.println("           VAREJO S/A ");
				System.out.println("    Código GTIN-13/upc/ean-13 ");
				System.out.println("-------------------------------");
				System.out.println("  VALIDAR CÓDIGO ");
				
				System.out.print("  Digite o código de 13 digitos: ");
				codeBar = leia.next();
				System.out.println("-------------------------------");
				
				if(codeBar.length() == 13) {
					digit = Integer.parseInt("" + codeBar.charAt(codeBar.length() - 1));            
		            ean = codeBar.substring(0, codeBar.length() - 1);            
		            for (int i = 0; i <= ean.length() - 1; i++) {
		                sum += (Integer.parseInt("" + ean.charAt(i))) * (Integer.parseInt("" + checkSum.charAt(i)));
		            }            
		            calculated = 10 - (sum % 10);
		            
		            if(calculated == digit) {
		            	System.out.println("  DIGITO VERIFICADOR: " + digit);
		            	System.out.println("  NÚMERO GTIN-13 VÁLIDO!");
		            	sum = 0;
		            	System.out.println("--------------------------------------");
						System.out.println("  Precione ENTER para continuar...");
						leia.nextLine();leia.nextLine();
		            }else {
		            	System.out.println("  DIGITO VERIFICADOR: " + calculated);
		            	System.out.println("  NÚMERO GTIN-13 INVÁLIDO!");
		            	sum = 0;
		            	System.out.println("--------------------------------------");
						System.out.println("  Precione ENTER para continuar...");
						leia.nextLine();leia.nextLine();
		            }
				}else {
					System.out.println("  Número GTIN-13 não possui 13 dígitos!");
					nextStep();
				}
				break;
			case 2:
				cleanScreen();
				System.out.println("-------------------------------");
				System.out.println("           VAREJO S/A ");
				System.out.println("    Código GTIN-13/upc/ean-13 ");
				System.out.println("-------------------------------");
				System.out.println("  IDENTIFICAR CÓDIGO ");
				
				System.out.print("  Digite o código de 13 digitos: ");
				codeBar = leia.next();
				
				if(codeBar.length() == 13) {
					codigodeBarra = codeBar.substring(0,3);
					
					switch (codigodeBarra) {
					case "789":
						System.out.println("  GTIN-13 origem Brasil");
						System.out.println("--------------------------------------");
						System.out.println("  Precione ENTER para continuar...");
						leia.nextLine();leia.nextLine();
						break;
					case "790":
						System.out.println("  GTIN-13 origem Brasil");
						nextStep();
						break;
					case "779":
						System.out.println("  GTIN-13 origem Argentina");
						nextStep();
						break;
					case "773":
						System.out.println("  GTIN-13 origem Uruguai");
						nextStep();
						break;
					case "780":
						System.out.println("  GTIN-13 origem Chile");
						nextStep();
						break;
					case "784":
						System.out.println("  GTIN-13 origem Paraguai");
						nextStep();
						break;
					case "786":
						System.out.println("  GTIN-13 origem Equador");
						nextStep();
						break;
					case "770":
						System.out.println("  GTIN-13 origem Côlombia");
						nextStep();
						break;
					case "743":
						System.out.println("  GTIN-13 origem Nicarágua");
						nextStep();
						break;
					case "600":
						System.out.println("  GTIN-13 origem África do Sul");
						nextStep();
						break;
					case "601":
						System.out.println("  GTIN-13 origem África do Sul");
						nextStep();
						break;
					default:
						System.out.println("VAREJOS S/A não vende para este país: " + codigodeBarra);
						nextStep();
					}
				}else {
					System.out.println("  Número GTIN-13 não possui 13 dígitos!");
					nextStep();
				}
				
				codigodeBarra = codeBar.substring(0,3);
				
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
	}
	
	// method to clean the screen
	public static void cleanScreen() { 
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); 
	}
	
	// method for further application
	public static void nextStep() {
		System.out.println("--------------------------------------");
		System.out.println("  Precione ENTER para continuar...");
		leia.nextLine();leia.nextLine();
	}

}

