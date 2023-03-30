<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html"/>
    <xsl:template match="/">
        <html>
        <head>
            <title>Productos</title>
        </head>
        <body>
            <center><h1>Stock de Productos</h1></center>
            <center>
            <table width = "1000">
                <tr bgcolor="orange" color="white">
                    <th>Id</th>
                    <th>Marca</th>
                    <th>Precio</th>
                    <th>Descuento</th>
                    <th>Tipo</th>
                    <th>Color</th>
                    <th>Teclas</th>
                    <th>Conector</th>
                    <th>Envio</th>
                    <th>PVP</th>
                </tr>
                <!-- <xsl:for-each select="productos/teclado"> -->
                <xsl:for-each select="productos/teclado[marca = 'FENDER']">
                    <tr>
                            <td align="center"><xsl:value-of select="@id"/></td>
                            <td align="center"><xsl:value-of select="marca"/></td>
                            <td align="center"><xsl:value-of select="precio"/></td>
                            <td align="center"><xsl:value-of select="descuento"/></td>
                            <td align="center"><xsl:value-of select="tipo"/></td>
                            <td align="center"><xsl:value-of select="color"/></td>
                            <td align="center"><xsl:value-of select="teclas"/></td>
                            <td align="center"><xsl:value-of select="conector"/></td>
                            <td align="center"><xsl:value-of select="envio"/></td>
                            <td align="center"><xsl:value-of select="pvp"/></td>
                    </tr>
                </xsl:for-each>
            </table>
            </center>
        </body>
        </html>
        </xsl:template>
</xsl:stylesheet>