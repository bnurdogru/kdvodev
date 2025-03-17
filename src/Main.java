import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvliTutar;
        double oranOnsekiz = 0.18;
        double oranSekiz = 0.8;


        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar = input.nextDouble();

        kdvliTutar = tutar < 1000 ? tutar * oranOnsekiz : tutar * oranSekiz;

        System.out.println("KDV'siz Tutar:" + tutar);
        System.out.println("KDV Tutarı: " + kdvliTutar);
        System.out.println("KDV'li Tutar: " + (tutar + kdvliTutar));


    }
}