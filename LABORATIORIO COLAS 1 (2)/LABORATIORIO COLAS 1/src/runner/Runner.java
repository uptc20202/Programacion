package runner;

import models.Sorter;

public class Runner {
    public static void main(String[] args) {

        Sorter sorter = new Sorter(new int[]{999,281,112,290,140,634,536,333});
        System.out.println(sorter.show());
    }
}
