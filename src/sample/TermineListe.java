package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

/**
 * Created by eberh_000 on 12.02.2017.
 */
public class TermineListe extends TableView<Termin> {

    TableColumn idCol;
    TableColumn titleCol;
    TableColumn komponistCol;
    TableColumn ortCol;
    TableColumn datumCol;
    TableColumn besetzungCol;
    TableColumn activeCol;

    private ArrayList<Termin> list = new ArrayList<>();

    public TermineListe() {
        idCol = new TableColumn("ID");
        titleCol = new TableColumn("Titel");
        komponistCol = new TableColumn("Komponist");
        ortCol = new TableColumn("Ort");
        datumCol = new TableColumn("Datum");
        besetzungCol = new TableColumn("Besetzung");
        activeCol = new TableColumn("Active");

        this.getColumns().addAll(idCol, titleCol, komponistCol, ortCol, datumCol, besetzungCol, activeCol );


    }

    public void addTermin(Termin t) {
        this.list.add( t );
    }

    public void updateView() {
        ObservableList<Termin> content = FXCollections.observableArrayList(list);
        idCol.setCellValueFactory( new PropertyValueFactory<>("id"));
        titleCol.setCellValueFactory( new PropertyValueFactory<>("title"));
        komponistCol.setCellValueFactory( new PropertyValueFactory<>("komponist"));
        ortCol.setCellValueFactory( new PropertyValueFactory<>("ort"));
        datumCol.setCellValueFactory( new PropertyValueFactory<>("datum"));
        besetzungCol.setCellValueFactory( new PropertyValueFactory<>("besetzung"));
        activeCol.setCellValueFactory(new PropertyValueFactory<>("active"));
        this.setItems( content );
    }

    public void setList(ArrayList<Termin> list) {
        this.list = list;
    }
}
