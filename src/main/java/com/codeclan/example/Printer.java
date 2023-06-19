package com.codeclan.example;

public class Printer {

    private int sheetsRemaining;
    private int tonerVolume;

    public Printer(int sheetsRemaining, int tonerVolume){
        this.sheetsRemaining = sheetsRemaining;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsRemaining(){
        return this.sheetsRemaining;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

    public void print(
            int numberOfPages,
            int numberOfCopies
    ){
        int totalSheetsNeeded = numberOfPages * numberOfCopies;
        if (totalSheetsNeeded <= this.sheetsRemaining){
            this.sheetsRemaining -= totalSheetsNeeded;
            this.tonerVolume -= totalSheetsNeeded;
        }
    }
}
