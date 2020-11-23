package str;

public class BubbleSort implements Strategy {
    public void sort(int[] numbers) {
    	int n = numbers.length;
		for( int i = 0; i < n; i++ )
		{
				for( int j = 1; j < (n - i); j++ )
				{
						if( numbers[j - 1] > numbers[j] )
						{		int  temp  =  numbers[j - 1] ;
								numbers[j - 1]  =  numbers[j] ;
								numbers[j]  =  temp;
						}
				}
		}
        System.out.println("sorting array using bubble sort strategy");
    }

}
