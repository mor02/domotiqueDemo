<%@ page import="com.servlet.test.model.ColorModel" %>
<html>
<body>
<h1 style="color:<%=((ColorModel) request.getAttribute("colorObject")).getColor() %>">
	R�cup�ration de l'attribut "<em>colorObject.getColor()</em>"
</h1>
<h1 style="color:<%=request.getAttribute("colorString") %>">
	R�cup�ration de l'attribut "<em>colorString</em>"
</h1>
</body>
</html>
