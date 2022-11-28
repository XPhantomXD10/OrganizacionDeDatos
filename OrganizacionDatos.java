import java.util.Scanner;

public class OrganizacionDatos {
    public static void main(String args[]) {

        // Zona de declaracion
        Scanner leer = new Scanner(System.in);
        int claves[] = new int[10];
        String colores[] = new String[10];
        char duracion[] = new char[10];
        float cantidades[] = new float[10];
        int opc, limite, cont = 1;
        
        do {
            System.out.println("\nL O S   D E S T I N T A D O S"); // Mostrar menu principal
            System.out.println("[1] Introducir los datos de un tinte");
            if (cont > 0) {    
                System.out.println("[2] Consultar un los datos de un tinte");
                System.out.println("[3] Consultar los datos de todos los tintes");
                System.out.println("[4] Modificar los datos de un tinte");
                System.out.println("[5] Eliminar los datos de un tinte");
                
                limite = 6;
            } else {
                limite = 2;
            }
            System.out.printf("[%d] Finalizar\n", limite);
            System.out.printf("¿Qué opción desea? [1-%d]: ", limite); // Elegir opcion
            opc = leer.nextInt();
            
            if (opc < 1 && opc > limite) {
                System.out.println("\nError: opción invalida");
                continue;
            }

            if (opc == limite) {
                System.out.println("\nPrograma finalizado!!, que tenga un lindo día :)");
            } else {
                switch(opc) {
                    case 1: // Ingresar datos
                        break;
                    case 2: // Consulta individual
                        break;
                    case 3: // Consulta general
                        break;
                    case 4: // Modificar datos
                        break;
                    case 5: // Eliminar datos
                        break;
                }
            }
        } while (opc != limite);

    }
}
