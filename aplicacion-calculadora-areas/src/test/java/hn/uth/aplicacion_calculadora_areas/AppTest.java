package hn.uth.aplicacion_calculadora_areas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	//pruebas de circulo
	@Test
    public void testCalcularAreaCirculoRadioPositivo() {
        double radio = 5.0;
        double expectedArea = Math.PI * Math.pow(radio, 2);
        double actualArea = App.calcularAreaCirculo(radio);
        assertEquals(expectedArea, actualArea, 0.0001);
    }
    
    @Test
    public void testCalcularAreaCirculoRadioCero() {
        double radio = 0.0;
        double expectedArea = 0.0;
        double actualArea = App.calcularAreaCirculo(radio);
        assertEquals(expectedArea, actualArea, 0.0001);
    }
    
    @Test
    public void testCalcularAreaCirculoRadioNegativo() {
        double radio = -5.0;
        double expectedArea = Math.PI * Math.pow(radio, 2);
        double actualArea = App.calcularAreaCirculo(radio);
        assertEquals(expectedArea, actualArea, 0.0001);
    }
	
    //pruebas de cuadrado
    @Test
    public void testCalcularAreaLadoPositivo() {
        double lado = 5.0;
        double expectedArea = 25.0;
        double actualArea = App.calcularAreaCuadrado(lado);
        assertEquals(expectedArea, actualArea, 0.0001);
    }
    
    @Test
    public void testCalcularAreaLadoCero() {
        double lado = 0.0;
        double expectedArea = 0.0;
        double actualArea = App.calcularAreaCuadrado(lado);
        assertEquals(expectedArea, actualArea, 0.0001);
    }
    
    @Test
    public void testCalcularAreaLadoNegativo() {
        double lado = -5.0;
        double expectedArea = 25.0;
        double actualArea = App.calcularAreaCuadrado(lado);
        assertEquals(expectedArea, actualArea, 0.0001);
    }
    
    //pruebas de un rectangulo
    @Test
    public void testCalcularAreaLadosPositivos() {
        double base = 5.0;
        double altura = 6.0;
        double expectedArea = 30.0;
        double actualArea = App.calcularAreaRectangulo(base, altura);
        assertEquals(expectedArea, actualArea, 0.0001);
    }
    
    @Test
    public void testCalcularAreaBaseCero() {
        double base = 0.0;
        double altura = 6.0;
        double expectedArea = 0.0;
        double actualArea = App.calcularAreaRectangulo(base, altura);
        assertEquals(expectedArea, actualArea, 0.0001);
    }
    
    @Test
    public void testCalcularAreaAlturaNegativa() {
        double base = 5.0;
        double altura = -6.0;
        double expectedArea = -30.0;
        double actualArea = App.calcularAreaRectangulo(base, altura);
        assertEquals(expectedArea, actualArea, 0.0001);
    }
    
    //pruebas de triangulo
    @Test
    public void testCalcularAreaTrianguloBasePositivaAlturaPositiva() {
        double base = 4.0;
        double altura = 3.0;
        double expectedArea = 6.0;
        double actualArea = App.calcularAreaTriangulo(base, altura);
        assertEquals(expectedArea, actualArea, 0.0001);
    }
    
    @Test
    public void testCalcularAreaTrianguloBaseCeroAlturaCero() {
        double base = 0.0;
        double altura = 0.0;
        double expectedArea = 0.0;
        double actualArea = App.calcularAreaTriangulo(base, altura);
        assertEquals(expectedArea, actualArea, 0.0001);
    }
    
    @Test
    public void testCalcularAreaTrianguloBaseNegativaAlturaNegativa() {
        double base = -5.0;
        double altura = -3.0;
        double expectedArea = 7.5;
        double actualArea = App.calcularAreaTriangulo(base, altura);
        assertEquals(expectedArea, actualArea, 0.0001);
    }
}

