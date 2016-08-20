/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.swii.kataromanos.*;
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

    @Test(expectedExceptions = RomanosCeroException.class)
    public void validarErrorAlPasarCero() throws RomanosCeroException, RomanosNegativoException {
        String romano = ToRomanos.convertir(0);
    }

    @Test(expectedExceptions = RomanosNegativoException.class)
    public void validarErrorAlPasarNegativo() throws RomanosCeroException, RomanosNegativoException {
        String romano = ToRomanos.convertir(-1);
    }

    @Test
    public void validarConversionDeUnDigitoII2() throws RomanosCeroException, RomanosNegativoException {

        String romano = ToRomanos.convertir(2);
        assertEquals(romano, "II");

    }

    @Test
    public void validarConversionDeUnDigitoVII7() throws RomanosCeroException, RomanosNegativoException {

        String romano = ToRomanos.convertir(7);
        assertEquals(romano, "VII");
    }

    @Test
    public void validarConversionDeDigitosEspecialesIV4() throws RomanosCeroException, RomanosNegativoException {
        String romano = ToRomanos.convertir(4);
        assertEquals(romano, "IV");

    }

    @Test
    public void validarConversionDeDigitosEspecialesIX9() throws RomanosCeroException, RomanosNegativoException {
        String romano = ToRomanos.convertir(9);
        assertEquals(romano, "IX");

    }

    @Test
    public void validarConversionDeDigitosEspecialesXL40() throws RomanosCeroException, RomanosNegativoException {
        String romano = ToRomanos.convertir(40);
        assertEquals(romano, "XL");

    }

    @Test
    public void validarConversionDeDigitosEspecialesXC90() throws RomanosCeroException, RomanosNegativoException {
        String romano = ToRomanos.convertir(90);
        assertEquals(romano, "XC");

    }

    @Test
    public void validarConversionDeVariosDigitosXX20() throws RomanosCeroException, RomanosNegativoException {

        String romano = ToRomanos.convertir(20);
        assertEquals(romano, "XX");

    }

    @Test
    public void validarConversionDeVariosDigitosXLIX49() throws RomanosCeroException, RomanosNegativoException {

        String romano = ToRomanos.convertir(49);
        assertEquals(romano, "XLIX");

    }

    @Test
    public void validarConversionDeNumeralBasicoI1() throws RomanosCeroException, RomanosNegativoException {

        String romano = ToRomanos.convertir(1);
        assertEquals(romano, "I");

    }

    @Test
    public void validarConversionDeNumeralBasicoV5() throws RomanosCeroException, RomanosNegativoException {

        String romano = ToRomanos.convertir(5);
        assertEquals(romano, "V");

    }

    @Test
    public void validarConversionDeNumeralBasicoX10() throws RomanosCeroException, RomanosNegativoException {

        String romano = ToRomanos.convertir(10);
        assertEquals(romano, "X");

    }

    @Test
    public void validarConversionDeNumeralBasicoL50() throws RomanosCeroException, RomanosNegativoException {

        String romano = ToRomanos.convertir(50);
        assertEquals(romano, "L");

    }

    @Test
    public void validarConversionDeNumeralBasicoC100() throws RomanosCeroException, RomanosNegativoException {

        String romano = ToRomanos.convertir(100);
        assertEquals(romano, "C");

    }

    @Test
    public void validarConversionDeNumeralBasicoD500() throws RomanosCeroException, RomanosNegativoException {

        String romano = ToRomanos.convertir(500);
        assertEquals(romano, "D");

    }

    @Test
    public void validarConversionDeNumeralBasicoM1000() throws RomanosCeroException, RomanosNegativoException {

        String romano = ToRomanos.convertir(1000);
        assertEquals(romano, "M");

    }

    /**
     *
     * @throws java.lang.Exception
     * @toDO Codigo revisado por Daniel ALfonso y Felipe Marciales
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
