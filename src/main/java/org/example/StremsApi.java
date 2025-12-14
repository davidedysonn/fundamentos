package org.example;

public class StremsApi {
    // DEPOIS DE EQUALS E HASHCODE
    public static void main(String[] args){
        /*
        ESTRUTURA DE UM STREAM (GUARDE ISSO)
        origem.stream()
          .operacaoIntermediaria()
          .operacaoIntermediaria()
          .operacaoTerminal();

        Exemplos:
          - Intermediárias: filter, map, distinct, sorted.
          - Terminais: forEach, collect, toList, findFirst.

        4️⃣ OPERAÇÕES ESSENCIAIS (COM EXEMPLOS):
        🔹 filter — filtrar elementos
        usuarios.stream()
                .filter(u -> u.getIdade() >= 18)
                .toList();
        📌 Retorna apenas quem passa na condição.

        🔹 OPERAÇÕES map — transformar:
        usuarios.stream()
                .map(Usuario::getNome)
                .toList();

        📌 Transforma Usuario → String


        🔹 OPERAÇÕES distinct — remover duplicados:
        ⚠️ Usa equals() e hashCode()
        usuarios.stream()
                .distinct()
                .toList();

        📌 Se equals/hashCode estiver errado → não funciona.

        🔹OPERAÇÕES sorted — ordenar:
        numeros.stream()
               .sorted()
               .toList();

        Ou com regra própria:
        usuarios.stream()
                .sorted(Comparator.comparing(Usuario::getNome))
                .toList();

        🔹OPERAÇÕES findFirst:
        usuarios.stream()
                .filter(Usuario::isAtivo)
                .findFirst();

        📌 Retorna Optional<Usuario>

        5️⃣ OPTIONAL (MINI-INTRODUÇÃO)
        Optional evita NullPointerException.
        Optional<Usuario> opt = usuarios.stream()
                                        .findFirst();

        opt.ifPresent(u -> System.out.println(u.getNome()));


        📌 Em entrevista:
        “Optional representa presença ou ausência de valor.”

         */

        /*
        6️⃣ EXERCÍCIOS MENTAIS (ENTREVISTA)
        🧠 Exercício 1
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        numeros.stream()
               .filter(n -> n > 3)
               .map(n -> n * 2)
               .toList();

        👉 Qual será o resultado?
        R>  filter: pega todo 'n' que seja maior que 3.
            map vai pegar todo 'n' do filter e multiplicar por 2, fazendo interacao
            em cada um dos valores resultantes do filter.
            toList vai pegar todo o resultado de realizado em map e transofrmar em uma lista.

        🧠 Exercício 2
            usuarios.stream()
                    .distinct()
                    .count();

            👉 O que esse código depende para funcionar corretamente?
            R> distinct removera todos os usuarios repetidos e ao final sera realizado
            uma contagem afim de saber quantos usuarios diferentes existem em "usuarios".
            Precisa do equals e hashcode pra ter certeza de funcionar corretamente com o equals
            sobrescrevendo corretamente.


        * */


    }
}
