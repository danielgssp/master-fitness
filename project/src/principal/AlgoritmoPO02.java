package principal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlgoritmoPO02 
{
	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static String[] pilha = new String[5];
	static int topo = -1, tamanho = 0;
	static String valor;
	
	public static void main(String[] args)throws IOException 
	{
		tamanho = pilha.length;
		for(int i=0; i<5; i++)
		{
			System.out.println("Informe Livro: ");
			valor = entrada.readLine();
			push(valor);
		}
		
		ordemEmbarqLivro();
		ordemDesmbqLivro();
	}
	
	//Método de (pilhar) push !
	public static int push(String valor) 
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
	
	//Método para listar ordem que foi digitado! 
	public static void ordemEmbarqLivro()
	{
		System.out.println("Ordem de Embarque dos Livros !");
		for(int i=0; i<5; i++)
		{
			System.out.println("Livros: " + pilha[i]);
		}
	}

	//Método para listar em ordem de (pilha) desempilhando
	public static void ordemDesmbqLivro()
	{
		System.out.println("Ordem de Desembarque dos Livros !");
		for(int i=4; i>=0; i--)
		{
			System.out.println("Livros: " + pilha[i]);
		}
	}

}
