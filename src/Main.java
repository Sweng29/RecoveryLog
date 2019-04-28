public class Main {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Kashif Alei\\Desktop\\Freelancing\\pauldenio 50\\log.txt";
        LogFileParser logFileParser = new LogFileParser();
        String output = logFileParser.turnTextFileIntoString(filePath);
        System.out.println(output);
    }
}
