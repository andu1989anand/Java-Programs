//Ragged array:

public class Ragged {

		public static void main(String []args) {
		
		int a[][]=new int[3][];
		a[0]=new int[3];
		a[1]=new int[4];
		a[2]=new int[2];
		
    int k=1;
		
		for (int i=0;i<3;i++)
		{
	for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=k;
				k++;
		System.out.print(a[i][j]+"\t");
			}
		System.out.println();
	}
	}
}

OUTPUT:
1	2	3	
4	5	6	7	
8	9	
