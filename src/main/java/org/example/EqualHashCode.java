package org.example;

public class EqualHashCode {
    //2 PARTE LOGO APOS COLLECTIONS
    public static void main(String[] args){
        /*
        5️⃣ EXERCÍCIOS (MENTAL + CÓDIGO)
        🧠 Exercício mental
        👉 Pense antes de responder.
        Usuario u1 = new Usuario("123");
        Usuario u2 = new Usuario("123");

        System.out.println(u1.equals(u2));
        R> Vao ser diferentes porque sao usuarios difentes, temos u1 e u2.
        Ainda que tenham o mesmo "nome"

        Correcao:
        ✅ Resposta correta (SEM equals/hashCode sobrescrito)
        🔹 u1.equals(u2)
        👉 false
        ✔ Você acertou o resultado
        ❌ Mas errou o motivo
        Motivo correto:
        equals() (da classe Object) compara referência
        u1 e u2 são objetos diferentes na memória
        📌 Não tem nada a ver com o conteúdo ainda

        System.out.println(u1 == u2);
        R> Acredito que deve retornar true.
        Aqui vai uma comparacao de conteudo do objeto e nao dele em si.
        como os dois sao strings contendo "123" daria true.

        Correcao:
        🔹 u1 == u2
        👉 false
        ❌ Aqui foi o erro principal.
        Por quê?
        == compara referência
        u1 e u2 são dois new
        Logo, apontam para endereços diferentes
        📌 Strings NÃO entram nessa comparação
        Você não está comparando "123" == "123"
        Você está comparando objetos Usuario

        🧠 RESUMO MENTAL (GUARDE ISSO)
        Comparação	          O que compara
        ==	                  referência (endereço de memória)
        equals()	          conteúdo (SE sobrescrito)


        🧠 TABELA DEFINITIVA (GUARDE ISSO)
        Operador / Método	    Compara referência?	        Compara conteúdo?
        ==	                     ✔ sempre	                ❌ nunca
        equals() (Object)	     ✔	                        ❌
        equals() (sobrescrito)	 ❌	                        ✔

        👉 Esse quadro resolve 90% das confusões.
        */


        /*
        💻 Exercício prático
        1️⃣ Crie uma classe Produto
            codigo
            nome
        2️⃣ Dois produtos são iguais se:
            tiverem o mesmo codigo
        3️⃣ Use:
            Set<Produto>
            adicione produtos com mesmo código
            verifique o tamanho
        📌 Não use IDE para gerar automático ainda — faça na mão.

        public class Produto{
            private String nome;
            private String codigo;

            public Produto(String nome, String codigo){
            this.nome=nome;
            this.codigo=codigo;
            }
            getter e setter...
         }

         public void verificarSeIguais(Object obj1, Object obj2){
            if(obj1.get(codigo) == obj2.get(codigo)){
                System.out.Println("Sao iguais");
            }
            //ps.: tenho como verificar de duas formas pelo indice ou pela propriedade
         }

         Set<Produto> produto1 = new HashSet<>();
         produto1.add("Sorvete", "123456");
         produto1.add("Arroz", "123456");

         System.out.println(produto1.size());
         //ps.2: se tudo aqui foi gerado fora de auxilio de IDE nao tem como eu testar nada.
         //esta tudo de cabeca. entao provavelmente tem partes faltando.

        */



    }
}
