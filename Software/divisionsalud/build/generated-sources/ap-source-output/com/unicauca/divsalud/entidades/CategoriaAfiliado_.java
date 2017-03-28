package com.unicauca.divsalud.entidades;

import com.unicauca.divsalud.entidades.Paciente;
import com.unicauca.divsalud.entidades.TipoRegimen;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-28T01:32:18")
@StaticMetamodel(CategoriaAfiliado.class)
public class CategoriaAfiliado_ { 

    public static volatile SingularAttribute<CategoriaAfiliado, Integer> cuotaBen;
    public static volatile SingularAttribute<CategoriaAfiliado, Integer> cuotaCot;
    public static volatile SingularAttribute<CategoriaAfiliado, TipoRegimen> idRegimen;
    public static volatile CollectionAttribute<CategoriaAfiliado, Paciente> pacienteCollection;
    public static volatile SingularAttribute<CategoriaAfiliado, Integer> id;
    public static volatile SingularAttribute<CategoriaAfiliado, String> copagoCot;
    public static volatile SingularAttribute<CategoriaAfiliado, String> nombre;
    public static volatile SingularAttribute<CategoriaAfiliado, String> copagoBen;
    public static volatile SingularAttribute<CategoriaAfiliado, Integer> maxCopago;

}