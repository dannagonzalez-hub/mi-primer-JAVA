package facultad_1;

import facultad.estudiante;
import facultad.profesor;
import facultad.perServicio;
import java.lang.*;


public class facultad_1 {

    public static void main(String[] args) {
        estudiante estudy = new estudiante() {
        };
        estudy.setNombre("Por favor ingresa tu nombre");
        estudy.setApellido("Por favor ingresa tu apellido");
        estudy.setEstadoCivil("Por gavor ingresa tu estado civil");
        estudy.setCurso(0);
        estudy.setNuevoCurso(0);
        
        
     
        System.out.println("El nombre del alumno es" + estudy.getNombre() + estudy.getApellido() + "numero de identificacion" + "el estado civil del alumno es" + estudy.getEstadoCivil() + "el alumno se encuentra en el curso" + estudy.getCurso() + "el estudiante va cursar" + estudy.getNuevoCurso()+"ANTES DE HACER LA SUMA");
        
        
        
        int curso = 1;
        int nuevoCurso = 1;
        int resultado = 0;
        
        
        try{resultado = nuevoCurso + curso;
        }
        catch(ArithmeticException ex){
            
         resultado = 0;
        
        System.out.println("Error:" + ex.getMessage());
        
       }
       finally{ System.out.println("Resultado" + resultado);
    
    
    
    
    }
        
        
        
        
        
        profesor prof = new profesor() {
        };
        
       
 prof.setNombre("Por favor ingresa tu nombre");
        prof.setApellido("Por favor ingresa tu apellido");
        prof.setEstadoCivil("Por favor ingresa tu estado civil");
        prof.setIdentificacion(0);
        prof.setDepartamento("Por favor ingresa tu departamento");
        prof.setCambDepartamento("Por favor ingresa el nuevo departamento");
        prof.setIngresofacultad("Por favor ingresa fecha de ingreso a facultad con /");
        prof.setDespacho(0);
        prof.setNewDespacho(0);
        System.out.println("el nombre del profesor es" + prof.getNombre() + prof.getApellido() + " el estado civil del profesor es" + prof.getEstadoCivil() + "numero de identificacion" + prof.getIdentificacion() + "departamento" + prof.getDepartamento() + "nueva facultad" + prof.getCambDepartamento() + "Fecha de ingreso a la facultad" + prof.getIngresofacultad() + "despacho" + prof.getDespacho() + "nuevo despacho" + prof.getNewDespacho());
        perServicio serv = new perServicio() {
        };
        serv.setNombre("Por favor ingresa tu nombre");
        serv.setApellido("Por favor ingresa tu apelldo");
        serv.setEstadoCivil("Por favor ingresa tu estado civil");
        serv.setIdentificacion(0);
        serv.setSeccion(" por favor ingresa tu seccion");
        serv.setTrasSeccion("Por favor ingresa tu nueva seccion");
        serv.setIngresofacultad("Por favor ingresa fecha de ingreso a facultad con /");
        serv.setDespacho(0);
        serv.setNewDespacho(0);
        System.out.println("El nombre del servidor es" + serv.getNombre() + serv.getApellido() + "el estado civil del empleado es " + serv.getEstadoCivil() + "numero de identificacion" + serv.getIdentificacion() + "seccion" + serv.getSeccion() + "nueva seccion" + serv.getTrasSeccion() + "fecha de ingreso a la facultad" + serv.getIngresofacultad() + "despacho" + serv.getDespacho() + "nuevo despacho" + serv.getNewDespacho());
    }
}
