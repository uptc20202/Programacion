	package models;

import structures.Queue;

import java.util.ArrayList;

public class Sorter {

    private int[] numbers;
    private int numberOfSweeps;
    private ArrayList<Queue<Integer>> colas = new ArrayList<>();


    public Sorter(int[] numbers){
        this.numbers = numbers;
        colas.add((new Queue<>())); //0
        colas.add((new Queue<>())); //1
        colas.add((new Queue<>()));//2
        colas.add((new Queue<>()));//3
        colas.add((new Queue<>()));//4
        colas.add((new Queue<>()));//5
        colas.add((new Queue<>()));//6
        colas.add((new Queue<>()));//7
        colas.add((new Queue<>()));//8
        colas.add((new Queue<>()));//9
        findNumberOfSweeps();
        assignNumbersToQueues();
        sweep();
    }

    private void sweep() {
    	System.out.println(numberOfSweeps+ " ultimo");
        for (int i = numberOfSweeps-1; i >= 0 ; i--) {
            for (Queue<Integer> cola:colas) {
                for (int j = 0; j < cola.getLength(); j++) {
                    int number = cola.poll();
                    switch (String.valueOf(number).charAt(i)) {
                        case '0' -> colas.get(0).push(number);
                        case '1' -> colas.get(1).push(number);
                        case '2' -> colas.get(2).push(number);
                        case '3' -> colas.get(3).push(number);
                        case '4' -> colas.get(4).push(number);
                        case '5' -> colas.get(5).push(number);
                        case '6' -> colas.get(6).push(number);
                        case '7' -> colas.get(7).push(number);
                        case '8' -> colas.get(8).push(number);
                        case '9' -> colas.get(9).push(number);
                    }
                }
            }
        }
    }

    public void findNumberOfSweeps(){
        for (int number : numbers) {
            if (numberOfSweeps < (int) (Math.log10(number) + 1)) {
            	System.out.println(Math.log10(number)+ " coi1");
                numberOfSweeps = (int) (Math.log10(number) + 1);
            }
        }
        System.out.println(numberOfSweeps+ " coi");
    }

    public void assignNumbersToQueues() {
        for (int number : numbers) {
        	System.out.println(String.valueOf(number)+" NUMERO A SACAR");
        	System.out.println(numberOfSweeps-1+" NUMERO A SACAR2");
        	System.out.println(String.valueOf(123).charAt(numberOfSweeps-1)+" NUMERO A SACAR3");
            switch (String.valueOf(number).charAt(numberOfSweeps-1)) {
                case '0' -> colas.get(0).push(number);
                case '1' -> colas.get(1).push(number);
                case '2' -> colas.get(2).push(number);
                case '3' -> colas.get(3).push(number);
                case '4' -> colas.get(4).push(number);
                case '5' -> colas.get(5).push(number);
                case '6' -> colas.get(6).push(number);
                case '7' -> colas.get(7).push(number);
                case '8' -> colas.get(8).push(number);
                case '9' -> colas.get(9).push(number);
            }
        }
    }

    public String show(){
        StringBuilder string = new StringBuilder();
        for (Queue<Integer> cola:colas) {
            string.append(cola.show());
        }
        return string.toString();
    }
}
