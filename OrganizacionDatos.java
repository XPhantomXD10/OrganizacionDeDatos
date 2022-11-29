import java.util.Scanner;

public class OrganizacionDatos {
    public static void main(String args[]) {

        // Zona de declaracion
        Scanner leer = new Scanner(System.in);
        final int TAM_ARRAY = 100;
        int claves[] = new int[TAM_ARRAY];
        String colores[] = new String[TAM_ARRAY];
        String colorAux;
        char duracion[] = new char[TAM_ARRAY];
        char duracionAux, resp2;
        float cantidades[] = new float[TAM_ARRAY];
        float cantidadAux;
        int opc, resp, limite, claveAux, indice = 0, cont = 0;
        boolean existe;

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
                        if (cont < claves.length) {
                            do {
                                System.out.print("\nIngrese el número de la clave que quiere agregar: ");
                                claveAux = leer.nextInt();

                                existe = false;

                                if (claveAux >= 1 && claveAux <= 111) {
                                    for (int i=0; i<cont; i++) {
                                        if (claves[i] == claveAux) {
                                            System.out.println("\nError: La clave ya está registrada en la base de datos\n");
                                            existe = true;
                                            break;
                                        }
                                    }   
                                } else {
                                    System.out.println("\nError: La clave ingresada está fuera de rango, [1-111]\n");
                                    existe = true;
                                }
                            } while (existe);

                            claves[cont] = claveAux;
                            
                            leer.nextLine();
                            System.out.print("Ingrese el nombre del color del tinte de pelo: ");
                            colores[cont] = leer.nextLine();
                            System.out.print("Ingrese la cantidad de producto que tiene [gramos]: ");
                            cantidades[cont] = leer.nextFloat();
                            leer.nextLine();

                            while (!(duracion[cont] == 'P' || duracion[cont] == 'T' || duracion[cont] == 'S')) {
                                System.out.print("¿El tinte es: [P=Permanente, T=Temporal, S=Semipermanente]: ");
                                duracion[cont] = leer.nextLine().toUpperCase().charAt(0);

                                if (!(duracion[cont] == 'P' || duracion[cont] == 'T' || duracion[cont] == 'S')) {
                                    System.out.println("\nError: valor no admitido, ingrese: [P, T, S]\n");
                                }
                            }
                        
                            cont++;
                        } else {
                            System.out.println("\nYa no hay espacio en la base de datos :(");
                        }
                        
                        break;
                    case 2: // Consulta individual
                        do {
                            System.out.print("\nIngresar la clave del tinte de pelo que quiere consultar: ");
                            claveAux = leer.nextInt();

                            if(claveAux < 1 || claveAux > 111){
                                System.out.println("\nERROR: La clave indicada esta fuera del rango");
                            }
                        } while (claveAux < 1 || claveAux > 111);

                        existe = true;

                        for(int x=0; x<cont; x++){
                            if(claves[x] == claveAux){
                                System.out.printf("\nProducto %d \n",x+1);
                                System.out.printf("Color del tinte de pelo: %s\n",colores[x]);
                                System.out.printf("Cantidad de tinte de pelo: %.2f\n",cantidades[x]);
                                System.out.print("Duración del tinte de pelo: ");
                                if (duracion[x] == 'P') {
                                    System.out.println("Permanente");
                                } else if (duracion[x] == 'T') {
                                    System.out.println("Temporal");
                                } else {
                                    System.out.println("Semitemporal");
                                }
                                existe = false;
                            }
                        }

                        if (existe) {
                            System.out.println("\nError: La clave no se encuentra en la base de datos");
                        }
                        break;
                    case 3: // Consulta general
                        for (int x=0; x<cont-1; x++) {
                            for (int y=0; y<cont-1-x; y++) {
                               if (claves[y] > claves[y+1]) {
                                  claveAux = claves[y];
                                  claves[y] = claves[y+1];
                                  claves[y+1] = claveAux;

                                  colorAux = colores[y];
                                  colores[y] = colores[y+1];
                                  colores[y+1] = colorAux;

                                  duracionAux = duracion[y];
                                  duracion[y] = duracion[y+1];
                                  duracion[y+1] = duracionAux;

                                  cantidadAux = cantidades[y];
                                  cantidades[y] = cantidades[y+1];
                                  cantidades[y+1] = cantidadAux;
                               }
                            }
                        }

                        for(int x=0; x<cont; x++){
                            System.out.printf("\nProducto %d \n",x+1);
                            System.out.printf("Clave del tinte de pelo: %d\n",claves[x]);
                            System.out.printf("Color del tinte de pelo: %s\n",colores[x]);
                            System.out.printf("Cantidad de tinte de pelo: %.2f\n",cantidades[x]);
                            System.out.print("Duración del tinte de pelo: ");
                            if (duracion[x] == 'P') {
                                System.out.println("Permanente");
                            } else if (duracion[x] == 'T') {
                                System.out.println("Temporal");
                            } else {
                                System.out.println("Semitemporal");
                            }
                        }
                        break;
                    case 4: // Modificar datos
                        do {
                            System.out.print("\nIngresar la clave del tinte de pelo que quiere consultar: ");
                            claveAux = leer.nextInt();

                            if(claveAux < 1 || claveAux > 111){
                                System.out.println("\nERROR: La clave indicada esta fuera del rango");
                            }
                        } while (claveAux < 1 || claveAux > 111);

                        existe = true;

                        for(int x=0; x<cont; x++){
                            if(claves[x] == claveAux){
                                do {
                                    do {
                                        System.out.println("\nM O D I F I C A C I Ó N"); // Mostrar menu de modificacion
                                        System.out.printf("[1] Color del tinte de pelo: %s\n",colores[x]);
                                        System.out.printf("[2] Cantidad de tinte de pelo: %.2f\n",cantidades[x]);
                                        System.out.print("[3] Duración del tinte de pelo: ");
                                        if (duracion[x] == 'P') {
                                            System.out.println("Permanente");
                                        } else if (duracion[x] == 'T') {
                                            System.out.println("Temporal");
                                        } else {
                                            System.out.println("Semitemporal");
                                        }
                                        System.out.println("[4] Salir");
                                        System.out.print("¿Qué opción desea? [1-4]: ");
                                        resp = leer.nextInt();
                                        leer.nextLine();
                                        
                                        if (resp < 1 && resp > 3) 
                                            System.out.println("\nError: Opción invalida [1-4]");
                                    } while (resp < 1 && resp > 3);
                                    
                                    switch (resp) {
                                        case 1:
                                            do {
                                                System.out.printf("\nColor del tinte de pelo: %s\n",colores[x]);
                                                System.out.print("¿Está seguro que lo quiere modificar? ['S' = Sí, 'N' = No]: ");
                                                resp2 = leer.nextLine().toUpperCase().charAt(0);

                                                if (!(resp2 == 'S' || resp2 == 'N')) {
                                                    System.out.println("\nError: Opción invalida [S, N]");
                                                }
                                            } while (!(resp2 == 'S' || resp2 == 'N'));

                                            if (resp2 == 'S') {
                                                System.out.print("\nIngrese el nombre del color del tinte de pelo: ");
                                                colores[x] = leer.nextLine();
                                            }
                                            break;
                                        case 2:
                                            do {
                                                System.out.printf("\nCantidad de tinte de pelo: %.2f\n",cantidades[x]);
                                                System.out.print("¿Está seguro que lo quiere modificar? ['S' = Sí, 'N' = No]: ");
                                                resp2 = leer.nextLine().toUpperCase().charAt(0);

                                                if (!(resp2 == 'S' || resp2 == 'N')) {
                                                    System.out.println("\nError: Opción invalida [S, N]");
                                                }
                                            } while (!(resp2 == 'S' || resp2 == 'N'));

                                            if (resp2 == 'S') {
                                                System.out.print("\nIngrese la cantidad de producto que tiene [gramos]: ");
                                                cantidades[x] = leer.nextFloat();
                                            }
                                            
                                            break;
                                        case 3:
                                            do {
                                                System.out.print("\nDuración del tinte de pelo: ");
                                                if (duracion[x] == 'P') {
                                                    System.out.println("Permanente");
                                                } else if (duracion[x] == 'T') {
                                                    System.out.println("Temporal");
                                                } else {
                                                    System.out.println("Semitemporal");
                                                }

                                                System.out.print("¿Está seguro que lo quiere modificar? ['S' = Sí, 'N' = No]: ");
                                                resp2 = leer.nextLine().toUpperCase().charAt(0);

                                                if (!(resp2 == 'S' || resp2 == 'N')) {
                                                    System.out.println("\nError: Opción invalida [S, N]");
                                                }
                                            } while (!(resp2 == 'S' || resp2 == 'N'));

                                            if (resp2 == 'S') {
                                                while (!(duracion[x] == 'P' || duracion[x] == 'T' || duracion[x] == 'S')) {
                                                    System.out.print("\nIngrese la modificación de la duración: [P=Permanente, T=Temporal, S=Semipermanente]: ");
                                                    duracion[x] = leer.nextLine().toUpperCase().charAt(0);
                                            
                                                    if (!(duracion[x] == 'P' || duracion[x] == 'T' || duracion[x] == 'S')) {
                                                        System.out.println("\nError: valor no admitido, ingrese: [P, T, S]\n");
                                                    }
                                                }
                                            }
                                            
                                            break;
                                    }
                                } while (resp != 4);

                                existe = false;
                            }
                        }

                        if (existe) {
                            System.out.println("\nError: La clave no se encuentra en la base de datos");
                        }

                        break;
                    case 5: // Eliminar datos
                        do {
                            System.out.print("\nIngresar la clave del tinte de pelo que quiere eliminar: ");
                            claveAux = leer.nextInt();
                            leer.nextLine();
                            
                            if(claveAux < 1 || claveAux > 111){
                                System.out.println("\nERROR: La clave indicada esta fuera del rango");
                            }
                        } while (claveAux < 1 || claveAux > 111);

                        existe = false;

                        for(int x=0; x<cont; x++){
                            if(claves[x] == claveAux){
                                indice = x;
                                existe = true;
                            }
                        }

                        if (existe) {
                            do {
                                System.out.printf("Color del tinte de pelo: %s\n",colores[indice]);
                                System.out.printf("Cantidad de tinte de pelo: %.2f\n",cantidades[indice]);
                                System.out.print("Duración del tinte de pelo: ");
                                if (duracion[indice] == 'P') {
                                System.out.println("Permanente");
                                } else if (duracion[indice] == 'T') {
                                    System.out.println("Temporal");
                                } else {
                                    System.out.println("Semitemporal");
                                }

                                System.out.print("¿Está seguro que quiere eliminar estos datos? ['S' = Sí, 'N' = No]: ");
                                resp2 = leer.nextLine().toUpperCase().charAt(0);

                                if (!(resp2 == 'S' || resp2 == 'N')) {
                                    System.out.println("\nError: Opción invalida [S, N]");
                                }
                            } while (!(resp2 == 'S' || resp2 == 'N'));

                            if (resp2 == 'S') {
                                for (int x=indice; x<cont-1; x++) {
                                    claves[x] = claves[x+1];
                                    colores[x] = colores[x+1];
                                    cantidades[x] = cantidades[x+1];
                                    duracion[x] = duracion[x+1];
                                }
                            }
                        
                            cont--;
                        }
                        
                        break;
                }
            }
        } while (opc != limite);

    }
}