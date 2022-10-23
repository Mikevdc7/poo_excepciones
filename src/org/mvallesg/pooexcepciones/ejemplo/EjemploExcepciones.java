package org.mvallesg.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {

    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String dividendo = JOptionPane.showInputDialog("Ingresa un entero dividendo: ");
        String divisor = JOptionPane.showInputDialog("Ingresa un entero divisor: ");
        //int divisor;
        //double division;
        //double division2;
        try{

            //int division = 10/divisor;
            //divisor = Integer.parseInt(valor);
            //division = cal.dividir(10, divisor);
            //System.out.println(division);

            double division2 = cal.dividir(dividendo, divisor);
            System.out.println("Division2 = " + division2);
        } catch(NumberFormatException e){
            System.out.println("Error. Se debe informar un número: " + e.getMessage());
            main(args);
        } catch (FormatoNumeroException e){
            System.out.println("Error. Se capturó una excepción: " + e.getMessage());
            e.printStackTrace();
            main(args);
        } catch(DivisionPorZeroException e){
            System.out.println("Error. Se capturó una excepción en tiempo de ejecución: " + e.getMessage());
            main(args);
        } finally{
            System.out.println("Esto se va a ejecutar siempre, haya o no excepción.");
        }
        System.out.println("Continuamos el flujo de la aplicación...");

    }
}
