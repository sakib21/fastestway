package fastestway;

import java.util.*;
class FastestWay
{
	
	
	
	public int shortest_path(int[] array1, int[] array2, int[] time1, int[] time2, int entry1, int entry2, int exit1, int exit2){
		
		int size = array1.length;
		int [] f1, f2 , l1, l2;
		int f,l,k;
		
		 f1 = new int[size];
		 f2 = new int[size];
		 l1 = new int[size];
		 l2 = new int[size];
		
		f1[1]=entry1+array1[1];
		f2[1]=entry2+array2[1];
		
		System.out.println("\nFor Line 1 :");
		System.out.print("First Station\tFirst Time\n");
		for (int i=0;i<size;i++){
			System.out.println((i+1)+"\t\t"+array1[i]);
		}
		System.out.println("\nFor Line 2 :");
		System.out.print("Second Station\tSecond Time\n");
		for (int i=0;i<size;i++){
			System.out.println((i+1)+"\t\t"+array2[i]);
		}
		
		System.out.println("\nEntry Times are: \nEntry1 ="+entry1+" entry2 ="+entry2);
		System.out.println("\nExit Times are:\nExit1 ="+exit1+" Exit2="+exit2);
		
		for(int j=1;j<size;j++){
			
			if((f1[j-1]+array1[j]) <=(f2[j-1]+time2[j-1]+array1[j])){
				f1[j]=f1[j-1]+array1[j];
				l1[j]=1;
			}
			
			else{
				f1[j]=f2[j-1]+time2[j-1]+array1[j]; l1[j]=2;
			}
			
			if((f2[j-1]+array2[j])<=(f1[j-1]+time1[j-1]+array2[j])){
				f2[j]=f2[j-1]+array2[j]; 
				l2[j]=2;
			}
			
			else{
				f2[j]=f1[j-1]+time1[j-1]+array2[j];
				l2[j]=1;
			}
		}

		if(f1[size-1]+exit1 < f2[size-1]+exit2){ 
			f=f1[size-1]+exit1;
			l=1;
		}
		else{
			f=f2[size-1]+exit2;
			l=2;
		}
		

		System.out.println("\n\n");
		System.out.println("Optimal Time is: "+f);
		System.out.println("Optimal line is: "+l);

		System.out.println("\nThe Optimal Path is :\n");
		System.out.println("Line \t\t Station ");
		System.out.println(l+"\t\t "+size);
		
		k=l;
		for(int j=size-1;j>=1;j--)
		{

			if (k==1)
			{
				k=l1[j]; 
				System.out.println(k+"\t\t "+j);
			}
			else
			{
				k=l2[j];
				System.out.println(k+"\t\t "+j);
			}
		}
		System.out.println();

		return f;
		
		
		
	}
			
}