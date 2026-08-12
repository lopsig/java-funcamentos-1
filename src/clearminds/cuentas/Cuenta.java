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

    //CONSTRUCTOTES
    public Cuenta(String id) {
        this.id = id;
        this.tipo = "A";
    }

    public Cuenta(String id, String tipo, double saldo) {
        this.id = id;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    //METODOS
    public void imprimir () {
        System.out.println("************************");
        System.out.println("        CUENTA          ");
        System.out.println("************************");
        System.out.println("Número de Cuenta: " + getId());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Saldo: USD " + getSaldo());
        System.out.println("************************");


    }

    public void imprimirConMiEstilo () {
        System.out.println("************************");
        System.out.println("  MI ESTILO CUENTA          ");
        System.out.println("************************");
        System.out.println("ESTILO Número de Cuenta: " + getId());
        System.out.println(" ESTILO Tipo: " + getTipo());
        System.out.println("ESTILO Saldo: USD " + getSaldo());
        System.out.println("************************");


    }

}
