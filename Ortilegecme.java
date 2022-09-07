import java.util.Scanner;

public class Ortilegecme {

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        int mat,fiz,tr,kim,muz,toplam=0,sayac=0;
        System.out.println("Matematik notunuz:");
        mat = sc.nextInt();
        System.out.println("Turkce notunuz:");
        tr = sc.nextInt();
        System.out.println("Fizik notunuz:");
        fiz = sc.nextInt();
        System.out.println("Kimya notunuz:");
        kim = sc.nextInt();
        System.out.println("Muzik notunuz:");
        muz = sc.nextInt();
        if(tr<=100 && tr>=0) {
            toplam +=tr;
            sayac++;
        }
        if(mat<=100 && mat>=0) {
            toplam +=mat;
            sayac++;
        }
        if(muz<=100 && muz>=0) {
            toplam +=muz;
            sayac++;
        }
        if(kim<=100 && kim>=0) {
            toplam +=kim;
            sayac++;
        }
        if(fiz<=100 && fiz>=0) {
            toplam +=fiz;
            sayac++;
        }
        System.out.println("Ortalamanız:"+(toplam/sayac));
        if((toplam/sayac)>=55){
            System.out.println("Geçtiniz");
        }
        else {
            System.out.println("Kaldınız");
        }
    }
}