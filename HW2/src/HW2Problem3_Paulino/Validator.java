package HW2Problem3_Paulino;

public interface Validator {
    void setNextValidator(Validator nextValidator);

    void validate(UserRegistration registration) throws ValidationException;
}
