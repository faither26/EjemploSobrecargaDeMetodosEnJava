package impuestos;

import static constantes.ParafiscalesEnteros.*;
import static constantes.ParafiscalesDouble.*;

public class ParafiscalesLogicas extends Parafiscalesnombre{



    public double calcularSalud()
    {
        if (this.getSalario()> NOVECIENTOS.getNumero())
        {
            return (this.getSalario()*CERO_CUATRO.getDescuento());
        }else
        {
            return (this.getSalario()*CERO_DOS.getDescuento());
        }
    }

    public double caluclarPension()
    {
        if (this.getSalario()> NOVECIENTOS.getNumero())
        {
            return (this.getSalario()*CERO_CINCO.getDescuento());
        }else
        {
            return (this.getSalario()*CERO_TRES.getDescuento());
        }
    }

    public double totalSalario ()
    {
        return (this.getSalario() - (this.calcularSalud()+this.caluclarPension()));
    }
}
