/**
 * Use los comentarios para explicar el objetivo de este programa 
 *
 * @author Bryan Adrian Delgado Sepúlveda | bryanadriands@ufps.edu.co
 * @version 1.0       Fecha:07-05-2021
 */
public class Loteria
{
    //entradas
    int numeroGanador,numeroApostado,apuestaPleno,apuestaInvertida,apuestaPata,a,b,c,d,p,q,r,s,residuo;
    //salidas
    boolean ganaPleno;
    boolean ganaInvertido;
    boolean ganaPata;
    long valorGanaPleno;
    long valorGanaPlenoInvertido;
    long valorGanaPata;
    long valorGanaTotal;

    //Ingresar algoritmo
    void algoritmo()
    {
        a = numeroGanador % 10000 / 1000;
        b = numeroGanador % 1000 / 100;
        c = numeroGanador % 100 / 10;
        d = numeroGanador % 10;
        p = numeroApostado % 10000 / 1000;
        q = numeroApostado % 1000 / 100;
        r = numeroApostado % 100 / 10; 
        s = numeroApostado % 10;
        ganaPleno = (p==a && q==b && r==c && s==d);
        ganaInvertido =(s==a && r==b && q==c && p==d);
        ganaPata = (c==r && d==s);
        valorGanaPleno = (5000 * apuestaPleno);
        valorGanaPlenoInvertido =(2500 * apuestaInvertida);
        valorGanaPata = (1000 * apuestaPata);
        valorGanaTotal = (valorGanaPleno +  valorGanaPlenoInvertido +  valorGanaPata);
    }
}