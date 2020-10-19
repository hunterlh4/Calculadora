package com.miempresa.calculadora;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    private Calculadora calculadora;

    public void setUp(){
        calculadora = new Calculadora();
    }

    public void addition_isCorrect(){

        double resultadoSuma=calculadora.suma(2d,3d);
        assertEquals(resultadoSuma,is(equalTo(6d)));
    }
    public void substaction_isCorrect(){

        double resultadoResta=calculadora.resta(4d,1d);
        assertEquals(resultadoResta,is(equalTo(3d)));
    }




}