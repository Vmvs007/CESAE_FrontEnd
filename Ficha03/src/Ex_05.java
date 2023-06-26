import java.util.Scanner;
public class Ex_05 {
    public static void main(String[] args) {

        int num=1, somatorio=0;

        while(num<=100){
            System.out.println(num);
            somatorio=somatorio+num;
            num++;
        }

        System.out.println("Somatorio: "+ somatorio);

    }
}
