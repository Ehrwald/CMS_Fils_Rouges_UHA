package CMS;

public class Header implements WebContent {

    protected String text;

    public Header(String text) {
        this.text = text;
    }

    @Override
    public String getHtml() {
        StringBuffer resBuffer = new StringBuffer();
        resBuffer.append("<header class='page-header'>");
        resBuffer.append("<h1>");
        resBuffer.append(this.text);
        resBuffer.append("</h1></header>");
        return resBuffer.toString();
    }
}
