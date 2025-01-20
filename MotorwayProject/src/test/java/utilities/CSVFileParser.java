package utilities;

import stepDefinitions.FileParser;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileParser implements FileParser {
    public List<String> extractRegistrationNumbers(String filePath) throws IOException {
        List<String> registrations = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            for (String value : values) {
                if (value.matches("\\b[A-Z]{2}[0-9]{2}\\s?[A-Z]{3}\\b")) {
                    registrations.add(value);
                }
            }
        }
        reader.close();
        return registrations;
    }
}

