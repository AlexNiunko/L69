import java.util.*;


public class HomeWorkL69 {
    public static void main(String[] args) {
        ArrayList<Integer>intList=new ArrayList<>();
        intList.add(4);
        intList.add(3);
        intList.add(2);
        intList.add(5);
        intList.add(6);

        ListIterator<Integer>iterator= intList.listIterator();
        while (iterator.hasNext()){
            Integer e= iterator.next();
        }

        while (iterator.hasPrevious()){
            Integer element= iterator.previous();
            System.out.print(element+" ");
            iterator.remove();
        }
        System.out.println();
        System.out.println(intList.isEmpty());
     }
    }

