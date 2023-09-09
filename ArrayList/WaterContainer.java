package ArrayList;
import java.util.ArrayList;
public class WaterContainer {

    public static int ContainerWithMostWater(ArrayList<Integer> list)
    {
        int max=0;
        for(int i=0;i<list.size()-1;i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                int cmp=0;
                if(list.get(i)<list.get(j))
                {
                    cmp=list.get(i)*(j-i);                }
                else{
                    cmp=list.get(j)*(j-i);
                }
                if(max<cmp)
                max=cmp;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(list);
        System.out.println(ContainerWithMostWater(list));

    }
}
