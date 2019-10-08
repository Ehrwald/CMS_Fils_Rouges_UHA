package CMS;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class HeaderTest {
    @Test
    @DisplayName("Should return the html and this string")
    void checkHtmlReturn(){
        Header header = new Header("Mon titre");
        assertEquals("<header class='page-header'><h1>Mon titre</h1></header>", header.getHtml());
    }
}