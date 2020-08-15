/*
*Diseñe e implemente un algorítmo que le permita Realizar 
*un polimorfismo del tema de paper de los elementos 
*utilizados para analizar componentes electrónicos 
*del vehículo.  
 */
package tarea1;
/**
 *
 * @author Lenin Alexander Carrillo Imbaquingo
 */


class InstrumentoElectrico {
public void DeterminarValor(){
System.out.println("Amperios");
}
}
class Multimetro extends InstrumentoElectrico {
public void DeterminarValor(){
System.out.println("18 Voltios");
}
}
class AnalizadorGases extends InstrumentoElectrico{
public void DeterminarValor(){
System.out.println("144 PPM");
}
}
class Osciloscopio extends InstrumentoElectrico{
public void DeterminarValor(){
System.out.println("1 Señal Cuadrada");
}
}
class Scanner extends InstrumentoElectrico{
public void DeterminarValor(){
System.out.println("Falla en el código 40 ");
}
}

public class TAREA1 {

    public static void main(String[] args) {
                             System.out.println("       UNIVERDIDAD DE LAS FUERZAS ARMADAS ");
        System.out.println("                ESPE-L            ");
        System.out.println("             PROGRAMACION");
        System.out.println("ALUMNO: LENIN ALEXANDER CARRILLO IMBAQUINGO ");
        System.out.println("DOCENTE: ING LUIS GUERRA");
        System.out.println("FECHA: 14/08/2020");
    
       InstrumentoElectrico Objeto1=new Multimetro();
       InstrumentoElectrico Objeto2=new AnalizadorGases();
       InstrumentoElectrico Objeto3=new Osciloscopio();
       InstrumentoElectrico Objeto4=new Scanner();
        //Outputs "18 voltios"
        System.out.println("\n Instrumento Eléctrico: Multímetro");
        Objeto1.DeterminarValor();

        //Outputs "Miau"
        System.out.println("Instrumento Eléctrico: Analizador de gases");
        Objeto2.DeterminarValor();
        
         //Outputs "Miau"
        System.out.println("Instrumento Eléctrico: Osciloscopio ");
        Objeto3.DeterminarValor();
         //Outputs "Miau"
         
        System.out.println("Instrumento Eléctrico: Scanner");
        Objeto4.DeterminarValor();
        
    }
    
}