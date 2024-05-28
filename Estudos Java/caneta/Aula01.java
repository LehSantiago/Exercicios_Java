//Atributo = Como o objeto é
//Método = O que o objeto faz
//Metodo Setter = passar parametros
//Método Getter = acessar algo ou ver

package caneta;

public class Aula01 {
    public static void main(String[] args){
        /*Instancias
        c1.carga = 80;
        c1.rabiscar();
        */
        Caneta c1 = new Caneta("Bic", "Amarela", 0.4f);
        Caneta c2 = new Caneta("Nop", "Verde", 0.5f);
        c1.status();
        c2.status();

    }
}
