import java.util.Random;
import java.util.Scanner;

public class geraSeisNumeros {

    public static void main(String[] args) {
        numeros();
    }
    public static void numeros (){//declara o methodo da funcao numeros
        Random generate = new Random(); //Declarando variavel  generate do tipo Random;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String name = scanner.nextLine();
        System.out.println("Seja bem vindo " + name);

        System.out.println("Quantos numeros aleatorios deseja escolher? ");
        int x = Integer.parseInt(scanner.nextLine());

        System.out.println("Entre quantos números? Por exemplo: 60 números.");
        int y = Integer.parseInt(scanner.nextLine());



        int i = 0;
        while (i < x) {
            int number = generate.nextInt(y);//declarei a variavel number e associei ao objeto generate;
            System.out.println(number);
            i++;
        }
        System.out.println("Você escolheu, " + x + " números " + " entre " + y + " números");

        numeros();

    }
}