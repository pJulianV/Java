import java.util.Scanner;

public class Cuenta {
    private long nCuenta;
    private String fechaApertura;
    private int tipoCuenta;
    private double saldoCuenta;

    public Cuenta() {
    }

    public Cuenta(long nCuenta, String fechaApertura, int tipoCuenta, double saldoCuenta) {
        this.nCuenta = nCuenta;
        this.fechaApertura = fechaApertura;
        this.tipoCuenta = tipoCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    public void setnCuenta(long nCuenta) {
        this.nCuenta = nCuenta;
    }

    public void setfechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public void settipo(int tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void setsaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public long getnCuenta() {
        return nCuenta;
    }

    public String getfechaApertura() {
        return fechaApertura;
    }

    public int gettipoCuenta() {
        return tipoCuenta;
    }

    public double getsaldoCuenta() {
        return saldoCuenta;
    }

    public double calcular_interes() {
        double interesMensual;
        if (tipoCuenta == 1)
            interesMensual = saldoCuenta * 0.015;
        else if (tipoCuenta == 2)
            interesMensual = saldoCuenta * 0.017;
        else
            interesMensual = saldoCuenta * 0.016;
        return interesMensual;
    }
}

public class Liquidación {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        long nCuenta;
        String fechaApertura;
        int tipoCuenta;
        double saldoCuenta, saldoTotal = 0;
        double interesMensual, interesTotal = 0;
        System.out.print("");
        n = input.nextInt();
        Cuenta objeto_cuenta;
        for (int i = 0; i < n; i++) {
            System.out.print("");
            nCuenta = input.nextLong();
            System.out.print("");
            fechaApertura = input.next();
            System.out.print("");
            tipoCuenta = input.nextInt();
            System.out.print("");
            saldoCuenta = input.nextDouble();
            objeto_cuenta = new Cuenta(nCuenta, fechaApertura, tipoCuenta, saldoCuenta);
            interesMensual = objeto_cuenta.calcular_interes();
            System.out.println(nCuenta);
            System.out.println(interesMensual);
            System.out.println(saldoCuenta + interesMensual);
            interesTotal += interesMensual;
            saldoTotal += saldoCuenta + interesMensual;
        }
        System.out.println(interesTotal);
        System.out.println(saldoTotal);
        input.close();
    }
}
