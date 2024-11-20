package coe3sm4_lab1;

public class HandsMaxHeap {
    private Hands[] myHeap;  // array
    private int size;      // heap size
    private int capacity;  // array capacity

    // [Problem 3] Implement Max Heap for 5-Card Hands

    // [Problem 3-1] Implement Private Utility Methods
    // 1. A private method calculating the parent index
    // 2. A private method calculating the left-child index
    // 3. A private method calculating the right-child index
    // 4. A private method swapping the two Heap nodes at the provided index1 and index2

    // [Problem 3-2] Implement the Downward Heap Reorganization Private Method (Recursive) from the provided index
    private void downHeapify(int index)
    {
        // recursive implementation, sinking element down the heap
        
        // If a leaf node, don't heapify
       
        // If not at leaf, check if parent-child swap is required
            // If left-swap required, perform Left Swap and Recursively Heapify
                // swap parent with left child, downheapify left side                  
            // Otherwise, perform Right Swap and Recursively Heapify            
                // swap parent with right child, downheapify right side                
    } 

    // [Problem 3-3] Implement Upward Heap Reorganization Private Method (Iterative) from the provided index
    private void heapifyUp(int index)
    {   
        // Almost like Insertion Sort

        // Copy the Heap Node at index into temp
        // Compare the copied node against the parent node
            // If the copied node is larger than the parent node
                // shuffle the parent node into the current node
                // move the index to the parent index, repeat
                // if index <= 0 after moving up to parent index, stop the shuffling
            // Otherwise, reinsert the copied node into the most updated index location        
    }


    // [Problem 3-4] Complete the Max Heap ADT Public Methods
    
    // Constructor
    public HandsMaxHeap(int bufSize)
    {
        // set capacity = bufSize, and size = 0
        // instantiate myHeap as a Hands array with capacity + 1 (think about why capacity + 1)
        // finally, set the first element in the Hands array to a dummy Hand (using the default Hands() constructor)        
    }

    // Insert Method
    public void insert(Hands thisHand)
    {
        // Put thisHand temporarily to the Heap index that's one greater than the size
        // increment the heap size
        // reorganize the heap from the current index UPWARDS (bubble the inserted element up to where it is supposed to be)        
    }

    public Hands removeMax()
    {
        // Save the top element of the heap for return
        // Decrement the heap size
        // Get an element from the end-element (indexed by size) to replace the top of the heap
        // reorganize the heap from top of the heap downward (i.e. sinking the replaced element down to where it is supposed to be)
        // Return the saved top element of the heap
    }

    public int getSize()
    {
        // return the size of the heap
    }

    public void printHeap()
    {
        // For Debugging Purpose - Print all the heap elements (i.e. Hands)        
        //  For valid hands, print the hand using the respective method in Hands class
        //  For invalid hands, just print "--INV--"
        //  Use the required method in Hands class to determine whether a Hand is valid.
        
    }
}
