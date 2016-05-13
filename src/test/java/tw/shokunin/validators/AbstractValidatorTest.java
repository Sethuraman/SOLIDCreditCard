package tw.shokunin.validators;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import tw.shokunin.CreditCard;

/**
 * Created by sethur on 13/05/2016.
 */
public class AbstractValidatorTest {


    @Test
    public void returnsFalseIfNestedValidatorReturnsFalse(){
        Validator<CreditCard> nestedFalseValidator = creditCard -> false;
        AbstractValidator validator = new AbstractValidator(nestedFalseValidator) {
            @Override
            protected boolean validate(CreditCard creditCard) {
                return true;
            }
        };

        Assertions.assertThat(validator.isValid(new CreditCard())).isFalse();
    }


    @Test
    public void returnsTrueIfNestedValidatorReturnsTrue(){
        Validator<CreditCard> nestedTrueValidator = creditCard -> true;
        AbstractValidator validator = new AbstractValidator(nestedTrueValidator) {
            @Override
            protected boolean validate(CreditCard creditCard) {
                return true;
            }
        };

        Assertions.assertThat(validator.isValid(new CreditCard())).isTrue();
    }
}