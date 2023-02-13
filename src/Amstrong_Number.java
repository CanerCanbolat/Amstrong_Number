import java.util.Scanner;
public class Amstrong_Number {
    public static void main (String[] args) {

        int a,c,number, counternumber=0, b=0, num=0,us=1;
        Scanner inp =new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        a=inp.nextInt(); c=a ; number = a;
        while (a!=0) {
            a /= 10;
            counternumber++;
        }
        while(c!=0){
            for (int i = 1; i <= counternumber ; i++) {
                b = (c) % 10  ;
                us=1;
                for (int j=1; j<=counternumber;j++) {
                    us*=b;
                }
                c=c/10;
                num = us+num;
            }
        }
        if (number == num) {
            System.out.println("Armstrong sayısıdır "+ number+" = "+num);
        }else {
            System.out.println("Armstrong sayısı değildir.");
        }
        System.out.println("Girilen sayı = "+number);
        System.out.println("Basamak sayısı ="+counternumber);
        System.out.print("Armstrong sayısı = "+num);
    }
}
