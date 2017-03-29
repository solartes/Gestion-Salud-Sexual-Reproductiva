package com.unicauca.divsalud.validadores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "validar_fecha")
/**
 * Validador para las fechas en formato dd/mm/aaaa
 */
public class ValidarFecha implements Validator
{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException
    {
        String fecha = String.valueOf(value);
        if(!fecha.isEmpty())
        {
            Pattern patron = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\\\d\\\\d)");
            Matcher encaja = patron.matcher(fecha);
            if (!encaja.find()) {
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Formato fecha", "Formato de fecha incorrecto (dd/mm/aaaa)");
                throw new ValidatorException(msg);
            }
        }
        else
        {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "", "Fecha no se ha seleccionado");
            throw new ValidatorException(msg);
        }
            
    }
    
}
