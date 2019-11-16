package number;

/**
 * Simple Java program for Pyramid
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
public class Sample1
{
	public static void main(String[] args) 
	{
		System.out.println("Pyramid from 1 to 5");
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"");
			}
		System.out.println();
		}

	}

}
