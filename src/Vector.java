public class Vector {
    int dim;
    float[] elements;

    public Vector(int dim, float[] elements){
        this.dim = dim;
        this.elements = elements;
    }

    public float get(int i){
        return elements[i];
    }

    public void set(int i, float value){
        elements[i] = value;
    }

}
