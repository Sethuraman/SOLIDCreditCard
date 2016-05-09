package tw.shokunin;

import static java.lang.String.format;

/**
 * Created by sethur on 9/05/2016.
 */
public class StoreInDb {

    public void store(String[] data){

        String sql = format("insert into creditcard (creditcard.id, " +
                "creditcard.number, " +
                "credicard.exp_date, " +
                "creditcard.cvv, " +
                "creditcard.name) " +
                "values (%s, %s, %s, %s)",
                data[0].replaceAll("\\s",""), data[1], data[2], data[3]);

        System.out.println(sql);
    }




}
