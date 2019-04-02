package CMS;

public class main {

    public static void main(String[] args) {
        Link l = new Link("text du lien", "www.google.com");
        System.out.println(l.getHtml());


        Paragraph p = new Paragraph("pouet pouet");
        System.out.println(p.getHtml());

        Nav n = new Nav("rien");
        System.out.println(n.getHtml());

        LayoutTwoCol layoutTwoCol = new LayoutTwoCol();
        System.out.println(layoutTwoCol.getHtml());
        layoutTwoCol.addContents(new Link("plouf", "ploufplouf.com"));
        layoutTwoCol.addContents(new Link("je sais pas", "facedebook.com"));
        System.out.println(layoutTwoCol.getHtml());
        n.addLink(l);
        System.out.println(n.getHtml());
        n.addLink(new Link("blabka", "facebook.com"));
        System.out.println(n.getHtml());

    }
}
