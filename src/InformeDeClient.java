import java.util.Vector;

import static java.lang.String.format;

public class InformeDeClient {

    public Client a;
    private String textcap="Informe de lloguers del client %s (%s)%n";




    public InformeDeClient(Client a){
        this.a=a;

    }



    public String informe() {
        return composaCapsalera(a) +
                composaDetall() +
                composaPeu();

    }

    public double importTotal(){
        double total = 0;
        for (Lloguer lloguer: a.lloguers) {
            total += lloguer.quantitat() * 30;
        }
        return total;
    }
    public int bonificacionsTotals(){
        int boni=0;
        for (Lloguer lloguers:a.lloguers){
            boni += lloguers.bonificacions();
        }
        return boni;
    }

    public String composaCapsalera(Client a){
        String resultat = "Informe de lloguers del client " +
                a.getNom() +
                " (" + a.getNif() + ")\n";

        String cap = String.format(textcap,a.getNom(),a.getNif());
        return cap;
    }
    public String composaDetall(){
        String resultat="";
        for (Lloguer lloguer: a.lloguers) {


            resultat += "\t" +
                    lloguer.getVehicle().getMarca() +
                    " " +
                    lloguer.getVehicle().getModel() + ": " +
                    (lloguer.quantitat() * 30) + "€" + "\n";



        }
        return resultat;
    }
    private String composaPeu(){

        String resultat = "Import a pagar: " + importTotal()+ "€\n" +
                "Punts guanyats: " + bonificacionsTotals() + "\n";
        return resultat;
    }
    //html





    //html

    public String htmlinforme() {
        return htmlcomposaCapsalera() +
                htmlcomposaDetall() +
                htmlcomposaPeu();
    }


    public String htmlcomposaCapsalera() {
        String resultat = "<h1>Informe de lloguers</h1>\n" +
                "<p>Informe de lloguers del client <em>" + a.getNom() + "</em> (<strong>" + a.getNif() + "</strong>)</p>\n";
        return resultat;
    }

    public String htmlcomposaDetall() {
        String resultat = "<table>\n<tr><td><strong>Marca</strong></td><td><strong>Model</strong></td><td><strong>Import</strong></td></tr>";
        for (Lloguer lloguer: a.lloguers) {
            resultat += "<tr><td>" + lloguer.getVehicle().getMarca() + "</td><td>" + lloguer.getVehicle().getModel() + "</td><td>" + (lloguer.quantitat() * 30) + "€" + "</td></tr>\n";

        }
        resultat += "</table>\n";
        return resultat;
    }

    public String htmlcomposaPeu() {
        String resultat = "<p>Import a pagar: <em>" + importTotal() + "€</em></p>\n"
                + "<p>Punts guanyats: <em>" + bonificacionsTotals() + "</em></p>\n";
        return resultat;
    }


}
