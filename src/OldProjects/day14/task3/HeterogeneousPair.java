package OldProjects.day14.task3;

/**
 * Created by RENT on 2017-07-14.
 */
public class HeterogeneousPair<F, S> {

    private final F first;
    private final S second;

    HeterogeneousPair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
