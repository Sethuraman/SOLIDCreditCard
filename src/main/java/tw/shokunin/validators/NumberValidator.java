package tw.shokunin.validators;

import tw.shokunin.CreditCard;

/**
 * Created by sethur on 13/05/2016.
 */
public class NumberValidator extends AbstractValidator {

    public NumberValidator(Validator validator) {
        super(validator);
    }

    public NumberValidator() {
    }

    @Override
    protected boolean validate(CreditCard creditCard) {
        return creditCard.getNumber()!=null && creditCard.getNumber().length()==16;
    }
}
