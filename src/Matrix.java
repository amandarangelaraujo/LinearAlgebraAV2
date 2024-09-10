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





  
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");  // Inicia o formato da matriz
    
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(matriz[i][j]);
                if (j < cols - 1) {
                    sb.append(", ");  // Adiciona uma vírgula e espaço entre os elementos da linha
                }
            }
            if (i < rows - 1) {
                sb.append(",\n");  // Adiciona uma vírgula e uma nova linha após cada linha da matriz
            }
        }
    
        sb.append("]");  // Fecha o formato da matriz
        return sb.toString();
    }

    

}
