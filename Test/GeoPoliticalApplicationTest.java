import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class GeoPoliticalApplicationTest {
    @Test
    public void testThatEachStateReturnsTheCorrectGeopoliticalZone(){
        GeoPoliticalApplication object = new GeoPoliticalApplication();

        String state = "Benue";

        String expectedZone = "North Central";

        String confirmZone = object.getGeoPoliticalZone(state);

        assertEquals(expectedZone, confirmZone, "Benue is in North Central zone");

        }

    }
