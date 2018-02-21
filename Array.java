import java.util.Random;
public class Array {

	public static void main(String[] args) {
		Random rand=new Random();
	    int[] a;
	    a=new int[9];
	    int[][] b=new int[5][2];
	    
		for(int i=0;i<9;i++)
		{	
			a[i]=rand.nextInt(100);
			System.out.println("a["+i+"]="+a[i]);
		}
		//System.out.println(a);
		for(int j=0;j<5;j++)
		{
			for(int k=0;k<2;k++)
			{
				b[j][k]=rand.nextInt(99);
				System.out.println("b["+j+"]"+"["+k+"]="+b[j][k]);
			}
		}
		
			
			
		
	}

}

