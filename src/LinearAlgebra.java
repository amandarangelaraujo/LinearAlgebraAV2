public class LinearAlgebra {

    //fazer para transposição de vetor
    public static Matrix transpose(Matrix matriz){
        Matrix matrizTransposta = new Matrix(matriz.getCols(),matriz.getRows());
        
        for (int linha=0; linha<matriz.getRows(); linha++){
        for (int coluna=0; coluna<matriz.getCols(); coluna++){
           matrizTransposta.set(coluna, linha, matriz.get(linha, coluna));
            }
        }

        return matrizTransposta;
    }

    //fazer para soma de vetor
    public static Matrix sum (Matrix matriz1, Matrix matriz2){
        Matrix somada = new Matrix(matriz1.getRows(), matriz2.getCols());
        for (int linha=0; linha<matriz1.getRows(); linha++){
            for (int coluna=0; coluna<matriz1.getCols(); coluna++){
                float value = matriz1.get(linha, coluna)+matriz2.get(linha, coluna);
               somada.set(linha, coluna, value);
            }
        }

        return somada;
    
    }

    //fazer para multiplação com vetor
    public static Matrix times(Matrix matriz, float escalar){
        Matrix multiplicada = new Matrix(matriz.getRows(), matriz.getCols());
        for (int linha=0; linha<matriz.getRows(); linha++){
            for (int coluna=0; coluna<matriz.getCols(); coluna++){
                float value = matriz.get(linha, coluna)*escalar;
                multiplicada.set(linha, coluna, value);
            }
        }

        return multiplicada;
    }
 
    //fazer com vetores
    public static Matrix dot(Matrix matriz1, Matrix matriz2){
        if (matriz1.getCols() != matriz2.getRows()) {
            throw new IllegalArgumentException("Número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz.");
        }

        Matrix multiplicada = new Matrix(matriz1.getCols(), matriz2.getRows()); 
        for (int linha=0; linha<matriz1.getRows(); linha++){
            for (int coluna=0; coluna<matriz1.getCols(); coluna++){
                float valorM = 0;
                //definir o valor acessando a outra matriz
                for (int j=0; j<matriz1.getCols(); j++){
                    valorM += matriz1.get(linha, j) * matriz2.get(j, coluna);
                }
                multiplicada.set(linha, coluna, valorM);
            }
        }
        return multiplicada;
    }


    

    public static void solve(Matrix matriz){
        //definir quem é o primeiro não nulo
        float a00 = matriz.get(0,0);
        float a10 = matriz.get(1, 0);   
        float a20 = matriz.get(2, 0);   
        float b0 = matriz.get(0, 3); 

        float a01 = matriz.get(0, 1);   
        float a11 = matriz.get(1, 1);   
        float a21 = matriz.get(2, 1);   
        float b1 = matriz.get(1, 3);  

        float a02 = matriz.get(0, 2);   
        float a12 = matriz.get(1, 2);   
        float a22 = matriz.get(2, 2);   
        float b2 = matriz.get(2, 3);  
        float x0 =0;
        float y0=0;
        float z0=0;
        for(int i=0; i<1000;i++){
            float xn =(b0-a01*y0-a02*z0)/a00;
            float yn = (b1-a10*x0-a12*z0)/a11;
            float zn = (b2-a20*x0-a21*y0)/a22;
            x0=xn;
            y0=yn;
            z0=zn;
            
        }

        System.out.println("X0: "+x0);
        System.out.println("Y0: "+y0);
        System.out.println("Z0: "+z0);
        
    }
     
    


            






  
        

        

}




