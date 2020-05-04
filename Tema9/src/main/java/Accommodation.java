import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Accommodation {

    private int id;
    private String type;
    private String bed_type;
    private int max_guests;
    private String description;
}
