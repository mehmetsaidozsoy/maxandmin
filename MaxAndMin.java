import java.util.Scanner;
public class MaxAndMin {
    
public static void main(String[] args) {

    Scanner inp = new Scanner(System.in);
    System.out.print("1. sayıyı giriniz: ");
    int enBuyuk = inp.nextInt();
    int enKucuk = enBuyuk;

    System.out.print("Kaç sayi gireceksiniz :");
    int counter=inp.nextInt();
    String sayi="Sayı";

    for(int i=2; i<=counter;++i){
        System.out.print(i+" . sayıyı giriniz :");
       
        String sayiAl=inp.next();
        sayi=sayi+Integer.toString(i);
        System.out.println(sayi+" = "+sayiAl);
        int sSayi=Integer.parseInt(sayiAl);
        if (sSayi > enBuyuk) {
            enBuyuk = sSayi;
        }
        if (sSayi < enKucuk) {
            enKucuk = sSayi;
        }
        
        //String sayiStr=Integer.toString(sayi);
        //String mesaj=sayiStr+Integer.toString(i);
    
        //System.out.println("Sayı Numarası :"+sayi);
        sayi="Sayı";
    }

    System.out.println("En büyük sayı: " + enBuyuk);
    System.out.println("En küçük sayı: " + enKucuk);
    inp.close();

        
    
}
}