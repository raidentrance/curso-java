class CuentaDeBanco {

	public double retirarDinero(int cuenta, double monto) {
		validar(cuenta);
		double saldoActual = consultarSaldoActual(cuenta);
		if (compararSaldoContraRetiro(monto, saldoActual)) {
			saldoActual = saldoActual - monto;
			entregarDinero(monto);
			System.out.println("Retiro exitoso");
			return saldoActual;
		} else {
			System.out.println("No tienes suficiente lana");
			return saldoActual;
		}
	}

	private void entregarDinero(double monto) {
		System.out.println("Entrega de " + monto);
	}

	private boolean compararSaldoContraRetiro(double monto, double saldoActual) {
		if (monto < saldoActual) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validar(int cuenta) {
		if (cuenta == 9999) {
			return true;
		} else {
			return false;
		}
	}

	public double consultarSaldoActual(int cuenta) {
		return 100.0;
	}

}

public class Cajero {
	public static void main(String[] args) {
		CuentaDeBanco cuenta = new CuentaDeBanco();
		double saldoActual = cuenta.consultarSaldoActual(1000);
		System.out.println(saldoActual);
		double retirarDinero = cuenta.retirarDinero(1000, 10);
		System.out.println("Nuevo saldo " + retirarDinero);
	}
}
