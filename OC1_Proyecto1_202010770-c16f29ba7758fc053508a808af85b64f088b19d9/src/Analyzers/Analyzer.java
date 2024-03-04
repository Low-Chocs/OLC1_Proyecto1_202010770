/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analyzers;

/**
 *
 * @author Luisi
 */
public class Analyzer {

    public static void main(String[] args) {
        int hello = 0;
        try {
            String route = "src/Analyzers/";
            String opcFlex[] = {route+"lexical.flex","-d",route};
            jflex.Main.generate(opcFlex);
            String opcCUP[] = {"-destdir",route,"-parser", "sintactical", route + "sintactical.cup"};
            System.out.println("HE PASADO");
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
