package tw.shokunin;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by sethur on 12/05/2016.
 */
public class ParserTest {

    @Test
    public void returns2CreditCards() throws IOException {
        Parser parser = new Parser(ParserTest.class.getResource("/testdataset.csv").getFile());
        List<CreditCard> cards = parser.parse();

        assertThat(cards).hasSize(2);
        assertThat(cards).contains(
                new CreditCard("1234 5678 1234 5678", "10/2015", "Shokunin 1", "123"),
                new CreditCard("0000 5678 1234 5678", "10/2015", "Shokunin 1", "123"));
    }

}