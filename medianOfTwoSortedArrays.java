import java.util.Arrays;
public class medianOfTwoSortedArrays {
   public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
    // Brute Force apporach
        int m = nums1.length, n = nums2.length;
        int[] newArr = new int[m + n];
        if( m == 0){
            return n % 2 == 0 ? (double)((nums2[ n / 2] + nums2[n/2 - 1]))/2 : nums2[(n-1)/2];
        }
        if(n == 0){
            return m % 2 == 0 ? (double)((nums1[ m / 2] + nums1[m/2 - 1]))/2 : nums1[(m-1)/2];
        }
        // when nums1 and nums2 both are not empty    
        int k = 0, i = 0, j = 0;
        while (i < m) {
            newArr[k] = nums1[i];
            i++;
            System.out.println("k: " + k);
            System.out.println("newArr[k]: " + newArr[k]);
            k++;
        }
        while (j < n) {
            newArr[k] = nums2[j];
            System.out.println("k: " + k);
            System.out.println("newArr[k]: " + newArr[k]);
            j++;
            k++;
        }
        Arrays.sort(newArr);
        if ((m + n) % 2 == 0) {
            return ((double) (newArr[(m + n) / 2] + newArr[(m + n) / 2 - 1]) / 2);
        }
        if ((m + n) % 2 != 0) {
            return newArr[(m + n - 1) / 2];
        }
        return 0;
    } 
}
