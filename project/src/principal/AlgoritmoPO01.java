package principal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlgoritmoPO01 
{
	
	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static int[] codigos = new int[10];
	static int troca=1, auxiliar=0, chave, y;

	public static void main(String[] args) throws IOException
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Digite o código "+(i+1)+"º: ");
			chave = Integer.parseInt(entrada.readLine());
			
			for(int x = 0; x < 10; x++)
			{
				if(codigos[x] == chave)
				{
					System.out.println("Código já informado !");
					y = 0;
					break;
				}
				else
				{
					y++;
				}
			}
			if(y != 0 || i==0)
			{
				codigos[i] = chave;
			}
			else
			{
				i--;
			}
					
		}
		
		bubbleSort();
		
		//Listando os códigos em ordem crescente!
		for(int i=0; i<10; i++)
		{
			System.out.println("Código "+ (i+1)+"º: "+ codigos[i]);
		}

	}
	
	//Método de ordenação Bubble Sort!
	public static void bubbleSort()
	{	
	while (troca != 0) 
	{
		troca = 0;
		for (int x = 0; x<9; x++) 
		{
			if (codigos[x] > codigos[x + 1]) 
			{
				troca ++;
				auxiliar = codigos[x + 1];
				codigos[x + 1] = codigos[x];
				codigos[x] = auxiliar;
			}
		
		}
	}
	
	}

}
