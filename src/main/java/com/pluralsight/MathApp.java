package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        double garySalary = 70000.21;
        double bobSalary = 50000.11;
        double highestSalary = Math.max(bobSalary,garySalary);

        System.out.println("The highest salary is " + "$" + highestSalary);

        //Question 2:

        double carPrice = 49999.99;
        double truckPrice = 79999.99;
        double lowestPrice = Math.min(carPrice,truckPrice);

        System.out.println("The cheapest vehicle is " + "$" + lowestPrice);

        //Question 3:

        double radius = 7.25;
        double circleArea = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of a circle is " + circleArea);

        //Question 4:

        double numberVariable = 5.0;
        double squareRoot = Math.sqrt(numberVariable);

        System.out.println("the square root it " + squareRoot);


        //Question 5:

        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("the distance between the two points is " + distance);

        //Question 6:

        double negativeNumber = -3.8;
        double absoluteValue = Math.abs(negativeNumber);

        System.out.println("The absolute value is " + absoluteValue);

        //Question 7:

        double randomNumber = Math.random();

        System.out.println("The random number is " + randomNumber);

        //Question 8:

        int days = 24;
        int hoursPerDay = 24;
        int minutesPerHour = 60;
        int totalMinutes = days * hoursPerDay * minutesPerHour;

        System.out.println("There are " + totalMinutes + "minutes in 24 days");

        //Question 8-Bonus:

        int secondsPerMinute = 60;
        int millisecondsPerSecond = 1000;

        long totalMilliseconds = (long) days * hoursPerDay * minutesPerHour * secondsPerMinute * millisecondsPerSecond;

        System.out.println("There are " + totalMilliseconds + " milliseconds in 24 days");













    }
}