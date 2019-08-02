package constantes;

public enum ParafiscalesString {
    C1("Empleado"),C2("Su salario es :"),C3("su descuento de Pension es :"),C4("su descuento de salud es :"),
    C5("total de salario :"),CC1("Ingresa el nombre del empleado"),CC2("ingrece el salario del empleado");

    private String valolar ;


    ParafiscalesString(String empleado) {
        this.valolar = empleado;
    }

    public String getValolar() {
        return valolar;
    }
}
