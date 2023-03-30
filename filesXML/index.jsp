<%-- index.jsp --%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.File" %>
<%@ page import="java.io.IOException" %>
<%@ page import="nu.xom.Builder" %>
<%@ page import="nu.xom.Document" %>
<%@ page import="nu.xom.Node" %>
<%@ page import="nu.xom.Nodes" %>
<%@ page import="nu.xom.ParsingException" %>
<%@ page import="nu.xom.xslt.XSLException" %>
<%@ page import="nu.xom.xslt.XSLTransform" %>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos lista</title>
    </head>
    <body>
        <h1>Productos lista</h1>
    </body>
    <%
        Builder builder;
        Document xml;
        Document xsl;
        XSLTransform transform;
        Nodes nodes;
        
        try {
            builder = new Builder();
            xml = builder.build(new File("c:\\xampp\\tomcat\\webapps\\web_aplikazioa1\\productos.xml"));
            xsl = builder.build(new File("c:\\xampp\\tomcat\\webapps\\web_aplikazioa1\\productos.xsl"));
            transform = new XSLTransform(xsl);
            nodes = transform.transform(xml);
            for (Node node: nodes) {
                out.print(node.toXML());
            }
        }
        catch (XSLException e) {
            out.println("Salbuespena:"+ e);
        }catch (ParsingException e) {
            out.println("Salbuespena" + e);
        }catch (IOException e) {
            out.println("Salbuespena" + e);
        } 
    %>
        
    </body>
</html>