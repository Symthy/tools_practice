import java.util.logging.Level;
import java.util.logging.StreamHandler;

public class StdOutHandler extends StreamHandler {
  {
    setOutputStream(System.out);
    setLevel(Level.ALL);
  }
}
