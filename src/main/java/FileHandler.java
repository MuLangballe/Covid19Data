import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private File file = new File("noegletal_pr_region_pr_aldersgruppe.csv");

    public ArrayList<Covid19Data> loadCovid19Data(){
        ArrayList<Covid19Data> data = new ArrayList<>();
        Scanner sc = null;

            try {
                sc = new Scanner(file, StandardCharsets.ISO_8859_1);
                sc.nextLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }



        Covid19Data covid19 = null;
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] attributes = line.split(";");
            covid19 = new Covid19Data(
                    (attributes[0]),
                    (attributes[1]),
                    Integer.parseInt(attributes[2]),
                    Integer.parseInt(attributes[3]),
                    Integer.parseInt(attributes[4])
            );

            data.add(covid19);

        }
        sc.close();
        return data;
        }
    }

