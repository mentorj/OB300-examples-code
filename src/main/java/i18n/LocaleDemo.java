package i18n;

import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        // this one depends from the JVM settings
        Locale defaultLocale=Locale.getDefault();

        // this one is initailized by programmer
        Locale french = new Locale("fr","FR");

        System.out.println("Default locale is = "+ defaultLocale.getDisplayName());
        System.out.println("French locale is = "+ french.getDisplayName() + " Variant:" + french.getVariant());

        Locale fr = new Locale("fr");
        System.out.println("FR locale is = "+ fr.getDisplayName() );

    }
}
