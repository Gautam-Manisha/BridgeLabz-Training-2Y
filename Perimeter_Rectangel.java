import java.util.Scanner;
public class Perimeter_Rectangel {
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        int length=input.nextInt();
        int width=input.nextInt();
        int perimeter = (length+width)*2;
        System.out.println(perimeter);
    }
}
