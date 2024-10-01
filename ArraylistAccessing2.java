import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ArraylistAccessing2 {
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
        System.out.println(al);
        for(Object a:al ){
            System.out.println(a);
        }
    }
}
