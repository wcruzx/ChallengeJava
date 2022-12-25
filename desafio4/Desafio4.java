package desafio4;

import java.util.Scanner;
	
	class Desafio4 {
		
		public static void main (String[] args) throws java.lang.Exception
		{
			Scanner leitor = new Scanner (System.in);
			String str = leitor.nextLine();
			int N = Integer.parseInt(str);
			char aux;
			
			for(int i = 0; i < N; i ++){
				
				String texto = leitor.nextLine();
				
				int met = texto.length();
				String [] correct = new String [met];
				
				int metade = (met/2); 
				
				for(int meta = 0; meta < metade; meta ++){
					aux = texto.charAt((metade-1)-meta);
					correct [meta] = ""+aux; 
				}
				int cont = 1;
				for(int meta = metade; meta < met; meta ++){
					aux = texto.charAt(met-cont);
					correct [meta] = ""+aux;
					cont ++;
				}
				for(int j = 0 ; j < met; j ++){
				System.out.print(correct[j]);
				}
				System.out.println("");
			}

	   }
	}