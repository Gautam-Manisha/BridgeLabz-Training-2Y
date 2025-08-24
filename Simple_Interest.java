import java.util.Scanner;
public class Simple_Interest {
    public static void main( String []args){
        Scanner input= new Scanner(System.in);
        int principal= input.nextInt();
        int time =input.nextInt();
        int rate=input.nextInt();
        double si= (principal *rate*time)/100;
        System.out.println(si);
    }
}
