package facultad;

public abstract class perServicio extends persona {

    private String seccion;

    private String trasSeccion;

    private String Ingresofacultad;

    private int despacho;

    private int newDespacho;

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getTrasSeccion() {
        return trasSeccion;
    }

    public void setTrasSeccion(String trasSeccion) {
        this.trasSeccion = trasSeccion;
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
