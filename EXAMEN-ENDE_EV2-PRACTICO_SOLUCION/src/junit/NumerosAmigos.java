package junit;

public class NumerosAmigos {
	private int n1;
	private int n2;
	
	public NumerosAmigos(int a, int b){
		n1=a;
		n2=b;
	}

	 public boolean amigo(){
		//Comprueba si dos numeros son amigos 
		boolean esAmigo = false;
		int rdo_n1=0,rdo_n2=0;

		for(int i = 1;i < n1;i++){
			if(n1% i == 0){
				rdo_n1+= i;
			}
		}

		for(int i = 1;i < n2;i++){
			if(n2% i == 0){
				rdo_n2+= i;
			}
		}

		if(rdo_n1 == n2 && rdo_n2 == n1){
			esAmigo = true;
		}

		return esAmigo;
	}

}

