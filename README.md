# Composite

## Motivação: 
No desenvolvimento de sistemas que lidam com estruturas hierárquicas, como sistemas de arquivos, interfaces de usuário ou organizações de objetos em jogos, é comum enfrentar desafios relacionados à complexidade do gerenciamento dessas estruturas. O padrão Composite surge como uma solução elegante para tratar objetos individuais e composições de objetos de forma uniforme, simplificando o código e melhorando a manutenção e a escalabilidade do sistema.

### Partipantes:

- **Componente (Interface):**
 - Define a interface comum para todos os elementos, com o método mostrar().
 - Permite que arquivos e pastas sejam tratados de forma uniforme.

- **Folha (Arquivo):**
 - Representa os objetos individuais que não têm filhos (arquivos).
 - Implementa o método mostrar() para exibir seu nome.

- **Composite (Pasta):**
 - Representa os objetos que podem conter outros objetos (pastas).
 - Gerencia uma lista de Componente (que podem ser arquivos ou outras pastas).
 - Implementa o método mostrar() para exibir seu nome e o conteúdo de seus filhos.

- **Cliente (Main):**
 - Cria a estrutura de pastas e arquivos.
 - Chama o método mostrar() na pasta principal, que percorre toda a estrutura de forma recursiva.
