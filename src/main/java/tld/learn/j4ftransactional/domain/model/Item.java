package tld.learn.j4ftransactional.domain.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
@EqualsAndHashCode
public final class Item {

    private final String name;
    private final String description;
    private final Long costInKops;
}

