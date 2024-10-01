import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListAccessing4 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The No.Of Elements To be stored in " + al.getClass());
        int n = sc.nextInt();
        System.out.println("Enter the " + n + " Elements");
        for (int i = 0; i < n; i++) {
            int elemnt = sc.nextInt();
            al.add(elemnt);
        }
        System.out.println(al);
        ListIterator litr = al.listIterator();
        System.out.println("FORWARD TRAVERSE!!");
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }
        ListIterator litr1 = al.listIterator(al.size());
        System.out.println("BACKWORD TRAVERSE");
        while (litr1.hasPrevious()) {
            System.out.println(litr1.previous());
        }
    }
}