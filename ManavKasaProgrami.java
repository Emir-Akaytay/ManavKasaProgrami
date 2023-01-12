import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        
        /** @TayTayTay54 */
        
        double a = 2.14,e = 3.67,d = 1.11,m = 0.95,p = 5,aKg,eKg,dKg,mKg,pKg,price;
        Scanner input = new Scanner(System.in);


        System.out.println("TayTay Pazara Hoş Geldiniz Lütfen Aldığınız Ürünleri Kilogram Birimiyle Yazınız.");
        System.out.println("FİYAT LİSTESİ =====>  Armut:2,14 TL   Elma:3,67 TL   Domates:1,11 TL   Muz:0,95 TL   Patlıcan:5,00 TL");
        System.out.println("Adı Geçen Üründen Almadıysanız LÜTFEN 0(Sıfır) Giriniz!!!!!");

        System.out.print("Kaç Kilo Armut Aldınız?: ");
        aKg = input.nextDouble();
        System.out.print("Kaç Kilo Elma Aldınız?: ");
        eKg = input.nextDouble();
        System.out.print("Kaç Kilo Domates Aldınız?: ");
        dKg = input.nextDouble();
        System.out.print("Kaç Kilo Muz Aldınız?: ");
        mKg = input.nextDouble();
        System.out.print("Kaç Kilo Patlıcan Aldınız?: ");
        pKg = input.nextDouble();

        price = (a*aKg)+(e*eKg)+(d*dKg)+(m*mKg)+(p*pKg);
        System.out.println("Ödemeniz Gereken Tutar: "+price+" TL");
        System.out.print("Teşekkürler!!!");
    }
}
