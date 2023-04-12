import de.fhkiel.tsw.Division;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


public class DivisionTest {
    Division division = new Division(2,3);
    double result = division.value();
    @Test
    assertEqual(500.0,result);
}
