package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forms_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<form name=\"firstForm\" action=\"firstFormAction.do\" method=\"post\" \r\n");
      out.write("             style=\"width:50%;margin:auto;background-color:#c1d9fc;padding-bottom:15px;\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"text-align:center;\">\t\t\r\n");
      out.write("\t\t\t<h2 style=\"color:white;background-color:#6683b1;\">Formulaire HTML</h2>\r\n");
      out.write("\t\t\t<p>Nom : <input type=\"text\" name=\"nom\" /></p>\r\n");
      out.write("\t\t\t<p>Prenom : <input type=\"text\" name=\"prenom\" /></p>\r\n");
      out.write("\t\t\t<p>Sexe : <input type=\"radio\" name=\"sexe\" value=\"Masculin\" />Masculin \r\n");
      out.write("                                  <input type=\"radio\" name=\"sexe\" value=\"Féminin\" />Féminin</p>\r\n");
      out.write("\t\t\t<p>Couleur de vos yeux : \r\n");
      out.write("\t\t\t\t<select name=\"yeux\">\r\n");
      out.write("\t\t\t\t\t<option value=\"Bleu\">Bleu</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"Marron\">Marron</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"Vert\">Vert</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>Vous programmez en :<br >\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" name=\"C\" />En C\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" name=\"C++\" />En C++\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" name=\"Java\" />En Java\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" name=\".NET\" />En .NET\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" name=\"PHP\" />En PHP\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p style=\"width:50%;margin:auto;\"><input type=\"submit\" name=\"Valider\" value=\"Valider\"/></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
