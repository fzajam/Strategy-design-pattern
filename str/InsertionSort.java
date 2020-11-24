package str;

public class InsertionSort implements Strategy {
	public void sort(int[] numbers) {
		 int n = numbers.length-1;
		  for (  int  i  =  2 ;  i  <=  n ;  i ++ )
		  {
		    int  v  =  numbers[i] ;
		    int  j  =  i ;
		   while ( numbers[ j - 1 ]  >  v )
		   {numbers[ j ]  =  numbers[ j - 1 ] ; 
		     j -- ; 
		    } 
		   numbers[ j ]   =  v  ; 
		   }
		  for(int i=0; i <n; i++)
	         {
	                 System.out.print(numbers[i] + " ");  
	         }
		  System.out.println("sorting array using insertion sort strategy");
		 }
       
    }


