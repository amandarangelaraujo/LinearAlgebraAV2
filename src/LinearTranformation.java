public class LinearTranformation {

    public static Vector translation2D(Vector vetor, float dx, float dy){
        if(vetor.getColumns() != 2){
            throw new IllegalArgumentException("O vetor deve ser bidimensional.");
        }
        float[] elements = new float[]{vetor.get(0)+dx, vetor.get(1)+dy};
        Vector transformed = new Vector(2, elements);

        //apenas um check para ver se ta dando tudo certo
        System.out.println("Vetor original: " + vetor);
        System.out.println("Vetor transformado: " + transformed);

        return transformed;

    }

    public static Vector translation3D(Vector vetor, float dx, float dy, float dz){
        if(vetor.getColumns() != 3){
            throw new IllegalArgumentException("O vetor deve ser tridimensional.");
        }

        float[] elements = new float[]{vetor.get(0)+dx, vetor.get(1)+dy, vetor.get(2)+dz};
        Vector transformed = new Vector(3, elements);

        //apenas um check para ver se ta dando tudo certo
        System.out.println("Vetor original: " + vetor);
        System.out.println("Vetor transformado: " + transformed);

        return transformed;

    }

    //rotação
    public static Vector rotation2d(Vector vetor, float angle){
        if(vetor.getColumns() != 2){
            throw new IllegalArgumentException("O vetor deve ser bidimensional.");
        }
        
        float radiano = (float) Math.toRadians(angle);
        Matrix rotationMatrix = new Matrix(2, 2);
        rotationMatrix.set(0, 0, (float)Math.cos(radiano));
        rotationMatrix.set(0, 1, (float)-Math.sin(radiano));
        rotationMatrix.set(1, 0, (float)Math.sin(radiano));
        rotationMatrix.set(1, 1, (float)Math.cos(radiano));

        return LinearAlgebra.MatrixDotVector(rotationMatrix, vetor);

    }

    public static Vector rotation3dx(Vector vetor, float angle){

        if(vetor.getColumns() != 3){
            throw new IllegalArgumentException("O vetor deve ser tridimensional.");
        }
        float radiano = (float) Math.toRadians(angle);
        Vector transformed = new Vector(3);
        transformed.set(0, vetor.get(0));
        transformed.set(1, (float)(vetor.get(1)*Math.cos(radiano) - vetor.get(2)*Math.sin(radiano)));
        transformed.set(2, (float)(vetor.get(1)*Math.sin(radiano) + vetor.get(2)*Math.cos(radiano)));

        return transformed;
    }

    public static Vector rotation3dy(Vector vetor, float angle){
        if(vetor.getColumns() != 3){
            throw new IllegalArgumentException("O vetor deve ser tridimensional.");
        }
        angle = (float) Math.toRadians(angle);
        Vector transformed = new Vector(3);
        transformed.set(0, (float)(vetor.get(0)*Math.cos(angle) + vetor.get(2)*Math.sin(angle)));
        transformed.set(1, vetor.get(1));
        transformed.set(2, (float)(-vetor.get(0)*Math.sin(angle) + vetor.get(2)*Math.cos(angle)));

        return transformed;
    }
    public static Vector rotation3dz(Vector vetor, float angle){
        if(vetor.getColumns() != 3){
            throw new IllegalArgumentException("O vetor deve ser tridimensional.");
        }
        angle = (float) Math.toRadians(angle);
        Vector transformed = new Vector(3);
        transformed.set(0, (float)(vetor.get(0)*Math.cos(angle) - vetor.get(1)*Math.sin(angle)));
        transformed.set(1, (float)(vetor.get(0)*Math.sin(angle) + vetor.get(1)*Math.cos(angle)));
        transformed.set(2, vetor.get(2));

        return transformed;
        
    }

    //Reflexão
    public static Vector reflection2dx(Vector vetor){
        if(vetor.getColumns() != 2){
            throw new IllegalArgumentException("O vetor deve ser bidimensional.");
        }
        Vector transformed = new Vector(2);
        transformed.set(0, vetor.get(0));
        transformed.set(1, vetor.get(1)*-1);

        return transformed;
        
    }
    public static Vector reflection2dy(Vector vetor){
        if(vetor.getColumns() != 2){
            throw new IllegalArgumentException("O vetor deve ser bidimensional.");
        }
        Vector transformed = new Vector(2);
        transformed.set(0, vetor.get(0)*-1);
        transformed.set(1, vetor.get(1));

        return transformed;
        
    }

    public static Vector reflection3dx(Vector vetor){
        if(vetor.getColumns() != 3){
            throw new IllegalArgumentException("O vetor deve ser tridimensional.");
        }
        Vector transformed = new Vector(3);
        transformed.set(0, vetor.get(0));
        transformed.set(1, vetor.get(1)*-1);
        transformed.set(2, vetor.get(2)*-1);
        return transformed;
        

    }
    public static Vector reflection3dy(Vector vetor){
        if(vetor.getColumns() != 3){
            throw new IllegalArgumentException("O vetor deve ser tridimensional.");
        }
        Vector transformed = new Vector(3);
        transformed.set(0, vetor.get(0)*-1);
        transformed.set(1, vetor.get(1));
        transformed.set(2, vetor.get(2)*-1);
        return transformed;
    }
    public static Vector reflection3dz(Vector vetor){
        if(vetor.getColumns() != 3){
            throw new IllegalArgumentException("O vetor deve ser tridimensional.");
        }
        Vector transformed = new Vector(3);
        transformed.set(0, vetor.get(0)*-1);
        transformed.set(1, vetor.get(1)*-1);
        transformed.set(2, vetor.get(2));
        return transformed;

    }

    //projeção
    public static Vector projection2dx(Vector vetor){
        if(vetor.getColumns() != 2){
            throw new IllegalArgumentException("O vetor deve ser bidimensional.");
        }
        Vector transformed = new Vector(2);
        transformed.set(0, vetor.get(0));
        transformed.set(1, 0);

        return transformed;

    }

    public static Vector projection2dy(Vector vetor){
        if(vetor.getColumns() != 2){
            throw new IllegalArgumentException("O vetor deve ser bidimensional.");
        }

        Vector transformed = new Vector(2);
        transformed.set(0, 0);
        transformed.set(1, vetor.get(1));

        return transformed;
    }

    public static Vector projection3dx(Vector vetor){
        if(vetor.getColumns() != 3){
            throw new IllegalArgumentException("O vetor deve ser bidimensional.");
        }
        Vector transformed = new Vector (3);
        transformed.set(0, vetor.get(0));
        transformed.set(1, 0);
        transformed.set(2, 0);

        return transformed;
    }

    public static Vector projection3dy(Vector vetor){
        if(vetor.getColumns() != 3){
            throw new IllegalArgumentException("O vetor deve ser bidimensional.");
        }

        Vector transformed = new Vector(3);
        transformed.set(0, 0);
        transformed.set(1, vetor.get(1));
        transformed.set(2, 0);
        return transformed;

    }

    public static Vector projection3dz(Vector vetor){
        if(vetor.getColumns() != 3){
            throw new IllegalArgumentException("O vetor deve ser bidimensional.");
        }

        Vector transformed = new Vector(3);
        transformed.set(0, 0);
        transformed.set(1, 0);
        transformed.set(2, vetor.get(2));
        return transformed;

    }

    public static Vector cisalhamento2D(Vector vetor, float kx, float ky){
        if(vetor.getColumns() != 2){
            throw new IllegalArgumentException("O vetor deve ser bidimensional.");
        }
        Vector cisalhado = new Vector(2);
        cisalhado.set(0, vetor.get(0) + kx*vetor.get(1));
        cisalhado.set(1, vetor.get(1) + ky*vetor.get(0));

        return cisalhado;
    }


}

