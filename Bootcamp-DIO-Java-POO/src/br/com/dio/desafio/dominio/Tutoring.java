package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Tutoring extends Content{
    private LocalDate date;


    public Tutoring() {
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Tutoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public double calculateXp() {
        return XP_PADRAO + 20d;
    }
}
