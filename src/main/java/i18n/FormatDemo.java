package i18n;

import java.text.DecimalFormat;
import java.util.Locale;

public class FormatDemo {
    public static void main(String[] args) {
        Double amount = Double.valueOf(1234567.67f);
        DecimalFormat formatter = (DecimalFormat) DecimalFormat.getInstance(Locale.UK);
        System.out.println("Amount with EN locale" + formatter.format(amount));
        formatter = (DecimalFormat) DecimalFormat.getInstance(Locale.FRANCE);
        System.out.println("Amount with FR locale" + formatter.format(amount));
    }
}
