import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
public class UserDetails {

    @Id
    private int userId;
    private String userName;
}