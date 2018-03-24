package principal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calcMetodo 
{
	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    static int opcao;
    static double num1, num2,result;
    
	public static void main(String[] args)throws IOException
	{
		System.out.print("Digite Primeiro número: ");
		num1 = Double.parseDouble(entrada.readLine());
		
		System.out.print("Digite Segundo número: ");
		num2 = Double.parseDouble(entrada.readLine());
		
		System.out.print("Digite a operação que deseja fazer 1[ + ] 2[ - ] 3[  /] 4[ * ]: ");
        opcao = Integer.parseInt(entrada.readLine());
        
        switch(opcao)
        {
        
        case 1:
        	System.out.println(somar(result));
        	break;
        case 2:
        	System.out.println(sub(result));
        	break;
        case 3:
        	System.out.println(div(result));
        	break;
        case 4:
        	System.out.println(mult(result));
        	break;
        	
        
        }
	}
	
	public static double somar(double result)
	{
		result = (num1 + num2);
		return result;
	}
	
	public static double sub(double result)
	{
		result = (num1 - num2);
		return result;
	}
	
	public static double div(double result)
	{
		result = (num1 / num2);
		return result;
	}
	
	public static double mult(double result)
	{
		result = (num1 * num2);
		return result;
	}

}
