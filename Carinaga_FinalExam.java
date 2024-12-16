import java.util.Stack;

public class Carinaga_FinalExam {

    // Class to represent creatures with a name and power level
    static class Creature {
        String name;
        int powerLevel;

        // Constructor to initialize the creature's name and power level
        Creature(String name, int powerLevel) {
            this.name = name;
            this.powerLevel = powerLevel;
        }
    }

    // Bubble Sort creatures in descending order based on power level
    static void bubbleSort(Creature[] creatures) {
        int n = creatures.length;
        for (int i = 1; i < n; i++) { // Loop through the array multiple times
            for (int j = 0; j < n - i; j++) { // Compare adjacent elements
                if (creatures[j].powerLevel < creatures[j + 1].powerLevel) { // If out of order, swap
                    Creature temp = creatures[j];
                    creatures[j] = creatures[j + 1];
                    creatures[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort creatures in ascending order based on power level
    static void selectionSort(Creature[] creatures) {
        int n = creatures.length;
        for (int i = 0; i < n - 1; i++) { // Start at each position in the array
            int minIndex = i; // Assume the current position is the smallest
            for (int j = i + 1; j < n; j++) { // Find the actual smallest element
                if (creatures[j].powerLevel < creatures[minIndex].powerLevel) { // Compare power levels
                    minIndex = j;
                }
            }
            // Swap the smallest element with the current position
            Creature temp = creatures[i];
            creatures[i] = creatures[minIndex];
            creatures[minIndex] = temp;
        }
    }

    // Method to display creatures' details
    static void display(Creature[] creatures) {
        for (int i = 0; i < creatures.length; i++) {
            System.out.println(creatures[i].name + " - " + creatures[i].powerLevel);
        }
    }

    // Stack Implementation push creatures onto a stack and pop them
    static void stackExample(Creature[] creatures) {
        Stack<Creature> stack = new Stack<>(); // Create a stack
        for (int i = 0; i < creatures.length; i++) { // Push creatures onto the stack
            stack.push(creatures[i]);
        }
        while (!stack.isEmpty()) { // Pop creatures from the stack until empty
            Creature creature = stack.pop();
            System.out.println("Popped: " + creature.name + " - " + creature.powerLevel);
        }
    }

    public static void main(String[] args) {
        // Initialize the array of creatures
        Creature[] creatures = new Creature[5];
        creatures[0] = new Creature("Dragon", 95);
        creatures[1] = new Creature("Griffin", 88);
        creatures[2] = new Creature("Unicorn", 78);
        creatures[3] = new Creature("Phoenix", 92);
        creatures[4] = new Creature("Centaur", 85);

        // Bubble Sort Descending order
        System.out.println("*** Bubble Sort: Descending Order by Power Level ***");
        bubbleSort(creatures);
        display(creatures);

        // Selection Sort Ascending order
        System.out.println("\n*** Selection Sort: Ascending Order by Power Level ***");
        selectionSort(creatures);
        display(creatures);

        // Stack Implementation
        System.out.println("\n*** Stack Implementation: Popping Creatures ***");
        bubbleSort(creatures); // This ensure creatures are sorted in descending order
        stackExample(creatures);
    }
}
