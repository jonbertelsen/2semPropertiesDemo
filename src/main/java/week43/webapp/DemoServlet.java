/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week43.webapp;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Properties prop;
        
        prop = loadProperties("config.properties");
        
        request.setAttribute("user", prop.getProperty("user"));
        request.setAttribute("password", prop.getProperty("password"));
        
        request.getRequestDispatcher("WEB-INF/properties.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    protected Properties loadProperties(String filename){
            Properties prop = new Properties();            
            InputStream is = DemoServlet.class.getClassLoader().getResourceAsStream(filename);        
            if (is != null) {
                try {
                    prop.load(is);
                } catch (IOException ex) {
                    Logger.getLogger(DemoServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }      
            return prop;
    }

}
