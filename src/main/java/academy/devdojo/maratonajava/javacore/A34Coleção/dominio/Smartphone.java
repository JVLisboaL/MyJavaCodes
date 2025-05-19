package academy.devdojo.maratonajava.javacore.A34Coleção.dominio;

public class Smartphone {
    private String serialNumber;
    private String IMEI;

    public Smartphone(String serialNumber, String IMEI) {
        this.serialNumber = serialNumber;
        this.IMEI = IMEI;
    }

    //REflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    //Simétrico: x.equals(y) tem que ser igual a y.equals(x)
    //Transitividade: x.equals(y) true e y.equals(z) true, logo x.equals(z) tem que ser true
    //Consistente: x.equals(y) sempre retorna true se x e y não mudarem
    //Para qualquer objeto x, x.equals(null) tem que ser false
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
        
    }

    //Se x.equals(y) == true, então x.hashCode() == y.hashCode()
    //y.hashCode() == x.hashCode() não necessariamente o equals tem que ser true
    //x.equals(y) == false, y.hashCode() != x.hashCode()
    //y.hashCode() != x.hashCode() x.equals(y) == false
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String iMEI) {
        IMEI = iMEI;
    }
}
