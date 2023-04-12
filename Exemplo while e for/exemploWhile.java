import java.util.*;

public class exemploWhile {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      float preco, total = 0;
        System.out.println("Preço: ");
        preco = input.nextFloat();
        
        while(preco != -1){
            total += preco;
            System.out.println("Preço:");
            preco = input.nextFloat();
        }
        System.out.printf("Total: R$ %.2f \n",total);
    }
    
}
