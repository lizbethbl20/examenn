public class MaGen  <T> 
 {
	private ListaEnlazada Esquina;
	private int NoElementos;
	//contructor
	@SuppressWarnings("unchecked")
   
	public MaGen()
   {    
		Esquina = new ListaEnlazada();
		NoElementos = 0;
	}
   
	public int cantidad()
   {
		return NoElementos ;
	}
	
	public void apilar(int n)throws DesbordamientoPila
   { 
	  //Esquina[indice] = valor;*/
     Esquina.agregarAlFin(new Nodo(null,n));
	  NoElementos++;
	}
   
   public int sacar()throws SubDesborPila
   {
	  int esacar;
     esacar= NoElementos-1;
	  NoElementos--;
	  return esacar;
	}
   
   public boolean vacia()
   {
     if(NoElementos == 0)
     {
   	 return true;
     }
	 return false;
	}
   
	public boolean llena()
   {
	  if (NoElementos  == 30)
     {
		 return true;
     }
	 return false;
	}
   
	public void vaciarPila()throws SubDesborPila
   {
	  while(!vacia())
     {
		sacar();
	  }
   }
   
}
