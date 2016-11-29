public class TwoDListProbs
{
	public static void main(String[] args)
	{
		int[][] square = buildArr(); 
		int [][] square2 = buildArr(10); 
		printArray(square); 
		printArray(square2); 
	}
	
 	
 	//Q1 Print a 4 x 4 square
	public static int[][] buildArr()
	{
		int[][] square = buildArr(4);
		return square;
		/*
		int size = 4;
		int[][] grid = new int[size][size];
		int counter = 1;
		for (int i = 0; i < size; i++)
		{
			for (int i2 = 0; i2 < size; i2++)
			{
				grid[i][i2] = counter;
				counter ++;
			}
		}
		return grid;
		*/
	}

	//Q2 Print Square
	public static int[][] buildArr(int size)
	{
		int[][] grid = new int[size][size];
		int counter = 1;
		for (int i = 0; i < size; i++)
		{
			for (int i2 = 0; i2 < size; i2++)
			{
				grid[i][i2] = counter;
				counter ++;
			}
		}
		return grid;
	}

	//Q3 Print Nicely
	public static void printArray(int[][] a)
	{
		for (int row = 0; row < a.length; row++)
		{
			for (int col = 0; col < a[row].length; col++)
				System.out.print(" –––––––");
			System.out.println();
			System.out.print("|");
			for (int col = 0; col < a[row].length; col++)
				System.out.print(a[row][col] + "\t |");
			System.out.println();
		}
		for (int col = 0; col < a[0].length; col++)
			System.out.print(" –––––––");
		System.out.println();
	}
}