// See https://aka.ms/new-console-template for more information
using System;

namespace binarysearch
{
    class Gbinary
    {



        public static void Main()
        {

            int[] arr = { 2, 3, 4, 10, 40, 50, 90 };
            int n = arr.Length;
            int x = 10;
            
           // Console.WriteLine("there is two ways to search,press 1 or 2");
        int N = 40;

            int result = Rsearch.binarySearch(arr, 0, n - 1, x);

            if (result == -1)
                Console.WriteLine(
                    " Element is not present in the array ");
            else
                Console.WriteLine("your elemnnts ...." + x + " Element is present at index "
                                  + result);
            int val =Rsearch.search(arr, arr.Length, N);
            if (val == -1)
                Console.WriteLine(
                    "Element is not present in array");
            else
                Console.WriteLine("the element ..." + val + "...Element is present at index "
                                  + val);
        }
    }
}


    

    
    