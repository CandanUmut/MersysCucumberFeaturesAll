package ApachePOI;

public class _01_2DArray {
    public static void main(String[] args) {
        String[][] zoo = {{"Lion","4"}, {"Tiger", "2"}, {"Elephant", "5"}, {"Shark", "3"}};
        System.out.println(zoo[0][0]);
        System.out.println(zoo[3][1]);


        for (int k = 0; k <zoo.length ; k++) {
            for (int i = 0; i < zoo[i].length; i++) {
                System.out.print(zoo[k][i]+", ");


            }
            System.out.println();

        }
    }
}
