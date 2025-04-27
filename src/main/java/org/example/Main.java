package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner nesnesi oluştur
        Scanner scanner = new Scanner(System.in);

        // Karşılama mesajı
        System.out.println("Sayı Tahmin Oyununa Hoş Geldiniz!");

        // 1-100 arasında rastgele sayı üret
        int rastgeleSayi = (int)(Math.random() * 100) + 1;

        // Tahmin sayısını ve tahmin listesini tut
        int tahminSayisi = 0;
        ArrayList<Integer> tahminler = new ArrayList<>();

        // Kullanıcıdan tahmin alma döngüsü
        while (true) {
            System.out.print("Bir sayı girin (1-100): ");
            int tahmin = scanner.nextInt();
            tahminSayisi++;
            tahminler.add(tahmin);

            // Tahmin kontrolü
            if (tahmin == rastgeleSayi) {
                System.out.println("Tebrikler! Doğru tahmin.");
                System.out.println("Tahmin sayısı: " + tahminSayisi);
                // Tahminleri yazdır
                System.out.print("Tahminleriniz: ");
                for (int i = 0; i < tahminler.size(); i++) {
                    System.out.print(tahminler.get(i));
                    if (i < tahminler.size() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
                break;
            } else if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else {
                System.out.println("Daha küçük bir sayı girin.");
            }
        }

        // Oyunu sonlandır
        System.out.println("Oyun bitti.");

        // Scanner'ı kapat
        scanner.close();
    }
}