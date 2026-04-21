import java.util.*;

public class A_Way_Too_Long_Words{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String s = sc.nextLine();
            if(s.length() > 10){
                String ans = s.charAt(0) + Integer.toString(s.length() - 2) + s.charAt(s.length() - 1);
                System.out.println(ans);
            } else {
                System.out.println(s);
            }
        }
    }
}