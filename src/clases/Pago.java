package clases;

public class Pago {
	
	private int categoria,pactual;
	private String desc;
	private double npension,promedio;
	//CONSTRUCTOR VACIO
	public Pago() {
		super();
	}
	//CONSTRUCTOR
	public Pago(int categoria, int pactual, String desc, double npension, double promedio) {
		super();
		this.categoria = categoria;
		this.pactual = pactual;
		this.desc = desc;
		this.npension = npension;
		this.promedio = promedio;
	}
	// GET Y SET
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getPactual() {
		return pactual;
	}

	public void setPactual(int pactual) {
		this.pactual = pactual;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public double getNpension() {
		return npension;
	}

	public void setNpension(double pension) {
		this.npension = pension;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	//OPERACIONES 
	public int pension_actual() {
		
		if(categoria==0) {
			pactual=550;
		}
		if(categoria==1) {
			pactual=500;
		}
		if(categoria==2) {
			pactual=460;
		}
		if(categoria==3) {
			pactual=400;
		}
		return pactual;
		
	}
	
	public String descuento() {
		if(categoria==0 || categoria==1 || categoria==2 ||categoria==3) {
			if(promedio<=13.99) {
				desc="0%";
			}else if(promedio==14.00 || promedio<=15.99) {
				desc="10%";
			}else if(promedio==16.00 || promedio<=17.99) {
				desc="12%";
			}
			else if(promedio==18.00 || promedio<=20) {
				desc="15%";
			}
		}
		return desc;
		
	}
	
	public double nueva_pension() {
		
		double n,r;
		
		if(categoria==0) {
			if(promedio<=13.99) {
				npension=550;
			}else if(promedio==14.00 || promedio<=15.99) {
				n=550*0.10;r=550-n;
				npension=r;
			}else if(promedio==16.00 || promedio<=17.99) {
				n=550*0.12;r=550-n;
				npension=r;
			}
			else if(promedio==18.00 || promedio<=20) {
				n=550*0.15;r=550-n;
				npension=r;
			}
		}
		if(categoria==1) {
			if(promedio<=13.99) {
				npension=500;
			}else if(promedio==14.00 || promedio<=15.99) {
				n=500*0.10;r=500-n;
				npension=r;
			}else if(promedio==16.00 || promedio<=17.99) {
				n=500*0.12;r=500-n;
				npension=r;
			}
			else if(promedio==18.00 || promedio<=20) {
				n=500*0.15;r=500-n;
				npension=r;
			}
		}
		if(categoria==2) {
			if(promedio<=13.99) {
				npension=460;
			}else if(promedio==14.00 || promedio<=15.99) {
				n=460*0.10;r=460-n;
				npension=r;
			}else if(promedio==16.00 || promedio<=17.99) {
				n=460*0.12;r=460-n;
				npension=r;
			}
			else if(promedio==18.00 || promedio<=20) {
				n=460*0.15;r=460-n;
				npension=r;
			}
		}
		if(categoria==3) {
			if(promedio<=13.99) {
				npension=400;
			}else if(promedio==14.00 || promedio<=15.99) {
				n=400*0.10;r=400-n;
				npension=r;
			}else if(promedio==16.00 || promedio<=17.99) {
				n=400*0.12;r=400-n;
				npension=r;
			}
			else if(promedio==18.00 || promedio<=20) {
				n=400*0.15;r=400-n;
				npension=r;
			}
		}
		return npension;
		
	}
	
	
}
