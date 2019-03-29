package CMS;

import java.util.ArrayList;

public class Layout implements WebContent {

    //TODO démultiplier par for:each nécessaire.
    private ArrayList<WebContent> contents = new ArrayList<>();

    public void addContents(WebContent content) {
        this.contents.add(content);
    }
    //TODO avoir un for: pour nbLayou que nécessaire.
    @Override
    public String getHtml() {
        StringBuffer resBuffer = new StringBuffer();
        resBuffer.append("<div class= 'twocollayout>");
        resBuffer.append("<div class= 'col1'>");
        for (WebContent content : contents) {
            resBuffer.append(content.getHtml()).append("</div>");;
        }
        resBuffer.append("<div class = 'col2'>");
        for (WebContent content : contents) {
            resBuffer.append(content.getHtml()).append("</div>");
        }
        resBuffer.append("</div>");
        return resBuffer.toString();
    }
}
