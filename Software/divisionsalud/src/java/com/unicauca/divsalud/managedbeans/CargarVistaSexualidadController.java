/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.divsalud.managedbeans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Daniela
 */
@Named(value = "cargarVistaSexualidad")
@SessionScoped
public class CargarVistaSexualidadController extends VistaController implements Serializable
{

    
    public CargarVistaSexualidadController()
    {
    }
    @Override
    public void cargarRegistrarPaciente()
    {
        ruta = "/usuariodelsistema/sexualidad/paciente/create.xhtml";
    }
    public void cargarRegistrarMetodoAnticonceptivo()
    {
        ruta = "/usuariodelsistema/sexualidad/metodo_planificacion/create.xhtml";
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public void cargarEditarPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cargarVerPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cargarListarPaciente() {
        ruta = "/usuariodelsistema/sexualidad/paciente/list.xhtml";
        System.out.println("ruta "+ruta);
    }

    @Override
    public void cargarPerfilUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
