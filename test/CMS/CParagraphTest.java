package CMS;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CParagraphTest {
    @Test
    @DisplayName("it should display test between <p> tags")
    void testGetHtml() {
        String text = "test";
        CParagraph cParagraph = new CParagraph(text);
        assertEquals(cParagraph.getHtml(), "<p>test</p>");
    }

   /* void testGet() {
        HttpURLConnection connection = new HttpURLConnection(URL, "http://localhost:8080/cpage");
        try {
            URL url = new URL("http://localhost:8080/cpage");
            connection = (HttpURLConnection, "http://localhost:8080/cpage"); url.openConnection();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

}