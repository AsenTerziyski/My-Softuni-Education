package Pr04RandomArrayList;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RandomArrayList<Integer> randomArrayList = new RandomArrayList<>();
        ThreadLocalRandom.current().ints(50).forEach(randomArrayList::add);
        System.out.println(randomArrayList.getRandomElement());

    }
}
