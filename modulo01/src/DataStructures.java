import java.util.ArrayList;
import java.util.Arrays;

public class DataStructures {
    static void main() {
        //Arrays Fijos
        int[] list = {0,2,100,-1,5};

        /*Puedo usar la clase Arrays para realizar operaciones sobre el array fijo
        de manera sencilla*/
        Arrays.sort(list);
        System.out.println(list[0]);
        System.out.println(Arrays.toString(list));

        //Arrays Dinamicos
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(1);
        System.out.println(list2);



    }
}
