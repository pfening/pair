/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatype;

public class DataType {
    
    private static void comp(String a){
        System.err.println(a);
        float suma=0;
        for(int i = 0; i<a.length();i++){
            //System.out.print(a.charAt(i)+" ");
            float uc = (a.substring(i, i+1).equals(a.substring(i, i+1).toUpperCase())) ? 1 : 0 ;
            float nr = (a.substring(i, i+1).matches("[0-9]+") ? 1 : 0 );
            float sp = (a.substring(i, i+1).matches("[@.]+") ? 1 : 0 );
            float sum = (uc+nr+sp)/3;
            //System.out.println(uc+" "+nr+" "+sp+" Sum: "+sum);
            suma=suma+sum;
        }
        float number = a.substring(a.length()-1).matches("[0-9]+") ? 1 : 0;
        //System.out.println(suma+number);
        //System.out.println(a.length());
        float score = (suma+number)/(a.length()+1);
        System.out.println(score);
    }

    public static void main(String[] args) {
        comp("PFENIGA1");
        comp("SZOLLAN1");
        comp("pfeniga1");
        comp("KAESTRA1");
        comp("Szollan1");
        comp("Pfeniga1");
        comp("szollan1");
        comp("Pfening");
        comp("Kovacs");
        comp("Slaninova");
        comp("Kaestingschaefer");
        comp("Pulicharla");
        comp("Sipos");
        comp("pfening@gmail.com");        
        comp("aleksandra.pfening@novartis.com");
        comp("naga.prasanna@novartis.com");
        comp("tomas.vitovec@novartis.com");
        comp("marek.sipos@novartis.com");
    }
    
}
