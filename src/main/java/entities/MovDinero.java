package entities;

public class MovDinero {
    private String movConcept;
    private Double montoMov;
    private String usuarioEncargado;

    public MovDinero(String movConcept, Double montoMov, String usuarioEncargado) {
        this.movConcept = movConcept;
        this.montoMov = montoMov;
        this.usuarioEncargado = usuarioEncargado;
    }

    public String getMovConcept() {
        return movConcept;
    }

    public void setMovConcept(String movConcept) {
        this.movConcept = movConcept;
    }

    public Double getMontoMov() {
        return montoMov;
    }

    public void setMontoMov(Double montoMov) {
        this.montoMov = montoMov;
    }

    public String getUsuarioEncargado() {
        return usuarioEncargado;
    }

    public void setUsuarioEncargado(String usuarioEncargado) {
        this.usuarioEncargado = usuarioEncargado;
    }
}
