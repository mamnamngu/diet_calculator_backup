package org.apache.jsp.Administrator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddSaleOff_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Add new sale off</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:400,700\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fontawesome.min.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/templatemo-style.css\">\r\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\" />\r\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"container tm-mt-big tm-mb-big\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-xl-9 col-lg-10 col-md-12 col-sm-12 mx-auto\">\r\n");
      out.write("                <div class=\"tm-bg-primary-dark tm-block tm-block-h-auto\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-10\">\r\n");
      out.write("                            <h2 class=\"tm-block-title d-inline-block\">Add Sale off</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-2\">\r\n");
      out.write("                            <form action=\"/diet-calculator/SaleOffController\">\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-block text-uppercase bg-success\"> << Return</button>                            \r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row tm-edit-product-row\">\r\n");
      out.write("                        <div class=\"col-xl-12 col-lg-12 col-md-12\">\r\n");
      out.write("                            <form action=\"/diet-calculator/SaleOffController\" class=\"tm-edit-product-form\">\r\n");
      out.write("                                <input type=\"hidden\" name=\"action\" value=\"create\"/>\r\n");
      out.write("                                <div class=\"form-group mb-3\">\r\n");
      out.write("                                    <label\r\n");
      out.write("                                        for=\"saleoffID\"\r\n");
      out.write("                                        >Sale off ID\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <input\r\n");
      out.write("                                        name=\"saleoffID\"\r\n");
      out.write("                                        type=\"text\"\r\n");
      out.write("                                        class=\"form-control validate\"\r\n");
      out.write("                                        required\r\n");
      out.write("                                        />\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group mb-3\">\r\n");
      out.write("                                    <label\r\n");
      out.write("                                        for=\"description\"\r\n");
      out.write("                                        >Description\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <input\r\n");
      out.write("                                        name=\"description\"\r\n");
      out.write("                                        type=\"text\"\r\n");
      out.write("                                        class=\"form-control validate\"\r\n");
      out.write("                                        required\r\n");
      out.write("                                        />\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"form-group mb-3 col-xs-12 col-sm-6\">\r\n");
      out.write("                                        <label\r\n");
      out.write("                                            for=\"startdate\"\r\n");
      out.write("                                            >Start date\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                        <input\r\n");
      out.write("                                            name=\"startdate\"\r\n");
      out.write("                                            type=\"date\"\r\n");
      out.write("                                            class=\"form-control validate\"\r\n");
      out.write("                                            required\r\n");
      out.write("                                            />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group mb-3 col-xs-12 col-sm-6\">\r\n");
      out.write("                                        <label\r\n");
      out.write("                                            for=\"enddate\"\r\n");
      out.write("                                            >End date\r\n");
      out.write("                                        </label>\r\n");
      out.write("                                        <input\r\n");
      out.write("                                            name=\"enddate\"\r\n");
      out.write("                                            type=\"date\"\r\n");
      out.write("                                            class=\"form-control validate\"\r\n");
      out.write("                                            required\r\n");
      out.write("                                            />\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"form-group mb-3\">\r\n");
      out.write("                                    <label\r\n");
      out.write("                                        for=\"target\"\r\n");
      out.write("                                        >target\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <input\r\n");
      out.write("                                        name=\"target\"\r\n");
      out.write("                                        type=\"text\"\r\n");
      out.write("                                        class=\"form-control validate\"\r\n");
      out.write("                                        required\r\n");
      out.write("                                        />\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xl-6 col-lg-6 col-md-12 mx-auto mb-4\">\r\n");
      out.write("                            <div class=\"tm-product-img-dummy mx-auto\">\r\n");
      out.write("                                <i\r\n");
      out.write("                                    class=\"fas fa-cloud-upload-alt tm-upload-icon\"\r\n");
      out.write("                                    onclick=\"document.getElementById('fileInput').click();\"\r\n");
      out.write("                                    ></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--                <div class=\"custom-file mt-3 mb-3\">\r\n");
      out.write("                                              <input id=\"fileInput\" type=\"file\" style=\"display:none;\" />\r\n");
      out.write("                                              <input\r\n");
      out.write("                                                type=\"button\"\r\n");
      out.write("                                                class=\"btn btn-primary btn-block mx-auto bg-success\"\r\n");
      out.write("                                                value=\"UPLOAD PRODUCT IMAGE\"\r\n");
      out.write("                                                onclick=\"document.getElementById('fileInput').click();\"\r\n");
      out.write("                                              />\r\n");
      out.write("                                            </div>-->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-12\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary btn-block text-uppercase bg-success\">Add Sale Off</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    <!-- https://jquery.com/download/ -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- https://getbootstrap.com/ -->\r\n");
      out.write("    <script>\r\n");
      out.write("                                        $(function () {\r\n");
      out.write("                                            $(\"#expire_date\").datepicker();\r\n");
      out.write("                                        });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
