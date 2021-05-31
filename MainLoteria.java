/**
 * Use los comentarios para explicar el objetivo de este programa 
 *
 * @author Bryan Adrian Delgado Sepúlveda | bryanadriands@ufps.edu.co
 * @version 1.0       Fecha:07-05-2021
 */
public class MainLoteria
{
    public static void main(String [] args)

    {
        //Crear objeto del modelo
        Loteria l = new Loteria ();
        //Crear objeto Vista "V"
        Consola c = new Consola();

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        l.numeroGanador= c.leerEntero("Número Ganador: ");
        l.numeroApostado= c.leerEntero("Número Apostado: ");
        l.apuestaPleno= c.leerEntero("Apuesta Pleno: ");
        l.apuestaInvertida= c.leerEntero("Apuesta a Pleno Invertida: ");
        l.apuestaPata= c.leerEntero("Apuesta a Pata: "); 
        //invocar el algoritmo o los algoritmos, usando el Modelo
        l.algoritmo();

        //mostrar / imprimir los datos de salida
        c.imprimir("Gana Pleno: "+l.ganaPleno);
        c.imprimir("Gana Pleno Invertido: "+l.ganaInvertido);
        c.imprimir("Gana Pata: "+l.ganaPata);
        c.imprimir("Valor Gana Pleno: "+l.valorGanaPleno);
        c.imprimir("Valor Gana Pleno Invertido: "+l.valorGanaPlenoInvertido);
        c.imprimir("Valor Gana Pata: "+l.valorGanaPata);
        c.imprimir("Valor Gana Total: "+l.valorGanaTotal);
        
    }   
}