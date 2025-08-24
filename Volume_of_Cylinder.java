import java.util.Scanner;
public class Volume_of_Cylinder {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int radius=input.nextInt();
        int height=input.nextInt();
        double volume= 3.14* radius *radius *height;
        System.out.println(volume);

    }
}
