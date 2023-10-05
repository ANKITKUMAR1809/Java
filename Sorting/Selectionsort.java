package Sorting;

public class Selectionsort {
    // pick the smallest from unsorted and put it at the begining
    public static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minpos=i; //for comparing to next element
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minpos]>arr[j])
                minpos=j;
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={3,2,1,6,7,1,9};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
    }
}
