import java.util.*;

class prueba {
  public static void main(String args[]) throws Exception {
    /* 1. Activamos el scanner */
    Scanner sc = new Scanner(System.in);

    /* 2.Variable para guardarnos la opción que el usuario escogerá del menú*/
    int opcio;

    /* 2. Creamos un booleano para salir del menú*/
    boolean salir = false;

    /* 3. Asignamos la longitud del array en una constante */
    final int Num_elements = 7;

    /* 4. Creamos variable para un contador */
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

        if (comptador == 0) {
          System.out.println("Posa la posició que vols inserir");
          p = sc.nextInt();
          while (p != 0) {
            System.out.println("No és correcte. La posició només pot ser 0");
            p = sc.nextInt();
          }
          System.out.println("Posa el cognom que vols afegir");
          x = sc.next();
          llista[0] = x;
          comptador++;
        } else if (comptador > 0 && comptador < Num_elements) {
          System.out.println("Posa la posició que vols inserir");
          p = sc.nextInt();
          while (p < 0 || p > comptador) {
            System.out.println("No és correcte. La posició només pot ser entre 0 i " + comptador);
            p = sc.nextInt();
          }
          System.out.println("Posa el cognom que vols afegir");
          x = sc.next();
          for (int i = comptador; i > p; i--) {
            llista[i] = llista[i - 1];
          }
          llista[p] = x;
          comptador++;
        } else if (comptador == Num_elements) {
          System.out.println("Posa la posició que vols inserir");
          p = sc.nextInt();
          System.out.println("La llista està plena, s'eliminarà l'element que té aquesta posició");
          System.out.println("Posa el cognom que vols afegir");
          x = sc.next();
          llista[p] = x;
        }
        for (int j = 0; j < Num_elements; j++) {
          System.out.print(llista[j] + ",");
        }
        System.out.println("");

        break;

      // Localitzar
      case 2:
        System.out.println("Escribe el apellido que deseas localizar");
        x = sc.next();
        for (int i = 0; i <= Num_elements; i++) {
          if (x.equals(llista[i])) {
            System.out.print("La posición es" + i + "\n");
            break;
          }
        }

        break;
      // Recuperar
      case 3:
        System.out.println("Escribe la posición que desees recuperar");
        p = sc.nextInt();

        while (p < 0 || p > Num_elements) {
          System.out.println("Posición incorrecta. Ha de ser entre 0 i 6");
          System.out.println("Escribe la posición que desees recuperar");
          p = sc.nextInt();
        }

        for (int i = 0; i <= Num_elements; i++) {
          if (p == i) {
            System.out.print("El apellido en la posición " + p + " es " + llista[i] + "\n");
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
        salir=true;
        break;

      default:
        System.out.println("Las opciones deben ser entre 1 y 12");
      }

    } while (!salir);

    /**/

    /**/

  }
}