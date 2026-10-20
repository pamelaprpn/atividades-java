package moduloPOO.singleton;

public class ContadorVisitas {
   private int total = 0;

   private static ContadorVisitas instancia;

   private ContadorVisitas(){

   }

   public static ContadorVisitas getInstance(){
       if(instancia == null){
           instancia = new ContadorVisitas();
       }
       return instancia;
   }

   public void registrarVisita(){
       System.out.println("Registro de visita: " + (total += 1));
   }

   public String getTotal(){
       return "Total: " + total;
   }

}
