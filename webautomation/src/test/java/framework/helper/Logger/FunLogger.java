package framework.helper.Logger;

import framework.utility.ResourceHelper;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


@SuppressWarnings("rawtypes")
public class FunLogger {

    private static boolean root = false;

    public static Logger getLogger(Class clas) {
        if (root) {
            return Logger.getLogger(clas);
        }
        PropertyConfigurator.configure(ResourceHelper.getResourcePath("\\src\\test\\resources\\log4j.properties"));
        root = true;
        return Logger.getLogger(clas);
    }
}
