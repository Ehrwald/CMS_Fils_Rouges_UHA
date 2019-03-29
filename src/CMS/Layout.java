package CMS;

import java.util.ArrayList;

public abstract class Layout implements WebContent {

    protected ArrayList<WebContent> elements = new ArrayList<>();

    public Layout(ArrayList<WebContent> elements) {
        this.elements = elements;
    }
}
