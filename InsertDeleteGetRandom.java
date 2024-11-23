import java.util.*;

class RandomizedSet {
    private List<Integer> data; // List to store elements
    private Map<Integer, Integer> idxMap; // Map to store element-to-index mapping
    private Random random; // Random object to fetch random elements

    /** Initialize the data structure. */
    public RandomizedSet() {
        data = new ArrayList<>();
        idxMap = new HashMap<>();
        random = new Random();
    }

    /** Inserts an element to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (idxMap.containsKey(val)) {
            return false; // Element already present
        }
        idxMap.put(val, data.size()); // Store the index of the new element
        data.add(val); // Add element to the list
        return true;
    }

    /** Removes an element from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!idxMap.containsKey(val)) {
            return false; // Element not present
        }
        // Get the index of the element to remove
        int idx = idxMap.get(val);
        int lastElement = data.get(data.size() - 1);

        // Swap the element to remove with the last element in the list
        data.set(idx, lastElement);
        idxMap.put(lastElement, idx); // Update the index of the last element

        // Remove the last element from the list and map
        data.remove(data.size() - 1);
        idxMap.remove(val);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        int randomIndex = random.nextInt(data.size()); // Generate a random index
        return data.get(randomIndex); // Return the element at the random index
    }
	
	
	
    public static void main(String[] args) {
        RandomizedSet randomSet = new RandomizedSet();

        System.out.println(randomSet.insert(1)); // true
        System.out.println(randomSet.insert(2)); // true
        System.out.println(randomSet.insert(1)); // false
        System.out.println(randomSet.getRandom()); // Randomly 1 or 2
        System.out.println(randomSet.remove(1)); // true
        System.out.println(randomSet.getRandom()); // Always 2
    }

}
