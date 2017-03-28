package com.unicauca.divsalud.entidades;

import com.unicauca.divsalud.entidades.ActualizacionOdo;
import com.unicauca.divsalud.entidades.CategoriaAfiliado;
import com.unicauca.divsalud.entidades.Depto;
import com.unicauca.divsalud.entidades.Eps;
import com.unicauca.divsalud.entidades.Escolaridad;
import com.unicauca.divsalud.entidades.EstadoCivil;
import com.unicauca.divsalud.entidades.Estrato;
import com.unicauca.divsalud.entidades.Facultad;
import com.unicauca.divsalud.entidades.Municipio;
import com.unicauca.divsalud.entidades.Parentesco;
import com.unicauca.divsalud.entidades.Programas;
import com.unicauca.divsalud.entidades.Raza;
import com.unicauca.divsalud.entidades.TipoAfiliado;
import com.unicauca.divsalud.entidades.TipoIdentificacion;
import com.unicauca.divsalud.entidades.TipoRegimen;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-28T02:38:20")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, String> estado;
    public static volatile SingularAttribute<Paciente, CategoriaAfiliado> categoriaAfiliado;
    public static volatile SingularAttribute<Paciente, Date> fechaNacimiento;
    public static volatile SingularAttribute<Paciente, TipoRegimen> tipoRegimen;
    public static volatile SingularAttribute<Paciente, TipoIdentificacion> tipoIdentificacion;
    public static volatile SingularAttribute<Paciente, Programas> programa;
    public static volatile SingularAttribute<Paciente, String> ocupacion;
    public static volatile SingularAttribute<Paciente, String> nombre2;
    public static volatile SingularAttribute<Paciente, String> nombre1;
    public static volatile SingularAttribute<Paciente, Municipio> municipioResidencia;
    public static volatile SingularAttribute<Paciente, Date> fechaApertura;
    public static volatile SingularAttribute<Paciente, String> personaResponsable;
    public static volatile SingularAttribute<Paciente, Estrato> estrato;
    public static volatile SingularAttribute<Paciente, Municipio> municipioNacimiento;
    public static volatile SingularAttribute<Paciente, Integer> id;
    public static volatile SingularAttribute<Paciente, String> telefono;
    public static volatile CollectionAttribute<Paciente, ActualizacionOdo> actualizacionOdoCollection;
    public static volatile SingularAttribute<Paciente, Character> zonaResidencia;
    public static volatile SingularAttribute<Paciente, Facultad> facultad;
    public static volatile SingularAttribute<Paciente, String> apellido2;
    public static volatile SingularAttribute<Paciente, String> direccionPresponsable;
    public static volatile SingularAttribute<Paciente, Raza> raza;
    public static volatile SingularAttribute<Paciente, String> apellido1;
    public static volatile SingularAttribute<Paciente, String> direccion;
    public static volatile SingularAttribute<Paciente, Eps> eps;
    public static volatile SingularAttribute<Paciente, String> identificacion;
    public static volatile SingularAttribute<Paciente, EstadoCivil> estadoCivil;
    public static volatile SingularAttribute<Paciente, TipoAfiliado> tipoAfiliado;
    public static volatile SingularAttribute<Paciente, Escolaridad> escolaridad;
    public static volatile SingularAttribute<Paciente, Depto> deptoResidencia;
    public static volatile SingularAttribute<Paciente, Parentesco> parentesco;
    public static volatile SingularAttribute<Paciente, Depto> deptoNacimiento;
    public static volatile SingularAttribute<Paciente, Character> sexo;
    public static volatile SingularAttribute<Paciente, String> telefonoPresponsable;
    public static volatile SingularAttribute<Paciente, String> carpeta;

}