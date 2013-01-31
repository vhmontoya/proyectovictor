/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ventasonline.request;

import edu.ventasonline.modelo.Factura;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author INNOVASOFTWARE
 */
@ManagedBean(name="request_factura")
@RequestScoped
public class Request_factura {
    Factura factura;

    public Request_factura() {
        factura = new Factura();
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    
}
