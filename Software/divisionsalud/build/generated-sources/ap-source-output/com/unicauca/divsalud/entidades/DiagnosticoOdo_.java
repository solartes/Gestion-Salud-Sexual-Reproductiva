package com.unicauca.divsalud.entidades;

import com.unicauca.divsalud.entidades.ActualizacionOdo;
import com.unicauca.divsalud.entidades.Tipodiagnostico;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-28T02:38:20")
@StaticMetamodel(DiagnosticoOdo.class)
public class DiagnosticoOdo_ { 

    public static volatile SingularAttribute<DiagnosticoOdo, String> ndx;
    public static volatile SingularAttribute<DiagnosticoOdo, String> dx;
    public static volatile SingularAttribute<DiagnosticoOdo, ActualizacionOdo> idActualizacion;
    public static volatile SingularAttribute<DiagnosticoOdo, Integer> id;
    public static volatile SingularAttribute<DiagnosticoOdo, Tipodiagnostico> tipodiagnostico;

}