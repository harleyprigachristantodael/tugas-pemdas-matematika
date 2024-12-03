/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematika1;

public class Matematika1 {

    public double pertambahan(double a, double b) {
        return a + b;
    }

    public double pengurangan(double a, double b) {
        return a - b;
    }

    public double perkalian(double a, double b) {
        return a * b;
    }

    public double pembagian(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan.");
            return Double.NaN; // Mengembalikan nilai NaN jika dibagi dengan nol
        }
        
    }
    public double modulus(double a, double b) {
        return a % b;
 
    }
}

  
  
    
  
