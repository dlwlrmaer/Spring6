import java.util.Locale;
import java.util.ResourceBundle;

/**
 * ClassName:Demo1
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author UESTC-史杰灵
 * @Create 2024/10/7 23:48
 * @Version 1.0
 */
public class Demo1 {

    public static void main(String[] args) {
        System.out.println(ResourceBundle.getBundle("messages",
                new Locale("en","GB")).getString("test"));

        System.out.println(ResourceBundle.getBundle("messages",
                new Locale("zh","CN")).getString("test"));
    }
}
