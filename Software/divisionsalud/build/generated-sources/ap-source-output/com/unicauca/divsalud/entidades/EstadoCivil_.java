package com.unicauca.divsalud.entidades;

import com.unicauca.divsalud.entidades.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-28T12:25:22")
@StaticMetamodel(EstadoCivil.class)
public class EstadoCivil_ { 

    public static volatile CollectionAttribute<EstadoCivil, Paciente> pacienteCollection;
    public static volatile SingularAttribute<EstadoCivil, Integer> id;
    public static volatile SingularAttribute<EstadoCivil, String> nombre;

}