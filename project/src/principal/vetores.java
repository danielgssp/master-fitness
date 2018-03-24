package principal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vetores
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int[] vetA = new int[5];
		int[] vetB = new int[5];
		int[] vetC = new int[10];
		for(int i =0; i<5; i++)
		{
			System.out.println("Digite valor para vetor A: ");
			vetA[i] = Integer.parseInt(entrada.readLine());
			
			System.out.println("Digite valor para vetor B: ");
			vetB[i] = Integer.parseInt(entrada.readLine());
		}
		
		for(int i =0; i<5; i++)
		{
			if(vetA[i] > 99)
			{
				vetC[i] = vetA[i];
			}
			
		}
		
		for(int x =0; x<5; x++)
		{
			if(vetB[x] > 99)
			{
				vetC[x] = vetB[x];
			}
		}
		
		for(int i =0; i<5; i++)
		{
			System.out.println("Vetor C:>>> " + vetC[i]);
		}

	}

}
