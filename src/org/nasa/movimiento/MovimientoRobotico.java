package org.nasa.movimiento;

import org.nasa.app.RunApp;
import org.nasa.espacio.GrillaMarte;
import org.nasa.posicion.PosicionExplorador;
import org.nasa.posicion.TipoApuntadorExplorador;

/**
 * @author rfcardozo
 * @version 1.0
 * Esta clase es una estrategia de movimiento, podrán haber mas de un tipo de moviento que adopte una maquina
 * 
 * */
public class MovimientoRobotico implements IMovimiento {
	
	private GrillaMarte grilla;
	
	public MovimientoRobotico(){
		
	}
	
	public MovimientoRobotico(GrillaMarte grilla){
		this.grilla = grilla;
	}

	@Override
	public void mover(PosicionExplorador posicion, String tipoMov) {
		if( tipoMov.equals( TipoMovimientoExplorador.A ) ){
			if( this.esValidoMover(posicion, posicion.getApuntador()) ){
				
				if( posicion.getApuntador().equals( TipoApuntadorExplorador.N ) ){
					posicion.setY( posicion.getY() + 1 );
				}
				else if( posicion.getApuntador().equals( TipoApuntadorExplorador.S ) ){
					posicion.setY( posicion.getY() - 1 );
				}
				else if( posicion.getApuntador().equals( TipoApuntadorExplorador.E ) ){
					posicion.setX( posicion.getX() - 1 );
				}
				else if( posicion.getApuntador().equals( TipoApuntadorExplorador.O ) ){
					posicion.setX( posicion.getX() + 1 );
				}
			}
			
		}
		else if( tipoMov.equals( TipoMovimientoExplorador.I ) ){
			if( posicion.getApuntador().equals( TipoApuntadorExplorador.N ) ){
				posicion.setApuntador( TipoApuntadorExplorador.E );
			}
			else if( posicion.getApuntador().equals( TipoApuntadorExplorador.S ) ){
				posicion.setApuntador( TipoApuntadorExplorador.O );
			}
			else if( posicion.getApuntador().equals( TipoApuntadorExplorador.E ) ){
				posicion.setApuntador( TipoApuntadorExplorador.S );
			}
			else if( posicion.getApuntador().equals( TipoApuntadorExplorador.O ) ){
				posicion.setApuntador( TipoApuntadorExplorador.N );
			}
		}
		else if( tipoMov.equals( TipoMovimientoExplorador.D ) ){
			if( posicion.getApuntador().equals( TipoApuntadorExplorador.N ) ){
				posicion.setApuntador( TipoApuntadorExplorador.O );
			}
			else if( posicion.getApuntador().equals( TipoApuntadorExplorador.S ) ){
				posicion.setApuntador( TipoApuntadorExplorador.E);
			}
			else if( posicion.getApuntador().equals( TipoApuntadorExplorador.E ) ){
				posicion.setApuntador( TipoApuntadorExplorador.N );
			}
			else if( posicion.getApuntador().equals( TipoApuntadorExplorador.O ) ){
				posicion.setApuntador( TipoApuntadorExplorador.S );
			}
		}
		
		
	}
	
	public void setGrilla( GrillaMarte grilla ){
		this.grilla = grilla;
	}
	
	private boolean esValidoMover( PosicionExplorador posicion, TipoApuntadorExplorador tipoApuntador ){		
		if( tipoApuntador.equals( TipoApuntadorExplorador.N ) ){
			if( grilla.getLimiteSuperiorY() >= posicion.getY() + 1  ){
				return true;
			}
		}
		else if( tipoApuntador.equals( TipoApuntadorExplorador.S ) ){
			if( grilla.getLimiteInferiorY() <= posicion.getY() - 1  ){
				return true;
			}
		}
		else if( tipoApuntador.equals( TipoApuntadorExplorador.E ) ){
			if( grilla.getLimiteInferiorX() <= posicion.getX() - 1  ){
				return true;
			}
		}
		else if( tipoApuntador.equals( TipoApuntadorExplorador.O ) ){
			if( grilla.getLimiteSuperiorX() >= posicion.getX() + 1  ){
				return true;
			}
		}
		return false;
	}

}
