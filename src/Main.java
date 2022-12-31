import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,i,k;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sınır Sayısı Giriniz: ");
        n=inp.nextInt();
        for(i=1;i<=n;i*=2){
            System.out.println(i);
        }
        for(k=1;k<=n;k*=3){
            System.out.println(k);
        }
    }
}