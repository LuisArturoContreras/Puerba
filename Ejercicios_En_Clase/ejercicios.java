import java.util.*;
import java.util.Scanner;

public class ejercicios{//ejercicio uno, permite ingresar 10 numeros y leer los positivos, negativos y ceros
    Scanner entrada =new Scanner(System.in);
    public void ejercicios1(){    
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
        System.out.println("Ingresa 10 numeros, pulsa enter para agregar cada numero");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();
        num4 = entrada.nextInt();
        num5 = entrada.nextInt();
        num6 = entrada.nextInt();
        num7 = entrada.nextInt();
        num8 = entrada.nextInt();
        num9 = entrada.nextInt();
        num10 = entrada.nextInt();
        int numeros [] = new int[10];
        numeros[0] = num1;
        numeros[1] = num2;
        numeros[2] = num3;
        numeros[3] = num4;
        numeros[4] = num5;
        numeros[5] = num6;
        numeros[6] = num7;
        numeros[7] = num8;
        numeros[8] = num9;
        numeros[9] = num10;
        int positivos=0;
        int negativos=0;
        int ceros=0;
        for(int i =0;i<numeros.length;i++){
            if(numeros[i]>0){
                positivos++;
            }else if(numeros[i]<0){
                negativos++;
            }else if(numeros[i]==0){
                ceros++;
            }

        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}