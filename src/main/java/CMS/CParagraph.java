package CMS;

public class CParagraph extends Content{


    public CParagraph(String text) {
        super(text);
    }


    @Override
    public String getHtml() {
        return "<p>"+this.text+"</p>";
    }



}
