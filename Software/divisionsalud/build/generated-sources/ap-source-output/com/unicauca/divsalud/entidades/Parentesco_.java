package com.unicauca.divsalud.entidades;

import com.unicauca.divsalud.entidades.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-28T00:47:43")
@StaticMetamodel(Parentesco.class)
public class Parentesco_ { 

    public static volatile CollectionAttribute<Parentesco, Paciente> pacienteCollection;
    public static volatile SingularAttribute<Parentesco, Integer> id;
    public static volatile SingularAttribute<Parentesco, String> nombre;

}