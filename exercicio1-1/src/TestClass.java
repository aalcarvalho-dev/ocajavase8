import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Logger;
import java.util.logging.Level;

public class TestClass {
    public static void main(String[] args) throws IOException {
        //assegura que o diretório seja criado
        Files.createDirectories(Paths.get("logs"));
        //obtém a data a ser usada no nome do arquivo
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd_hhmm");
        LocalDateTime now = LocalDateTime.now();
        String date = now.format(df);
        //define o nome do arquivo no diretório logs
        String logFileName = "logs//testlog-"+date+".txt";
        //define logger
        FileHandler myFileHandler = new FileHandler(logFileName);
        myFileHandler.setFormatter(new SimpleFormatter());
        Logger ocajLogger = Logger.getLogger("OCAJ Logger");
        ocajLogger.setLevel(Level.ALL);
        ocajLogger.addHandler(myFileHandler);
        //mensagem de log
        ocajLogger.info("\nEssa é uma mensagem de informação de log");
        //fecha o arquivo
        myFileHandler.close();
    }
}
