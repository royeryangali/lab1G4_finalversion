package pe.pucp.edu.telecom.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVmanager {

    public static void writeToCsvFile(List<String[]> thingsToWrite, String fileName){
        try (FileWriter writer = new FileWriter(fileName)){
            for (String[] strings : thingsToWrite) {
                for (int i = 0; i < strings.length; i++) {
                    writer.append(strings[i]);
                    if(i < (strings.length-1))
                        writer.append(",");
                }
                writer.append(System.lineSeparator());
            }
            writer.flush();
            System.out.println("HECHOOOOO");
        } catch (IOException e) {
            System.out.println("No pudo escribirse el archivo!");
        }

    }
    public static List<String[]> readFromCsvFile(String fileName){
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            List<String[]> list = new ArrayList<>();
            String line = "";
            while((line = reader.readLine()) != null){
                String[] array = line.split(",");
                list.add(array);
            }
            return list;
        } catch (IOException e) {
            return null;
        }
    }


}
