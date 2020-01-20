import java.util.*;

class prueba2 {

    public static void main(String args[]) throws Exception {
        /* 1. Activamos el scanner */
        Scanner sc = new Scanner(System.in);

        /* 2. Creamos una variable para guardarnos la opción que el usuario escogerá del menú*/
        int opcio;

        /* 2. Creamos un booleano para salir del menú*/
        boolean salir = false;

        /* 3. Longitud del array en una constante */
        final int Num_elements = 7;

        /* 4. Variable para un contador */
        int comptador = 0;

        /* 5. Variable para la posición de apellidos en la lista */
        int p = 0;

        /* 6. Creamos variable para guardarnos los elementos de la lista (apellidos) */
        String x;

        /* Declaración del array */
        String[] llista = new String[Num_elements];

        /* creamos la regla con un do while para mostrar las opciones por pantalla */
        do {
            System.out.println("Què vols fer? ");
            System.out.println("1) Inserir ");
            System.out.println("2) Localitzar");
            System.out.println("3) Recuperar");
            System.out.println("4) Suprimir");
            System.out.println("5) Suprimir dada");
            System.out.println("6) Anular");
            System.out.println("7) Primerdarrer");
            System.out.println("8) Imprimir");
            System.out.println("9) Ordenar");
            System.out.println("10) Localitzar en ordenada");
            System.out.println("11) Suprimr dada en ordenada");
            System.out.println("12) Sortir");

            opcio = sc.nextInt();
            switch (opcio) {

                // Inserir
                case 1:
                    System.out.println("OPCIÓN INSERTAR");
                    System.out.println("Introduce la posición en la que deseas insertar:");
                    /*leer la posición por teclado*/
                    p = sc.nextInt(); 
                    /* Estructurar lo que inserta el usuario con el inicio del array (comienza en cero)*/
                    p = p - 1; // la posición p insertada por el usuario
                    
                    /*Si la posición p es menor que cero y mayor que la longitud del array*/
                    if (p < 0 || p > Num_elements) {
                        System.out.println("la posición no es válida");
                    }  
                        /*Si contador es igual o mayor a la longitud del array*/
                        else if (comptador>= Num_elements) {
                        System.out.println("La lista está llena");
                        } 
                        
                        /*de otra manera pedir que inserte el nombre*/
                        else {
                            System.out.println("Inserta el apellido");
                            //pedir apellidos
                            x = sc.next();
                            
                                //i será igual al valor actual del contador
                                //mientras i sea mayor o igual a p 
                               /* for (int i = comptador; i >= p; i--) {
                                    llista[i + 1] = llista[i];
                                }*/
                            
                        llista[p] = x;
                        comptador++;
                        
                        }
                    
                    System.out.println("Lista: ");
                    /* Recorrer el array e imprimir la lista*/
                    for (int i = 0; i < comptador; i++) { 
                        System.out.println(i + 1 + ". " + llista[i]);
                    }
                    break;


                // Localitzar
                case 2:
                    System.out.println("Escribe el apellido que deseas localizar");
                    x = sc.next();
                    for (int i = 0; i <= Num_elements; i++) {
                        if (x.equals(llista[i])) {
                            System.out.print("La posición es: " + (i+1) + "\n");
                            break;
                        }
                    }

                    break;
                // Recuperar
                case 3:
                    System.out.println("Escribe la posición que desees recuperar");
                    p = sc.nextInt();

                    while (p < 0 || p > Num_elements) {
                        System.out.println("Posición incorrecta. Ha de ser entre 1 i 7");
                        System.out.println("Escribe la posición que desees recuperar");
                        p = sc.nextInt();
                    }

                    for (int i = 0; i <= Num_elements; i++) {
                        if (p == i) {
                            System.out.print("El apellido en la posición " + p + " es " + llista[i-1] + "\n");
                            break;
                        }
                    }

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9:

                    break;

                case 10:

                    break;

                case 11:

                    break;

                case 12:
                    salir = true;
                    break;

                default:
                    System.out.println("Las opciones deben ser entre 1 y 12");
            }

        } while (!salir);

        /**/

 /**/
    }
}
