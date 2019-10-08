package CMS.WEB;

import CMS.Header;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class CPageServletTest {

    @Test
    @DisplayName("it should make a connection HttpUrl and retain his code status with his url on a GET")
    void testSendGetWithConsoleLog() throws IOException {
        String url = "http://localhost:8080/cpage";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        System.out.println(response.toString());

        assertEquals(200, responseCode);
        assertEquals("http://localhost:8080/cpage", url);

    }

    @Test
    @DisplayName("it should make a connection HttpUrl and retain his code status with his url on a GET")
    void testSendPostWithConsoleLog() throws IOException {
        String url = "http://localhost:8080/cpage";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("POST");

        String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";


        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

        assertEquals(200, responseCode);
        assertEquals("http://localhost:8080/cpage", url);
    }

}