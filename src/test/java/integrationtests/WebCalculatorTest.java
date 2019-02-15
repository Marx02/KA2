/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrationtests;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.HttpClient;

/**
 *
 * @author caspe
 */
public class WebCalculatorTest {

    HttpClient hc = new HttpClient("http://localhost:7777/KA2/calculator");

    public WebCalculatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void addTest() throws IOException {
        String res = hc.makeHttpRequest("?operation=add&n1=2&n2=4");
        assertEquals("Result of: 2+4= 6", res);
    }

    @Test
    public void subTest() throws IOException {
        String res = hc.makeHttpRequest("?operation=sub&n1=4&n2=2");
        assertEquals("Result of: 4-2= 2", res);
    }

    @Test
    public void mulTest() throws IOException {
        String res = hc.makeHttpRequest("?operation=mul&n1=4&n2=2");
        assertEquals("Result of: 4*2= 8", res);

    }

    @Test
    public void divTest() throws IOException {
        String res = hc.makeHttpRequest("?operation=div&n1=4&n2=2");
        assertEquals("Result of: 4/2= 2", res);

    }
}
