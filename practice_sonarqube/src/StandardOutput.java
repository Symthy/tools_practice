import java.util.logging.Level;
import java.util.logging.Logger;

public class StandardOutput {
  public static void main(String[] args) {
    Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    logger.addHandler(new StdOutHandler());
    logger.setUseParentHandlers(false);
    logger.setLevel(Level.ALL);

    logger.fine("ログ出力テスト：fine");
    logger.info("ログ出力テスト：info");
    logger.severe("ログ出力テスト：severe");

    System.out.println("test");
  }
}
