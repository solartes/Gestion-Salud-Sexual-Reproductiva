package com.unicauca.divsalud.entidades;

import com.unicauca.divsalud.entidades.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T14:04:54")
@StaticMetamodel(TipoIdentificacion.class)
public class TipoIdentificacion_ { 

    public static volatile CollectionAttribute<TipoIdentificacion, Paciente> pacienteCollection;
    public static volatile SingularAttribute<TipoIdentificacion, String> id;
    public static volatile SingularAttribute<TipoIdentificacion, String> nombre;

}