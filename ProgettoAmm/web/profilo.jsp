<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

        <jsp:include page="navBarLaterale.jsp"/>

        <div id="FormAzione">
            <h1>Completa al 100% il tuo profilo</h1>
            <form method="post" action="Profilo">
                <p>
                    <c:if test="${update==true}">
                    <p>Dati aggiornati</p>
                    </c:if>
                    <label for="nome">Nome</label>
                    <input type="text" name="nome">
                    <label for="cognome">Cognome</label>
                    <input type="text" name="cognome">
                    <label for="immagine">URL immagine</label>
                    <input type="text" name="immagine">
                    <label for="frase">Frase di presentazione</label>
                    <textarea rows="4" cols="20" name="frase"></textarea>
                    <label for="nascita">Data di nascita</label>
                    <input type="text" name="nascita">
                    <label for="password1">Password</label>
                    <input type="password" name="password1">
                    <label for="password2">Conferma password</label>
                    <input type="password" name="password2" id="password2">
                    <button type="submit" name="submit" value="submit">conferma</button>
                </p>
            </form>
        </div>
    </body>
</html>

