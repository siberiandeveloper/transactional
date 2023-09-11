package tld.learn.j4ftransactional.domain.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
@EqualsAndHashCode
public final class FullName {

    private final String firstName;
    private final String middleName;
    private final String lastName;

}

