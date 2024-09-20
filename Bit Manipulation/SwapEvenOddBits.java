public class SwapEvenOddBits {
    public static int swapBits(int x) 
    {
	    // Mask even bits (positions 0, 2, 4, ...) using 0xAAAAAAAA
        int evenBits = x & 0xAAAAAAAA; 

        // Mask odd bits (positions 1, 3, 5, ...) using 0x55555555
        int oddBits = x & 0x55555555;

        // Shift even bits right to odd positions
        evenBits >>= 1;

        // Shift odd bits left to even positions
        oddBits <<= 1;

        // Combine the shifted even and odd bits
        return (evenBits | oddBits);
	    
	}
    public static void main(String[] args) {
        System.out.println("After swapping: "+ swapBits(23));
    }
}
