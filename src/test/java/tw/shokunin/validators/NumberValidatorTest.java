package tw.shokunin.validators;

import org.junit.Test;
import tw.shokunin.CreditCard;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by sethur on 13/05/2016.
 */
public class NumberValidatorTest {

    @Test
    public void returnsFalseIfNumberIsLessThan16Chars(){
        CreditCard creditCard = new CreditCard();
        creditCard.setNumber("12345");

        assertThat(new NumberValidator().validate(creditCard)).isFalse();
    }

    @Test
    public void returnsTrueIfNumberIs16Chars(){
        CreditCard creditCard = new CreditCard();
        creditCard.setNumber("1234123412341234");

        assertThat(new NumberValidator().validate(creditCard)).isTrue();
    }


}