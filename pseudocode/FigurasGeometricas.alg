algoritmo "Figuras"
// Fun��o : Ler figuras geom�tricas baseado em suas coordenadas no planox-y, e ent�o ler pontos no plano e indentificar quais pontos est�o inseridos em quais figuras
// Autor :
// Data : 17/07/2016
// Se��o de Declara��es 
var
   F: Vetor[1..10,1..4] de Real
   P: Vetor[1..10,1..2] de Real
   T: Vetor[1..10] de Caractere
   i, j, l: Inteiro
   d: Real
inicio
// Se��o de Comandos
   Para i := 1 ate 6 faca
        Escreval("Digite o tipo da figura [r,c]:")
        Leia(T[i])
        LimpaTela
        Escolha(T[i])
          Caso "r"
               Escreval("Digite as coordenadas do ret�ngulo:")
               Para j := 1 ate 4 faca
                    Leia(F[i,j])
               FimPara
          Caso "c"
               Escreval("Digite as coordenadas do c�rculo:")
               Para j := 1 ate 3 faca
                    Leia(F[i,j])
               FimPara
        FimEscolha
        LimpaTeli a
   FimPara
   Para i := 1 ate 6 faca
        Para j := 1 ate 2 faca
             Escolha (j)
               Caso 1
                 Escreval("Digite a coordenada x do ponto:")
                 Leia(P[i,j])
               Caso 2
                 Escreval("Digite a coordenada y do ponto:")
                 Leia(P[i,j])
             FimEscolha
        FimPara
   FimPara
   Para i := 1 ate 6 faca
        l := 0
        Para j := 1 ate 6 faca
          Se (T[j] = "r") entao
            Se((P[i,1] <= F[j,3]) e (P[i,1] >= F[j,1]) e (P[i,2] <= F[j,2]) e (P[i,2] >= F[j,4])) entao
              Escreval("O ponto",i," est� contindo na figura",j)
              l := l + 1
            FimSe
          FimSe
          Se (T[j] = "c") entao
             d := RaizQ(Exp(Abs(P[i,1] - F[j,1]),2) + Exp(Abs(P[i,2] - F[j,2]),2))
             Se (d <= F[j,3]) entao
                Escreval("O ponto",i," est� contido na figura",j)
                l := l + 1
             FimSe
          FimSe
        FimPara
        Se(l = 0) entao
             Escreval("O ponto",i," n�o est� contido em nenhuma figura")
        FimSe
   FimPara
fimalgoritmo
