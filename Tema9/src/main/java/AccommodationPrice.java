import lombok.Setter;
import lombok.ToString;

@Setter
@ToString

public class AccommodationPrice {

    private int id;
    private String type;
    private String description;
    private int max_guests;

    private double value;
    private String season;

}
