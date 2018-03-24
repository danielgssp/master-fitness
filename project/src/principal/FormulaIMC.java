package principal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FormulaIMC 
{
	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	static float peso, altura, imc;
	public static void main(String[] args)throws IOException
	{
		System.out.println("Qual sua altura ? ");
		altura = Float.parseFloat(entrada.readLine());
		
		System.out.println("Qual seu peso ? ");
		peso = Float.parseFloat(entrada.readLine());
		
		System.out.println(IMC(imc));

	}
	
	public static float IMC(float imc)
	{
		imc = (peso/(altura*2));
		return imc;
	}
	
	
	
	

}
