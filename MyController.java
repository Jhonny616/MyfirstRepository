import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.MenuButton;

public class MyController {
    @FXML
    private MenuButton cmdCafe;

    @FXML
    private Button cmdPrecioBase;

    @FXML
    private MenuButton cmdAzucar;

    @FXML
    private Button cmdRecargarC;

    @FXML
    private Button cmdRecargarAzucar;

    @FXML
    private Button cmdRecargarV;

    @FXML
    private Button cmdPrepararC;

    @FXML
    private Button cmdRegistrarF;

    @FXML
    private TextField txtPrecio;

    @FXML
    private Label idPrecio;

    @FXML
    private Label idCantidadCafe;

    @FXML
    private Label idCantidadAzucar;

    @FXML
    private Label idCantidadVasos;

    @FXML
    private Label idPrecioBaseCafe;

    @FXML
    private Label idIngresos;

    @FXML
    private Label idEgresos;

    @FXML
    private Label idGanancias;

    @FXML
    private Label idIva;

    @FXML
    private Label idGananciasNetas;

    @FXML
    private TextField txtCantidadCafe;

    @FXML
    private TextField txtCantidadAzucar;

    @FXML
    private TextField txtCantidadVasos;

    @FXML
    private TextField txtPrecioBC;

    @FXML
    private TextField txtIngresos;

    @FXML
    private TextField txtEgresos;

    @FXML
    private TextField txtGanancias;

    @FXML
    private TextField txtIva;

    @FXML
    private TextField txtGananciasNetas;
    
    MaquinaCafetera maquina = new MaquinaCafetera();
    
    
    @FXML
    public void cantidadCafe() {
        maquina.getCafe();
    }

    @FXML
    public void precioBC() {
        maquina.getPrecioBaseCafe();
    }
    
    @FXML
    public void azucar() {
        //Haga aqui algo inteligente
        System.out.println("Cancelar...");

    }

    @FXML
    public void vasos() {
        //Haga aqui algo inteligente
        System.out.println("Cancelar...");
    }

    
    @FXML
    public void ingresos() {
        //Haga aqui algo inteligente
        System.out.println("Cancelar...");
    }

    @FXML
    public void egresos() {
        //Haga aqui algo inteligente
        System.out.println("Cancelar...");

    }

    @FXML
    public void ganancias() {
        //Haga aqui algo inteligente
        System.out.println("Cancelar...");
    }

    @FXML
    public void iva() {
        //Haga aqui algo inteligente
        System.out.println("Cancelar...");

    }

    @FXML
    public void gananciasNetas() {
        //Haga aqui algo inteligente
        System.out.println("Cancelar...");
    }

    @FXML
    public void tipoCafe() {
        //Haga aqui algo inteligente
        System.out.println("Cancelar...");

    }

    @FXML
    public void cantidadAzucar() {
        //Haga aqui algo inteligente
        System.out.println("Cancelar...");
    }

    @FXML
    public void cantidadVasos() {
        //Haga aqui algo inteligente
        System.out.println("Cancelar...");

    }

    @FXML
    public void precioBase() {
        
        //Haga aqui algo inteligente
        System.out.println("Cancelar...");
    }

    @FXML
    public void recargarCafe() {
        //Haga aqui algo inteligente
        System.out.println("Cancelar...");

    }

    @FXML
    public void recargarVasos() {
        //Haga aqui algo inteligente
        System.out.println("Cancelar...");
    }

    @FXML
    public void recargarAzucar() {
        //Haga aqui algo inteligente
        System.out.println("Cancelar...");

    }

    @FXML
    public void registrarFactura() {
        //Haga aqui algo inteligente
        System.out.println("Cancelar...");
    }

    @FXML
    public void prepararCafe() {
        //Haga aqui algo inteligente
        System.out.println("Cancelar...");

    }

    @FXML
    public void calcularPrecio() {
        //Haga aqui algo inteligente
        System.out.println("Cancelar...");

    }

}

