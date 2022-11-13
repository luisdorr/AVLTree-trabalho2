package model.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import model.structures.Person;

public class FileConverter {
    
    public static int countLines(String filePath ) {
        int count = 0;

        try (BufferedReader buffer = new BufferedReader(new FileReader(filePath))) {
            String line = buffer.readLine();

            while (line != null) {
                count++;
                line = buffer.readLine();
            }
            
        } catch (IOException e){
            System.out.println("Error: "+ e.getMessage());
        }

        return count;
    }

    public static String[] toStrings(String filePath, int numberOfLines ) {
        String[] lines = new String[numberOfLines];

        try (BufferedReader buffer = new BufferedReader(new FileReader(filePath))) {
            String line = buffer.readLine();

            for(int i = 0; i < lines.length; i++) {
                lines[i] = line;
                line = buffer.readLine();
            }
            
        } catch (IOException e){
            System.out.println("Error: "+ e.getMessage());
        }

        return lines;
    }

    public static Person stringToPerson(String line) throws ParseException {
        String[] attributes = line.split(";");
            
        Long CPF = Long.parseLong(attributes[0]);
        Long RG = Long.parseLong(attributes[1]);
        String personalName = attributes[2];
        Date birthDay = new SimpleDateFormat("dd/MM/yyyy").parse(attributes[3]); 
        String cityName = attributes[4];

        return new Person(CPF, RG, personalName, birthDay, cityName);
    }

    public static List<Person> toPeopleList(String filePath) throws ParseException {
        List<Person> people = new ArrayList<>();
        int numberOfLines = countLines(filePath);

        String[] lines = toStrings(filePath, numberOfLines);

        for(String line : lines) {
            Person dude = stringToPerson(line);

            if (!people.contains(dude)) {
                people.add(dude);
            } else {
                System.out.println("ERROR! CPF: " + dude.getCPF() +" HAS ALREADY BEEN REGISTERED!");
            }
            
        }

        return people;
    }

    
}
