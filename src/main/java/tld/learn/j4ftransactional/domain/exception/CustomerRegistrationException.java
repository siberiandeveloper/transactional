package tld.learn.j4ftransactional.domain.exception;

import lombok.Getter;
import tld.learn.j4ftransactional.domain.model.FullName;

@Getter
public class CustomerRegistrationException extends RuntimeException {

    private static final String EXCEPTION_MESSAGE = "Customer has to pass valid first and last name [%s]";

    private final FullName fullName;

    public CustomerRegistrationException(FullName name) {
        super(String.format(EXCEPTION_MESSAGE, name));
        this.fullName = name;
    }
}

