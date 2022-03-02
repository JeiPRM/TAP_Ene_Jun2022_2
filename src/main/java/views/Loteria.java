package views;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.net.URLClassLoader;

public class Loteria extends Stage {

    private VBox vBox;
    private HBox hBox1, hBox2;
    private Button btnAtras, btnSiguiente, btnJugar;
    private Label lblTiempo;
    private GridPane gdpPlantilla;
    private Image imgCarta;
    private Scene escena;

    private String[] arImagenes = {"barril.jpeg", "chavorruco.jpeg", "luchador.jpeg", "tacos.jpeg", "botella.jpeg"};
    private Button[][] arBtnPlantilla = new Button[4][2];
    private Image imgCartaP;
    private ImageView imv;


    public Loteria(){
        CrearUI();
        this.setTitle("Loteria");
        this.setScene(escena);
        this.show();
    }

    private void CrearUI() {
        btnAtras = new Button("Atras");
        btnSiguiente = new Button("Siguiente");
        lblTiempo = new Label("00:00");
        hBox1 = new HBox();
        hBox1.getChildren().addAll(btnAtras, btnSiguiente, lblTiempo);

        gdpPlantilla = new GridPane();
        CrearPlantilla();
        hBox2 = new HBox();
        hBox2.getChildren().addAll(gdpPlantilla);

        vBox = new VBox();
        vBox.getChildren().addAll(hBox1,hBox2);


        escena = new Scene(vBox, 700,500);
        // me falta definir la anchura y la longitud

    }

    private void CrearPlantilla() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++){
                arBtnPlantilla[j][i] = new Button();
                imgCartaP = new Image("file:///C:\\Users\\juan1\\IdeaProjects\\Proyecto2022_2\\src\\main\\java\\Images\\barril.jpeg") ; // me falta añadir la ruta relativa
                imv = new ImageView(imgCartaP);
                arBtnPlantilla[j][i].setGraphic(imv);
                gdpPlantilla.add(arBtnPlantilla[j][i],i,j);
            }
        }
    }
}
