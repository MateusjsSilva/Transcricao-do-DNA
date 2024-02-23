# Transcrição de DNA para RNA

Este programa Java converte uma fita de DNA em RNA mensageiro. O DNA é lido a partir de um arquivo de entrada e o RNA resultante é escrito em um arquivo de saída.

## Funcionalidade

- **Input:** O programa lê uma sequência de DNA a partir de um arquivo de entrada.
- **Output:** Gera uma sequência correspondente de RNA mensageiro.
- **Teste de Exemplo:** `GGC.CGA.TTA.ATG.CTT.AAA.TGC.GGC.CTA.AAT.TAT`

## Uso

1. Certifique-se de ter um arquivo de entrada contendo a sequência de DNA no formato desejado.
2. Execute o programa.
3. Verifique o arquivo de saída para obter a sequência correspondente de RNA.

## Detalhes Técnicos

- O programa faz a transcrição de DNA para RNA de acordo com as seguintes regras:
  - `A` em DNA corresponde a `U` em RNA.
  - `G` em DNA corresponde a `C` em RNA.
  - `T` em DNA corresponde a `A` em RNA.
  - `C` em DNA corresponde a `G` em RNA.
  - Os pontos (`.`) são mantidos inalterados.
- O programa converte todas as letras da sequência de DNA para maiúsculas antes de realizar a transcrição.
- O RNA resultante é escrito em um arquivo de saída.

## Arquivos do Projeto

- **Transcricao.java:** Contém o código-fonte do programa.
- **entrada(Transcricao).txt:** Arquivo de entrada que contém a sequência de DNA a ser transcrita.
- **saida(Transcricao).txt:** Arquivo de saída onde será gravada a sequência de RNA resultante da transcrição.