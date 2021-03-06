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

        
         <div>
            <p>
                <a href="#info">Cosa e' Nerdbook?</a>
            </p>
            <p>
                <a href="#abbonamento">Quali sono i costi?</a>
            </p>
            <p>
                <a href="#iscrizione">come funziona la procedura di iscrizione?</a>
            </p>  
        </div>
        
        <div>
            <a id="info">
                <h1>Nerdbook - Nerd di tutto il mondo: unitevi!</h1>
            </a>
            <p>
                 Ben arrivato qui su Nerdbook, l' unico social che mette al primo posto l uomo e la tecnologia.
            </p>
            <a id="abbonamento">
                <h2>Piano di abbonamento</h2>
            </a>
            <p>
                 Nel primo mese l'iscrizione a Nerdbook e' gratuita, in seguito il costo sarà di 10 euro mensili.
            </p> 
            <a id="iscrizione">
             <h3>Iscrizione immediata.</h3>
            </a>
            <p>
                inserire la propria mail,  dati personali basilari, la password e puoi accedere subito a Nerdbook.
            </p>
        </div>

    </body>
</html>
