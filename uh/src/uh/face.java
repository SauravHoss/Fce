package uh;

public class face 
{
	public static void main(String[] args) 
	{
		
		int [][] x = new int [3][5];
		x[0][1] = 3;
		x[0][3] = 3;
		x[1][2] = 4;
		x[1][0] = 1;
		x[1][4] = 1;
		x[2][1] = 1;
		x[2][2] = 1;
		x[2][3] = 1;
	
		fprinter(x);
	}
	
	public static void fprinter(int [][] x) 
	{
		
		for(int i = 0; i < x.length; i++ )
		{
			for(int j = 0; j < x[i].length; j++)
			{
			System.out.print(x[i][j]);
			}
			System.out.println();
		}
	}
}