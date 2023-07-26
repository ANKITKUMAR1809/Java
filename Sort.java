public class Sort {
    public static void bubbleSort(int arr[])
    {
        for(int turn =0;turn<arr.length-1;turn++)
        {
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    // Selection Sort
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++)
        {
            int cmp=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[cmp]>arr[j])
                cmp=j;
            }
            int temp = arr[cmp];
            arr[cmp]=arr[i];
            arr[i] = temp;
        }

    }

    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        printArr(arr);
        // bubbleSort(arr);
        selectionSort(arr);
        printArr(arr);

    }
}
