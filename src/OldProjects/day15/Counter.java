package OldProjects.day15;

/**
 * Created by sp0rk on 17/07/17.
 */
class Counter {

    int count = 0;


    synchronized void increment(int value) {
        this.count += value;
        System.out.println(count);
    }
}
