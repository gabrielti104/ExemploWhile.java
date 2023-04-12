import java.util.*;

public class ADO2 {

    public static void main(String[] args) {
        Scanner inicio = new Scanner (System.in);
        System.out.println("Digite o inicio");
        int quant = inicio.nextInt();
        System.out.println("Digite o limite");
        int fim = inicio.nextInt();
        int i;
        int resultado = 0;
        for( i= quant; i <=fim; i++){
        resultado= resultado+i;
        System.out.println("i="+i);
        }
        System.out.println("Total="+resultado);
        
    }
    
}
