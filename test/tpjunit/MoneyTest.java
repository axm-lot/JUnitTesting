/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tpjunit;
import static org.junit.Assert.*;

/**
 *
 * @author axm
 */
public class MoneyTest {
    private static Money m12CHF;
    private static Money m14CHF;
    
    static{
        m12CHF = new Money(12, "CHF"); // création de données
        m14CHF = new Money(14, "CHF");
    }
    
    @org.junit.Test
    public void testSimpleAdd() {
        
        Money expected = new Money(26, "CHF");
        Money result = m12CHF.add(m14CHF); // exécution de la méthode testée
        assertTrue(expected.equals(result)); // comparaison
    }
    
    @org.junit.Test
    public void testEquals() {
        assertTrue(!m12CHF.equals(null)); 
        assertEquals(m12CHF, m12CHF);
        assertEquals(m12CHF, new Money(12, "CHF"));
        assertTrue(!m12CHF.equals(m14CHF));
    }
}
