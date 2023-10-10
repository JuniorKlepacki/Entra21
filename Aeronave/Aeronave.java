package Aeronave;

public class Aeronave {
  private int passageiros ;
 private int velocidadeMax ;
 private int combustivel ;
 private  double queima ;
 
 public Aeronave (int passageiros,int velocidadeMax,int combustivel,double queima) {
	 this.passageiros=passageiros;
	 this.velocidadeMax= velocidadeMax;
	 this.combustivel=combustivel;
	 this.queima= queima;
 }
 
 public double rendimento() {
	 return combustivel / queima;
	 
 }

public int getPassageiros() {
	return passageiros;
}

public void setPassageiros(int passageiros) {
	this.passageiros = passageiros;
}

public int getVelocidadeMax() {
	return velocidadeMax;
}

public void setVelocidadeMax(int velocidadeMax) {
	this.velocidadeMax = velocidadeMax;
}

public int getCombustivel() {
	return combustivel;
}

public void setCombustivel(int combustivel) {
	this.combustivel = combustivel;
}

public double getQueima() {
	return queima;
}

public void setQueima(double queima) {
	this.queima = queima;
}

	


}
 

