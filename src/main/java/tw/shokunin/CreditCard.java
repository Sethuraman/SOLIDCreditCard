package tw.shokunin;

import tw.shokunin.validators.Validator;

/**
 * Created by sethur on 12/05/2016.
 */
public class CreditCard {

    private String number;
    private String expiryDate;
    private String name;
    private String cvv;

    private Validator<CreditCard> validator;

    public CreditCard(String number, String expiryDate, String name, String cvv) {
        this();
        this.number = number;
        this.expiryDate = expiryDate;
        this.name = name;
        this.cvv = cvv;
    }

    public CreditCard() {
        validator = Validator.CREDIT_CARD_VALIDATOR;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public boolean isValid(){
        return validator.isValid(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditCard that = (CreditCard) o;

        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (expiryDate != null ? !expiryDate.equals(that.expiryDate) : that.expiryDate != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return cvv != null ? cvv.equals(that.cvv) : that.cvv == null;

    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (expiryDate != null ? expiryDate.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (cvv != null ? cvv.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number='" + number + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", name='" + name + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }
}
