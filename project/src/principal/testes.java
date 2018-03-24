package principal;
import java.util.Scanner;
public class testes 
{	 static  String nome, msg;
	 static  Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) 
	{	 
		 System.out.print("Digite seu nome..: ");
		 nome = entrada.next();
		 System.out.println(msgNome(nome));
		 
	}
	
	public static String msgNome(String nome)
	{
		msg = nome + " Seja bem-vindo, logado com sucesso!";
		return msg;
	}	
}
