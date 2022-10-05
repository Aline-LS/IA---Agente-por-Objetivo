package com.example.ia2.Random;

import java.util.Random;

public class Randomizar {

    private static final Random gerador = new Random();

    public static void main(String[] args) {

        gerador.setSeed(4);
        for (int j = 0; j < 5; j++){
            System.out.println((char) ('A' + Math.abs(gerador.nextInt() % 2)));

        }


//        String letras = "AB";
//
//        Random random = new Random();
//
//        String armazenaChaves = "";
//        int index = -1;
//        for( int i = 0; i < 9; i++ ) {
//            index = random.nextInt( letras.length() );
//            armazenaChaves += letras.substring( index, index + 1 );
//        }
//        System.out.println( armazenaChaves );



//        Random gerador = new Random(19700621);
//
//        for (int i = 0; i < 10; i++) {
//            int gerar = gerador.nextInt(2);
//            if( gerar == 0){
//                System.out.println("A");
//            }else {
//                System.out.println("P");
//            }
//        }


    }

}
