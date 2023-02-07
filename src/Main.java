import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        Arrays.sort(list);
        int sayi = girdi.nextInt();
        for (int s=0;s<list.length;s++) {
            if(sayi<list[s]){
                System.out.println("Dizi : "+ Arrays.toString(list));
                System.out.println("Girilen Sayı :"+sayi);
                System.out.println("Girilen sayıdan küçük en yakın sayı : "+list[s-1]);
                System.out.println("Girilen sayıdan büyük en yakın sayı :"+list[s]);
                break;
            }
        }

    }
}
