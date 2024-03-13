import java.util.*;
public class nes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int b = sc.nextInt();
        int a = sc.nextInt();
        int sum = a+b;
        int prod = a*b;
        System.out.println(sum);
        System.out.println(prod);
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.print(area);
        sc.close();
    } 
}
