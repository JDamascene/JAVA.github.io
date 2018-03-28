public class WorkingWithAreys {
    public static void main(String[] args) {
        //Arrey syntax
        /* Declaring and instanciating my arrey to only hold 5 items */
       int[] numbers = new int[5];
       /*Initialize or populate my arrey*/
       numbers[0] = 25;
       numbers[1] = 35;
       numbers[2] = 25;
       numbers[3] = 10;
       numbers[4] = 5;

       /* Accessing elements in my arrey */
       System.out.println("The number at possition 3 is:"+numbers[2]);
       System.out.println("The number at the last possition is:"+numbers[numbers.length-1]);
       /* Print arrey elements */
       for (int i = 0; i < numbers.length; i++){
           System.out.println("The number is:"+numbers[i]);
       }
       for (int elem : numbers){
           System.out.print(elem + " ");
       }

       String[] names = {"Edwin","Kibs","Charlie"};
        System.out.println(names[0] + " - " + names[1] + " - " + names[2]);

        //Travers
        for (int i = 0; i < names.length;i++){
            System.out.println("Name : " +  names[i]);
        }
        for (String elem2 : names){
            System.out.print(elem2 + " ");
        }

        double[] large = {20.9, -2.4 , 60.45 , };

        //find the highest value
        double max = large[0];

        for (int counter = 1; counter < large.length; counter++) {
            if (large[counter] > max) {
                max = large[counter];
                System.out.println("The highest maximum for the December is: " + max);
            }
        }

        //Nested Multi-dimensional / mtrix Arrey

        int[][] squre = new int[3][3];
        squre[0][0] = 1;
        squre[0][1] = 2;
        squre[0][2] = 3;
        squre[1][0] = 4;
        squre[1][1] = 5;
        squre[1][2] = 6;
        squre[2][0] = 7;
        squre[2][1] = 8;
        squre[2][2] = 9;

        for (int i=0; i < 3; i++){
            for (int y=0; y < 3; y++) {
                System.out.print(squre[i][y]+" ");
            }
            System.out.println(/*squre[1][i]*/);
        }

        String[][] nested = {
                {"Mr.","Mrs.","Miss."},
                {"Korir","Meylyne","Amitress"}
        };
        System.out.print(nested[0][0]);
        System.out.print(nested[1][0]);

        System.out.println(" ");

        System.out.print(nested[0][1]);
        System.out.print(nested[1][1]);

        System.out.println(" ");

        System.out.print(nested[0][2]);
        System.out.print(nested[1][2]);


        int ab[][] = {{1,3,4}, {3,4,5}};
        int ba[][] = {{1,3,4}, {3,4,5}};
        System.out.println(" ");
        System.out.print((ab[0][0]) + (ba[0][0]));
        System.out.print(" ");
        System.out.print((ab[0][1]) + (ba[0][1]));
        System.out.print(" ");
        System.out.print((ab[0][2]) + (ba[0][2]));
        System.out.println(" ");
        System.out.print((ab[1][0]) + (ba[1][0]));
        System.out.print(" ");
        System.out.print((ab[1][1]) + (ba[1][1]));
        System.out.print(" ");
        System.out.print((ab[1][2]) + (ba[1][2]));
        System.out.println(" ");

        System.out.println("The teacher's way");

        int[][] c = new int[2][3];
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                c[i][j] = ab[i][j];
                System.out.print((c[i][j]) + (c[i][j]) + "   ");
            }
            System.out.println();
        }
    }
}

//2 6 8
//6 8 10
