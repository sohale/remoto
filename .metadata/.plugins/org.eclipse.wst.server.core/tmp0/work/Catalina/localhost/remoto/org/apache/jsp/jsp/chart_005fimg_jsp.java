/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.30
 * Generated at: 2013-09-25 22:40:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class chart_005fimg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String cdSimulation = (String)request.getAttribute( "cdSimulation" );

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\"><!-- InstanceBegin template=\"/Templates/template2.dwt\" codeOutsideHTMLIsLocked=\"false\" -->\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"bg.css\"/>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"favicon.ico\" />\r\n");
      out.write("<!-- InstanceBeginEditable name=\"doctitle\" -->\r\n");
      out.write("<title>Graphic Result</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".summary {\r\n");
      out.write("\tbackground-color: #F5F9FA;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\theight: auto;\r\n");
      out.write("\twidth: 900px;\r\n");
      out.write("\tmargin-right: auto;\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("\tborder: medium solid #C0DCE2;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<!-- InstanceEndEditable -->\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".first {\r\n");
      out.write("\tmargin-right: auto;\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("\twidth: 1020px;\r\n");
      out.write("\tbackground-color: #666;\r\n");
      out.write("\theight: auto;\r\n");
      out.write("\tmin-height: 620px;\r\n");
      out.write("\tmin-width: 800px;\r\n");
      out.write("\tpadding-top: 5px;\r\n");
      out.write("\tpadding-right: 2px;\r\n");
      out.write("\tpadding-bottom: 10px;\r\n");
      out.write("\tpadding-left: 2px;\r\n");
      out.write("\tborder-top-width: 0px;\r\n");
      out.write("\tborder-right-width: 0px;\r\n");
      out.write("\tborder-bottom-width: 0px;\r\n");
      out.write("\tborder-left-width: 0px;\r\n");
      out.write("\tborder-top-style: none;\r\n");
      out.write("\tborder-right-style: none;\r\n");
      out.write("\tborder-bottom-style: none;\r\n");
      out.write("\tborder-left-style: none;\r\n");
      out.write("}\r\n");
      out.write(".banner {\r\n");
      out.write("\theight: auto;\r\n");
      out.write("\twidth: 1024px;\r\n");
      out.write("\tmargin-right: auto;\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("\tmax-width: 1024px;\r\n");
      out.write("\tborder-top-width: 2px;\r\n");
      out.write("\tborder-right-width: 2px;\r\n");
      out.write("\tborder-bottom-width: 0px;\r\n");
      out.write("\tborder-left-width: 2px;\r\n");
      out.write("\tborder-top-style: none;\r\n");
      out.write("\tborder-right-style: none;\r\n");
      out.write("\tborder-bottom-style: none;\r\n");
      out.write("\tborder-left-style: none;\r\n");
      out.write("}\r\n");
      out.write(".second {\r\n");
      out.write("\tbackground-color: #154151;\r\n");
      out.write("\twidth: 98%;\r\n");
      out.write("\tmargin-right: auto;\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("\tborder-left-width: medium;\r\n");
      out.write("\tborder-left-style: solid;\r\n");
      out.write("\tborder-left-color: #59ACBB;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\theight: 42px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#links {\r\n");
      out.write("\tfont-family: \"Times New Roman\", Times, serif;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\twidth: 1024px;\r\n");
      out.write("\tmargin-right: auto;\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("}\r\n");
      out.write("#footer {\r\n");
      out.write("\tfont-family: \"Times New Roman\", Times, serif;\r\n");
      out.write("\tfont-size: small;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\twidth: 1024px;\r\n");
      out.write("\tmargin-right: auto;\r\n");
      out.write("\tmargin-left: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<!-- InstanceBeginEditable name=\"head\" -->\r\n");
      out.write("<link href=\"hint.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<!-- InstanceEndEditable -->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"banner\"><img src=\"remoto_top.png\" width=\"1024\" height=\"154\" alt=\"ReMoto\" /></div>\r\n");
      out.write("<div class=\"first\"><!-- InstanceBeginEditable name=\"EditRegion1\" -->\r\n");
      out.write("\r\n");
      out.write("<p>\r\n");
      out.write("<div class=\"summary\"><IMG\r\n");
      out.write("\tSRC=\"/remoto/servlet/ServletChartGenerator?cdSimulation=");
      out.print(cdSimulation);
      out.write("&id=");
      out.print(Math.random());
      out.write("\"\r\n");
      out.write("\tBORDER=0 /> <br />\r\n");
      out.write("<br />\r\n");
      out.write("</div>\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<!-- InstanceEndEditable --></div>\r\n");
      out.write("<div id=\"links\">\r\n");
      out.write("\t\t\t<hr /><a href=\"http://www.usp.br/\" target=\"_blank\">USP</a> |\r\n");
      out.write("\t\t\t<a href=\"http://www.poli.usp.br/\" target=\"_blank\">POLI</a> |\r\n");
      out.write("<a href=\"http://www.leb.usp.br/\" target=\"_blank\">LEB</a><hr />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t\t\tCopyright &copy; 2011 Biomedical Engineering Laboratory. All rights \r\n");
      out.write("\t\t\treserved.</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<!-- InstanceEnd --></html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
