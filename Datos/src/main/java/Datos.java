public class Datos {

    public static void main (String[] args){
        Informacion info = new Informacion("Isaac Mendoza", "Ingenieria informatica", "programacion orientada a objetos");
        String NumCon = info.getNombre() + " " + info.getCarrera() + " " + info.getMateria();
        System.out.println("\n Datos generales de alumn@:" + NumCon);
    }
    
}
