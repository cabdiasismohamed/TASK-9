package rates;

import java.util.HashMap;
import java.util.Map;

public class CurrencyRates {
    private static final Map<String, Double> rates = new HashMap<>();

    static {
        rates.put("USD_EUR", 0.85);
        rates.put("SSP", 130.0);
        rates.put("SOS", 570.0);
        rates.put("UGX", 3800.0);
    }
}
