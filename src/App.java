import java.util.Scanner;

public class App {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coletando o número de dimensões do vetor
        
        
        System.out.println("Escolha o número de dimensões do vetor (2 para 2D, 3 para 3D): ");
        int dim = scanner.nextInt();
        if (dim != 2 && dim != 3) {
            System.out.println("Apenas vetores de 2D ou 3D são suportados.");
            return;
        }

        // Coletando os elementos do vetor
        float[] elements = new float[dim];
        for (int i = 0; i < dim; i++) {
            System.out.println("Digite o valor para o elemento " + (i + 1) + ": ");
            elements[i] = scanner.nextFloat();
        }

        // Criando o vetor com base nos valores inseridos
        Vector vetor = new Vector(dim, elements);

        // Menu de operações
        System.out.println("\nEscolha a operação:"); //OK
        System.out.println("1 - Translação 2D"); //OK
        System.out.println("2 - Translação 3D"); //OK
        System.out.println("3 - Rotação 2D"); //OK
        System.out.println("4 - Rotação 3D (eixo X)"); //OK
        System.out.println("5 - Rotação 3D (eixo y)"); //OK
        System.out.println("6 - Rotação 3D (eixo z)"); //OK
        System.out.println("7 - Reflexão em torno do eixo X (2D)"); //OK
        System.out.println("8 - Reflexão em torno do eixo Y (2D)"); //OK
        System.out.println("9 - Reflexão em torno do eixo X (3D)"); //OK
        System.out.println("10 - Reflexão em torno do eixo Y (3D)"); //OK
        System.out.println("11 - Reflexão em torno do eixo Z (3D)"); //OK
        System.out.println("12 - Projeção no eixo X (2D)");
        System.out.println("13 - Projeção no eixo Y (2D)");
        System.out.println("14 - Projeção no eixo X (3D)");
        System.out.println("15 - Projeção no eixo Y (3D)");
        System.out.println("16 - Projeção no eixo Z (3D)");
        System.out.println("9 - Cisalhamento 2D");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1: // Translação 2D
                if (dim != 2) {
                    System.out.println("Operação válida apenas para vetores 2D.");
                    break;
                }
                System.out.println("Digite o valor de dx: ");
                float dx2D = scanner.nextFloat();
                System.out.println("Digite o valor de dy: ");
                float dy2D = scanner.nextFloat();
                System.out.println("Resultado: " + LinearTranformation.translation2D(vetor, dx2D, dy2D));
                break;

            case 2: // Translação 3D
                if (dim != 3) {
                    System.out.println("Operação válida apenas para vetores 3D.");
                    break;
                }
                System.out.println("Digite o valor de dx: ");
                float dx3D = scanner.nextFloat();
                System.out.println("Digite o valor de dy: ");
                float dy3D = scanner.nextFloat();
                System.out.println("Digite o valor de dz: ");
                float dz3D = scanner.nextFloat();
                System.out.println("Resultado: " + LinearTranformation.translation3D(vetor, dx3D, dy3D, dz3D));
                break;

            case 3: // Rotação 2D
                if (dim != 2) {
                    System.out.println("Operação válida apenas para vetores 2D.");
                    break;
                }
                System.out.println("Digite o ângulo de rotação (em graus): ");
                float angle2D = scanner.nextFloat();
                System.out.println("Resultado: " + LinearTranformation.rotation2d(vetor, angle2D));
                break;

            case 4: // Rotação 3D em torno do eixo X
                if (dim != 3) {
                    System.out.println("Operação válida apenas para vetores 3D.");
                    break;
                }
                System.out.println("Digite o ângulo de rotação (em graus): ");
                float angle3DX = scanner.nextFloat();
                System.out.println("Resultado: " + LinearTranformation.rotation3dx(vetor, angle3DX));
                break;
            //Rotação 3D (eixo y)
            case 5: 
                if (dim != 3) {
                    System.out.println("Operação válida apenas para vetores 3D.");
                    break;
                }
                System.out.println("Digite o ângulo de rotação (em graus): ");
                float angle3DY = scanner.nextFloat();
                System.out.println("Resultado: " + LinearTranformation.rotation3dy(vetor, angle3DY));
                break;
            
