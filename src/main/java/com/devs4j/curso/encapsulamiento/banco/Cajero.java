package com.devs4j.curso.encapsulamiento.banco;

class CuentaDeBanco {

	public double retirarDinero(int cuenta, double monto) {
		validarCuenta(cuenta);
		double saldoActual = consultarSaldoActual(cuenta);
		System.out.println("El saldo actual es de: "+saldoActual);
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

	public void validarCuenta(int cuenta) {
		if (cuenta != 9999) {
			System.err.println("Cuenta inválida");
			System.exit(0);
		}
	}

	public double consultarSaldoActual(int cuenta) {
		validarCuenta(cuenta);
		return 100.0;
	}

}

public class Cajero {
	public static void main(String[] args) {
		CuentaDeBanco cuenta = new CuentaDeBanco();
		double nuevoSaldo = cuenta.retirarDinero(9999, 10);
		System.out.println("Nuevo saldo: " + nuevoSaldo);
	}
}
