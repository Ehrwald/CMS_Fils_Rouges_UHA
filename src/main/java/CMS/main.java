package CMS;

public class main {

    public static void main(String[] args) {
        Link l = new Link("text du lien", "www.google.com");
        System.out.println(l.getHtml());


        CParagraph p = new CParagraph("pouet pouet");
        System.out.println(p.getHtml());

        Nav n = new Nav("rien");
        System.out.println(n.getHtml());

        LayoutTwoCol layoutTwoCol = new LayoutTwoCol();
        System.out.println(layoutTwoCol.getHtml());
        layoutTwoCol.addContentCol1(new Link("plouf", "ploufplouf.com"));
        layoutTwoCol.addContentsCol(new Link("je sais pas", "facedebook.com"));
        System.out.println(layoutTwoCol.getHtml());
        n.addLink(l);
        System.out.println(n.getHtml());
        n.addLink(new Link("blabka", "facebook.com"));
        System.out.println(n.getHtml());

        Header header = new Header("Allo le monde");
        System.out.println(header.getHtml());

        CFooter cFooter = new CFooter("aurevoir");
        System.out.println(cFooter.getHtml());

        WebSite webSite = new WebSite();
        System.out.println(webSite.getHtml());
        webSite.addPages(new CPage());
        System.out.println(webSite.getHtml());

    }
}
