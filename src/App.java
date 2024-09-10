public class App {
    public static void main(String[] args) throws Exception {
        
        //teste para todos os casos: Matrix
        float[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Matrix m = new Matrix(3, 3, elements);
        System.out.println("Matrix 3x3");
        System.out.println(m);

        Matrix m2 = LinearAlgebra.transpose(m);
        System.out.println("Matrix 3x3 transposta");
        System.out.println(m2);

        Matrix m3 = LinearAlgebra.dot(m, m2);
        System.out.println("Matrix 3x3 * Matrix 3x3 transposta");
        System.out.println(m3);

        Matrix m4 = LinearAlgebra.times(m, 4);
        System.out.println("Matrix 3x3 * 4");
        System.out.println(m4);

        Matrix m5 = LinearAlgebra.sum(m, m);
        System.out.println("Matrix 3x3 + Matrix 3x3");
        System.out.println(m5);

        float[] elements2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Matrix m6 = new Matrix(3, 4, elements2);
        System.out.println("Método gauss-jacob");
        LinearAlgebra.solve(m6);
    }
}
