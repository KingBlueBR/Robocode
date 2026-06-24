**RELATÓRIO DE ATIVIDADE**

Grupo: Eduardo Schabarum do Amarante, Gabriela Goulart Nascimento, Isaac Silveira dos Santos

1. **Introdução**

O presente relatório descreve a atividade prática realizada na disciplina de Introdução à Computação, do Curso Superior de Tecnologia em Análise e Desenvolvimento de Sistemas do IFSC. A atividade consistiu no desenvolvimento de um robô para a plataforma Robocode, sendo utilizada como contexto para a prática das ferramentas de controle de versão Git e GitHub.

O Robocode é um jogo de programação onde tanques robóticos se enfrentam em uma arena, com comportamento definido inteiramente pelo código Java escrito pelo programador. O lema da plataforma, "Build the best, destroy the rest\!", resume bem a proposta: programar é o diferencial competitivo.

2. **Descrição da Atividade**

A atividade foi estruturada com os seguintes requisitos:

* Organização em grupos de, em média, 3 pessoas.

* Desenvolvimento de um robô para competição entre os grupos da turma.

* Armazenamento do projeto em repositório no GitHub.

* Utilização de ferramentas de controle de versão do Git ao longo do desenvolvimento.

* Uso de Branches para inclusão de novas funcionalidades.

* Contribuições registradas de todos os integrantes da equipe no histórico do projeto.

* Entrega de relatório descrevendo o processo e os resultados obtidos.

3. **Cronologia das Aulas**

A atividade teve início com a apresentação da plataforma Robocode por meio de slides expositivos, uma demonstração ao vivo de batalha e a explicação do objetivo e das regras da atividade, momento em que a turma foi dividida em grupos. Na aula seguinte, realizamos a instalação do Robocode e os primeiros passos práticos com a ferramenta. Nas semanas seguintes, o grupo se dedicou ao desenvolvimento do robô, adotando branches no Git para implementar e testar funcionalidades. A estratégia desenvolvida está descrita na seção seguinte.

A competição final foi realizada em sala de aula, com os 11 robôs da turma disputando em duas fases de 100 rounds cada. Na primeira, todos os robôs lutaram simultaneamente e ficamos em 4º lugar. Na segunda, os robôs foram redistribuídos em grupos, ficamos no grupo com 4 robôs e alcançamos o 2º lugar, o que não foi suficiente para a classificação na final, mas representou um bom resultado.

4. **Estratégia do Robô Desenvolvido**

O robô desenvolvido pelo grupo foi inspirado na estratégia clássica de patrulhamento de paredes (wall-hugging), porém com uma abordagem mais agressiva e adaptativa. A lógica de comportamento foi dividida em duas fases distintas:

**4.1. Fase Inicial – Patrulha Agressiva das Bordas**

* Ao iniciar a partida, o robô se desloca até a parede mais próxima e começa a circular pelo perímetro da arena.

* Durante as curvas, o radar permanece ativo e varrendo continuamente em busca de adversários.

* Nessa fase, todos os disparos são realizados com potência máxima (3), priorizando a eliminação rápida de oponentes que também adotem estratégia de borda.

* Essa fase dura 8 voltas completas pela arena.

**4.2. Fase Final – Patrulha com Economia de Energia**

* Após completar 8 voltas, o canhão passa a ser orientado para o centro da arena, cobrindo a área de maior movimentação.

* O robô continua patrulhando as paredes, mas passa a calibrar a potência dos disparos conforme a distância do alvo: tiros fracos para alvos distantes, tiros fortes para alvos próximos.

* Em colisões com outros robôs, o robô recua para evitar ficar preso e retoma o patrulhamento.

5. **Uso de Git e GitHub**

O controle de versão foi parte central da avaliação. Como prática adotada pelo grupo, foi criado um repositório público no GitHub para o projeto do robô. Além disso, os três integrantes realizaram commits registrados no histórico do repositório.

6. **Resultados**  
   

| Fase | Robôs Participantes | Colocação do Grupo |
| :---: | :---: | :---: |
| 1ª Fase (Geral) | 11 robôs | **4º lugar** |
| 2ª Fase (Grupo 2\) | 4 robôs | **2º lugar** |

**6.1. Análise da 1ª Fase**

Na fase geral, com 11 robôs disputando simultaneamente em 100 rounds, o grupo alcançou o 4º lugar. Esse resultado coloca nosso robô no primeiro terço superior do ranking (top 36%), o que demonstra uma estratégia acima da média da turma. Em competições de múltiplos agentes, a sobrevivência em um campo com 11 adversários exige tanto capacidade ofensiva quanto de esquiva, o desempenho indica que o robô equilibrou bem esses dois aspectos.

Com 11 competidores, apenas os 3 primeiros colocados representariam o top 27%. Ficar em 4º significa que o robô ficou a uma posição da elite do ranking geral, uma diferença muito pequena, que pode ter sido determinada por poucos rounds de vantagem dos adversários à frente.

**6.2. Análise da 2ª Fase**

Na fase de grupos, enfrentamos 3 outros robôs (total de 4 no grupo) e terminamos em 2º lugar. Isso representa um resultado muito positivo: ficar entre os dois melhores de um grupo é demonstrar consistência e força competitiva mesmo em confrontos mais diretos e reduzidos.

Embora o 2º lugar não tenha garantido a classificação para a final, o grupo demonstrou capacidade de adaptação e desempenho acima de 50% dos competidores desta fase.

7. **Conclusão**

A atividade com o Robocode serviu principalmente como pretexto para a prática das ferramentas de controle de versão Git e GitHub, que foram o foco central da avaliação. Criar e adaptar um robô na plataforma foi uma forma concreta e dinâmica de colocar em uso comandos como git init, git add, git commit e git push, além do fluxo de trabalho com branches, conceitos que, de outra forma, poderiam parecer abstratos num primeiro contato.

Ainda que a disciplina de Introdução à Computação seja ampla e não voltada especificamente à programação, a experiência permitiu uma visão geral de como funciona um ciclo básico de desenvolvimento colaborativo: ter um repositório compartilhado, registrar alterações e trabalhar em equipe com histórico rastreável.

Os resultados obtidos na competição, 4º lugar na fase geral e 2º na fase de grupos, foram satisfatórios dentro do contexto da atividade.

8. **Referências**

ROBOCODE – APRESENTAÇÃO. Material de aula disponibilizado na disciplina Introdução à Computação. \[S.l.: s.n.\], \[s.d.\].  
ROBOCODE – RESUMO DE COMANDOS. Material de apoio disponibilizado na disciplina Introdução à Computação. \[S.l.: s.n.\], \[s.d.\].  
REIS, Helder Linhares Bertoldo dos. Robocode: manual de instruções. Juiz de Fora: Universidade Federal de Juiz de Fora, \[s.d.\].  
REIS, Helder Linhares Bertoldo dos. Robocode: manual de instruções. Juiz de Fora: Universidade Federal de Juiz de Fora, \[s.d.\]. Disponível em material digital consultado para definição do ambiente Robocode e de suas funcionalidades.

