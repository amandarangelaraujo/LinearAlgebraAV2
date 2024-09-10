public class Vector {

    private float[][] vector;
    private int columns;
    private int rows;

    // Construtor para criar um vetor linha a partir de um array de elementos
    public Vector(int dim, float[] elements) {
        this.columns = dim;
        this.rows = 1;
        this.vector = new float[rows][columns];
        System.arraycopy(elements, 0, this.vector[0], 0, dim);
    }

    // Construtor para criar um vetor vazio com a dimensão especificada
    public Vector(int dim) {
        this(dim, new float[dim]);
    }

    // Construtor protegido para criar um vetor de qualquer dimensão (linha ou coluna)
    protected Vector(int rows, int columns) {
        this.vector = new float[rows][columns];
        this.rows = rows;
        this.columns = columns;
    }

    protected Vector(){

    }

    // Método para obter o valor de uma posição específica
    public float get(int index) {
        if (rows == 1) {
            return vector[0][index];
        } else {
            return vector[index][0];
        }
    }

    // Método para definir o valor de uma posição específica
    public void set(int index, float value) {
        if (rows == 1) {
            vector[0][index] = value;
        } else {
            vector[index][0] = value;
        }
    }

    // Método para obter o número de colunas
    public int getColumns() {
        return columns;
    }

    // Método para obter o número de linhas
    public int getRows() {
        return rows;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(rows>1){
            for (int i = 0; i < Math.max(rows, columns); i++) {
                sb.append(get(i)).append(System.lineSeparator());
            }
        }else{
            for (int i = 0; i < Math.max(rows, columns); i++){
                sb.append(get(i)).append(" ");
            }
        }
       
        
        return sb.toString();
    }
}
