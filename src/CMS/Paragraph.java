package CMS;

class Paragraph extends Content{


    public Paragraph(String text) {
        super(text);
    }


    @Override
    public String getHtml() {
        return "<p>"+this.text+"</p>";
    }
}
