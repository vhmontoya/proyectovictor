/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ventasonline.request;

import edu.ventasonline.comun.FuenteDatos;
import edu.ventasonline.modelo.Cliente;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author INNOVASOFTWARE
 */
@ManagedBean(name="request_cliente")
@RequestScoped
public class Request_cliente {
    Cliente cliente;

    public Request_cliente() {
        cliente = new Cliente();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void iniciar()
    {
        FuenteDatos.getEntityManager();
    }
}
