/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import java.io.IOException;
import java.io.StringWriter;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author mitzi
 */
public class resultado extends SimpleTagSupport {
    StringWriter  nombre = new StringWriter  (); 

    
    @Override
    public void doTag() throws JspException, IOException { 
        
    
            getJspBody().invoke(nombre);
        getJspContext().getOut().println("Yo soy " + nombre.toString()+ " y el día de hoy es 18 de marzo 2021");
        JspFragment f = getJspBody(); 
        
    }
    
}
