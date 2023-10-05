package Sorting;

public class Bubblesort {
    // Bigger element is compared to the next element and swap if it is bigger and goes to the last.
    public static void bubbleSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++) // -i is for turn
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,0,3,9};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

}
