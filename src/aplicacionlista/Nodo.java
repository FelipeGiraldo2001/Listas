
package aplicacionlista;

public class Nodo 
{
 private int dato;
 //auto referencia
 private Nodo enlace;   
 /* Constructor Nodo
 Se inicializan los atributos de la clase
 por defecto
 */
 public Nodo()
 {
     this.dato=0;
     this.enlace=null;
 }

    Nodo(int dato) {
        this.dato=dato;
        this.enlace=null;
    }
 /*Se obtiene el dato del Nodo
 @return valor entero correspondiente al dato
 */
 public int getDato()
 {
     return dato;
 }
 /*Se actualiza el dato del Nodo
 @param dato
 */
public void setDato(int dato)
{
    this.dato = dato;
}
/* Obtiene el valor de la referencia
@return referencia del siguiente Nodo
*/

public Nodo getEnlace()
{
    return enlace;
}
/*Se actualiza la referencia del Nodo
 @param dato
 */
public void setEnlace(Nodo enlace) 
{
    this.enlace = enlace;
}

 
}
