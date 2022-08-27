package entities;

public class Empleado {
    private String nombreEmpleado;
    private String correoEmpleado;
    private String empresaEmpleadoPertenece;
    private String roleEmpleado;

    public Empleado(String nombreEmpleado, String correoEmpleado, String empresaEmpleadoPertenece, String roleEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaEmpleadoPertenece = empresaEmpleadoPertenece;
        this.roleEmpleado = roleEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getEmpresaEmpleadoPertenece() {
        return empresaEmpleadoPertenece;
    }

    public void setEmpresaEmpleadoPertenece(String empresaEmpleadoPertenece) {
        this.empresaEmpleadoPertenece = empresaEmpleadoPertenece;
    }

    public String getRoleEmpleado() {
        return roleEmpleado;
    }

    public void setRoleEmpleado(String roleEmpleado) {
        this.roleEmpleado = roleEmpleado;
    }
}
