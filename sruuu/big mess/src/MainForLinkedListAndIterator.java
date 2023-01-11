import java.util.Iterator;
import java.util.LinkedList;

public class MainForLinkedListAndIterator {
    public static void main(String[] args) {
        LinkedList<Integer> linky = new LinkedList<Integer>();
        linky.add(6);
        linky.add(78);
        linky.add(45);
        System.out.println(linky.get(1));

        Iterator it = linky.iterator();
        while (it.hasNext()){
            if ((int) it.next() == 78) {
                System.out.println();
            }
        }
       System.out.println("Posision " + linky.indexOf(78));
    }
}