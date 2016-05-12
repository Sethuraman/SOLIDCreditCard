package tw.shokunin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sethur on 12/05/2016.
 */
public class Parser {

    private String file;

    public Parser(String file) {
        this.file = file;
    }

    public List<CreditCard> parse() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(file));
        List<CreditCard> cards = new LinkedList<>();
        for (String line : lines) {
            String[] split = line.split(",");
            if(split.length==4){
                cards.add(createCreditCard(split));
            }
        }
        return cards;
    }

    private CreditCard createCreditCard(String[] split) {
        CreditCard creditCard = new CreditCard();
        creditCard.setNumber(split[0]);
        creditCard.setExpiryDate(split[1]);
        creditCard.setCvv(split[2]);
        creditCard.setName(split[3]);
        return creditCard;

    }
}
