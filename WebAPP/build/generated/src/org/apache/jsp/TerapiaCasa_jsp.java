package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TerapiaCasa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("        <link href=\"css/Terapiacasa.css\" rel=\"stylesheet\" type=\"text/css\"/> \n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>TERAPIA EN CASA</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header id=\"header\" style=\" background: #007653 !important;\">\n");
      out.write("        <a class=\"logo\" href=\"Principal.jsp\">\n");
      out.write("        </a>\n");
      out.write("        <a class=\"logo\" id=\"ulUserData\" href=\"index.html\"></a> \n");
      out.write("    </header>      \n");
      out.write("        <div class=\"div-head-tittle\"><h2></h2></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form class=\"form1\"> \n");
      out.write("            <section class=\"sec-main\">\n");
      out.write("                <div class=\"div-cont-main\">\n");
      out.write("                    <table style='width: 100%; text-align: center; margin-left: 20px; margin-top: 30px'>\n");
      out.write("                        <thead >\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Numero de identificacion</th>\n");
      out.write("                                <th>Nombres del Paciente</th>\n");
      out.write("                                <th>Nombres del Medico</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td> <div class=\"div-cont-name\"><input type=\"text\"onkeypress='return validaNumericos(event)' id=\"txt-ced\" class=\"inp-ced\" placeholder=\"Numero de identificacion\" name=\"Identificacion\" onkeypress='return validaNumericosA(event)' maxlength=\"15\"/></div></td>\n");
      out.write("                                <td><div class=\"div-cont-name\"><input type=\"text\" disabled=\"true\" id=\"txt-namep\"onkeypress=\"return soloLetras(event)\" class=\"inp-ced\" placeholder=\"Nombres del Paciente\" name=\"nombres paciente\" onkeypress=\"return soloLetras(event)\"/></div></td>\n");
      out.write("                                <td><div class=\"div-cont-name\"><input type=\"text\" id=\"txt-nameme\" class=\"inp-name\" placeholder=\"Nombres del Medico\" name=\"nombres medico\" onkeypress=\"return soloLetras(event)\"disabled=\"true\"/></div></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("\n");
      out.write("                        <thead >\n");
      out.write("                            <tr>                          \n");
      out.write("                                <th>Actividad</th>\n");
      out.write("                                <th>Indicación Médica</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><div class=\"div-cont-lname\"><input type=\"text\" onkeyup=\"mayus(this);\" id=\"txt-lnamem\" class=\"inp-lname\" placeholder=\"Actividad a realizar\" name=\"medicamento\"/></div></td>\n");
      out.write("                                <td><div class=\"div-cont-name\"><input type=\"text\"onkeyup=\"mayus(this);\" id=\"txt-namei\" class=\"inp-name\" placeholder=\"Indicación Médica\" name=\"indicaciones\"/></div></td>\n");
      out.write("                                <td><div style='margin-top: -20px !important;'class=\"div-cont-lname\"><input type=\"button\" id=\"btn-action\" class=\"btn-accept\" value=\"+\"> \n");
      out.write("                                        <input type=\"button\"  id=\"btn-addReceta\" class=\"btn-accept\" value=\"GUARDAR\"></div></td> \n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>                        \n");
      out.write("                    </table> \n");
      out.write("\n");
      out.write("                    <div style=\"width: 70%; height: auto; margin-left: auto; margin-right: auto\" >\n");
      out.write("                        <div >\n");
      out.write("                            <table id=\"tabla\" class=\"table table-bordered\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr> \n");
      out.write("\n");
      out.write("                                        <td>Nª</td>\n");
      out.write("                                        <td>Actividades</td>\n");
      out.write("                                        <td>Indicaciones Médicas</td>\n");
      out.write("                                        <td>Acciones</td>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section> \n");
      out.write("        </form>\n");
      out.write("        <script>\n");
      out.write("            function mayus(e) {\n");
      out.write("                e.value = e.value.toUpperCase();\n");
      out.write("            }\n");
      out.write("            function validaNumericos(event) {\n");
      out.write("                if (event.charCode >= 48 && event.charCode <= 57) {\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("                if (event.charCode == 13) {\n");
      out.write("                    console.log(\"unio\");\n");
      out.write("                    buscador1();\n");
      out.write("                }\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            function soloLetras(e) {\n");
      out.write("                key = e.keyCode || e.which;\n");
      out.write("                tecla = String.fromCharCode(key).toLowerCase();\n");
      out.write("                letras = \" áéíóúabcdefghijklmnñopqrstuvwxyz\";\n");
      out.write("                especiales = [8, 37, 39, 46];\n");
      out.write("\n");
      out.write("                tecla_especial = false\n");
      out.write("                for (var i in especiales) {\n");
      out.write("                    if (key == especiales[i]) {\n");
      out.write("                        tecla_especial = true;\n");
      out.write("                        break;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (letras.indexOf(tecla) == -1 && !tecla_especial)\n");
      out.write("                    return false;\n");
      out.write("            }\n");
      out.write("            function verificarCedula(cedula) {\n");
      out.write("                if (typeof (cedula) == 'string' && cedula.length == 10 && /^\\d+$/.test(cedula)) {\n");
      out.write("                    var digitos = cedula.split('').map(Number);\n");
      out.write("                    var codigo_provincia = digitos[0] * 10 + digitos[1];\n");
      out.write("\n");
      out.write("                    //if (codigo_provincia >= 1 && (codigo_provincia <= 24 || codigo_provincia == 30) && digitos[2] < 6) {\n");
      out.write("\n");
      out.write("                    if (codigo_provincia >= 1 && (codigo_provincia <= 24 || codigo_provincia == 30)) {\n");
      out.write("                        var digito_verificador = digitos.pop();\n");
      out.write("\n");
      out.write("                        var digito_calculado = digitos.reduce(\n");
      out.write("                                function (valorPrevio, valorActual, indice) {\n");
      out.write("                                    return valorPrevio - (valorActual * (2 - indice % 2)) % 9 - (valorActual == 9) * 9;\n");
      out.write("                                }, 1000) % 10;\n");
      out.write("                        return digito_calculado === digito_verificador;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("    <footer></footer>\n");
      out.write("    <script src=\"js/jquery-2.1.1.min.js\" type=\"text/javascript\"></script>   \n");
      out.write("    <script src=\"js/recetamedica.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"js/Buscadorpaciente.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"js/newjavascript.js\" type=\"text/javascript\"></script>    \n");
      out.write("</html>\n");
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
