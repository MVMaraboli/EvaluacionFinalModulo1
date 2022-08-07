/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package acitividades_curso.evaluacionfinalmodulo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author Leon DeBurgh
 */
public class EvaluacionFinalModulo1 {
    public static ArrayList aEf = new ArrayList();
    public static ArrayList aPr = new ArrayList();
    public static ArrayList aCap = new ArrayList();
    public static ArrayList aCos = new ArrayList();
    public static String[][] aElectrod = new String[10][2];
    public static void main(String[] args) {
        int I = 0;
        
        aEf.add("  A       ");
        aPr.add(20000);
        aEf.add("  B       ");
        aPr.add(18000);
        aEf.add("  C       ");
        aPr.add(16000);
        aEf.add("  D       ");
        aPr.add(14000);
        aEf.add("  E       ");
        aPr.add(12000);
        aEf.add("  F       ");
        aPr.add(10000);
        
        aCap.add("0 a 19 KG.   ");
        aCos.add(5000);
        aCap.add("20 a 49 KG.  ");
        aCos.add(8000);
        aCap.add("50 a 80 KG.  ");
        aCos.add(10000);
        aCap.add("Más de 80 KG.");
        aCos.add(15000);

        
        System.out.println("Tabla de Eficiencia Energética");
        System.out.println("==============================");
        System.out.println("Definición     Precio         ");
        System.out.println("==============================");
        for (I = 0; I < 6; I++) {
            System.out.println(aEf.get(I).toString()+"     $ "+aPr.get(I));
        }
        System.out.println("==============================");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("  Tabla de Precio Capacidad   ");
        System.out.println("==============================");
        System.out.println("Definición     Precio         ");
        System.out.println("==============================");
        for (I = 0; I < 4; I++) {
            System.out.println(aCap.get(I).toString()+"     $ "+aCos.get(I));
        }
        System.out.println("==============================");
        //System.out.println(outerArrayList.toString());
    }
}
