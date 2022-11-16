import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("Toyota");
        h.add("Honda");
        h.add("Audi");
        h.add("Mercedez Benz");

        HashMap<String,String > fun = new HashMap<String,String >();
        fun.put("Fortuner","Mini SUV");

        LinkedList<String> linky = new LinkedList<String>();
        linky.add("Not Available");
        linky.add("Available");

        Stack<String> Honda = new Stack<String>();
        Honda.add("Jazz");
        Honda.add("CRV");

        Queue<Integer> merce = new LinkedList<Integer>();
        merce.add(1);





        if (h.contains("Toyota") == true){
            System.out.println(fun);
        }
        if (h.contains("Audi") == true){
            System.out.println(linky.get(0));
        }
        if (h.contains("Honda")== true){
            System.out.println(Honda.pop());
        }
        if (h.contains("Mercedez Benz")== true){
            System.out.println("Only Available ");
            System.out.println(merce);

        }





    }
}