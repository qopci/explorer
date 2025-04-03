import static org.junit.Assert.*;
import org.junit.Test;

public class ExplorerSearchTest {
    @Test
    public void testReachableArea_someUnreachable() {
        int[][] island = {
            {1,1,1,3,1,1},
            {3,2,3,1,3,1},
            {1,1,1,1,3,3},
            {3,1,2,1,0,1},
            {1,1,1,2,1,1},
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(14, actual);
    }

    @Test
    public void testReachableArea_allAccessible() {
        int[][] island = {
            {1, 0, 1},
            {1, 1, 1},
            {1, 1, 1},
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(9, actual);  
    }

    @Test
    public void testReachableArea_noAccessible() {
        int[][] island = {
            {2, 2, 2},
            {2, 0, 2},
            {2, 2, 2},
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(1, actual);  
    }

    // Add more tests here!
    // Come up with varied cases
}
