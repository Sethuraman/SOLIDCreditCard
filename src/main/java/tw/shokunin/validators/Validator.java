package tw.shokunin.validators;

import tw.shokunin.CreditCard;

/**
 * Created by sethur on 12/05/2016.
 */
@FunctionalInterface
public interface Validator<$Model> {
    boolean isValid($Model model);

    Validator<CreditCard> CREDIT_CARD_VALIDATOR = new NumberValidator();
}
