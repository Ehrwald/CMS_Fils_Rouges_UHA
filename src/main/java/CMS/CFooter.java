package CMS;

public class CFooter implements WebContent {

    protected String text;

    public CFooter(String text) {
        this.text = text;
    }

    @Override
    public String getHtml() {
        StringBuffer resBuffer = new StringBuffer();
        resBuffer.append("<div class='footer'>");
        resBuffer.append(this.text);
        resBuffer.append("</div>");
        return resBuffer.toString();
    }
}
