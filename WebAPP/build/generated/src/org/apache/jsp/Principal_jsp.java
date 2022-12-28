package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>DIRECCION DE DESARROLLO SOCIAL</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"icon\" type=\"img/logoblancod.ico\" href=\"img/logoblancod.ico\"/>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Principal/css/main.css\" />\r\n");
      out.write("        <link href=\"css/animacionprincipal.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body class=\"is-preload\">    \r\n");
      out.write("       ");

            HttpSession s = request.getSession();
            //variables de session
        
      out.write("    \r\n");
      out.write("        <label id=\"usuario\" style=\"display:none;\">");
      out.print( s.getAttribute("galeno_user11"));
      out.write(" </label> \r\n");
      out.write("        <label id=\"nombre\"></label>\r\n");
      out.write("\r\n");
      out.write("        <header id=\"header\" style=\"\">\r\n");
      out.write("\r\n");
      out.write("            <header id=\"header\" style=\" background: #007653 !important;\">\r\n");
      out.write("                <a class=\"logo\" href=\"index.jsp\">\r\n");
      out.write("                </a>\r\n");
      out.write("                <a class=\"logo\" id=\"ulUserData\" href=\"index.html\"></a>\r\n");
      out.write("                <nav>\r\n");
      out.write("                    <a href=\"cambioclave.jsp\" style=\"color:white\" >Cambiar clave</a>\r\n");
      out.write("                    <a href=\"cerrar.jsp\" style=\"color:white\" >Cerrar sesión</a>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </header>\r\n");
      out.write("        </header>\r\n");
      out.write("        <!-- container principal -->\r\n");
      out.write("        <section class=\"wrapper\">\r\n");
      out.write("            <div class=\"inner\">\r\n");
      out.write("                <div class=\"highlights\">\r\n");
      out.write("                    <!-- PRIMER MODULO -->\r\n");
      out.write("                    <section class=\"animadoagregarinformacion\">\r\n");
      out.write("                        <div class=\"content\">\r\n");
      out.write("                            <header>\r\n");
      out.write("                                <a href=\"\">\r\n");
      out.write("                                    <img alt=\"\" src=\"img/icons8_workstation_96px.png\">\r\n");
      out.write("                                    <span class=\"label\"></span></a>\r\n");
      out.write("                                <h3 style=\"color:#007653; font-weight: bold\">AGREGAR CONSULTA MEDICA Y RECETA</h3>\r\n");
      out.write("\r\n");
      out.write("                            </header>\r\n");
      out.write("                            <p>Agregar consulta sobre el  paciente y receta medica</p>\r\n");
      out.write("                            <a id=\"PaginaMedi\" class=\"button primary\" style=\" background: #007653 !important;\" >Agregar consulta o receta</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("\r\n");
      out.write("                    <!-- SEGUNDO MODULO -->\r\n");
      out.write("                    <section class=\"animadoagregarinformacion\">\r\n");
      out.write("                        <div class=\"content\">\r\n");
      out.write("                            <header>\r\n");
      out.write("                                <a href=\"\" >\r\n");
      out.write("                                    <img alt=\"\" src=\"img/icon-terapia-fisica-principal.png\">\r\n");
      out.write("                                    <span class=\"label\"></span></a>\r\n");
      out.write("                                <h3 style=\"color:#007653; font-weight: bold\" class=\"textgrueso\">TERAPIA FÍSICA</h3>\r\n");
      out.write("                            </header>\r\n");
      out.write("                            <p>Ingresar al módulo de ateción del área de terapia física</p>\r\n");
      out.write("                            <a id=\"PaginaTerapia\" class=\"button primary\" style=\" background: #007653 !important;\">Ingresar</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("                    \r\n");
      out.write("                    <!-- TERCER MODULO -->\r\n");
      out.write("                    <section class=\"animadoagregarinformacion\">\r\n");
      out.write("                        <div class=\"content\">\r\n");
      out.write("                            <header>\r\n");
      out.write("                                <a href=\"\" >\r\n");
      out.write("                                    <img alt=\"\" src=\"img/icons8_account_96px.png\">\r\n");
      out.write("                                    <span class=\"label\"></span></a>\r\n");
      out.write("                                <h3 style=\"color:#007653; font-weight: bold\" class=\"textgrueso\">Reportes</h3>\r\n");
      out.write("                            </header>\r\n");
      out.write("                            <p>Descargar en PDF las actividades o recetas medicas de los pacientes</p>\r\n");
      out.write("                            <a href=\"Reportes.jsp\" class=\"button primary\" style=\" background: #007653 !important;\">Ver reportes</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("\r\n");
      out.write("                    <!-- CUARTO MODULO -->                 \r\n");
      out.write("                    <section class=\"animadoagregarinformacion\">\r\n");
      out.write("                        <div class=\"content\">\r\n");
      out.write("                            <header>\r\n");
      out.write("                                <a href=\"\">\r\n");
      out.write("                                    <img alt=\"\" src=\"img/icons8_accounting_96px.png\">\r\n");
      out.write("                                    <span class=\"label\"></span></a>\r\n");
      out.write("                                <h3 style=\"color:#007653; font-weight: bold\">Historial</h3>\r\n");
      out.write("                            </header>\r\n");
      out.write("                            <p>Mostrar la información de las actividades de los pacientes</p>\r\n");
      out.write("                            <a href=\"HistorialPaciente.jsp\" class=\"button primary\"style=\" background: #007653 !important;\">Ver historial</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("\r\n");
      out.write("                    <!-- QUINTO MODULO -->\r\n");
      out.write("                    <!-- <section class=\"animadoagregarinformacion\">\r\n");
      out.write("                         <div class=\"content\">\r\n");
      out.write("                             <header>\r\n");
      out.write("                                 <a href=\"\">\r\n");
      out.write("                                     <img alt=\"\" src=\"img/icons8_cv_96px.png\">\r\n");
      out.write("                                     <span class=\"label\"></span></a>\r\n");
      out.write("                                 <h3 style=\"color:#007653; font-weight: bold\">Transferir Paciente</h3>\r\n");
      out.write("                             </header>\r\n");
      out.write("                             <p>Transferir un paciente a otro departamento</p>\r\n");
      out.write("                             <a href=\"TransferirPaciente.jsp\" class=\"button primary\" style=\" background: #007653 !important;\">Acceder</a>\r\n");
      out.write("                         </div>\r\n");
      out.write("                     </section>-->\r\n");
      out.write("                    <!-- QUINTO MODULO -->\r\n");
      out.write("                    <section class=\"animadoagregarinformacion\">\r\n");
      out.write("                        <div class=\"content\">\r\n");
      out.write("                            <header>\r\n");
      out.write("                                <a href=\"\">\r\n");
      out.write("                                    <img alt=\"\" src=\"img/icons8_profile_96px.png\">\r\n");
      out.write("                                    <span class=\"label\"></span></a>\r\n");
      out.write("                                <h3 style=\"color:#007653; font-weight: bold\">Actualizar datos personales medico</h3>\r\n");
      out.write("                            </header>\r\n");
      out.write("                            <p>Podrá actualizar sus datos personales, en caso de alguna actualización</p>\r\n");
      out.write("                            <a href=\"ActualizarDatosPersonalesMedicos.jsp\" class=\"button primary\" style=\" background: #007653 !important;\">Acceder</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("                    <!-- SEXTO MODULO -->\r\n");
      out.write("                    <section class=\"animadoagregarinformacion\">\r\n");
      out.write("                        <div class=\"content\">\r\n");
      out.write("                            <header>\r\n");
      out.write("                                <a href=\"\">\r\n");
      out.write("                                    <img alt=\"\" src=\"svg/medico.svg\" width=\"96\" height=\"96\">\r\n");
      out.write("                                    <span class=\"label\"></span></a>\r\n");
      out.write("                                <h3 style=\"color:#007653; font-weight: bold\">Ingresar Paciente</h3>\r\n");
      out.write("                            </header>\r\n");
      out.write("                            <p>Ingresar datos personales por primera vez del paciente</p>\r\n");
      out.write("                            <a href=\"ingreso.jsp\" class=\"button primary\" style=\" background: #007653 !important;\">Ingresar Paciente</a>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <a href=\"Actualizardatospaciente.jsp\" class=\"button primary\" style=\" background: #007653 !important; margin-top: 12px;\">Actualizar paciente</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("                    <!-- SEPTIMO MODULO -->\r\n");
      out.write("                    <section class=\"animadoagregarinformacion\">\r\n");
      out.write("                        <div class=\"content\">\r\n");
      out.write("                            <header>\r\n");
      out.write("                                <a href=\"\">\r\n");
      out.write("                                    <img alt=\"\" src=\"svg/resultados-de-los-examenes.svg\" width=\"96\" height=\"96\">\r\n");
      out.write("                                    <span class=\"label\"></span></a>\r\n");
      out.write("                                <h3 style=\"color:#007653; font-weight: bold\">EXAMENES</h3>\r\n");
      out.write("                            </header>\r\n");
      out.write("                            <p>Subir o actualizar examenes del paciente</p>\r\n");
      out.write("                            <a href=\"ListarPacientes.jsp\" class=\"button primary\" style=\" background: #007653 !important;\">Subir examenes</a>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <a href=\"ListarPacientesGeneral.jsp\" class=\"button primary\" style=\" background: #007653 !important; margin-top: 12px;\">Actualizar examenes</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Scripts -->\r\n");
      out.write("        <script src=\"js/jquery-2.1.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"Principal/js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"Principal/js/browser.min.js\"></script>\r\n");
      out.write("        <script src=\"Principal/js/breakpoints.min.js\"></script>\r\n");
      out.write("        <script src=\"Principal/js/util.js\"></script>\r\n");
      out.write("        <script src=\"Principal/js/main.js\"></script>\r\n");
      out.write("        <script src=\"js/animacion.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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
