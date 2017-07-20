<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Nerdbook - Il vero Social Network per Nerd (e Geek) </title>
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Curreli Riccardo">
        <meta name="description" content="Unico collante per gli asociali">
        <meta name="keywords" content="Network">   
    </head>
    
    <body>
        <jsp:include page="header.jsp"/>
        
        

        <div id="FormAzione">
           
            
            <h1>Login</h1>
            <form action="Login" method="post">
                
                <c:if test="${invalidData == true}">
                    <div id="invalidDataWarning">I dati inseriti non sono corretti</div>
                </c:if>
                <c:if test="${accessDenied==true}">
                    <div id="accessDeniedError">Utente già autenticato</div>
                </c:if>
                
                <label for="Nickname">Nome Utente</label>
                <input type="text" name="Nickname" id="Nickname">
                
                <label for="password">password</label>
                <input type="password" name="password" id="password">
                
                <button type="submit">conferma</button>
            </form>
        </div>
    </body>
</html>
