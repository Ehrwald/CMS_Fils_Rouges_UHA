package CMS;

public class Link extends Content {

    private String url;

    public Link(String text, String url) {
        super(text);
        this.url = url;
    }


    @Override
    public String getHtml() {
        return "<a href='" + this.url + "'>" + this.text + "</a>";
    }

}

