import java.util.ArrayList;
import java.util.List;

public class Calculator {

    List<Integer> list;

    private int sum=0;

    public void sum(List<Integer> list) throws EmptyArrayException {



        if(list.size()>0){
            for (int i = 0; i < list.size(); i++) {
                sum = sum + list.get(i);
            }
            System.out.println(sum);
        }

        else {
            throw new EmptyArrayException("Array is Empty");
        }






    }
}
