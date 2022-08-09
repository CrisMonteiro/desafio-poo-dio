package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;

public class Dev {
    private String nome;
    private Set<conteudo> conteudosInscritos * new LinkedHashSet<>() ;
    private Set<conteudo> conteudosConcluido new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){}
            this.conteudosIncritos.addall(bootcamp.getconteudos());
                bootcamp.getDevsInscritos().add(this);

        public void progredir(){
          optional<conteudo> conteudo = this.conteudosInscritos.stream().findfirst();
            if(conteudo.isPresent()){
                this.conteudosConcluidos.add(conteudo.get());
                this.conteudosInscritos.remove(conteudo.get());
            }else {
                System.err.println("Você não está matrículado em nenhum conteudo!");
            }
        }
        public double caculatTotalXP(){
            this.conteudosConcluido.stream().mapToDouble
                    (Conteudo -> conteudo.calcularXP());
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<conteudo> getConteudosConcluido() {
        return conteudosConcluido;
    }

    public void setConteudosConcluido(Set<conteudo> conteudosConcluido) {
        this.conteudosConcluido = conteudosConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluido, dev.conteudosConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluido);
    }
}
