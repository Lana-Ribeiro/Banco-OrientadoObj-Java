import java.util.Scanner;

public class Back {

    Scanner sc = new Scanner(System.in);

    float agencia[]= {123,456,789,102,103,104};

    float conta[]={001,002,003,004,005,006};

    private float saque,depositar;
    
    

    private float saldo=100;


    float agenciatentativa;
    float contatentativa;

    public void iniciar(){ // iniciar o programa
        int opcao;

        do {
            menu();
            opcao = sc.nextInt();
            escolhaMenu(opcao);
        } while(opcao != 4)
        ;
    }

   public void menu(){ //menu para mostrar para o usuario qual opcao ele deseja
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Extrato");
   }

   public void escolhaMenu(int opcao){
        float valor;
        
    
        switch(opcao){ //switch case para mostrar as opçoes escolhidas na tela de iniciar

         case 1: 
           System.out.println("Quanto deseja depositar :");
           valor= sc.nextFloat();
           depositar (valor);
           break;

        case 2:
     
            System.out.println("Quanto deseja sacar: ");
            valor = sc.nextFloat();
            sacar(valor);

        case 3:
             extrato();
             break;
    
        }


        }
    
            
        public void tentativaEntrar(){ //ira varrer o vetor de conta e agencia e ver se a tentativa do usuario sera igual aos numero que estao no vetor

            for(int i=0; i< agencia.length;i++){
                for(int j=0; j<conta.length;j++){

                if(agencia[i]==agenciatentativa && conta[j]==contatentativa){
                    System.out.println("Bem vindo!");
                    iniciar();

                } else if (agencia[i]!= agenciatentativa && conta[j]!=contatentativa){
                    System.out.println("Inexistente, tente novamente!");
                    break;
                }
            }
        }

        }

      

        public void extrato(){ //extrato
            System.out.println("Saldo da conta: "+this.saldo);
        }

        public void depositar(float valor){ //saldo ais o valor que o cliente deseja inserir
            saldo += valor;
            System.out.println("Valor para deposito: ");
            System.out.println("Saldo atualizado: "+saldo+ "\n");
        }

        public void sacar (float valor){ //pegar o saldo inicial e subtrair pelo valor do saque
            if(saldo >= valor){
                saldo -= valor;
                saque++;
                System.out.println("Valor sacado: "+valor);
                System.out.println("Saldo atualizado: "+saldo+ "\n");
            }
        }

    public float[] getAgencia() {

     return agencia;
    }
    public void setAgencia(float[] agencia) {
        this.agencia = agencia;
    }
    public float[] getConta() {
        return conta;
    }
    public void setConta(float[] conta) {
        this.conta = conta;
    }



}
