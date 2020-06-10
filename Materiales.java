import  java.util.Random ;
public class Materiales
{
	public static void main(String[] args) 
   {
		Random gen = new Random();
      MaGen lista = new MaGen(); //aun está en veremos
      MaGen Mad = new MaGen();
      MaGen Res = new MaGen();
      MaGen Hil = new MaGen();
      
      boolean Mesa=false;
		boolean Barco=false;
		boolean Baston=false;
		boolean Cana_p=false;
		boolean Cuerda=false;
      int Num=0;
      /*for(int i=0; i<=2; i++)
      {///materiales de manera aleatoria por 30 dias
			//Num=gen.nextInt(3);
        
         Num=gen.nextInt(10);
         lista.agregarAlFin(new Nodo(null,Num));//aun está en veremos
         System.out.println(Num);
      }*/   
		for(int i=0; i<=30; i++)
      {///materiales de manera aleatoria por 30 dias
			Num=gen.nextInt(3);

		 if(Num==0)
       {
		   try{
		   	Mad.apilar(0);
			}catch(DesbordamientoPila e)
          {
				System.out.println(e.getMessage()+" MADERA SE LLENO CORECTAMNETE ");
		    }
   	 }
		 if(Num==1)
       {
			try{
				Res.apilar(1);
			}catch(DesbordamientoPila e)
          {
			   System.out.println(e.getMessage()+" RESINA SE LLENO CORECTAMNETE ");
			 }
		 }
		 if(Num==2)
       {
			try{
				Hil.apilar(2);
			}catch(DesbordamientoPila e)
          {
				System.out.println(e.getMessage()+" HILO SE LLENO CORECTAMNETE ");
			 }
		 }
							
		 if((Mad.cantidad()>4) && (Mesa==false))
       {
			for(int m=0; m<4; m++)
         {
   			try{
   				Mad.sacar();
   			}catch(SubDesborPila e)
            {
   				System.out.println(e.getMessage());
   			}
			} 
				Mesa=true;
				System.out.println(" MESA ADQUIRIDO ");
		 }
												
		 if((Mesa==true) && (Mad.cantidad()==2) && (Baston==false))
       {
			for(int m=0; m<2; m++)
         {
   			try{
   				Mad.sacar();
   			}catch(SubDesborPila e)
            {
   				System.out.println(e.getMessage());
   			}
			}
				Baston=true;
				System.out.println(" BASTON ADQUIRIDO ");
		 }
		 /////////////////
		 if((Mesa==true) && (Hil.cantidad()==4) && (Res.cantidad()>=1) && (Cuerda==false))
       {
			try{                      
				Hil.sacar();
				Hil.sacar();
				Hil.sacar();
				Hil.sacar();
				Res.sacar();
			}catch(SubDesborPila e)
         {  
				System.out.println(e.getMessage());
			}
				Cuerda=true;
				System.out.println(" CUERDA ADQUIRIDO "); 
		 }
		
		 if((Mesa==true)&&(Baston==true)&&(Cuerda==true)&&(Cana_p==false))
       {
			Cana_p=true;
			System.out.println(" CANA DE PESCAR ADQUIRIDO ");
		 }
				
		 if((Mesa==true)&&(Mad.cantidad()==5)&& (Barco==false))
       {
			for(int m=0; m<5; m++)
         {
   			try{
   				Mad.sacar();
   			}catch(SubDesborPila e)
            {  
   				System.out.println(e.getMessage());
   			}
			}
				Barco=true;
				System.out.println(" BARCO ADQUIRIDO "); 
		 }
      }
      
   }
}

