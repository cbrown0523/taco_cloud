package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

//@Data annotation tells Lombok automatically generates the getters and setters methods at runtime
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;
    public static enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
