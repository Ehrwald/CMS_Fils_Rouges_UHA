package CMS;

import java.util.ArrayList;
import java.util.List;

public class Nav extends Content {
    private List<Link> li;

    public Nav(String text) {
        super(text);
        li = new ArrayList();
    }

    public void addLink(Link link) {
        this.li.add(link);
    }


    @Override
    public String getHtml() {
        StringBuffer resBuffer = new StringBuffer();
        resBuffer.append("<nav>");
        resBuffer.append("<ul>");
        for (Link link : li) {
            resBuffer.append("<li>").append(link.getHtml()).append("</li>");
        }
        resBuffer.append("</ul>");
        resBuffer.append("</nav>");
        return resBuffer.toString();
    }


}
