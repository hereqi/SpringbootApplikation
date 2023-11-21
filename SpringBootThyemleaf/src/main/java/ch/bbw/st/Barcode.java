package ch.bbw.st;


public class Barcode {
    private String name;
    private String nachname;
    private String sitzreihe;
    private String saal;
    private String film;
    private String zeit;
    private String barcode;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }


    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getZeit() {
        return zeit;
    }

    public String getSitzreihe() {
        return sitzreihe;
    }

    public void setSitzreihe(String sitzreihe) {
        this.sitzreihe = sitzreihe;
    }

    public String getSaal() {
        return saal;
    }

    public void setSaal(String saal) {
        this.saal = saal;
    }

    public void setZeit(String zeit) {
        this.zeit = zeit;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getValues() {
        //String returnThing = "Name: " + name + " Nachname: " + nachname + " Strasse: " + strasse + " PLZ: " + plz + " Film Name: " + film + " Datum/Uhrzeit: " + zeit;

        if (name == null) {
            return "";
        }
        String values = "";
        values += name.substring(0, 1) + "-";
        values += nachname.substring(0, 1)+ "-";
        values += sitzreihe.substring(0, 2)+ "-";
        values += saal.substring(0, 1)+ "-";
        values += film.substring(0, 1)+ "-";
        values += zeit.substring(0, 2);



        return values;

    }

    public String[] decode(){

        if ( barcode == null) {
            return new String[0];
        }

        String[] splited = barcode.split("-");

        return splited;

    }
}
