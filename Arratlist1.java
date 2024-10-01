import java.util.ArrayList;
import java.util.Scanner;

public class Arratlist1 {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("How Many Elements you have to be add!! at First "+ al1.getClass());
        int n=sc.nextInt();

        System.out.println("Enter The " +n+" Elements");
        for(int i=0;i<n;i++){
            int element=sc.nextInt();
            al1.add(element);
        }
        System.out.println(al1);
        al1.add(2,2000);
        System.out.println(al1);
        ArrayList al2=new ArrayList();
        System.out.println("How Many Elements you have to be add!! at Second "+al2.getClass());
        int n1=sc.nextInt();
        System.out.println("Enter the "+n1+" Elements");
        int j=0;
        while(j<n){
            int element1=sc.nextInt();
            al2.add(element1);
            //System.out.println(al2);
            j++;
        }
        System.out.println(al2);

        al1.addAll(al2);
        System.out.println(al1);

        al1.remove(2);
        System.out.println(al1);
//
//        al1.removeAll(al2);
//        System.out.println(al1);

//        al1.retainAll(al2);
//        System.out.println(al1);

        al1.set(0,"Dhanush");
        System.out.println(al1);

        System.out.println(al1.get(0));


    }
}
