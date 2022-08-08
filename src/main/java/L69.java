import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class L69 {
    public static void main(String[] args) {
        List<String>arrayList= Arrays.asList("A","B","C","D");
        ListIterator<String>listIterator=arrayList.listIterator();
        while (listIterator.hasNext()){
            String element= listIterator.next();
            listIterator.set(element+"+");
        }
        System.out.println("Измененный arrayList в обратном порядке: ");
        while (listIterator.hasPrevious()){
            String element= listIterator.previous();
            System.out.println(element+" ");
        }
    }
}
