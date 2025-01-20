package utilities;


public class FileParserFactory {
    public static Object getParser(String filePath) {
        if (filePath.endsWith(".txt")) {
            return new TextFileParser();
        } else if (filePath.endsWith(".csv")) {
            return new CSVFileParser();
        } else {
            throw new UnsupportedOperationException("Unsupported file type: " + filePath);
        }
    }
}

