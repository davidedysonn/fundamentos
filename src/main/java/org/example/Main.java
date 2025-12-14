package org.example;
public class Main {
    public static void main(String[] args) {
        /*
🔹 EXERCÍCIO MENTAL 1 — Escolha da Collection

        1️⃣ Preciso armazenar IDs de pedidos, não podem repetir e não importa a ordem.
👉 Qual collection?
        R> HashSet. ele nao se importa com a ordem em sua natureza e nao permite repeticoes.

        2️⃣ Preciso armazenar histórico de ações do usuário, na ordem em que ocorreram, podendo repetir.
👉 Qual collection?
        R> List. Pois permite repecitoes e mantem a orden de insersao.

        3️⃣ Preciso armazenar nomes de usuários únicos, mas ordenados alfabeticamente.
👉 Qual collection?
        R> TreeSet. como contem nomes devolve organiza em ordem alfabetica e mantem sua unicidade.

        4️⃣ Preciso associar CPF → Cliente, e buscar rapidamente pelo CPF.
👉 Qual collection?
        R> Map. pois trabalha chave e valor. (sinto que ainda me perco em quem seria a chave e valor neste caso)
        quando busco o CPF de um cliente posso dizer que a chave da minha busca seria o CPF. pois e a informacao que tenho.
        Curiosidade sei que posso pesquisar algo usando seja sua chave ou seu valor. entao como eu decido, o que seria chave e o que seria valor?
        existe um tipo de padronizacao?

        5️⃣ Preciso armazenar produtos únicos, mas na ordem em que foram cadastrados.
👉 Qual collection?
        R> LinkedHasSet. mantenho minha unicidade porem armazendo conforme foi inserido.

        🔹 EXERCÍCIO MENTAL 2 — Comportamento (muito comum em entrevista)
        Set<Integer> numeros = new HashSet<>();
        numeros.add(3);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        System.out.println(numeros);
        1️⃣ Quantos números serão impressos?
        R> 3 numeros
        2️⃣ A ordem será previsível?
        R> ao se trabalhar com HashSet a ordem nao e garantida
        3️⃣ O número 3 aparece duas vezes?
        R> Nao. o fato de ter tentando adicionar o numero 3 fara com que essa adicao
        repetida seja ignorada.

        🔹 EXERCÍCIO MENTAL 3 — Programar para interface
        Qual opção é mais correta e por quê?
        A) HashMap<String, Usuario> map = new HashMap<>();
        R> A sintaxe esta errada. A Nao trabalhamos com implementacao.
        B) Map<String, Usuario> map = new HashMap<>();
        R> A sintaxe esta correta. A implementacao sera voltada pra interface.

        Correcao:
        Aqui está a confusão central — e vamos resolver agora.
        Você disse:
        “A sintaxe está errada. Não trabalhamos com implementação.”
        ⚠ Ajuste fino:
        A sintaxe NÃO está errada.
        Ela funciona, mas não é a melhor prática.
        // Funciona, mas acopla
        HashMap<String, Usuario> map = new HashMap<>();
        // Melhor prática
        Map<String, Usuario> map = new HashMap<>();
        ✔ A segunda é preferível porque reduz acoplamento, não porque a primeira seja inválida.
        */


    }
}