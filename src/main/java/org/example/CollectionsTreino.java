package org.example;

import java.util.*;

public class CollectionsTreino {
    public static void main(String[] args){
        /*
    * 🔹 EXERCÍCIO 1 — LIST
    Requisitos:
    Crie uma List<String>
    Adicione 5 nomes (pode repetir)
    Imprima:
    todos os nomes
    tamanho da lista
    Remova um nome
    Imprima novamente
    📌 Objetivo: entender ordem e repetição
    * */

        List<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("Betania");
        nomes.add("Silva");
        nomes.add("Costa");
        nomes.add("Adriana");
        System.out.println(nomes);
        System.out.println(nomes.size());
        nomes.remove(3);
        System.out.println(nomes);


        /*
        * 🔹 EXERCÍCIO 2 — SET (HashSet)
        Requisitos:
        Crie um Set<String> de CPFs
        Adicione CPFs repetidos
        Imprima o Set
        📌 Objetivo: ver unicidade na prática*/

        Set<String> cpfs = new HashSet<>();
        cpfs.add("792.146.581-00");
        cpfs.add("104.975.326-14");
        cpfs.add("452.880.003-87");
        cpfs.add("104.975.326-14");
        System.out.println(cpfs);

        /*🔹 EXERCÍCIO 3 — LinkedHashSet
        Requisitos:
        Use LinkedHashSet
        Adicione valores fora de ordem
        Imprima
        📌 Objetivo: observar ordem de inserção*/

        Set<Integer> algunsNumeros = new  LinkedHashSet<>();
        algunsNumeros.add(2);
        algunsNumeros.add(5);
        algunsNumeros.add(1);
        algunsNumeros.add(20);
        System.out.println(algunsNumeros);

        /*
        🔹 EXERCÍCIO 4 — TreeSet
        Requisitos:
        Use TreeSet<Integer>
        Adicione números desordenados
        Imprima
        📌 Objetivo: ver ordenação automática*/

        Set<Integer> numAlternados = new TreeSet<>();
        numAlternados.add(5);
        numAlternados.add(30);
        numAlternados.add(1);
        numAlternados.add(17);
        System.out.println(numAlternados);

        /*
        🔹 EXERCÍCIO 5 — MAP (HashMap)
        Requisitos:
        Crie Map<String, String>
        Chave → email
        Valor → nome
        Adicione 3 usuários
        Busque um usuário pelo email
        Imprima o nome encontrado
        📌 Objetivo: entender chave → valor
        */
        Map<String, String> buscas = new HashMap<>();
        buscas.put("maria@gmail.com", "Maria");
        buscas.put("pedro@gmail.com", "Pedro");
        buscas.put("fernanda@gmail.com", "Fernanda");
        System.out.println(buscas.get("fernanda@gmail.com"));
        /* ps. acho que essa parte o exercicio respondeu minha pergunta la em cima. A busca e sempre realizada pela chave.
        * ou sela ela define minhas informacoes, o valor sempre sera o item devolvido da busca*/
    }
}
