package com.unicauca.divsalud.entidades;

import com.unicauca.divsalud.entidades.Facultad;
import com.unicauca.divsalud.entidades.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-28T19:55:08")
@StaticMetamodel(Programas.class)
public class Programas_ { 

    public static volatile CollectionAttribute<Programas, Paciente> pacienteCollection;
    public static volatile SingularAttribute<Programas, Integer> id;
    public static volatile SingularAttribute<Programas, String> nombre;
    public static volatile SingularAttribute<Programas, Facultad> facultad;

}