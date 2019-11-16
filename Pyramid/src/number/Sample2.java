package number;

/**
 * Simple Java program for Pyramid
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/
 
public class Sample2
{
	public static void main(String[] args) 
	{
		System.out.println("Pyramid from 5 to 1");
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}

	}

}
