package co.uk.jordanterry.validatedinputs.validators;

/**
 * A {@link Validator} to validate a phone number
 */
public class PhoneValidator implements Validator {

    @Override
    public boolean validate(String input) {
        return false;
    }

    @Override
    public String getValidationMessage() {
        return null;
    }

}