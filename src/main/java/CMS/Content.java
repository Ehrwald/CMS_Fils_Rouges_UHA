package CMS;

public abstract class Content implements WebContent{

    protected String text;

    public Content(String text) {
        this.text = text;
    }

}
