public class App {
    public static void main(String[] args) throws Exception {
        float[] elementos = {3,1,-1,5,1,4,1,18,2,-1,5,21};
        Matrix teste = new Matrix(4, 4, elementos);

        LinearAlgebra.solve(teste);
        
    }
}
