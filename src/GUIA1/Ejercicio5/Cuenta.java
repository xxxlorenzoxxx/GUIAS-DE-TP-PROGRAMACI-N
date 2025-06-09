package GUIA1.Ejercicio5;

public class Cuenta {
    private static long ultimoNumeroCuenta = 100000; // Número de cuenta inicial
    private long numeroCuenta;
    private long dniCliente;
    private double saldoActual;
    private double interesAnual; // Porcentaje de interés anual

    // Constructor por defecto
    public Cuenta() {
        this.numeroCuenta = ++ultimoNumeroCuenta;
        this.dniCliente = 0;
        this.saldoActual = 0.0;
        this.interesAnual = 0.0;
    }

    // Constructor con DNI, saldo e interés
    public Cuenta(long dniCliente, double saldoActual, double interesAnual) {
        this.numeroCuenta = ++ultimoNumeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
    }

    // Métodos analizadores (getters)
    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    // Métodos modificadores (setters)
    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    // Método para actualizar el saldo aplicando el interés diario
    public void actualizarSaldo() {
        double interesDiario = interesAnual / 365 / 100; // Convertir a porcentaje diario
        saldoActual += saldoActual * interesDiario;
    }

    // Método para ingresar dinero en la cuenta
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldoActual += cantidad;
        }
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        if (cantidad > 0 && saldoActual >= cantidad) {
            saldoActual -= cantidad;
        }
    }

    // Método para mostrar todos los datos de la cuenta
    public void mostrarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI del cliente: " + dniCliente);
        System.out.println("Saldo actual: " + saldoActual);
        System.out.println("Interés anual: " + interesAnual + "%");
    }
}