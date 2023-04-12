
import java.util.*;

public class exemplowhile3 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    float saldo, preco, total = 0;
    char comprar;

    System.out.println("Saldo:");
    saldo = input.nextFloat();

    System.out.println("Comprar? s ou n");
    comprar = input.next().charAt(0);

    if(comprar == 's'){
        while(comprar == 's') {
            System.out.println("Preço: ");
            preco = input.nextFloat();
            if(preco <= saldo && preco > 0) {
                System.out.println("Compra autorizada!");
                total += preco;
                saldo -= preco;
                System.out.println("Comprar? s ou n");
                comprar = input.next().charAt(0);
            }
            }
        }else{
            System.out.println("compra não autorizada!");
            System.out.printf("Saldo: R$ %.2f \n",saldo);
        }
        System.out.println("Ate logo!");
        System.out.printf("Saldo: R$ %.2f \n", saldo);
    }
}
