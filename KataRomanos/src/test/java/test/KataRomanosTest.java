/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.swii.kataromanos.ToRomanos;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author f209
 */
public class KataRomanosTest {

    public KataRomanosTest() {
    }

    @Test(expectedExceptions = Exception.class)
    public void validarErrorAlPasarCero() {
        String romano = ToRomanos.convertir(0);
    }

    @Test(expectedExceptions = Exception.class)
    public void validarErrorAlPasarNegativo() {
        String romano = ToRomanos.convertir(-1);
    }

    @Test
    public void validarConversionDeUnDigito() {

        String romano = ToRomanos.convertir(2);
        assertEquals(romano, "II");
        
        romano = ToRomanos.convertir(3);
        assertEquals(romano, "III");
        
        romano = ToRomanos.convertir(7);
        assertEquals(romano, "VII");
        
        romano = ToRomanos.convertir(8);
        assertEquals(romano, "VIII");
    }

    @Test
    public void validarConversionDeDigitosEspeciales() {
        String romano = ToRomanos.convertir(4);
        assertEquals(romano, "IV");
        
        romano = ToRomanos.convertir(9);
        assertEquals(romano, "IX");
        
        romano = ToRomanos.convertir(40);
        assertEquals(romano, "XL");
        
        romano = ToRomanos.convertir(90);
        assertEquals(romano, "XC");
        
    }

    @Test
    public void validarConversionDeVariosDigitos() {

        String romano = ToRomanos.convertir(20);
        assertEquals(romano, "XX");
        romano = ToRomanos.convertir(49);
        assertEquals(romano, "XLIX");

    }

    @Test
    public void validarConversionDeNumeralesBasicos() {

        String romano = ToRomanos.convertir(1);
        assertEquals(romano, "I");
        romano = ToRomanos.convertir(5);
        assertEquals(romano, "V");
        romano = ToRomanos.convertir(10);
        assertEquals(romano, "X");
        romano = ToRomanos.convertir(50);
        assertEquals(romano, "L");
        romano = ToRomanos.convertir(100);
        assertEquals(romano, "C");
        romano = ToRomanos.convertir(500);
        assertEquals(romano, "D");
        romano = ToRomanos.convertir(1000);
        assertEquals(romano, "M");

    }
    
  /**
   * 
   * @toDO  Codigo revisado por Daniel ALfonso  y Felipe Marciales
   */ 

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
