import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>(10);
        //ArrayList<Generics>name
        //generics cannot be wrapper class it can  only be generic like
        // integer = generic,int = wrapper class.

        list.add(10);
        list.add(30);
        list.add(100);
        list.add(1000);
        list.add(500);
        System.out.print(list);
        System.out.println(list.contains(1000));

        //list.set(10,99);
        //list.remove(index number)
        
    }
}
