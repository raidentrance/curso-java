/**
 * 
 */
package com.devs4j.curso.exceptions.customautoclosable;

/**
 * @author raidentrance
 *
 */
public class MiRecurso implements AutoCloseable {

	public void imprimirMensaje() {
		System.out.println("Esta es una acción");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Se esta cerrando mi recurso");
		throw new Exception("Este es un error al cerrar");
	}

}
