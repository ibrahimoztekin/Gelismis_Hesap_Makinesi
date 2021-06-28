import java.util.Scanner;
public class Main {

    static int sum (int a,int b){
        int result= a+b;
        System.out.println("Toplam: "+result);
        return result;

    }

    static int minus (int a,int b){
        int result= a-b;
        System.out.println("Çıkarma: "+result);
        return result;
    }

    static int times (int a,int b){
        int result= a*b;
        System.out.println("Çarpma: "+result);
        return result;
    }

    static int divided (int a,int b){
        if(b==0){
            System.out.println("İkinci Sayıyı 0'dan farklı olmalı");
            return 0;
        }
        int result= a/b;
        System.out.println("Bölme: "+result);
        return result;
    }

    static int power (int a,int b){
        int result= (int)Math.pow(a,b);
        System.out.println("ÜS alma: "+result);
        return result;
    }

    static int mod (int a,int b) {
        int result = a % b;
        System.out.println("Mod: " + result);
        return result;

    }

    static void calc (int a,int b) {
        int alan = a * b;
        int çevre= 2*(a+b);

        System.out.println("Çevresi: "+ çevre+ "\nAlanı: "+alan);

    }


        public static void main(String[] args) {
        System.out.println(
                "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme İşlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Mod Alma\n" +
                "7- Dikdörtgen Alan ve Çevre Hesabı\n" +
                 "0- Cıkış Yap");

        Scanner input = new Scanner(System.in);


        while (true){

            System.out.print("Seçim Yapınız: ");
            int select = input.nextInt();

            if(select==0){
                break;
            }

            System.out.print("İlk Sayı: ");
            int a=input.nextInt();
            System.out.print("İkinci Sayı: ");
            int b=input.nextInt();



            switch (select){

                case 1:
                    sum(a,b);
                    break;

                case 2:
                    minus(a,b);
                    break;

                case 3:times(a,b);
                    break;

                case 4:
                    divided(a,b);
                    break;

                case 5:
                    power(a,b);
                    break;

                case 6:
                    mod(a,b);
                    break;

                case 7:
                    calc(a,b);
                    break;

                default:
                    System.out.println("Geçersiz bir işle.");


            }
        }

        System.out.println("Güle Güle");

    }

}
