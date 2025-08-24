
import java.util.Scanner;
public class Kilometers_to_Miles {
    public static void main(String []args){
        Scanner input=new Scanner (System.in);
        int kilometeres=input.nextInt();
        double miles =kilometeres*0.621371;
        System.out.println(miles);
    }
}
