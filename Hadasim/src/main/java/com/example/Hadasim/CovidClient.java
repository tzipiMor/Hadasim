package com.example.Hadasim;

import java.time.LocalDate;

public class CovidClient {

    private LocalDate coronaVaccine;
    private String manufacturer;
    private LocalDate possiveAnswer;
    private LocalDate recovery;

    public CovidClient(LocalDate oronaVaccine, String manufacturer, LocalDate possiveAnswer, LocalDate recovery) {
        this.coronaVaccine = oronaVaccine;
        this.manufacturer = manufacturer;
        this.possiveAnswer = possiveAnswer;
        this.recovery = recovery;
    }

    public LocalDate getOronaVaccine() {
        return coronaVaccine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public LocalDate getPossiveAnswer() {
        return possiveAnswer;
    }

    public LocalDate getRecovery() {
        return recovery;
    }

    public void setOronaVaccine(LocalDate oronaVaccine) {
        this.coronaVaccine = oronaVaccine;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPossiveAnswer(LocalDate possiveAnswer) {
        this.possiveAnswer = possiveAnswer;
    }

    public void setRecovery(LocalDate recovery) {
        this.recovery = recovery;
    }

    @Override
    public String toString() {
        return "CovidClient{" +
                "coronaVaccine=" + coronaVaccine +
                ", manufacturer='" + manufacturer + '\'' +
                ", possiveAnswer=" + possiveAnswer +
                ", recovery=" + recovery +
                '}';
    }
}
