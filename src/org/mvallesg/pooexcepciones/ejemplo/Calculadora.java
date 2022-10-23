package org.mvallesg.pooexcepciones.ejemplo;

public class Calculadora {

    public double dividir(int dividendo, int divisor) throws DivisionPorZeroException{
        if(divisor==0){
            throw new DivisionPorZeroException("No se puede dividir por cero!");
        }
        return dividendo/(double)divisor;
    }

    public double dividir(String dividendo, String divisor) throws DivisionPorZeroException, FormatoNumeroException {
        try{
            int divid = Integer.parseInt(dividendo);
            int divis = Integer.parseInt(divisor);
            return this.dividir(divid, divis);
        } catch (NumberFormatException e){
            throw new FormatoNumeroException("Debe ingresar un número en el dividendo y en el divisor.");
        }
    }
}