package com.unicauca.divsalud.entidades;

import com.unicauca.divsalud.entidades.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-28T00:47:43")
@StaticMetamodel(Eps.class)
public class Eps_ { 

    public static volatile CollectionAttribute<Eps, Paciente> pacienteCollection;
    public static volatile SingularAttribute<Eps, Integer> id;
    public static volatile SingularAttribute<Eps, String> nombre;

}