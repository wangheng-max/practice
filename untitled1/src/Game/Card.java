package Game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private  String color;
    private  String size;
    private  int nums;

    @Override
    public String toString() {
        return color+size;
    }


}
