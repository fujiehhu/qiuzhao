import org.apache.log4j.Logger;
import sun.rmi.runtime.Log;

/**
 * Created by lenovo on 20/7/18.
 */
public class test {
    private static Logger logger = Logger.getLogger(test.class);

    public static void main(String[] args) {
        test.logger.debug("测试");
    }
}
