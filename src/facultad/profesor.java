package facultad;

public abstract class profesor extends persona {

    private String departamento;

    private String CambDepartamento;

    private String Ingresofacultad;

    private int despacho;

    private int newDespacho;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCambDepartamento() {
        return CambDepartamento;
    }

    public void setCambDepartamento(String CambDepartamento) {
        this.CambDepartamento = CambDepartamento;
    }

    public String getIngresofacultad() {
        return Ingresofacultad;
    }

    public void setIngresofacultad(String Ingresofacultad) {
        this.Ingresofacultad = Ingresofacultad;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    public int getNewDespacho() {
        return newDespacho;
    }

    public void setNewDespacho(int newDespacho) {
        this.newDespacho = newDespacho;
    }
}
