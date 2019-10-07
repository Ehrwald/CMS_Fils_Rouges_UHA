package CMS.WEB;


import CMS.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class CPageServlet extends HttpServlet {
    CPage model = new CPage();

    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.setContentType("text/html");
        //resp.setCharacterEncoding("UTF-8");
        this.getServletContext().getRequestDispatcher( "/WEB-INF/vue.jsp" ).forward( req, resp );
       // displayForm(resp);


    }
@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        model.setHeader(new Header(req.getParameter("titre")));
        model.addInBody(new CParagraph(req.getParameter("textP")) );
        model.setFooter(new CFooter(req.getParameter("footer")));
        model.addNavPage(new CPage());
//TODO donner un nom à ces pages? Creer un bouton pour en générer?
    resp.getWriter().println(model.getHtml());
    }


    //TODO voir jsp pour générer un form
  /*  private void displayForm(HttpServletResponse resp) throws IOException {
        String form = "<form action=\"cpage\" method='POST'>" +
                "<b>Nom du titre :</b> <input name=\"titre\"/><br/>" +
                "<b>Paragraphe :</b> <input name=\"text\"/><br/><br/>" +
                "<b>Paragraph </b> <br/>" +
                "<textarea name=\"textarea\"></textarea><br/>" +
                "<b>Footer:</b> <input name=\"footer\"/><br/><br/>" +
                "<input type=\"submit\"/>" +
                "</form>";
        resp.getWriter().println(form);
    } */
}
