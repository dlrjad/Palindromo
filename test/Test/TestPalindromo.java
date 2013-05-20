package Test;

import Calculate.Palindromo;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestPalindromo {
    
    public TestPalindromo() {
    }
    
    @Test
    public void CaseBase(){
        Palindromo palindromo = new Palindromo("0");
        assertTrue(palindromo.isPalindromo());
    }
    
    @Test
    public void CaseTrue(){
        Palindromo palindromo = new Palindromo("1234321");
        assertTrue(palindromo.isPalindromo());
        palindromo = new Palindromo("01210");
        assertTrue(palindromo.isPalindromo());
    }
    
    @Test
    public void CaseFalse(){
        Palindromo palindromo = new Palindromo("785");
        assertFalse(palindromo.isPalindromo());
        palindromo = new Palindromo("1210");
        assertFalse(palindromo.isPalindromo());
    }
}
