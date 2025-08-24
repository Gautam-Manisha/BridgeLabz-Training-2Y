import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int first=input.nextInt();
        int second=input.nextInt();
        int third=input.nextInt();
        int avg=(first+second+third)/3;
        System.out.println(avg);
    }
}
