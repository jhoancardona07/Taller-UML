Package Punto10;

public class Main{
    
    public static void main(String[] args){
    
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();
        estudiante.setNombre("Pepito");
        estudiante.setEdad(33);
        estudiante.setCarrera("Ingeniería de Sistemas");
        estudiante.setLegajo(123456789);
        profesor.setNombre("Jacobo");
        profesor.setEdad("50");
        profesor.setMateria("Ciencias de la Información");
        profesor.setCargo("Director de apoyo administrativo");
        System.out.println("Nombre del estudiante: " + estudiante.getNombre());
        System.out.println("Edad del estudiante: " + estudiante.getEdad());
        System.out.println("Carrera: " + estudiante.getCarrera());
        System.out.println("Legajo: " + estudiante.getLegajo());
        System.out.println("Nombre del docente: " + profesor.getNombre());
        System.out.println("Edad del profesor: " + profesor.getEdad());
        System.out.println("Materia: " + profesor.getMateria());
        System.out.println("Cargo: " + profesor.getCargo());
    }
}
