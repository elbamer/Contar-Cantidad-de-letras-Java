package numeroDeLetras;

public class NumLetras {

	public static int numLetras(String palab2, char letr){ 
		int contador=0;
		for(int i=0; i<palab2.length();i++){
			if(palab2.charAt(i)==letr){
				contador++;
			}
		}
		return contador;
	}

	public static void main(String[] args) {
		String palabra2="Buenos dias ";
		char letra='B';
		int contador=numLetras(palabra2, letra);
		System.out.println("Las veces que se encuentra la "+letra+" son: "+contador);
	}

}
