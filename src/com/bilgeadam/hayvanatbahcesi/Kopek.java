package com.bilgeadam.hayvanatbahcesi;

// Inheritance
//supperclassın özellikleirni subclass alıyor
//extends ile saglanır.

public class Kopek extends Hayvan{

    private String kopekCins;

    public String getKopekCins() {
        return kopekCins;
    }

    public void setKopekCins(String kopekCins) {
        this.kopekCins = kopekCins;
    }

    //method overriding
    //superclass methodunu kendinize özgü yeniden yazıyoruz.
    @Override
    public void sesCikar()

    {
        System.out.println("Hav Hav");
    }

    @Override
    public String toString() {
        return " Ad:" +getAd() +
                " Agırlık:" + getAgirlik()+ "\n" +
                " Uzunluk: "+ getUzunluk()+ " \n" +
                " Cins:" + getKopekCins();
    }
}
