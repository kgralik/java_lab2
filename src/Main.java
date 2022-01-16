public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */



        int index = 46;
        int x = index % 100;
        int i = 1000;
        do {
            System.out.println(i);
            if (i % x == 0){
                System.out.println("Liczba " + i + " jest podzielna przez " + x);
            }
        } while (--i > 0);
        System.out.println("\n");


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while - uzyc 2 petle
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */


//        a)

        int [] tablica1 = new int [5];
        tablica1[0] = 25;
        tablica1[1] = 85;
        tablica1[2] = 34;
        tablica1[3] = 72;
        tablica1[4] = 29;
        int j = 0;
        while(j < 5){
            System.out.println("table [" + j +"] = " + tablica1[j]);
            ++j;
            if(j == 5){
                System.out.println("\n");
                break;
            }
        }

        //  b)
        double [] tablica2 = new double[5];
        tablica2[0] = 8.54;
        tablica2[1] = 9.97;
        tablica2[2] = 2.56;
        tablica2[3] = 2.87;
        tablica2[4] = 9;

        int k = 0;
        while(k < 5){
            System.out.println("table_double [" + k +"] = " + tablica2[k]);
            ++k;
            if(k == 5){
                System.out.println("\n");
                break;
            }
        }

        //c
        String [] table_String = new String[5];
        table_String[0] = "Karolina";
        table_String[1] = "Kamil";
        table_String[2] = "Mariusz";
        table_String[3] = "Józef";
        table_String[4] = "Janusz";

        int s = 0;
        while(s < 5){
            System.out.println("table_String [" + s +"] = " + table_String[s]);
            ++s;
            if(s == 5){
                System.out.println("\n");
                break;
            }
        }



      /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */


        while (true) {
            System.out.println("Wykonuje");
        }

        //Pętla (true) uruchamia się w nieskończoność, false się wysypuje,

    }
}
