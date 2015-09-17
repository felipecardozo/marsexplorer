package org.nasa.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.nasa.espacio.GrillaMarte;
import org.nasa.movimiento.IMovimiento;
import org.nasa.movimiento.MovimientoRobotico;
import org.nasa.posicion.PosicionExplorador;

/**
 * @author fcardozo
 * @version 1.0
 *
 */
public class RunApp {
	
	public static final String FILE_NAME = "resources/prueba.in";
	
	private GrillaMarte grilla ;
	
	public RunApp(){
		
		PosicionExplorador posicion = null;
		
		List<String> instrucciones = null;
		
		Scanner sc = null;
		try {
			
			sc = new Scanner( new File ( RunApp.FILE_NAME ) );
			
			if( sc.hasNextLine() ){
				this.construirGrilla(sc);
			}
			while( sc.hasNextLine() ){
				posicion = this.construirPosicionExplorador(sc);
				
				if( sc.hasNextLine() ){
					instrucciones = this.construirInstrucciones(sc);
				}
				
				IMovimiento movimiento = new MovimientoRobotico(grilla);
				for( String i : instrucciones ){
					movimiento.mover(posicion, i);
				}
				System.out.println( posicion );
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch( Exception e ){
			e.printStackTrace();
		}
		
	}
	
	public void construirGrilla( Scanner sc ){
		
		String lineaLimites = sc.nextLine() ;
		
		Scanner scLimites = new Scanner( lineaLimites );
		int limiteX = -1 ;
		int limiteY = -1 ;
		
		if( scLimites.hasNextInt(  ) ){
			limiteX = scLimites.nextInt();
		}
		if( scLimites.hasNextInt(  ) ){
			limiteY = scLimites.nextInt();
		}
		
		grilla = new GrillaMarte();
		grilla.setLimiteSuperiorX( limiteX );
		grilla.setLimiteSuperiorY( limiteY );
		
	}
	
	public PosicionExplorador construirPosicionExplorador( Scanner sc ){
		
		PosicionExplorador posicion = null;
		
		String lineaPosicionInicial = sc.nextLine();
		
		Scanner scPosicion = new Scanner( lineaPosicionInicial );
		int x = -1;
		int y = -1;
		String c = null;
		if( scPosicion.hasNextInt() ){
			x = scPosicion.nextInt();
		}
		if( scPosicion.hasNextInt() ){
			y = scPosicion.nextInt();
		}
		if( scPosicion.hasNext() ){
			c = scPosicion.next();
		}
		posicion = new PosicionExplorador( x, y );
		posicion.setApuntador( c );
		
		return posicion;
	}
	
	public List<String> construirInstrucciones(Scanner sc){
		
		List<String> movimientos = new ArrayList<String>();
		
		String lineaMovimientos = sc.nextLine();
		
		char[] temp = lineaMovimientos.toCharArray();

		for( int i = 0; i < temp.length ; i++ ){
			movimientos.add( temp[i]+"" );
		}
		return movimientos;
	}
	
	/**
	 * La salida de la aplicacion puede variar en cuanto al punto de Vista del Este y Oeste. 
	 * Si es Izquierda o Derecha respectivamente
	 * **/
	public static void main( String [] felipe ){
		new RunApp();
	}

}
