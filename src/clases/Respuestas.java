
package clases;

import java.util.StringTokenizer;

public class Respuestas {

    String[] respuestas = {
      "Libre","World Wide Web","Una marca de procesadores","Microsoft Office","lenguaje de  para la elaboración de páginas web"
    };
    
    String[] radioR = {
       "Monotarea,Libre, Propietario, Ninguna de las anteriores ",
       "World Wide Web,Telaraña mundial,Informatica en ingles,No significan nada",
       "Un virus muy potente,un programa para windows 7,Un virus muy debil,Una marca de procesadores",
       "Adobe systems,Oracle,Microsoft Office ,Ninguna de las anteriores",
        "Lenguaje informatico para detectar virus,La extension de una hoja de calculo,lenguaje de  para la elaboración de páginas web,ninguna de las anteriores",
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
