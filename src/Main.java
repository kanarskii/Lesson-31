public class Main {
    public static void main(String[] args) {
        MatrixCollection matrixCollection = new MatrixCollection();

        matrixCollection.add(3,0,0);
        matrixCollection.add(3,0,1);
        matrixCollection.add(3,1,0);
        matrixCollection.add(3,1,1);
        matrixCollection.add(3,2,0);
        matrixCollection.add(3,2,1);
        matrixCollection.add(3,3,0);
        matrixCollection.add(3,3,1);


        for (int i : matrixCollection) {
           System.out.print(i + " ");
        }

    }
}