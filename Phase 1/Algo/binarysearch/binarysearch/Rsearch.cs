using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace binarysearch
{
    public class Rsearch
    {
        public static int search(int[] arr, int N, int x)
        {
            for (int i = 0; i < N; i++)
            {
                if (arr[i] == x)
                    return i;
            }
            return -1;
        }
        public static int binarySearch(int[] arr, int left, int right, int x)
        {
            if (right >= left)
            {
                int mid = left + (right - left) / 2;


                if (arr[mid] == x)
                    return mid;


                if (arr[mid] > x)
                    return binarySearch(arr, left, mid - 1, x);


                return binarySearch(arr, mid + 1, right, x);
            }

            //if not exist 
            return -1;

        }
    }
    
}
