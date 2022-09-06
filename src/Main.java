import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {


        List<Integer> list1 = List.of(1,2,3,4,5,8);
        Calculator calc = new Calculator();
        try {
            calc.sum(list1);

        } catch (EmptyArrayException e) {
            System.out.println(e.getMessage());

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}