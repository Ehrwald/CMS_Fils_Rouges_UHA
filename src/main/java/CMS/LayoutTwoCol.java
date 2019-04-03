package CMS;

import java.util.ArrayList;

public class LayoutTwoCol implements WebContent {

    //TODO démultiplier par for:each nécessaire.
    private ArrayList<WebContent> col1 = new ArrayList<>();
    private ArrayList<WebContent> col2 = new ArrayList<>();

    public void addContentCol1(WebContent content) {
        this.col1.add(content);
    }
    public void addContentsCol(WebContent content) {
        this.col2.add(content);
    }
    //TODO avoir un for: pour nbLayou que nécessaire.
    @Override
    public String getHtml() {
        StringBuffer resBuffer = new StringBuffer();
        resBuffer.append("<div class= 'twocollayout'>");
        resBuffer.append("<div class= 'col1>'");
        for (WebContent content : col1) {
            resBuffer.append(content.getHtml());
        }
        resBuffer.append("</div>").append("<div class = 'col2'>");
        for (WebContent content : col2) {
            resBuffer.append(content.getHtml());
        }
        resBuffer.append("</div>");
        return resBuffer.toString();
    }
}
