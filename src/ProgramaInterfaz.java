
public class ProgramaInterfaz {

    public static void main(String[] args) {
         Persona pavaroti = new Persona(); 
        hacerCantar(pavaroti); 
       
        Canario piolin = new Canario(); 
        hacerCantar(piolin);
        
         Burro checho = new Burro(); //Llamo la clase burro y le asigno un nombre. 
        hacerCantar(checho);
       
    } 

    public static void hacerCantar(PuedeCantar cantor) { 
        cantor.cantar(); 
    } 
}

    
    

