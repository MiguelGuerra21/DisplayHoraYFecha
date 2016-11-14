public class DisplayHoraYFecha
{
    private ClockDisplay reloj;
    private CalendarioPiki fecha;
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private DisplayDosDigitos dia;
    private DisplayDosDigitos mes; 
    private DisplayDosDigitos año;
    private  int contador;
    
public DisplayHoraYFecha ()
{
    fecha = new CalendarioPiki();
    reloj = new ClockDisplay ();
}
public void avanzarMomento () {
        reloj.timeTick();
            if (hours.getValue() == 24 && minutes.getValue() == 60 ) {
                dia.incrementaValor();
                    if (dia.getValor() == 31) {
                        mes.incrementaValor();
                    }
                    if (mes.getValor() == 13) {
                        año.incrementaValor();
                    }
    }
}
public void setMomento (NumberDisplay hora, NumberDisplay minuto, DisplayDosDigitos day, DisplayDosDigitos month ,DisplayDosDigitos year ) {
    contador = 0;
    
   
    
  
    
}
}