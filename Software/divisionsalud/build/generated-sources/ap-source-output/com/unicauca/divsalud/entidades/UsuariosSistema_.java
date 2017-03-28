package com.unicauca.divsalud.entidades;

import com.unicauca.divsalud.entidades.ActualizacionOdo;
import com.unicauca.divsalud.entidades.GrupoUsuarioTipo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-28T12:25:22")
@StaticMetamodel(UsuariosSistema.class)
public class UsuariosSistema_ { 

    public static volatile SingularAttribute<UsuariosSistema, String> apellidos;
    public static volatile SingularAttribute<UsuariosSistema, String> extension;
    public static volatile SingularAttribute<UsuariosSistema, String> identificacion;
    public static volatile SingularAttribute<UsuariosSistema, String> login;
    public static volatile SingularAttribute<UsuariosSistema, String> nombres;
    public static volatile SingularAttribute<UsuariosSistema, String> registro;
    public static volatile CollectionAttribute<UsuariosSistema, GrupoUsuarioTipo> grupoUsuarioTipoCollection;
    public static volatile SingularAttribute<UsuariosSistema, String> celular;
    public static volatile SingularAttribute<UsuariosSistema, String> contrasena;
    public static volatile SingularAttribute<UsuariosSistema, Integer> id;
    public static volatile SingularAttribute<UsuariosSistema, String> cargo;
    public static volatile SingularAttribute<UsuariosSistema, String> telefono;
    public static volatile CollectionAttribute<UsuariosSistema, ActualizacionOdo> actualizacionOdoCollection;
    public static volatile SingularAttribute<UsuariosSistema, Integer> activo;

}