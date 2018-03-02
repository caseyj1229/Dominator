import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DominatorTest {
    @Test
    void solution() {
        int[] A = {};
        assertEquals(-1,Dominator.solution(A));

        int[] B = {0,0,1,1,1};
        assertEquals(4,Dominator.solution(B));

        int[] C = {3,4,3,2,3,-1,3,3};
        assertEquals(7,Dominator.solution(C));

        int[] D = {9,-2,5,-2,4,-2,-2};
        assertEquals(6,Dominator.solution(D));

        int[] E = {1,2,3,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,4,3,2,1};
        assertEquals(22,Dominator.solution(E));

        int[] F = {2};
        assertEquals(0,Dominator.solution(F));
    }
}