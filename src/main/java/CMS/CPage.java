package CMS;

import java.util.ArrayList;

public class CPage implements WebContent{
    private Header header = new Header("");
    private CFooter footer = new CFooter("");
    private LayoutCol body = new LayoutCol();
    private WebSite webSite = new WebSite();
    //private WebContent body = new LayoutCol();

//TODO Implementer le NAV de CPages en tete de page.

    public void setHeader(Header header) {
        this.header = header;
    }
    public void setFooter(CFooter footer) {
        this.footer = footer;
    }

    /**
     * ajoute un layout dans le body
     * @param content ajoute xElements
     */
   public void addInBody(WebContent content) {
        this.body.addContentToCol(content);
    }

    public void addNavPage(CPage CPages) {
        this.webSite.addPages(CPages);
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
        resBuffer.append(this.webSite.getHtml());
        resBuffer.append(this.header.getHtml());
        resBuffer.append("<body>");
        resBuffer.append(this.body.getHtml());
        resBuffer.append("</body>\n");
        resBuffer.append(this.footer.getHtml());
        resBuffer.append("</html>");
        return resBuffer.toString();
    }
    //TODO CPage à finir avec l'intégration de la servlet.
    //TODO faire un autre model (backoffice? qui tape dans le même model?) regarder swing !)

}
