/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika1;
public class MatematikaBeraksi {
    public class MatematikaBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mathCanggih = new MatematikaCanggih();
        
        // Menguji operasi dasar dengan dua parameter
        System.out.println("Pertambahan (12.5 + 28.7): " + mathCanggih.pertambahan(12.5, 28.7));
        System.out.println("Pengurangan (28.7 - 14.2): " + mathCanggih.pengurangan(28.7, 14.2));
        System.out.println("Perkalian (12 * 14): " + mathCanggih.perkalian(12, 14));
        System.out.println("Pembagian (28.7 / 14.2): " + mathCanggih.pembagian(28.7, 14.2));
        System.out.println("Modulus (28.7 % 14.2): " + mathCanggih.modulus(28.7, 14.2));

        // Menguji pertambahan dengan tiga parameter (pecahan)
        System.out.println("Pertambahan tiga angka (12.5 + 28.7 + 14.2): " + mathCanggih.pertambahan(12.5, 28.7, 14.2));

        // Menguji operasi dengan tiga parameter bertipe pecahan
        System.out.println("Operasi Pecahan (12.5 + 28.7 - 14.2): " + mathCanggih.operasiPecahan(12.5, 28.7, 14.2));

        // Menguji overflow dengan angka besar
        System.out.println("Overflow Pertambahan (12.5 + 28.7 + 14.2): " + mathCanggih.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Overflow Pertambahan (12 + 28 + 14): " + mathCanggih.pertambahan(12, 28, 14));
        System.out.println("Overflow Pertambahan (23 + 34): " + mathCanggih.pertambahan(23, 34));
        System.out.println("Overflow Pertambahan (3.4 + 4.9): " + mathCanggih.pertambahan(3.4, 4.9));
    }
}
}
