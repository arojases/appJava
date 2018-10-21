/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author luisponce
 */

@XmlRootElement(name = "seguro")
@XmlAccessorType (XmlAccessType.FIELD)
public class SeguroDTO {
    private int se_id;
    private String se_nombre;
    private String se_empresa;
    private String se_desc;
    private Date se_vigencia;
    private char se_activo;
    private int se_precio;

    public SeguroDTO() {
    }

    public SeguroDTO(int se_id, String se_nombre, String se_empresa, String se_desc, Date se_vigencia, char se_activo, int se_precio) {
        this.se_id = se_id;
        this.se_nombre = se_nombre;
        this.se_empresa = se_empresa;
        this.se_desc = se_desc;
        this.se_vigencia = se_vigencia;
        this.se_activo = se_activo;
        this.se_precio = se_precio;
    }

    
    public int getSe_id() {
        return se_id;
    }

    public void setSe_id(int se_id) {
        this.se_id = se_id;
    }

    public String getSe_nombre() {
        return se_nombre;
    }

    public void setSe_nombre(String se_nombre) {
        this.se_nombre = se_nombre;
    }

    public String getSe_empresa() {
        return se_empresa;
    }

    public void setSe_empresa(String se_empresa) {
        this.se_empresa = se_empresa;
    }

    public String getSe_desc() {
        return se_desc;
    }

    public void setSe_desc(String se_desc) {
        this.se_desc = se_desc;
    }

    public Date getSe_vigencia() {
        return se_vigencia;
    }

    public void setSe_vigencia(Date se_vigencia) {
        this.se_vigencia = se_vigencia;
    }

    public char getSe_activo() {
        return se_activo;
    }

    public void setSe_activo(char se_activo) {
        this.se_activo = se_activo;
    }

    public int getSe_precio() {
        return se_precio;
    }

    public void setSe_precio(int se_precio) {
        this.se_precio = se_precio;
    }
    
    
}
