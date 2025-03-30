package conversion;

import rates.CurrencyRates;

public class Converter {
    public static double convert(String from, String to, double amount) {
        double rate = CurrencyRates.getRate(from, to);
        if (rate == -1.0) {
            System.out.println("Not Available.");
            return 0.0;
        }
        return amount * rate;
    }
}

