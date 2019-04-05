package CMS.WEB;

import CMS.Header;
import CMS.WebContent;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PageServlet extends HttpServlet {
    List<WebContent> contents = new ArrayList<>();

    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        if (req.getQueryString() == null)
            displayForm(resp);
        else
            displayPage(req, resp);
    }

    private void displayPage(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Map<String, String> params = splitParameters(req.getQueryString());
        Header header = new Header(params.get("titre"));
        resp.getWriter().println(header.getHtml());
    }

    //TODO voir jsp pour générer un form
    private void displayForm(HttpServletResponse resp) throws IOException {
        String form = "<form action=\"page\">" +
                "<b>Nom du titre :</b> <input name=\"titre\"/><br/>" +
                "<b>Paragraphe :</b> <input name=\"text\"/><br/><br/>" +
                "<b>Paragraph </b> <br/>" +
                "<textarea name=\text\"></textarea><br/>" +
                "<input type=\"submit\"/>" +
                "</form>";
        resp.getWriter().println(form);
    }
    public Map<String, String> splitParameters(String queryString) {
        String[] brutParams = queryString.split("&");
        Map<String, String> params = new HashMap<>();
        for (String brutParam : brutParams) {
            String[] keyAndValue = brutParam.split("=");
            if (keyAndValue.length == 2)
                params.put(keyAndValue[0], keyAndValue[1]);
        }
        return params;
    }
}
