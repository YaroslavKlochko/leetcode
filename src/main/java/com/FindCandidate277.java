
public class FindCandidate277 {

    public int findCelebrity(int n) {
        int candidate = 0;
        for (int i = 0; i < n; i++) {
            if (knows(candidate, i)) {
                candidate = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != candidate || knows(candidate, i) || !knows(i, candidate)) ;
        }
        return candidate;
    }


    //API tells where a knows b
    private boolean knows(int a, int b) {
        return false;
    }
}
