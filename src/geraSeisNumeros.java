import java.util.Random;

public class geraSeisNumeros {

    public static void main(String[] args) {
        Random generate = new Random(); //Declarando variavel  generate do tipo Random;


        for (int i = 0; i < 6; i++) {
            int number = generate.nextInt(60);//declarei a variavel number e associei ao objeto generate;
            System.out.println(number);

        }
    }

}
