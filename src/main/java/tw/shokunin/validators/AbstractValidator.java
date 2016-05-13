package tw.shokunin.validators;

import tw.shokunin.CreditCard;

/**
 * Created by sethur on 13/05/2016.
 */
public abstract class AbstractValidator implements Validator<CreditCard>{
    private Validator<CreditCard> validator;

    public AbstractValidator(Validator<CreditCard> validator) {
        this.validator = validator;
    }

    public AbstractValidator() {
        this(creditCard -> true);
    }


    @Override
    public boolean isValid(CreditCard creditCard) {
        return validator.isValid(creditCard) && validate(creditCard);
    }

    protected abstract boolean validate(CreditCard creditCard);
}
