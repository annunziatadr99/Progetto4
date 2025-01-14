package Esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {

    public static final Logger logger = LoggerFactory.getLogger(Esercizio1.class);

    public static void main(String[] args) {

        int[] numeri = new int[5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < numeri.length; i++) {
            numeri[0]= random.nextInt(10) +1;
        }
        StampaNumeri(numeri);



        while (true){
            try {
               logger.info("Inserisci un numero (0 se vuoi uscire): ");
                int numero = scanner.nextInt();
                if (numero == 0){
                    break;
                }
                logger.info("Inserisci la posizione (0-4) dove vorrai inserire il numero scelto in precedenza: ");
                int posizione = scanner.nextInt();
                numeri[posizione]= numero;

                StampaNumeri(numeri);


            }catch (ArrayIndexOutOfBoundsException e){
                logger.info("Posizione non valida, inserire un valore tra 0 e 4 ", e);
                scanner.nextLine();
            }catch (Exception e) {
                logger.error("Valore non valido", e);
                scanner.nextLine();
            }
        }
        scanner.close();
    }
    public static void StampaNumeri(int[] numeri){
        System.out.print("Numeri:");
        for (int value : numeri) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
