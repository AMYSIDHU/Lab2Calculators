
package ca.sait.calculators.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



/**
 * Determines the next age of the person.
 * @author AMY 
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

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
        String message="---";
        request.setAttribute("result", message);  
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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

        String firstInput = request.getParameter("first");
        String secondInput = request.getParameter("second");
        request.setAttribute("first",firstInput);
        request.setAttribute("second",secondInput);
        

     
    
        String button = request.getParameter("button");
        String message;



      
        
    

if (firstInput == null && secondInput == null ) {
 message = "Invalid";

 request.setAttribute("result", message);   

} else if (firstInput == null || secondInput == null ){
 message = "Invalid";

 request.setAttribute("result", message);  
} else {


try {

int first = Integer.parseInt(firstInput);
int second = Integer.parseInt(secondInput);
      
switch(button) {

case "+":
 message = (first + second) + "";

 request.setAttribute("result", message); 
break;

 case "-":
 message = (first - second) + "";

 request.setAttribute("result", message); 
break;

case "*":
 message = (first * second) + "";

 request.setAttribute("result", message); 
break;

case "%":
 message = (first / second) + "";

 request.setAttribute("result", message); 
break;






}

 
} catch (NumberFormatException ex) {
 message = "Invalid";
request.setAttribute("result", message);   
}
}


   
        
getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }


}
