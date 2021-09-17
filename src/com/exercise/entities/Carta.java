package com.exercise.entities;

import java.util.Objects;

public class Carta {
    private String nome;
    private int valore;
    private String seme;

    public Carta() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValore() {
        return valore;
    }

    public void setValore(int valore) {
        this.valore = valore >= 10 ? 10 : valore;
    }

    public String getSeme() {
        return seme;
    }

    public void setSeme(String seme) {
        this.seme = seme;
    }

    public String scheda()
    {
    	return  nome + " di "+ seme;
    }

    @Override
    public String toString() {
        return  nome + " di " + seme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return valore == carta.valore && Objects.equals(nome, carta.nome) && Objects.equals(seme, carta.seme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, valore, seme);
    }
}
