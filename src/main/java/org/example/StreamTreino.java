package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class StreamTreino {
    public static void main(String[] args){

        /*
        7️⃣ EXERCÍCIOS PRÁTICOS (CÓDIGO)
            Crie uma classe StreamTreino.
            🔹 Exercício 1 — filter + map
            Crie uma lista de usuários
            Filtre apenas os ativos
            Retorne apenas os nomes
        */
        System.out.println("Exercício 1 — filter + map");
        List<Usuarios> usuarios = new ArrayList<>();
        usuarios.add(new Usuarios("Mariana", false,"1234567", 10));
        usuarios.add(new Usuarios("Carla", true,"1234568", 18));
        usuarios.add(new Usuarios("Patricia", true,"1234569", 22));


       List<String> estaAtivo = usuarios.stream()
               .filter(Usuarios::getAtivo)
               .map(Usuarios::getNome)
               .toList();
        System.out.println(estaAtivo);

        System.out.println("Exercício 2 — distinct");
        /*
        Crie usuários duplicados (mesmo CPF)
        Use distinct
        Imprima o tamanho
        */
        usuarios.add(new Usuarios("Sandra",true,"123456", 17));
        usuarios.add(new Usuarios("Sandra",true,"123456", 51));

        List<Usuarios> isDuplicated = usuarios.stream()
                .distinct()
                .toList();

        System.out.println(isDuplicated.size());

        /*
        Exercício 4 — findFirst + Optional
        Busque o primeiro usuário maior de idade
        Trate com Optional
        */
        System.out.println("Exercício 4 — findFirst + Optional");

        List<Usuarios> maiorIdade = usuarios.stream()
                .filter(u-> u.getIdade() >=18)
                .toList();

        Optional<Usuarios> opt =  usuarios.stream()
                .filter(u-> u.getIdade() >=18)
                .findFirst();
        opt.ifPresent(u -> System.out.println(u.getNome()));

    }

}
class Usuarios{
    private String nome;
    private Boolean ativo;
    private String cpf;
    private Integer idade;

    public Usuarios(String nome, Boolean ativo, String cpf, Integer idade) {
        this.nome = nome;
        this.ativo = ativo;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuarios usuarios = (Usuarios) o;
        return Objects.equals(cpf, usuarios.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "nome='" + nome + '\'' +
                ", ativo=" + ativo +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
