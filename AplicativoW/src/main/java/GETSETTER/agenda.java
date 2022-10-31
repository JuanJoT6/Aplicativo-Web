package GETSETTER;

public class agenda {
    private String cedula;
    private String paciente;
    private String eps;
    private String direccion;
    private String especialidad;
    private String sexo;
    private String observacion;
    private String fechacita;
    private String estado;

    public agenda(String cedula, String paciente, String eps, String direccion, String especialidad, String sexo, String observacion, String fechacita, String estado) {
        this.cedula = cedula;
        this.paciente = paciente;
        this.eps = eps;
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.sexo = sexo;
        this.observacion = observacion;
        this.fechacita = fechacita;
        this.estado = estado;
    }

    public agenda() {

    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getFechacita() {
        return fechacita;
    }

    public void setFechacita(String fechacita) {
        this.fechacita = fechacita;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
