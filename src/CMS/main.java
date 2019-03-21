package CMS;

public class main {

    public static void main(String[] args) {
        Link l = new Link("text du lien", "www.google.com");
        System.out.println(l.getHtml());


        Paragraph p = new Paragraph("pouet pouet");
        System.out.println(p.getHtml());
    }
}
