/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraprueba;

/**
 *
 * @author teresa
 */
public class calculadora {

    /**
     * @param args the command line arguments
     */
    // clase con constructor pasando dos numeros reales, setters , getters y m�todos para devolver el resultado de sumar, restar , multiplicar y dividir
    private double numero1, numero2;

    public calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // sets and gets
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    //m�todos
    public double suma() {
        double suma = numero1 + numero2;
        return suma;
    }

    public double resta() {
        double resta = numero1 - numero2;
        return resta;
    }

       public double multiplicacion() {
        double multiplicacion = numero1 * numero2;
        return multiplicacion;
    }

    public double division() {
        double division = numero1 / numero2;
        return division;
    }
    public double resto(){
        double resto = numero1%numero2;
        return resto;
    }
}
