package desafio3;

import java.util.Scanner;

class Desafio3 {

	static int contarPares(int arr[], int n, int k)
		{
		int count = 0;
		
		for (int i = 0; i < n; i++)
					
		{
			for (int j = i + 1; j < n; j++)
				if (arr[i] - arr[j] == k ||
					arr[j] - arr[i] == k)
					count++;
		}
		return count;
	}

	public static void main(String args[])
	{
        Scanner leitor = new Scanner(System.in);
        
		int n = leitor.nextInt();
        int arr[] = new int[n];
		int k = leitor.nextInt();
		
		for (int i = 0; i < n; i++)
			
		{
			arr[i] = leitor.nextInt();    
        }
		
		System.out.println(contarPares(arr, n, k));
	}
}
