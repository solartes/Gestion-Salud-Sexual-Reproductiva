package com.unicauca.divsalud.entidades;

import com.unicauca.divsalud.entidades.Depto;
import com.unicauca.divsalud.entidades.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-28T01:32:18")
@StaticMetamodel(Municipio.class)
public class Municipio_ { 

    public static volatile CollectionAttribute<Municipio, Paciente> pacienteCollection1;
    public static volatile CollectionAttribute<Municipio, Paciente> pacienteCollection;
    public static volatile SingularAttribute<Municipio, String> id;
    public static volatile SingularAttribute<Municipio, String> nombre;
    public static volatile SingularAttribute<Municipio, Depto> idDepto;

}