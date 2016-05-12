package tw.shokunin;

import java.util.List;

/**
 * Created by sethur on 9/05/2016.
 */
public class Application {

    public static void main(String[] args) {
        try {
            List<CreditCard> creditCards = new Parser(getCsvFile(args)).parse();
            for (CreditCard creditCard : creditCards) {
                System.out.println(creditCard.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static String getCsvFile(String[] args) {
        return args.length==0 ? Application.class.getResource("/testdataset.csv").getFile() : args[0];
    }
}