            //Rotação 3D (eixo z)
            case 6:
                if (dim != 3) {
                    System.out.println("Operação válida apenas para vetores 3D.");
                    break;
                }
                System.out.println("Digite o ângulo de rotação (em graus): ");
                float angle3DZ = scanner.nextFloat();
                System.out.println("Resultado: " + LinearTranformation.rotation3dz(vetor, angle3DZ));
                break;


            case 7: // Reflexão no eixo X (2D)
                if (dim != 2) {
                    System.out.println("Operação válida apenas para vetores 2D.");
                    break;
                }
                System.out.println("Resultado: " + LinearTranformation.reflection2dx(vetor));
                break;

            case 8: // Reflexão no eixo Y (2D)
                if (dim != 2) {
                    System.out.println("Operação válida apenas para vetores 2D.");
                    break;
                }
                System.out.println("Resultado: " + LinearTranformation.reflection2dy(vetor));
                break;
            
            // Reflexão no eixo X (3D)
            case 9:
                if (dim != 3) {
                    System.out.println("Operação válida apenas para vetores 3D.");
                    break;
                }
                System.out.println("Resultado: " + LinearTranformation.reflection3dx(vetor));
                break;
            // relfeção no eixo y (3D)
            case 10:
            if (dim != 3) {
                System.out.println("Operação válida apenas para vetores 3D.");
                break;
            }
            System.out.println("Resultado: " + LinearTranformation.reflection3dy(vetor));
            break;

            case 11: // Reflexão no eixo Z (3D)
                if (dim != 3) {
                    System.out.println("Operação válida apenas para vetores 3D.");
                    break;
                }
                System.out.println("Resultado: " + LinearTranformation.reflection3dz(vetor));
                break;

            case 12: // Projeção no eixo X (2D)
                if (dim != 2) {
                    System.out.println("Operação válida apenas para vetores 2D.");
                    break;
                }
                System.out.println("Resultado: " + LinearTranformation.projection2dx(vetor));
                break;

            case 13: // Projeção no eixo Y (2D)
            if (dim != 2) {
                System.out.println("Operação válida apenas para vetores 2D.");
                break;
            }
            System.out.println("Resultado: " + LinearTranformation.projection2dy(vetor));
            break;


            case 14: // Projeção no eixo X (3D)
            if (dim != 3) {
                System.out.println("Operação válida apenas para vetores 3D.");
                break;
            }
            System.out.println("Resultado: " + LinearTranformation.projection3dx(vetor));
            break;

            case 15: // Projeção no eixo y (3D)
            if (dim != 3) {
                System.out.println("Operação válida apenas para vetores 3D.");
                break;
            }
            System.out.println("Resultado: " + LinearTranformation.projection3dy(vetor));
            break;

            case 16: // Projeção no eixo y (3D)
            if (dim != 3) {
                System.out.println("Operação válida apenas para vetores 3D.");
                break;
            }
            System.out.println("Resultado: " + LinearTranformation.projection3dz(vetor));
            break;



            case 17: // Cisalhamento 2D
                if (dim != 2) {
                    System.out.println("Operação válida apenas para vetores 2D.");
                    break;
                }
                System.out.println("Digite o valor de cisalhamento kx: ");
                float kx = scanner.nextFloat();
                System.out.println("Digite o valor de cisalhamento ky: ");
                float ky = scanner.nextFloat();
                System.out.println("Resultado: " + LinearTranformation.cisalhamento2D(vetor, kx, ky));
                break;

            default:
                System.out.println("Escolha inválida.");
                break;
        }
       
        
    
    }
}