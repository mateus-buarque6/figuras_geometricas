
// AUTHOR: MATEUS BUARQUE
// Date: 20/7/2016

package figurasgeometricas;

import java.util.Scanner;

public class FigurasGeometricas {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite quantas figuras você desja inserir: ");
        int n_figuras = ler.nextInt();
        // NESTA LINHA IRÁ ENTRAR O COMANDO PARA LIMPAR A TELA
        System.out.println("Digite quantos pontos você desja cadastrar: ");
        int n_pontos = ler.nextInt();
        // NESTA LINHA TAMBÉM ENTRARÁ UM COMANDO PARA LIMPAR A TELA
        float f[][] = new float[n_figuras][4];
        float p[][] = new float[n_pontos][2];
        String t[] = new String[n_figuras];
        for (int i = 0; i <= n_figuras - 1; i++){
            System.out.println("Digite o tipo da figura");
            t[i] = ler.next();
            if (t[i].equals("r")){
                System.out.println("Digite as coordenadas do retângulo:");
                for (int j = 0; j <= 3; j++){
                    f[i][j] = ler.nextFloat();
                }
            }
            if (t[i].equals("c")){
                System.out.println("Digite as coordenadas do círculo:");
                for (int j = 0; j <= 2; j++){
                    f[i][j] = ler.nextFloat();
                }
            }
        // AQUI VAI ENTRAR DE NOVO O COMANDO PARA LIMPAR A TELA           
        }
        for (int i = 0; i <= n_pontos - 1; i++){
            for (int j = 0; j <= 1; j++){
                if (j == 0){
                    System.out.println("Digite a coordenada x do ponto:");
                    p[i][j] = ler.nextFloat();
                }
                if (j == 1){
                    System.out.println("Digite a coordenada y do ponto:");
                    p[i][j] = ler.nextFloat();
                } 
            }
        }
        for (int i = 0; i <= n_pontos - 1; i++){
            int l = 0;
            for (int j = 0; j <= n_pontos - 1; j++){
                if (t[j].equals("r")){
                    if ((p[i][0] <= f[j][2]) && (p[i][0] >= f[j][0]) && (p[i][1] <= f[j][1]) && (p[i][1] >= f[j][3])){
                        System.out.println("O ponto " + ++i + " está contido na figura " + ++j);
                        l++;
                    }
                }
                if (t[j].equals("c")){
                    double d = Math.sqrt(Math.pow(Math.abs(p[i][0] - f[j][0]), 2) + Math.pow(Math.abs(p[i][1] - f[j][1]), 2));
                    if (d <= f[j][2]){
                        System.out.println("O ponto " + ++i + " está contido na figura " + ++j);
                        l++;
                    }
                }
            }
            if (l == 0){
                System.out.println("O ponto " + ++i + " não está contido em nenhuma figura");
            } 
        }
        System.out.println();
        System.out.println("Programa finalizado");
    }    
}
