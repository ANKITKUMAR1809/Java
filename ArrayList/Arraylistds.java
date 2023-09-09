package ArrayList;

import java.util.ArrayList;
public class Arraylistds{

    public static void swap(ArrayList<Integer> list, int idx1,int idx2)
    {
       int temp=list.get(idx1);
       list.set(idx1,list.get(idx2));
       list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // add at index operation
        // list.add(1,10);
        // System.out.println(list);

        // get operation
        // System.out.println(list.get(1));

        // remove operation

        // list.remove(1);
        // list.set(0, 110);
        // System.out.println(list);

        // swap two number
        System.out.println(list);
        int idx1=1, idx2=3;
        swap(list,idx1,idx2);
        System.out.println(list);

    }
}