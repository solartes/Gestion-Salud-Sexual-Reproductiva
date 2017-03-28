package com.unicauca.divsalud.entidades;

import com.unicauca.divsalud.entidades.Municipio;
import com.unicauca.divsalud.entidades.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-28T01:11:23")
@StaticMetamodel(Depto.class)
public class Depto_ { 

    public static volatile CollectionAttribute<Depto, Municipio> municipioCollection;
    public static volatile CollectionAttribute<Depto, Paciente> pacienteCollection1;
    public static volatile CollectionAttribute<Depto, Paciente> pacienteCollection;
    public static volatile SingularAttribute<Depto, Integer> id;
    public static volatile SingularAttribute<Depto, String> nombre;

}