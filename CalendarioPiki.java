/**
 * Write a description of class CalendarioPiki here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioPiki
{
    // instance variables - replace the example below with your own
    private DisplayDosDigitos dia;
    
    private DisplayDosDigitos mes;
    
    private DisplayDosDigitos año;

    /**
     * Constructor for objects of class CalendarioPiki
     */
    public CalendarioPiki()
    {
        dia = new DisplayDosDigitos (31);
        mes = new DisplayDosDigitos (13);
        año = new DisplayDosDigitos (100);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void introducirFecha(int nuevoDia,int nuevoMes,int nuevoAño)
    {
        dia.setValor(nuevoDia);
        mes.setValor(nuevoMes);
        año.setValor(nuevoAño);
    }
    
    /**
     * Permita, a través de un método, avanzar en un día la fecha almacenada. El método deberá de preocuparse de que la nueva fecha del objeto sea una fecha legal teniendo en cuenta que
     * No vamos a preocuparnos por los años bisiestos.
     * Todos los meses van a tener para nosotros 30 días
     */
    public void avanzarFecha () {
        dia.incrementaValor();
        if(dia.getValor() == 1)
            mes.incrementaValor();
                if (mes.getValor() == 1)
                    año.incrementaValor();
                        if(año.getValor() == 1)
                            dia.setValor(01);
                            mes.setValor(01);
                            año.setValor(01);
       
        
}
    /**
     * metodo que devuelve la fecha actual
     */
public String mostrarFecha(){
       return dia.getValorDelDisplay() + "-" + mes.getValorDelDisplay() + "-" + año.getValorDelDisplay();
    }
}

