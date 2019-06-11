import org.junit.Assert;
import org.junit.Test;

public class TestClientHTMLInforme {
    @Test
    public void TestInforme() {
        Client nouClient = new Client ("12333211123L", "Isma", "123324422334");


        Vehicle v1 = new Vehicle("Seat", "Leon", Vehicle.BASIC);
        Vehicle v2 = new Vehicle("Toyota", "Prius", Vehicle.GENERAL);
        Vehicle v3 = new Vehicle("Ferrari", "Lusso T", Vehicle.LUXE);

        Lloguer L4 = new Lloguer("10-04-2018", 9, v1);
        Lloguer L5 = new Lloguer("11-05-2018", 10, v2);
        Lloguer L6 = new Lloguer("12-06-2018",11, v3);


        nouClient.afegeix(L4);
        nouClient.afegeix(L5);
        nouClient.afegeix(L6);

        String informe = new InformeDeClient(nouClient).htmlinforme();
        String resultat = "<h1>Informe de lloguers</h1>\n" +
                "<p>Informe de lloguers del client <em>Isma</em> (<strong>12333211123L</strong>)</p>\n" +
                "<table>\n" +
                "<tr><td><strong>Marca</strong></td><td><strong>Model</strong></td><td><strong>Import</strong></td></tr>" +
                "<tr><td>Seat</td><td>Leon</td><td>360.0€</td></tr>\n" +
                "<tr><td>Toyota</td><td>Prius</td><td>720.0€</td></tr>\n" +
                "<tr><td>Ferrari</td><td>Lusso T</td><td>1980.0€</td></tr>\n" +
                "</table>\n" +
                "<p>Import a pagar: <em>3060.0€</em></p>\n" +
                "<p>Punts guanyats: <em>4</em></p>\n";

        Assert.assertEquals(resultat, informe);
    }

    //Test: Un sol lloguer
    @Test
    public void TestInformeUnlloguer() {
        Client nouClient = new Client ("12333211123L", "Isma", "123324422334");

        Vehicle v1 = new Vehicle("Seat", "Leon", Vehicle.BASIC);
        Lloguer L4 = new Lloguer("10-04-2018", 9, v1);
        nouClient.afegeix(L4);


        String informe = new InformeDeClient(nouClient).htmlinforme();
        String resultat = "<h1>Informe de lloguers</h1>\n" +
                "<p>Informe de lloguers del client <em>Isma</em> (<strong>12333211123L</strong>)</p>\n" +
                "<table>\n" +
                "<tr><td><strong>Marca</strong></td><td><strong>Model</strong></td><td><strong>Import</strong></td></tr>" + "<tr><td>Seat</td><td>Leon</td><td>360.0€</td></tr>\n" +
                "</table>\n" +
                "<p>Import a pagar: <em>360.0€</em></p>\n" +
                "<p>Punts guanyats: <em>1</em></p>\n";

        
        Assert.assertEquals(resultat, informe);
    }


    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("Testhtmlinforme");
    }
}
