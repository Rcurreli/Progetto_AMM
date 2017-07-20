<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
       
    <nav id="anticamera">
        <h2 id="NerdRecinto">
          NERDBOOK
        </h2>
        <c:if test="${loggedIn==null||loggedIn==false}">
            <a href="Login">Accedi</a>
        </c:if>
        
        <c:if test="${loggedIn==true}">
            <a href="Bacheca">Bacheca</a>
        </c:if>
        
        <c:if test="${page!='profilo'&&page!='login'}">
            <a href="Profilo">Profilo</a>
        </c:if>
        
        <c:if test="${loggedIn==true}">
            <a href="descrizione.jsp">Descrizione</a>
            <div id="logout">
                <p>${utente.getNome()}</p>
                <a href="Login?logout=1"> Logout </a>
            </div>
        </c:if>
        
            
    </nav>