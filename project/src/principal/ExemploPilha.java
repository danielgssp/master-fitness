package principal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExemploPilha 
{
	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static int[] pilha = new int[6];
	static int topo = -1, tamanho = pilha.length,valor = 0;
	
	public static void main(String[] args)throws IOException
	{
		tamanho = pilha.length;
		
			do
			{
			System.out.println("Digite um valor inteiro: ");
			valor = Integer.parseInt(entrada.readLine());
			if (push(valor) == -1) 
			{
				System.out.println("Pilha Cheia");
			}
		
			else
			{
				System.out.println("Acabo de Adicionar o valor:"+pilha[topo]);
			}
			}while(valor!=0);
		
		
		for (int x = 0; x <6; x ++) 
		{
			if (pop() == -1)
			{
				System.out.println("Pilha Vazia");
			}
			
			else
			{
				System.out.println("Desempilhei " + pilha[x]);
			}
		}

	}
	
	public static int push(int valor) 
	{
		if( topo == (tamanho - 1)) 
		{
		return -1;
		}
		
		else
		{
		topo ++;
		pilha[topo] = valor;
		return 0;
		}
	}
	
	public static int pop() 
	{
		if( topo == -1) 
		{
		return -1;
		}
		
		else{
		topo --;
		return pilha[topo + 1];
		}
	}


}
