import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Back back = new Back();

        

        System.out.print("Digite a sua agencia: ");
        back.agenciatentativa = sc.nextFloat();

        System.out.print("Digite a sua conta: ");
        back.contatentativa = sc.nextFloat();

     // back.impressao();
     back.tentativaEntrar();
     

    
     
   
    
     







        
    }
    
}
