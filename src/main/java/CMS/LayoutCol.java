package CMS;

import java.util.ArrayList;

public class LayoutCol implements WebContent {

    //TODO démultiplier par for:each nécessaire.
    private ArrayList<WebContent> col = new ArrayList<>();

    public void addContentToCol(WebContent content) {
        this.col.add(content);
    }


    @Override
    public String getHtml() {
        StringBuffer resBuffer = new StringBuffer();
        resBuffer.append("<div>");
        for (WebContent content : col) {
            resBuffer.append(content.getHtml());
        }
        resBuffer.append("</div>");
        return resBuffer.toString();
    }
}
