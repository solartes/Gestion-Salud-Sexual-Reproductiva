package com.unicauca.divsalud.entidades;

import com.unicauca.divsalud.entidades.Paciente;
import com.unicauca.divsalud.entidades.Programas;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-28T01:11:23")
@StaticMetamodel(Facultad.class)
public class Facultad_ { 

    public static volatile CollectionAttribute<Facultad, Programas> programasCollection;
    public static volatile CollectionAttribute<Facultad, Paciente> pacienteCollection;
    public static volatile SingularAttribute<Facultad, Integer> id;
    public static volatile SingularAttribute<Facultad, String> nombre;

}