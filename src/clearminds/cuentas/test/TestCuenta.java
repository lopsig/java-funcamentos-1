package clearminds.cuentas.test;
import clearminds.cuentas.Cuenta;


public class TestCuenta {
    public static void main(String[] args) {
        // 1. Creación de instancias con diferentes constructores
        Cuenta cuenta1 = new Cuenta("03476");
        cuenta1.setSaldo(1200);

        Cuenta cuenta2 = new Cuenta("03476", "C", 750.56);

        Cuenta cuenta3 = new Cuenta("03476");
        cuenta3.setTipo("C");

        // 2. Visualización inicial
        System.out.println("-------- Valores Iniciales ---------");
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();

        // 3. Nuevas Cuentas
        Cuenta cuenta4 = new Cuenta("030712", "A", 544.988);

        Cuenta cuenta5 = new Cuenta("8693");
        cuenta5.setSaldo(998.53);

        Cuenta cuenta6 = new Cuenta("2123");
        cuenta6.setTipo("B");
        cuenta6.setSaldo(100.256);

        // 4. Visualizacion Nuevas cuentas
        System.out.println("-------- Nuevas Cuentas ---------");
        cuenta4.imprimirConMiEstilo();
        cuenta5.imprimirConMiEstilo();
        cuenta6.imprimirConMiEstilo();


    }
}
