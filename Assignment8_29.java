import java.util.Scanner;
public class Assignment8_29 
{
	public static boolean equals(int[][] m1, int[][] m2) 
    {
		for (int i = 0; i < m1.length; i++) 
        {
			for (int j = 0; j < m1[i].length; j++) 
            {
				int element = m1[i][j];
				boolean found = false;

				for (int ii = 0; ii < m2.length && !found; ii++) 
                {
					for (int jj = 0; jj < m2[ii].length && !found; jj++) 
                    {
						if (m2[ii][jj] == element) 
                        {
							found = true;
						}
					}
				}
				if (!found) 
                {
					return false;
				}
			}
		}
		for (int i = 0; i < m2.length; i++) 
        {
			for (int j = 0; j < m2[i].length; j++) 
            {
				int element = m2[i][j];
				boolean found = false;
				for (int ii = 0; ii < m1.length && !found; ii++) 
                {
					for (int jj = 0; jj < m1[ii].length && !found; jj++) 
                    {
						if (m1[ii][jj] == element) 
                        {
							found = true;
						}
					}
				}
				if (!found) 
                {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		int m1[][] = new int[3][3];
		int m2[][] = new int[3][3];
		System.out.println("Enter m1:");
		for (int i = 0; i < m1.length; i++) 
        {
			for (int j = 0; j < m1[i].length; j++) 
            {
				m1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter m2:");
		for (int i = 0; i < m2.length; i++) 
        {
			for (int j = 0; j < m2[i].length; j++) 
            {
				m2[i][j] = sc.nextInt();
			}
		}
		if (equals(m1, m2)) 
        {
			System.out.println("The two arrays are identical.");
		} else {
			System.out.println("The two arrays are not identical.");
		}
	}
}