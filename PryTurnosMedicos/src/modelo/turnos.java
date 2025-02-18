
package modelo;

import java.util.Date;

public class turnos {
    public pacientes pacientes;
    public medicos medicos;
    public Date fechaHora;

    public turnos(pacientes pacientes, medicos medicos, Date fechaHora) {
        this.pacientes = pacientes;
        this.medicos = medicos;
        this.fechaHora = fechaHora;
    }

    public pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public medicos getMedicos() {
        return medicos;
    }

    public void setMedicos(medicos medicos) {
        this.medicos = medicos;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    
}
