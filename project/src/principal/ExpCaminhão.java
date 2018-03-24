package principal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExpCaminhão 
{
	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static int[] pilha = new int[7];
	static int topo = -1, tamanho = pilha.length,pedido = 0;

	public static void main(String[] args)throws IOException
	{
		for(int i=0; i<7; i++)
		{
			System.out.println("Informe o pedido: ");
			pedido = Integer.parseInt(entrada.readLine());
			push(pedido);
		}
		
		listaEmbarque();
		listaDesembarque();

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
	
	public static void listaEmbarque()
	{
		for(int i=0; i<7; i++)
		{
			System.out.println("Lista de Embarque: " + pilha[i]);
		}
	}
	
	public static void listaDesembarque()
	{
		for(int i=6; i>=0; i--)
		{
			System.out.println("Lista de Desembarque: " + pilha[i]);
		}
	}

}
