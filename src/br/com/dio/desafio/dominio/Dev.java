package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){}

    public void progredir(){}

    public void calcularXp(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev)) return false;

        Dev dev = (Dev) o;

        if (getNome() != null ? !getNome().equals(dev.getNome()) : dev.getNome() != null) return false;
        if (getConteudosInscritos() != null ? !getConteudosInscritos().equals(dev.getConteudosInscritos()) : dev.getConteudosInscritos() != null)
            return false;
        return getConteudosConcluidos() != null ? getConteudosConcluidos().equals(dev.getConteudosConcluidos()) : dev.getConteudosConcluidos() == null;
    }

    @Override
    public int hashCode() {
        int result = getNome() != null ? getNome().hashCode() : 0;
        result = 31 * result + (getConteudosInscritos() != null ? getConteudosInscritos().hashCode() : 0);
        result = 31 * result + (getConteudosConcluidos() != null ? getConteudosConcluidos().hashCode() : 0);
        return result;
    }
}
