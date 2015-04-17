/**
 * Created by jankroon on 17-03-15.
 */
import java.util.HashMap;
import java.util.Map;

public class Vault {
//    Map clientBalances = new HashMap<String, float>;
    Map clientBalances = new HashMap();
    Map clientNames = new HashMap();
    float interestForLoans = 0; // percent per month
    float interestForDeposits = 0; // percent per month
    static float totalBalance = 0;
    static float profitBank = 0;
    static float salamiBalance = 0;
    private Exception AccountUnknownException;

    // Constructor method
    void Vault() {
        // Initialize accounts, clientNames, clientBalances

        clientNames.put("0001", "Bob");
        clientNames.put("0002", "Jan");

        clientBalances.put("0001", 30000.00);
        clientBalances.put("0002", -150.00);
    }

//    public Integer getBalanceOf(String account) throws AccountUnknownException {
//        return Integer.valueOf(0);
//    }
//
//    public String[] getAccountOf(String name) throws AccountUnknownException { // multiple clients may have same name
//        return null;
//    }

    public void processInterestForLoans() {

    }

    public void processInterestForDeposits() {

    }

    public boolean processPaymentsBatch(String fileName) {
        return true;
    }
}
