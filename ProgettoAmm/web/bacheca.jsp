<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Bacheca: Nerdbook</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Curreli Riccardo">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>

    <body>

        <jsp:include page="header.jsp"/>

        <jsp:include page="navBarLaterale.jsp"/>

        <div id="bachecaPost">
            <c:if test="${accessDenied==true}">
                <div id="accessDeniedError">Acesso negato, richiesto Login</div>
            </c:if>
            <div id="FraseMalvenuto">
                <h1>${utente.getNome()}:</h1>
                <p>${utente.getFrasePresentazione()}</p>
            </div>
            
            <c:forEach var="post" items="${posts}">
                <div class="Post">
                    
                    <div class="contUtente">
                        <img class="fotoUtente" title="fotoProfilo" alt="Foto profilo ${post.getUser().getNome()} ${post.getUser().getCognome()}" src="${post.getUser().getUrlFotoProfilo()}">
                        <p class="nomeUtente">${post.getUser().getNome()}</p>
                    </div>
                    <p>${post.text}</p>
                        
                    <c:if test="${post.postType == 'IMAGE'}">
                        <img alt="Post con foto" src="${post.getUrl()}">
                    </c:if>
                        
                    <c:if test="${post.postType == 'LINK'}">
                        <a href="${post.getUrl()}">${post.getLinkText()}</a>
                    </c:if>    
                </div>
            </c:forEach>
        </div>

    </body>
</html>

