import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		int n=Integer.parseInt(input.readLine());
		String[] array=input.readLine().split("");
		
		int min=0;
		int test=0;
		if(n==1||n==0)
		{
			min=0;
		}
		else
		{
			if(Math.abs(Integer.parseInt(array[0])-Integer.parseInt(array[1]))==0)
			{
				min=0;
			}
			else if(Math.abs(Integer.parseInt(array[0])-Integer.parseInt(array[1]))!=0)
			{
				min=Math.abs(Integer.parseInt(array[0])-Integer.parseInt(array[1]));
			}
			
			for(int i=0;i<=n-1;i++)
			{
				for(int j=i+1;j<=n-1;j++)
				{
					test=Math.abs(Integer.parseInt(array[i])-Integer.parseInt(array[j]));
					if(test<min)
					{
						min=test;
					}
				}
				
				for(int j=i-1;j>=0;j--)
				{
					if(i!=j)
					{
						test=Math.abs(Integer.parseInt(array[i])-Integer.parseInt(array[j]));
						if(test<min)
						{
							min=test;
						}
					}
				}
			}
		}
		
		System.out.println(min);
	}
}
