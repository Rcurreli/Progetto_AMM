/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook.servlet;

import amm.nerdbook.UserFactory;
import amm.nerdbook.User;
import amm.nerdbook.PostFactory;
import amm.nerdbook.Post;
import amm.nerdbook.Post.Type;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 *
 * @author marcotegas
 */
public class Bacheca extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session= request.getSession();
        
        if (session.getAttribute("loggedIn") == null ||
            !session.getAttribute("loggedIn").equals(true)){
            
            response.sendError(401, "Per poter visualizzare il profilo è nesessario autenticarsi");
        }
        else{
            if(session.getAttribute("loggedIn") != null &&
                session.getAttribute("loggedIn").equals(true)){
                
                
                if(request.getParameter("submit")!=null && request.getParameter("submit").equals("submit")){
                    request.setAttribute("invio", true);
                    Post post=new Post();
                    post.setText((String)request.getAttribute("messaggio"));
                    
                }

                User user=UserFactory.getInstance().getUserById((int)session.getAttribute("loggedUserID"));
                request.setAttribute("utente", user);
                List<Post> postList=PostFactory.getInstance().getPostListForUser(user);
                request.setAttribute("posts", postList);
                
                
                
                request.getRequestDispatcher("bacheca.jsp").forward(request, response);
            }
        }  
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
