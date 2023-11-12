import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        /* int[] values = {6, 5, 8, 7, 11};
        System.out.println(Arrays.toString(values));
        System.out.println("Smallest value: " + smallest(values));
        System.out.println("Index of smallest value: " + indexOfTheSmallest(values));
        System.out.println("Index of the smallest starting from 2: " + indexOfTheSmallestStartingFrom(values, 2));
        swap(values, 2, 4);
        System.out.println("After swapping values at index 2 and 4: " + Arrays.toString(values));
        System.out.println("Is 11 in values array: " + BinarySearch.search(values, 11));
        printElegantly(values);
        System.out.println("\n"); */

        /* NightSky NightSky1 = new NightSky(0.1, 40, 10);
        NightSky1.printLine();
        System.out.println("--- NOVI NIGHTSKY ---");
        NightSky NightSky2 = new NightSky(8, 4);
        NightSky2.print();
        System.out.println("Number of starts: " + NightSky2.startInLastPrint()); */

        /* Library library = new Library();
        Book dis = new Book("Dervis i Smrt", "Bosanci", 1978);
        Book s = new Book("Stranac", "Francuzi", 1891);
        library.addBook(dis);
        library.addBook(s);
        library.printBooks(); */

        //I cannot be bothered with creating this in a seperate main program that has a while loop which i can terminate. It is 11 at night
        Bird r = new Bird("Raven", "Rovus");
        Bird s = new Bird("Seagul", "Seagulus");
        BirdWatching birdWatching = new BirdWatching();
        birdWatching.add(r);
        birdWatching.add(s);
        birdWatching.statistics();
        birdWatching.observation(r);
        birdWatching.observation(r);
        birdWatching.statistics();
    }

    public static int smallest(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int indexOfTheSmallest(int[] array){
        int min = array[0];
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int startIndex){
        int min = array[startIndex];
        int index = startIndex;
        for(int i = startIndex; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void printElegantly(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            System.out.print(array[i] + ", ");
        }
    }
}
