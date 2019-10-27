/**
 * Author : Zhang Zhe
 */
public class Test4 {
    public static void main(String[] args) {
        Test3 test3=new Test3();
        test3.add(0,12);
        test3.add(1,124);
        test3.add(2,1290);
        test3.add(2,129087);
        test3.add(4,6);
        test3.add(2,17);
        int n=test3.search(124);
        int m=test3.getPos(2);
        test3.display();
        System.out.println(n+" "+m);
        test3.display();
    }
}
