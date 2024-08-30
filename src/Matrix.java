import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrix {

    private int rows;
    private int cols;
    private float[] elements;
    float[][] matriz;
    
    //construtor com elementos
    public Matrix(int rows, int cols, float[] elements){
        this.rows = rows;
        this.cols=cols;
        this.elements = elements;
        this.matriz = new float[rows][cols];

        //colocar os elementos dentro da matriz
        int index =0;
        for (int linha=0; linha<rows; linha++){
        for(int coluna=0; coluna<cols; coluna++){
            if (index < elements.length) {
                    matriz[linha][coluna] = elements[index++];
                }
            }
        }
    }
    

    

    //construtor sem elementos
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols=cols;
        this.matriz = new float[rows][cols];
    }





    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    
    public float get(int i, int j){
        return matriz[i][j];
    }

    public void set(int i, int j, float value){
        matriz[i][j] = value;
    }





    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<rows;i++){
            for(int j=0; j<cols; j++){
                sb.append("a" + i + "," + j + " = " + matriz[i][j] + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    

}
