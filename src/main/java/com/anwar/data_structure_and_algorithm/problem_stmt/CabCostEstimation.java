package com.anwar.data_structure_and_algorithm.problem_stmt;

// Base abstract class
abstract class Vehicle {
    public abstract double estimatedCost(int distance);
}

// Mini implementation
class Mini extends Vehicle {
    public double estimatedCost(int distance) {
        if (distance > 75) {
            return distance * 8;
        }

        int base = 50;
        if (distance <= 3) return base;
        if (distance <= 18) return base + (distance - 3) * 10;

        return base + (15 * 10) + (distance - 18) * 8;
    }
}

// Sedan implementation
class Sedan extends Vehicle {
    public double estimatedCost(int distance) {
        if (distance > 100) {
            return distance * 10;
        }

        int base = 80;
        if (distance <= 5) return base;
        if (distance <= 20) return base + (distance - 5) * 12;

        return base + (15 * 12) + (distance - 20) * 10;
    }
}

// SUV implementation
class SUV extends Vehicle {
    public double estimatedCost(int distance) {
        int base = 100;
        if (distance <= 5) return base;
        if (distance <= 20) return base + (distance - 5) * 15;

        return base + (15 * 15) + (distance - 20) * 12;
    }
}

// MotorBike implementation
class MotorBike extends Vehicle {
    public double estimatedCost(int distance) {
        int base = 20;
        if (distance <= 2) return base;
        if (distance <= 7) return base + (distance - 2) * 10;

        return base + (5 * 10) + (distance - 7) * 2;
    }
}

// Main class
public class CabCostEstimation {

    public static void main(String[] args) {

        int distance = 10;

        Vehicle[] vehicles = {
                new Mini(),
                new Sedan(),
                new SUV(),
                new MotorBike()
        };

        for (Vehicle v : vehicles) {
            System.out.println(
                    v.getClass().getSimpleName() +
                            " Fare = Rs. " +
                            v.estimatedCost(distance)
            );
        }
    }
}


/*
5️⃣ WHAT TO SAY IN INTERVIEW (SCRIPT)

“I have used an abstract base class Vehicle to define a common contract.
Each vehicle type extends it and overrides estimatedCost() according to its tariff rules.
In main, I use a parent reference to hold different child objects, which demonstrates runtime polymorphism.
This design follows Open–Closed Principle — new vehicle types can be added without modifying existing code.”*/

/*
Problem Statement

Aapali Taxi is a taxi cab/bike operator. They have 3 types of cars – Mini, Sedan, and SUV, and 1 motor bike, each with different tariffs.
When customers approach them for booking rides, they would like you to create a program that can calculate an “Estimated Cost” for these passengers based on various parameters.

Mini
Base charges flat up to 3 KM – Rs. 50

For next 15 KM – Rs. 10 per KM

Additional distance charged at Rs. 8 per KM

If total ride distance is more than 75 KM, ride charged at Rs. 8 per KM flat with no base charges

Sedan
Base charges flat up to 5 KM – Rs. 80

For next 15 KM – Rs. 12 per KM

Additional distance charged at Rs. 10 per KM

If total ride distance is more than 100 KM, ride charged at Rs. 10 per KM flat with no base charges

SUV
Base charges flat up to 5 KM – Rs. 100

For next 15 KM – Rs. 15 per KM

Every additional KM – Rs. 12 per KM

No flat charges, pay as per tariff above

Motor Bike
Base charges flat up to 2 KM – Rs. 20

For next 5 KM – Rs. 10 per KM

Every additional KM – Rs. 2 per KM

No flat charges, pay as per tariff above*/