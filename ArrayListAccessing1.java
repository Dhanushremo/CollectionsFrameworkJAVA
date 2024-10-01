import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAccessing1 {
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
        for(int i=0;i<=al.size()-1;i++){
            System.out.println(al.get(i));
        }
    }
}
