import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListAccessing3 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The No.Of Elements To be stored in "+al.getClass());
        int n= sc.nextInt();
        System.out.println("Enter the "+n+" Elements");
        for(int i=0;i<n;i++){
            int elemnt=sc.nextInt();
            al.add(elemnt);
        }
       Iterator itr =al.iterator();
//        itr.hasNext();
//        System.out.println(itr.next());
//        itr.hasNext();
//        System.out.println(itr.next());
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
