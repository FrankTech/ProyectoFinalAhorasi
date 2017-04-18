
package clases;


public class Preguntas {
    
    String[] preguntas = {
        "Linux es un sistema operativo...", "¿Que significa www?", "¿AMD es ....?",
        "¿Publisher es parte de la paqueteria de .....?", "¿Que es  HTML?"
    };
    
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    
}
