package CMS;

public class CPage implements WebContent{

    @Override
    public String getHtml() {
        StringBuffer resBuffer = new StringBuffer();
        resBuffer.append("<!doctype html>\n" +
                "<html lang=\"fr\">\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <title>Titre de la CPage</title>\n" +
                "  <link rel=\"stylesheet\" href=\"style.css\">\n" +
                "  <script src=\"script.js\"></script>\n" +
                "</head>\n" +
                "<body>\n" +
                "  ...\n" +
                "  <!-- Le reste du contenu -->\n" +
                "  ...\n" +
                "</body>\n" +
                "</html>");
        return resBuffer.toString();
    }
    //TODO CPage à finir avec l'intégration de la servlet.
    //TODO faire un autre model (backoffice? qui tape dans le même model?) regarder swing !)

}
