/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novato.proyectofina2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jasonvz
 */
public class Principal {

    static ArrayList<Geometria> geometria = new ArrayList<Geometria>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //para llenar los menus 
        mostrarResultados();
        char respuesta;
        int opcion = 0;

        do {

            opcion = menu();

            switch (opcion) {
                case 1:

                    int opcion1 = 0;
                    do {
                        opcion1 = menu1();
                        switch (opcion1) {

                            case 1:
                                llenarCirculo();
                                mostrarResultados();

                                break;

                            case 2:
                                llenarTriangulo();
                                mostrarResultados();

                                break;

                            case 3:

                                llenarCuadrado();
                                mostrarResultados();
                                break;

                            case 4:
                                llenarRectangulo();

                                mostrarResultados();
                                break;

                            case 5:
                                llenarRombo();

                                mostrarResultados();
                                break;

                            case 6:
                                llenarTrapecio();

                                mostrarResultados();
                                break;

                            case 7:
                                llenarRomboide();
                                mostrarResultados();
                                break;

                            case 8:
                                llenarPoligono();
                                mostrarResultados();
                                break;

                            default:
                        }
                        System.out.print("\nDesea intruducir otra figura (s/n): ");
                        respuesta = entrada.next().charAt(0);
                        System.out.print("");

                    } while (respuesta == 's' || respuesta == 'S');
                    break;

                case 2:
                    int opcion2 = 0;
                    do {
                        opcion2 = menu2();
                        switch (opcion2) {

                            case 1:
                                llenarCirculo();
                                mostrarResultados1();

                                break;

                            case 2:
                                llenarTriangulo();
                                mostrarResultados1();

                                break;

                            case 3:

                                llenarCuadrado();
                                mostrarResultados1();
                                break;

                            case 4:
                                llenarRectangulo();

                                mostrarResultados1();
                                break;

                            case 5:
                                llenarRombo();
                                mostrarResultados1();
                                break;

                            case 6:
                                llenarTrapecio();

                                mostrarResultados1();
                                break;

                            case 7:
                                llenarRomboide();
                                mostrarResultados1();
                                break;

                            case 8:
                                llenarPoligono();
                                mostrarResultados1();
                                break;

                            default:

                        }
                        System.out.print("\nDesea intruducir otra figura (s/n): ");
                        respuesta = entrada.next().charAt(0);
                        System.out.print("");

                    } while (respuesta == 's' || respuesta == 'S');
                    break;

                case 3:

                    int opcion3 = 0;
                    do {
                        opcion3 = menu3();
                        switch (opcion3) {

                            case 1:
                                llenarEsfera();
                                mostrarResultados3();

                                break;

                            case 2:

                                llenarCilindro();
                                mostrarResultados3();

                                break;

                            case 3:
                                llenarCono();
                                mostrarResultados3();
                                break;

                            case 4:
                                llenarHexaedro();
                                mostrarResultados3();

                                break;

                            case 5:
                                llenarPrisma();
                                mostrarResultados3();
                                break;

                            case 6:
                                llenarPiramide();
                                mostrarResultados3();
                                break;

                            default:
                        }

                        System.out.print("\nDesea intruducir otra figura (s/n): ");
                        respuesta = entrada.next().charAt(0);
                        System.out.print("");

                    } while (respuesta == 's' || respuesta == 'S');
                    break;

                case 4:

                    int opcion4 = 0;
                    do {
                        opcion4 = menu4();
                        switch (opcion4) {

                            case 1:
                                llenarEsfera();
                                mostrarResultados2();

                                break;

                            case 2:

                                llenarCilindro();
                                mostrarResultados2();

                                break;

                            case 3:
                                llenarCono();
                                mostrarResultados2();
                                break;

                            case 4:
                                llenarHexaedro();
                                mostrarResultados2();

                                break;

                            case 5:
                                llenarPrisma();
                                mostrarResultados2();
                                break;

                            case 6:
                                llenarPiramide();
                                mostrarResultados2();
                                break;

                            default:
                        }

                        System.out.print("\nDesea intruducir otra figura (s/n): ");
                        respuesta = entrada.next().charAt(0);
                        System.out.print("");

                    } while (respuesta == 's' || respuesta == 'S');
                    break;

                case 5:
                    int opcion5 = 0;
                    do {
                        opcion5 = menu5();
                        switch (opcion5) {

                            case 1:
                                llenarUlma();

                                break;

                            case 2:
                                llenarGilber();

                                break;

                            default:
                        }

                        System.out.print("\nDesea intruducir otra conjentura (s/n): ");
                        respuesta = entrada.next().charAt(0);
                        System.out.print("");

                    } while (respuesta == 's' || respuesta == 'S');
                    break;

            }

        } while (opcion != 5);
    }
    //hice menu los ciclo un es menor principal y los  otros son  segundario

    public static int menu5() {

        System.out.println("\n1.Ulmann: ");
        System.out.println("\n2. Gilbreath: ");
        System.out.print("\n3. salir: ");
        System.out.println(" \nopcion: ");

        int opcion = entrada.nextInt();
        return opcion;

    }

    public static int menu4() {

        System.out.println("\n1.esfera: ");
        System.out.println("\n2. cilindro: ");
        System.out.println("\n3. cono: ");
        System.out.print(" \n4. hexaedro regular: ");
        System.out.println("\n5. prisma: ");
        System.out.println("\n6. pirámide regular: ");
        System.out.print("\n7. salir: ");
        System.out.println(" \n opcion: ");

        int opcion = entrada.nextInt();
        return opcion;

    }

    public static int menu3() {

        System.out.println("\n1.esfera :");
        System.out.println("\n2. cilindro :");
        System.out.println("\n3. cono: ");
        System.out.print(" \n4. hexaedro regular: ");
        System.out.println("\n5. prisma : ");
        System.out.println("\n6. pirámide regular");
        System.out.print("\n7. salir: ");
        System.out.println(" \n opcion: ");

        int opcion = entrada.nextInt();
        return opcion;

    }

    public static int menu2() {

        System.out.println("\n1.circulo :");
        System.out.println("\n2. triangulo :");
        System.out.println("\n3. cuadrado: ");
        System.out.print(" \n4. rectángulo: ");
        System.out.println("\n5. rombo: ");
        System.out.println("\n6. trapecio");
        System.out.print("\n7. romboide: ");
        System.out.println("\n8. polígonos regulares: ");
        System.out.print("\n9.salir: ");
        System.out.println(" \n opcion: ");

        int opcion = entrada.nextInt();
        return opcion;

    }

    public static int menu1() {

        System.out.println("\n1.circulo :");
        System.out.println("\n2. triangulo :");
        System.out.println("\n3. cuadrado: ");
        System.out.print(" \n4. rectángulo: ");
        System.out.println("\n5. rombo: ");
        System.out.println("\n6. trapecio");
        System.out.print("\n7. romboide: ");
        System.out.println("\n8. polígonos regulares : ");
        System.out.print(" \n9.salir:");
        System.out.println(" \n opcion : ");

        int opcion = entrada.nextInt();
        return opcion;

    }

    public static int menu() {
        System.out.println("\n1.Áreas de figuras planas( 2D ) :");
        System.out.println("\n2. Perímetros de figuras planas (2D):");
        System.out.println("\n3. Superficies: ");
        System.out.print("\n4. Volúmenes: ");
        System.out.println("\n5. Conjeturas:  ");
        System.out.println("\n6.salir: ");
        System.out.println("\nopcion:");

        int opcion = entrada.nextInt();
        return opcion;

    }

    //empeze en arreglar los casos 
    public static void llenarTriangulo() {
        double lado1, lado2, lado3, peri;
        System.out.print("\nDigite el lado1 del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("\nDigite el lado2 del triangulo: ");
        lado2 = entrada.nextDouble();
        System.out.print("\nDigite el lado3 del triangulo: ");
        lado3 = entrada.nextDouble();
        System.out.print("\nDigite el perimetro: ");
        peri = entrada.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3, peri);

        geometria.add(triangulo);
    }

    public static void llenarRectangulo() {
        double lado1, lado2;
        System.out.print("\nDigite el lado1 del rectangulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado2 del rectangulo: ");
        lado2 = entrada.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1, lado2);

        geometria.add(rectangulo);

    }

    public static void llenarCirculo() {
        double radio, areaRadio;
        System.out.print("\nDigite el radio: ");
        radio = entrada.nextDouble();
        System.out.print("\nDigite el area_Radio: ");
        areaRadio = entrada.nextDouble();

        Circulo circulo = new Circulo(radio, areaRadio);
        geometria.add(circulo);
    }

    public static void llenarCuadrado() {
        double lado;
        System.out.print("\nDigite el lado1 del cuadrado: ");
        lado = entrada.nextDouble();

        Cuadrado cuadrado = new Cuadrado(lado);

        geometria.add(cuadrado);

    }

    public static void llenarRombo() {
        double lado1, Diago, diag;
        System.out.print("\nDigite el lado1 del Rombo: ");
        lado1 = entrada.nextDouble();

        System.out.print("\nDigite la diagonal mayor: ");
        Diago = entrada.nextDouble();
        System.out.print("\nDigite la diagonal menor: ");
        diag = entrada.nextDouble();

        Rombo rombo = new Rombo(lado1, Diago, diag);

        geometria.add(rombo);

    }

    public static void llenarTrapecio() {
        double Bm, bm, alt, lado, lado1;
        System.out.print("\nDigite la base mayor: ");
        Bm = entrada.nextDouble();

        System.out.print("\nDigite la base menor: ");
        bm = entrada.nextDouble();
        System.out.print("\nDigite la altura: ");
        alt = entrada.nextDouble();

        System.out.print("\nDigite el lado1 : ");
        lado = entrada.nextDouble();
        System.out.print("Digite el lado2 : ");
        lado1 = entrada.nextDouble();

        Trapecio trapecio = new Trapecio(Bm, bm, alt, lado, lado1);

        geometria.add(trapecio);

    }

    public static void llenarRomboide() {
        double base, alt, lado;
        System.out.print("\nDigite la base: ");
        base = entrada.nextDouble();
        System.out.print("Digite la altura: ");
        alt = entrada.nextDouble();

        System.out.print("Digite el lado: ");
        lado = entrada.nextDouble();

        Romboide romboide = new Romboide(base, alt, lado);

        geometria.add(romboide);

    }

    public static void llenarPoligono() {
        double lado, lado1, apote, perime;
        System.out.print("\nDigite la medida del lado: ");
        lado = entrada.nextDouble();
        System.out.print("Digite el numero de lados: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite la apotema: ");
        apote = entrada.nextDouble();
        System.out.print("Digite el perimetro: ");
        perime = entrada.nextDouble();

        Poligono poligono = new Poligono(lado, lado1, apote, perime);

        geometria.add(poligono);

    }

    public static void llenarEsfera() {
        double radio;
        System.out.print("\nDigite el radio: ");
        radio = entrada.nextDouble();

        Esfera esfera = new Esfera(radio);

        geometria.add(esfera);

    }

    public static void llenarCilindro() {
        double radio, alt;
        System.out.print("\nDigite el radio: ");
        radio = entrada.nextDouble();
        System.out.print("Digite la altura: ");
        alt = entrada.nextDouble();

        Cilindro cilindro = new Cilindro(radio, alt);

        geometria.add(cilindro);

    }

    public static void llenarCono() {
        double base, late, alt;
        System.out.print("\nDigite la base: ");
        base = entrada.nextDouble();
        System.out.print("Digite el area lateral: ");
        late = entrada.nextDouble();
        System.out.print("Digite la altura: ");
        alt = entrada.nextDouble();

        Cono cono = new Cono(base, late, alt);

        geometria.add(cono);

    }

    public static void llenarHexaedro() {
        double longitud;
        System.out.print("\nDigite la longitud: ");
        longitud = entrada.nextDouble();

        Hexaedro hexaedro = new Hexaedro(longitud);

        geometria.add(hexaedro);

    }

    public static void llenarPrisma() {

        double base, alt, lar, anch;
        System.out.print("\nDigite la base: ");
        base = entrada.nextDouble();
        System.out.print("Digite el area altura: ");
        alt = entrada.nextDouble();
        System.out.print("Digite el largo: ");
        lar = entrada.nextDouble();
        System.out.print("Digite el ancho: ");
        anch = entrada.nextDouble();

        Prisma prisma = new Prisma(base, alt, lar, anch);

        geometria.add(prisma);

    }

    public static void llenarPiramide() {
        double base1, base, alt;
        System.out.print("\nDigite el are de la base: ");
        base1 = entrada.nextDouble();
        System.out.print("Digite la base: ");
        base = entrada.nextDouble();
        System.out.print("Digite la altura: ");
        alt = entrada.nextDouble();

        Pirámide pirámide = new Pirámide(base1, base, alt);

        geometria.add(pirámide);

    }

    //este es el arreglo de Ulman en el menu5
    public static int llenarUlma() {

        System.out.println("Ingrese un numero entero: ");
        double numero;
        numero = entrada.nextInt();

        if (numero > 0) {

            while (numero != 1) {

                System.out.println(numero);

                if (numero % 2 == 0) {

                    numero = numero / 2;

                } else {

                    numero = numero * 3 + 1;

                }

            }

            System.out.println(numero);

        } else {

            System.out.println("ERROR. El numero debe ser un entero positivo.");

        }
        return 0;

    }
    //este es el menu5 el caso Gilbreath.

    public static int llenarGilber() {

        int pisos;
        Scanner recibe = new Scanner(System.in);
        System.out.println("Ingrese  numeros primos: ");
        pisos = recibe.nextInt();

        for (int i = 1; i <= pisos; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        }
        System.out.println("");
        return 0;
    }

    // estos los que hacen que recorra el arreglo lo compuse con ArrayList
    public static int mostrarResultados() {
        //recorriendo el arreglo
        for (Geometria geome : geometria) {
            System.out.println(geome.toString());
            System.out.println("Area" + geome.area());
            int opcion = entrada.nextInt();
            return opcion;
        }
        return 0;

    }

    public static int mostrarResultados1() {
        //recorriendo el arreglo 
        for (Geometria geome : geometria) {
            System.out.println(geome.toString());

            System.out.println("perimetro " + geome.perimetro());
            int opcion = entrada.nextInt();
          
            return opcion;
           
            
        }
        return 0;

    }

    public static int mostrarResultados2() {
        //recorriendo el arreglo
        for (Geometria geome : geometria) {
            System.out.println(geome.toString());

            System.out.println("volumen " + geome.volumen());
            int opcion = entrada.nextInt();
            return opcion;
        }
        return 0;

    }

    public static int mostrarResultados3() {
        //recorriendo el arreglo 
        for (Geometria geome : geometria) {
            System.out.println(geome.toString());

            System.out.println("superficie " + geome.superficie());
            int opcion = entrada.nextInt();
            return opcion;
        }
        return 0;

    }

}
