package org.nasa.posicion;

import org.nasa.app.RunApp;

/**
 * @author fcardozo
 * @version 1.0
 *
 */
public class PosicionExplorador implements IPosicion {
	
	private int x;

	private int y;
	
	private TipoApuntadorExplorador apuntador;
	
	public PosicionExplorador(){
		
	}
	
	public PosicionExplorador(int x, int y, TipoApuntadorExplorador apuntador) {
		super();
		this.x = x;
		this.y = y;
		this.apuntador = apuntador;
	}
	
	public PosicionExplorador( int x, int y ) {
		super();
		this.x = x;
		this.y = y;
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public TipoApuntadorExplorador getApuntador() {
		return apuntador;
	}

	public void setApuntador(TipoApuntadorExplorador apuntador) {
		this.apuntador = apuntador;
	}
	
	public void setApuntador( String apuntador ) {
		this.apuntador = this.establecerApuntador( apuntador );
	}
	
	private TipoApuntadorExplorador establecerApuntador( String arg ){
		
		if( arg.equals( TipoApuntadorExplorador.N.toString() ) ){
			return TipoApuntadorExplorador.N;
		}
		else if( arg.equals( TipoApuntadorExplorador.S.toString() ) ){
			return TipoApuntadorExplorador.S;
		}
		else if( arg.equals( TipoApuntadorExplorador.E.toString() ) ){
			return TipoApuntadorExplorador.E;
		}
		else if( arg.equals( TipoApuntadorExplorador.O.toString() ) ){
			return TipoApuntadorExplorador.O;
		}
		else{
			Exception e = new Exception("Error en establecer el apuntador, no se conoce el caracter");
			e.printStackTrace() ;
		}
		
		return null;
	}
	
	
	@Override
	public String toString(){
		return x+" "+y+" "+apuntador;
	}
	
}