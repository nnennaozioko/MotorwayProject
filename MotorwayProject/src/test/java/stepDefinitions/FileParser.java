package stepDefinitions;

import java.io.IOException;
import java.util.List;

public interface FileParser {

     List<String> extractRegistrationNumbers(String filePath) throws IOException;
}
