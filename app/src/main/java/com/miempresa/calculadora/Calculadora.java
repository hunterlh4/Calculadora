package com.miempresa.calculadora;

public class Calculadora {


    public enum Operador{sum,res,multi,div};



    public double suma(double primerOperador,double segundoOperador){
        return primerOperador +segundoOperador;
    }

    public double resta(double primerOperador,double segundoOperador){
        return primerOperador -segundoOperador;
    }

    public double multiplicacion(double primerOperador,double segundoOperador){
        return primerOperador *segundoOperador;
    }
    public double division(double primerOperador,double segundoOperador){
        if(segundoOperador ==0){
            return 0.0;
        }
        else {
        return primerOperador /segundoOperador;
    }
    }

}
