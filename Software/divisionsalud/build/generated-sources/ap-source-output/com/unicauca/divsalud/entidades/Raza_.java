package com.unicauca.divsalud.entidades;

import com.unicauca.divsalud.entidades.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-28T01:11:23")
@StaticMetamodel(Raza.class)
public class Raza_ { 

    public static volatile CollectionAttribute<Raza, Paciente> pacienteCollection;
    public static volatile SingularAttribute<Raza, Integer> id;
    public static volatile SingularAttribute<Raza, String> nombre;

}