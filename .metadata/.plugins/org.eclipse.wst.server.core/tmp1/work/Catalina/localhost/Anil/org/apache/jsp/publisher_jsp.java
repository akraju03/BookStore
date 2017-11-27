/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2017-11-27 05:58:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import domain.Publisher;
import domain.Book;
import java.util.ArrayList;
import db.Repository;
import domain.User;
import db.Repository;

public final class publisher_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/foot.jspf", Long.valueOf(1511686208000L));
    _jspx_dependants.put("/WEB-INF/head.jspf", Long.valueOf(1511686208000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("domain.User");
    _jspx_imports_classes.add("db.Repository");
    _jspx_imports_classes.add("domain.Book");
    _jspx_imports_classes.add("domain.Publisher");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");

            Repository r = new Repository();
            int publisherId = Integer.parseInt(request.getParameter("publisherId"));
            Publisher p = r.getPublisher(publisherId);
            ArrayList<Book> books = r.getBooksOfPublisher(p);
            User u = (User)session.getAttribute("user");
        
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>");
      out.print(p.getTitle());
      out.write("</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

        User u1 = (User) session.getAttribute("user");
    
      out.write("\n");
      out.write("    <div id=\"header-wrapper\">\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"current_page_item\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"books.jsp\">Books</a></li>\n");
      out.write("                    <li><a href=\"authors.jsp\">Authors</a></li>\n");
      out.write("                    <li><a href=\"genres.jsp\">Ganres</a></li>\n");
      out.write("                    <li><a href=\"publishers.jsp\">Publishers</a></li>\n");
      out.write("                    <li><a href=\"index.jsp\">Contact</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- end #menu -->\n");
      out.write("            ");

                if (u1 == null) {
            
      out.write("\n");
      out.write("            <div id=\"search\">       \n");
      out.write("                <b><h3> <a href = \"login.jsp\">Login </a>\n");
      out.write("                        <label> | </label>\n");
      out.write("                        <a href=\"register.jsp\"> Register</a></h3></b>                 \n");
      out.write("\n");
      out.write("                ");
} else {
      out.write("\n");
      out.write("                <h3><label>");
      out.print(u1.getUsername()+", ");
      out.write("</label>\n");
      out.write("                    <a href=\"LogoutServlet\">logout</a></h3>\n");
      out.write("                ");

                }
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- end #search -->\n");
      out.write("        </div>\n");
      out.write("        <!-- end #header -->\n");
      out.write("    </div>\n");
      out.write("    <!-- end #header-wrapper -->\n");
      out.write("    <div id=\"page\">\n");
      out.write("        <div id=\"logo\">\n");
      out.write("            <h1><a href=\"index.jsp\">Book Store</a></h1>\n");
      out.write("        </div>\n");
      out.write("        <hr/>\n");
      out.write("    \n");
      out.write("\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("        <h2><label>");
      out.print(p.getTitle());
      out.write("</label></h2>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function deletePublisher(id){\n");
      out.write("                var conf = confirm(\"Are you sure that you want to delete '");
      out.print(p.getTitle());
      out.write("'\");\n");
      out.write("                if(conf==true){\n");
      out.write("                    location = \"DeletePublisherServlet?publisherId=");
      out.print(p.getId());
      out.write("\";\n");
      out.write("                    alert(\"'");
      out.print(p.getTitle());
      out.write("' was deleted\");\n");
      out.write("                } else { \n");
      out.write("                                        \n");
      out.write("                }\n");
      out.write("                               \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        ");
if(r.isAdmin(session)){
      out.write("\n");
      out.write("        <div align=\"right\">\n");
      out.write("            <form action=\"EditPublisherServlet?publisherId=");
      out.print(p.getId());
      out.write("\" method=\"post\">\n");
      out.write("                <input type=\"text\" name=\"publisherTitle\" id=\"publisherTitle\" value=\"");
      out.print(p.getTitle());
      out.write("\"/>\n");
      out.write("                <input type=\"text\" name=\"publisherAddress\" id=\"publisherAddress\" value=\"");
      out.print(p.getAddress());
      out.write("\"/>\n");
      out.write("                <input type=\"submit\" value=\"Edit\" style=\"margin-right: 2em; width: 7em\"/>\n");
      out.write("            </form>\n");
      out.write("            <input type=\"button\" name=\"deleteBtn\" onclick=\"deletePublisher(");
      out.print(p.getId());
      out.write(")\" value=\"Delete\" style=\"margin-right: 2em; width: 7em\"/>\n");
      out.write("        </div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <h3><table id=\"page\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>ID</b></td>\n");
      out.write("                    <td><b>Book</b></td>\n");
      out.write("                    <td><b>Ganre</b></td>\n");
      out.write("                    <td><b>Year</b></td>\n");
      out.write("                    <td><b>Price</b></td>\n");
      out.write("                </tr>\n");
      out.write("                ");
                for (Book b : books) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(b.getId());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(b.getTitle());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(b.getGanre().getTitle());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(b.getYear());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(b.getPrice());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
                }
                
      out.write("\n");
      out.write("            </table></h3>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("<div id=\"footer\">\n");
      out.write("    <p>Copyright (c) 2013 BookStore.com. All rights reserved.</p>\n");
      out.write("</div>\n");
      out.write("<!-- end #footer -->\n");
      out.write("</div>\n");
      out.write("<!-- end #page -->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
