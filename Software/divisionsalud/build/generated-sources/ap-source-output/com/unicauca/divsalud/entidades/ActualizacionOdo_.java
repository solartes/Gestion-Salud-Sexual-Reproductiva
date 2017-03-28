package com.unicauca.divsalud.entidades;

import com.unicauca.divsalud.entidades.Paciente;
import com.unicauca.divsalud.entidades.UsuariosSistema;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-28T01:11:23")
@StaticMetamodel(ActualizacionOdo.class)
public class ActualizacionOdo_ { 

    public static volatile SingularAttribute<ActualizacionOdo, Paciente> idPaciente;
    public static volatile SingularAttribute<ActualizacionOdo, Date> fecha;
    public static volatile SingularAttribute<ActualizacionOdo, String> tipo;
    public static volatile SingularAttribute<ActualizacionOdo, String> parentesco;
    public static volatile SingularAttribute<ActualizacionOdo, String> hora;
    public static volatile SingularAttribute<ActualizacionOdo, UsuariosSistema> idUsuario;
    public static volatile SingularAttribute<ActualizacionOdo, String> celular;
    public static volatile SingularAttribute<ActualizacionOdo, Integer> id;
    public static volatile SingularAttribute<ActualizacionOdo, String> telefono;
    public static volatile SingularAttribute<ActualizacionOdo, String> acompanante;

}