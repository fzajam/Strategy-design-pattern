package str;

public class QuickSort implements Strategy {
	public void sort(int[] numbers)
    {int n=numbers.length;
     qSort(numbers,0,n-1);
     for(int i=0; i <n; i++)
     {
             System.out.print(numbers[i] + " ");  
     }
     System.out.println("sorting array using quick sort strategy");
    }
	public static void echanger(int[]numbers, int m, int n) {
	    int temp = numbers[m];
	    numbers[m] = numbers[n];
	    numbers[n] = temp;
	  }

	public static int partition(int numbers[],int deb,int fin)
    {
    int compt=deb;
    int pivot=numbers[deb];
    
    for(int i=deb+1;i<=fin;i++)
        {
        if (numbers[i]<pivot)
            {
            compt++;
            echanger(numbers,compt,i);
            }
        }
    echanger(numbers,deb,compt);
    return(compt);
    }

	private static void qSort(int tableau[],int deb,int fin)
    {
    if(deb<fin)
        {
        int positionPivot=partition(tableau,deb,fin);
        qSort(tableau,deb,positionPivot-1);
        qSort(tableau,positionPivot+1,fin);
        }
    }
	   
}
