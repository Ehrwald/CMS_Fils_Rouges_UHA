package CMS;

import java.util.ArrayList;
import java.util.List;

public class WebSite implements WebContent {
private List<CPage> pages = new ArrayList<>();

    public void addPages(CPage CPages){
    this.pages.add(CPages);
}
    @Override
    public String getHtml() {
        StringBuffer resBuffer = new StringBuffer();
        resBuffer.append("<nav>");
        resBuffer.append("<ul>");
        for (CPage CPages : pages){
            resBuffer.append("<li>").append(CPages.getHtml()).append("</li>");
        }
        resBuffer.append("</ul");
        resBuffer.append("</nav>");
        return resBuffer.toString();
    }

}
