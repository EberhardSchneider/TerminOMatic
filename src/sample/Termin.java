package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Created by eberh_000 on 12.02.2017.
 */
public class Termin {
    private SimpleIntegerProperty id = new SimpleIntegerProperty();
    private SimpleStringProperty title = new SimpleStringProperty();
    private final SimpleStringProperty  komponist = new SimpleStringProperty();
    private final SimpleStringProperty ort = new SimpleStringProperty();
    private final SimpleStringProperty datum =new SimpleStringProperty();
    private final SimpleStringProperty besetzung = new SimpleStringProperty();
    private final SimpleIntegerProperty active =  new SimpleIntegerProperty();



    public void setId(int id) {

            this.id.set( id );

    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public void setKomponist(String komponist) {
        this.komponist.set(komponist);
    }

    public void setOrt(String ort) {
        this.ort.set(ort);
    }

    public void setDatum(String datum) {
        this.datum.set(datum);
    }

    public void setBesetzung(String besetzung) {
        this.besetzung.set(besetzung);
    }

    public void setActive(int active) {
        this.active.set(active);
    }

    public String getTitle() {
        return title.get();
    }

    public SimpleStringProperty titleProperty() {
        return title;
    }

    public String getKomponist() {
        return komponist.get();
    }

    public SimpleStringProperty komponistProperty() {
        return komponist;
    }

    public String getOrt() {
        return ort.get();
    }

    public SimpleStringProperty ortProperty() {
        return ort;
    }

    public String getDatum() {
        return datum.get();
    }

    public SimpleStringProperty datumProperty() {
        return datum;
    }

    public String getBesetzung() {
        return besetzung.get();
    }

    public SimpleStringProperty besetzungProperty() {
        return besetzung;
    }

    public int getActive() {
        return active.get();
    }

    public SimpleIntegerProperty activeProperty() {
        return active;
    }

    public int getId() {

        return id.get();
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public void logToConsole() {
        System.out.println("Id:" +id + " Title: " + title + " Komponist: " + komponist +
                            " Ort: " + ort + " Datum: " + datum.toString());
        System.out.println("Besetzung: " + besetzung );
    }

    public ArrayList<String> getStringList() {
        ArrayList<String> result = new ArrayList<>();
        result.add( id.toString() );
        result.add( title.toString() );
        result.add( komponist.toString());
        result.add( ort.toString() );
        result.add( datum.toString() );
        result.add( besetzung.toString() );

        return result;
    }

    public void edit() {

    }
}
