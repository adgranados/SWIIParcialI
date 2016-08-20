/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swii.kataromanos;

/**
 *
 * @author f209
 */
public class ToRomanos {

    private static void validarCero(int i) throws RomanosCeroException{
        if(i==0){
            throw new RomanosCeroException("En los numeros Romanos no hay una representacion para el Cero");
        }
    }
    private static void validarNegativo(int i) throws RomanosNegativoException{
        if(i<0){
            throw new RomanosNegativoException("En los numeros Romanos no hay una representacion para Numeors negativos");
        }
    }
    public static String convertir(int i) throws RomanosCeroException, RomanosNegativoException {
        validarCero(i);
        validarNegativo(i);
        return "";
    }
    
}
