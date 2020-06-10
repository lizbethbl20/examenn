public class ListaEnlazada
{
 //Referencia al inicio
  private Nodo Inicio;
 //Referencia al final
  private Nodo Fin;
  private int NoElementos;
  
  public ListaEnlazada()
  {
    Inicio = null;
    Fin= null;
    NoElementos=0;
  }
   public int obtenerNoElementos()
   {
    return NoElementos;
   }
   
  public void agregarAlInicio(Nodo AG)
  {
  //Caso cuando no tengo Nodos
   if(Inicio ==null)
   {
    Inicio=AG;
    Fin=AG;
    NoElementos++;
   }else{
   //Mi lista al menos tiene un Nodo
   AG.Siguiente= Inicio;
   Inicio= AG;
   NoElementos++; 
   }
   
  }
  
  public void agregarAlFin(Nodo AG)
  {
  //Caso cuando no tengo Nodos
   if(Fin==null)
   {
    Fin=AG;
    Inicio=AG;
    NoElementos++;
   }else{
    //Mi lista al menos tiene un Nodo
    Fin.Siguiente=AG;
    Fin=AG;
    NoElementos++;
   }
  }
  
  public Nodo buscar(Nodo AB)
  {
   //Nodo no es null
   if(AB != null)
   {
    Nodo ref=Inicio;
    boolean Encontrado=false;
    while((ref != null)&& !Encontrado)
    {
    //Si esto es cierto nodo fue encontrado
     if(ref.obtenerData() == AB.obtenerData())
     {
      Encontrado= true;
     }
     if(!Encontrado)
     {
      ref = ref.Siguiente;
     }
    }
    return ref;
   }
   return null;
  }
  
   public boolean buscar2(Nodo AB)
  {
   //Nodo no es null
   if(AB != null)
   {
    Nodo ref=Inicio;
    boolean Encontrado=false;
    while((ref != null) && !Encontrado)
    {
    //Si esto es cierto nodo fue encontrado
     if(ref.obtenerData() == AB.obtenerData())
     {
      Encontrado= true;
     }
     
      ref = ref.Siguiente;
    }
    return Encontrado;
   }
   return false;//Si AB es null tengo nada que buscar
  }
  
  public Nodo eliminarAlInicio()
  {
     if(Inicio == null)
     {
      return null;
     }else{
      Nodo Ret = Inicio;
      Inicio = Inicio.Siguiente;
      Ret.Siguiente = null;
      NoElementos--;
      return Ret;
     }
  }
  public Nodo eliminarAlFin()
  {
     if(Fin == null)
     {
      return null;
     }else{
       Nodo ref = Inicio;
       boolean Encontrado=false;
       while((ref != null) && !Encontrado)
       {
        if(ref.Siguiente == Fin)
        {
         Encontrado = true;
        }
        if(!Encontrado)
        {
        ref = ref.Siguiente;
        }
       }
       NoElementos--;
       Nodo eliminar = Fin;
       Fin = ref;
       ref.Siguiente = null;
       return eliminar;
     }
  }
   
  public Nodo eliminarPorNodo(Nodo AB)
  {
   if(AB == null)
   {
    return null;
   }
     if(Fin == null)
     {
      return null;
     }else{
       Nodo refRojo = Inicio;
       Nodo refAzul= null;
       Nodo refElim=null;
       boolean Encontrado=false;
       while((refRojo != null) && !Encontrado)
       {
        if(refRojo.obtenerData() == AB.obtenerData())
        {
         Encontrado = true;
         refElim = refRojo;
         NoElementos--;
        }
        if(!Encontrado)
         {
          refAzul = refRojo;
          refRojo = refRojo.Siguiente;
         }else{
          refAzul.Siguiente = refRojo.Siguiente;
          refElim.Siguiente=null;
         }
       
       }
       
       return refElim;
     }
  }
  
  public String toString()
   {
     String temp="";
     if(Inicio==null)
     {
      return "";
     }
     Nodo ref=Inicio;
     while(ref!=null)
     {
      temp = temp + "  " + ref.toString();
      ref=ref.Siguiente;
     }
     return temp;
   }
   
   public Nodo porIndice(int p)
   {
    if(Inicio == null)
    {
     return null;
    }
    if(p >=NoElementos)
    {
     return null;
    }
    if(p <0)
    {
     return null;
    }
    int i=0;
    Nodo ref= Inicio;
    for(;i < p; i++)
    {
      ref = ref.Siguiente;
    }
    ref = new Nodo(null, ref.obtenerData());
    return ref;
   }
}