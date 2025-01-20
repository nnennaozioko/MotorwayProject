package utilities;

import stepDefinitions.FileParser;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;


public class TextFileParser implements FileParser {

    public List<String> extractRegistrationNumbers(String filePath) throws IOException {
        List<String> registrations = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        Pattern pattern = Pattern.compile("\\b[A-Z]{2}[0-9]{2}\\s?[A-Z]{3}\\b");

        while ((line = reader.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                registrations.add(matcher.group());
            }
        }
        reader.close();
        return registrations;
    }

}