import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList al=new ArrayList(11);
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(true);
        al.add("TAP");
        al.add(3.45f);
        al.add(false);
        al.add(100);
        al.add(null);
        al.add("11th Element 10th Location");
        System.out.println(al);

    }
}
