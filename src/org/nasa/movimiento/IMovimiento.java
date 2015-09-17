package org.nasa.movimiento;

import org.nasa.posicion.PosicionExplorador;

/**
 * @author rfcardozo
 * @version 1.0
 * Esta interfaz es la Estrategia generica de como un Trasportador podria moverse
 * 
 * */
public interface IMovimiento {
	
	public void mover(PosicionExplorador posicion, String tipoMov);

}
