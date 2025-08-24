import java.util.Scanner;
public class Celsius_to_Faherenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int celsius = input.nextInt();
        int fahernheit = (celsius * 9/5)+32;
        System.out.println("Celsius to Faherenheit: " + fahernheit);
    }
}
