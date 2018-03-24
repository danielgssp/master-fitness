package principal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testesBuscas 
{
	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    static int[] vet = new int[5];
	public static void main(String[] args)throws IOException 
	{
		for(int i=0; i<5; i++)
		{
			System.out.print("vet: ");
			vet[i] = Integer.parseInt(entrada.readLine());
		}
		
		bubbleSort();
		buscaBinaria();
		listar();
	}
	
	public static void buscaBinaria()throws IOException
	{
		int comeco = 0;
		int meio = 0;
		int fim = 4;
		boolean achei = false;
		int chave;
		
		System.out.print("Chave: ");
		chave = Integer.parseInt(entrada.readLine());
		
		while((comeco <= fim) && (achei == false))
		{
			meio = (comeco + fim )/2;
			
			if(vet[meio] == chave)
			{
				achei = true;
			}
			else
			{
				if(vet[meio] > chave)
				{
					fim = meio -1;
				}
				else
				{
					comeco = meio +1;
				}
				
			}
		}
		if(achei == false)
		{
			System.out.println("Não achei!!");
		}
		else
		{
			System.out.println("Achei " + vet[meio]);
		}
	}
	
	public static void bubbleSort()
	{
		 int troca = 1;
		 int auxiliar = 0;
		 
		//Metodo de Ordenação BublleSort
		 while (troca != 0) 
		 {
			 troca = 0;
			 for (int x = 0; x<4; x++) 
			 {
				 if (vet[x] > vet[x + 1])
				 {
					 troca ++;
					 auxiliar = vet[x + 1];
					 vet[x + 1] = vet[x];
					 vet[x] = auxiliar;
				 }
			 }
		 }
	}
	
	public static void listar()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Lista: " + vet[i]);
		}
	}
}