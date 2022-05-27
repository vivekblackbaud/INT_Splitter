<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="3.0">
    <!-- test feature1 -->
    <xsl:output method="text" indent="yes"/>
    <xsl:template match="/">
        <xsl:for-each select="row">
        <xsl:value-of select="ref1"/>
        <text>,</text>
       <xsl:value-of select="ref2"/>
        </xsl:for-each>
    </xsl:template>
    
</xsl:stylesheet>