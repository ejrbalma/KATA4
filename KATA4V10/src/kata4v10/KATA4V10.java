package kata4v10;

import java.io.IOException;
import java.util.ArrayList;

public class KATA4V10 {

    public static void main(String[] args) throws IOException {
        System.out.println("Inicio");
        String nameFile = "/Users/ejrbalma/NetBeansProjects/Proyectoa/Kata3V_2/Datos/emailsfilev1.txt";
        ArrayList <String> arrayMail = MailList.readFile(nameFile);
        Histogram<String> histogram = MailHistogramBuilder.build(arrayMail);
        new HistogramDisplay(histogram).execute();
        System.out.println("Fin");
        
    }
    
}
