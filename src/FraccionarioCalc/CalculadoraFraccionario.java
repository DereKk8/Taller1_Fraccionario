package FraccionarioCalc;
import java.util.*;
public class CalculadoraFraccionario {
    static int opcion = -1;
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        while(opcion != 7)
        {
            menu();

            switch(opcion)
            {
                case 1:
                {
                    System.out.println("Ingrese el numerador: ");
                    int num = ent.nextInt();
                    System.out.println("\nIngrese el denominador: ");
                    int denom = ent.nextInt();;

                    Fraccionario frac = new Fraccionario(num, denom);
                    System.out.println(frac.toString());

                    break;
                }
                case 2:
                {
                    System.out.println("Ingrese el numerador del primer fraccionario: ");
                    int num1 = ent.nextInt();
                    System.out.println("\nIngrese el denominador del primer fraccionario: ");
                    int denom1 = ent.nextInt();;
                    System.out.println("Ingrese el numerador del segundo fraccionario: ");
                    int num2 = ent.nextInt();
                    System.out.println("\nIngrese el denominador del segundo fraccionario: ");
                    int denom2 = ent.nextInt();

                    Fraccionario frac1 = new Fraccionario(num1, denom1);
                    Fraccionario frac2 = new Fraccionario(num2, denom2);


                    Fraccionario res = frac1.sumar(frac2);
                    System.out.println(res.toString());

                    break;
                }
                case 3:
                {
                    System.out.println("Ingrese el numerador del primer fraccionario: ");
                    int num1 = ent.nextInt();
                    System.out.println("\nIngrese el denominador del primer fraccionario: ");
                    int denom1 = ent.nextInt();;
                    System.out.println("Ingrese el numerador del segundo fraccionario: ");
                    int num2 = ent.nextInt();
                    System.out.println("\nIngrese el denominador del segundo fraccionario: ");
                    int denom2 = ent.nextInt();

                    Fraccionario frac1 = new Fraccionario(num1, denom1);
                    Fraccionario frac2 = new Fraccionario(num2, denom2);


                    Fraccionario res = frac1.restar(frac2);
                    System.out.println(res.toString());

                    break;
                }
                case 4:
                {
                    System.out.println("Ingrese el numerador del primer fraccionario: ");
                    int num1 = ent.nextInt();
                    System.out.println("\nIngrese el denominador del primer fraccionario: ");
                    int denom1 = ent.nextInt();;
                    System.out.println("Ingrese el numerador del segundo fraccionario: ");
                    int num2 = ent.nextInt();
                    System.out.println("\nIngrese el denominador del segundo fraccionario: ");
                    int denom2 = ent.nextInt();

                    Fraccionario frac1 = new Fraccionario(num1, denom1);
                    Fraccionario frac2 = new Fraccionario(num2, denom2);


                    Fraccionario res = frac1.multiplicar(frac2);
                    System.out.println(res.toString());

                    break;
                }
                case 5:
                {
                    System.out.println("Ingrese el numerador del primer fraccionario: ");
                    int num1 = ent.nextInt();
                    System.out.println("\nIngrese el denominador del primer fraccionario: ");
                    int denom1 = ent.nextInt();;
                    System.out.println("Ingrese el numerador del segundo fraccionario: ");
                    int num2 = ent.nextInt();
                    System.out.println("\nIngrese el denominador del segundo fraccionario: ");
                    int denom2 = ent.nextInt();

                    Fraccionario frac1 = new Fraccionario(num1, denom1);
                    Fraccionario frac2 = new Fraccionario(num2, denom2);


                    Fraccionario res = frac1.dividir(frac2);
                    System.out.println(res.toString());
                    break;
                }
                case 6:
                {
                    System.out.println("Ingrese el numerador del primer fraccionario: ");
                    int num = ent.nextInt();
                    System.out.println("\nIngrese el denominador del primer fraccionario: ");
                    int denom = ent.nextInt();;

                    Fraccionario frac = new Fraccionario(num, denom);
                    Fraccionario res = frac.simplificar();
                    System.out.println(res.toString());
                    break;
                }

            }
        }

    }


    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("/////////////////////////////");
        System.out.println("/////////////////////////////");
        System.out.println("1. Crear Fraccionario");
        System.out.println("2. Sumar Fraccionario");
        System.out.println("3. Restar fraccionarios");
        System.out.println("4. Multiplicar fraccionarios");
        System.out.println("5. Dividir fraccionarios");
        System.out.println("6. Simplificar Fraccionarios");
        System.out.println("7. SALIR");
        System.out.println("/////////////////////////////");
        System.out.println("/////////////////////////////");
        opcion = entrada.nextInt();
    }



}