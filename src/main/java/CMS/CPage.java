package CMS;

public class CPage implements WebContent{
    private Header header = new Header("");
    private LayoutCol body = new LayoutCol();
    //private WebContent body = new LayoutCol();


    public void setHeader(Header header) {
        this.header = header;
    }

   public void addInBody(WebContent content) {
        this.body.addContentToCol(content);
    }
    /*public void setBody(WebContent content) {
        this.body =content;
    }//*/
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
                "</head>\n");
        resBuffer.append(this.header.getHtml());


        resBuffer.append("<body>");
        resBuffer.append(this.body.getHtml());
        resBuffer.append("</body>\n" +
                "</html>");
        return resBuffer.toString();
    }
    //TODO CPage à finir avec l'intégration de la servlet.
    //TODO faire un autre model (backoffice? qui tape dans le même model?) regarder swing !)

}
