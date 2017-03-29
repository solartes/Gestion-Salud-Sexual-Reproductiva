package com.unicauca.divsalud.entidades;

import com.unicauca.divsalud.entidades.CategoriaUsuario;
import com.unicauca.divsalud.entidades.GrupoUsuarioTipo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-29T16:34:42")
@StaticMetamodel(TipoUsuario.class)
public class TipoUsuario_ { 

    public static volatile CollectionAttribute<TipoUsuario, GrupoUsuarioTipo> grupoUsuarioTipoCollection;
    public static volatile SingularAttribute<TipoUsuario, Integer> id;
    public static volatile SingularAttribute<TipoUsuario, CategoriaUsuario> idCategoriaUsuario;
    public static volatile SingularAttribute<TipoUsuario, String> nombre;

}