package i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String[] args) {
        ResourceBundle rb_fr= ResourceBundle.getBundle("messages", Locale.FRANCE);
        ResourceBundle rb_uk  = ResourceBundle.getBundle("messages",Locale.UK);
        System.out.println("Cle recherchee dans le bundle FR= "+  rb_fr.getString("key"));
        System.out.println("Cle recherchee dans le bundle UK= "+  rb_uk.getString("key"));
    }
}
