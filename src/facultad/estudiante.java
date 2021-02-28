package facultad;

public abstract class estudiante extends persona {

    private int curso;

    private int nuevoCurso;
    
    private int resultado;

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getNuevoCurso() {
        return nuevoCurso;
    }

    public void setNuevoCurso(int nuevoCurso) {
        this.nuevoCurso = nuevoCurso;
    }
}
