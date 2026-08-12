package clearminds.cuentas;

public class Cuenta {
    //ATRIBUTOS
    private String id;
    private String tipo;
    private double saldo;

    // GETTERS, SETTERS
    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }
    public void setId(String id) {
        this.id = id;
    }

    public double getSaldo() {
        return  saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
