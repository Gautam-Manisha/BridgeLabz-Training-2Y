import java.util.Scanner;
public class Area_of_Circle {
    public static void main(String[] args) {
     Scanner input= new Scanner (System.in);
     int radius=input.nextInt();
     double area = radius * radius * 3.14;
     System.out.println(area);
    }
}
