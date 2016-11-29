public class TwoDPractice
{
	public static void main(String[] args)
	{
		int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
		printArray(grid);
		
		int[][] spreadsheet = new int[5][7];
		printArray(spreadsheet);
		
		String[][] myWords = new String[4][3];
		System.out.println(myWords); //prints the memory location
		//printArray(myWords);
		
		int[][] square = buildSquareArr(9);
		printArray(square);
		int[][] square4 = build4SquareArr();
		printArray(square4);
	}
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
	public static void print2D(String[][] a) //overload: java knows what method to use
	//even if they have the same name because of the input value
	{
		for (int row = 0; row < a.length; row++)
		{
			
			for (int col = 0; col < a[row].length; col++)
			{
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] build4SquareArr()
	{
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
	}

	public static int[][] buildSquareArr(int size)
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
}