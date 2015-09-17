package org.nasa.espacio;

/**
 * @author fcardozo
 * @version 1.0
 *
 */
public class GrillaMarte implements IGrilla {
	
	private int limiteInferiorX;
	
	private int limiteInferiorY;
	
	private int limiteSuperiorX;
	
	private int limiteSuperiorY;
	
	public GrillaMarte(){
		this.limiteInferiorX = 0;
		this.limiteInferiorY = 0;
	}

	public int getLimiteSuperiorX() {
		return limiteSuperiorX;
	}

	public void setLimiteSuperiorX(int limiteSuperiorX) {
		if( limiteSuperiorX > 0 ){
			this.limiteSuperiorX = limiteSuperiorX;
		}
		else{
			Exception e = new Exception("Error en establecer el limite superior X");
			e.printStackTrace();
		}
	}

	public int getLimiteSuperiorY() {
		return limiteSuperiorY;
	}

	public void setLimiteSuperiorY(int limiteSuperiorY) {
		if( limiteSuperiorY > 0 ){
			this.limiteSuperiorY = limiteSuperiorY;
		}
		else{
			Exception e = new Exception("Error en establecer el limite superior Y");
			e.printStackTrace() ;
		}
	}

	public int getLimiteInferiorX() {
		return limiteInferiorX;
	}

	public void setLimiteInferiorX(int limiteInferiorX) {
		this.limiteInferiorX = limiteInferiorX;
	}

	public int getLimiteInferiorY() {
		return limiteInferiorY;
	}

	public void setLimiteInferiorY(int limiteInferiorY) {
		this.limiteInferiorY = limiteInferiorY;
	}
	
	@Override
	public String toString(){
		return limiteSuperiorX+" "+limiteSuperiorY ;
	}

}
