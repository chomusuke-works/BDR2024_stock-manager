package ch.stockmanager.client.views;

import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;

public class Navigator {

    private static Stage mainStage;

    /**
     * Enregistre le stage principal (appelé une seule fois, par ex. dans stockmanager.client.Client.start()).
     */
    public static void setStage(Stage stage) {
        mainStage = stage;
    }

    /**
     * Accès à la vue Dashboard.
     */
    public static void goToDashboard() {
        VueDashboard dashboard = new VueDashboard();
        Scene scene = new Scene(dashboard, 900, 600);
        mainStage.setScene(scene);
        mainStage.setTitle("Application - Dashboard");
        mainStage.show();
    }

    /**
     * Accès à la vue des produits expirés.
     */
    public static void goToProduitsExpires() throws IOException, URISyntaxException {
        ExpiryDatesPane vue = new ExpiryDatesPane();
        Scene scene = new Scene(vue, 900, 600);
        mainStage.setScene(scene);
        mainStage.setTitle("Produits Expirés");
        mainStage.show();
    }

    /**
     * Accès à la vue Ventes & Déchets.
     */
    public static void goToVentesDechets() throws IOException, URISyntaxException {
        SalesPane vue = new SalesPane();
        Scene scene = new Scene(vue, 900, 600);
        mainStage.setScene(scene);
        mainStage.setTitle("Ventes & Déchets");
        mainStage.show();
    }

    /**
     * Accès à la vue Localisation & Rayons.
     */
    public static void goToLocalisationRayons() throws IOException {
        ShelvesPane vue = new ShelvesPane();
        Scene scene = new Scene(vue, 1000, 600);
        mainStage.setScene(scene);
        mainStage.setTitle("Localisation & Rayons");
        mainStage.show();
    }

    /**
     * Accès à la vue Gestion des commandes.
     */
    public static void goToGestionCommandes() throws IOException {
        VueGestionCommandes vue = new VueGestionCommandes();
        Scene scene = new Scene(vue, 900, 600);
        mainStage.setScene(scene);
        mainStage.setTitle("Gestion des commandes");
        mainStage.show();
    }

    /**
     * Accès à la vue Fournisseurs.
     */
    public static void goToFournisseurs() throws IOException {
        VueFournisseurs vue = new VueFournisseurs();
        Scene scene = new Scene(vue, 1000, 600);
        mainStage.setScene(scene);
        mainStage.setTitle("Fournisseurs");
        mainStage.show();
    }
}

