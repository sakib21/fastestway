package fastestway;

import junit.framework.TestCase;
import java.util.Random;

public class FastestWayTest extends TestCase {

	public void testMinimized_path() {
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		int[] time1 = new int[10];
		int[] time2 = new int[10];
		
		
		
		Random rand = new Random(); //for generating random values 
		
		for(int i=0; i<10; i++) /* assigning random values to the arrays*/
		{
			array1[i] = rand.nextInt(20) + 1;
			
		}
		for(int i=0; i<10; i++)
		{
			array2[i] = rand.nextInt(20) + 1;
			
		}
		for(int i=0; i<10; i++)
		{
			
			time1[i] = rand.nextInt(20) + 1;
			
		}
		for(int i=0; i<10; i++)
		{

			time2[i] = rand.nextInt(20) + 1;
			
		}
		
		int entryTime1 =rand.nextInt(20) + 1; /* random values for variables*/
		int entryTime2 = rand.nextInt(20) + 1;
		int exit1 = rand.nextInt(20) + 1;
		int exit2 = rand.nextInt(20) + 1;
		
		
		
		FastestWay fWay = new FastestWay();
		int time = fWay.shortest_path(array1, array2, time1, time2, entryTime1, entryTime2, exit1, exit2); // function called

	}

}
