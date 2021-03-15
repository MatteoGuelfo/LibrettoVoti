package it.polito.tdp.librettovoti;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Libretto;
import model.Voto;

public class FXMLController {

	private Libretto model;  
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtVoto;

    @FXML
    private TextField txtData;

    @FXML
    private TextArea txtRisultato;

    @FXML
    void handleInserisci(ActionEvent event) {
    	// Leggi e controlla i dati 
    	String nomeEsame = txtNome.getText();
    	if(nomeEsame.length()==0) {
    		txtRisultato.setText("Errore");
    		return;
    	}
    	String votoEsame = txtVoto.getText();
    	int votoInt = Integer.parseInt(votoEsame);
    	String dataEsame = txtData.getText();
    	LocalDate data= LocalDate.parse(dataEsame);
    	//TODO: aggiungere tutti i controlli
    	
    	// Esegui l'azione
    	Voto voto = new Voto(nomeEsame, votoInt, data);
    	model.add(voto);
    	
    	// Aggiorna i risultati nella vista
    	txtRisultato.setText(model.toString());

    }
    
    public void setModel(Libretto model) {
    	this.model = model; 
    }

    @FXML
    void initialize() {
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtVoto != null : "fx:id=\"txtVoto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtData != null : "fx:id=\"txtData\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisultato != null : "fx:id=\"txtRisultato\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
