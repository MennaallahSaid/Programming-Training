// See https://aka.ms/new-console-template for more information
using System;
Console.WriteLine("Hello, World!");
Console.WriteLine("hi zuko here");

namespace LogicalPrograms
{
    class Program
    {

        static void merge(int[] num ,int left , int mid ,int right) { 
            int[] temp = new int[num.Length];
            int i, left_end, num_elements, tmp_pos;
            left_end = (mid - 1);
            tmp_pos = left;
            num_elements = (right - left + 1);

            while ((left <= left_end) && (mid <= right))
            {
                if (num[left] <= num[mid])
                    temp[tmp_pos++] = num[left++];
                else
                    temp[tmp_pos++] = num[mid++];
            }
            while (left <= left_end)
                temp[tmp_pos++] = num[left++];
            while (mid <= right)
                temp[tmp_pos++] = num[mid++];
            for (i = 0; i < num_elements; i++)
            {
                num[right] = temp[right];
                right--;
            }
        }
        static public void SortMethod(int[] numbers, int left, int right)
        {
            int mid;
            if (right > left)
            {
                mid = (right + left) / 2;
                SortMethod(numbers, left, mid);
                SortMethod(numbers, (mid + 1), right);
                merge(numbers, left, (mid + 1), right);
            }
        }
        static void Main(string[] args)
        {
            int[] numbers = { 38, 27, 43, 3, 9, 82, 10 };
            int len = numbers.Length;
            Console.WriteLine("Before Merge Sort:");
            foreach (int item in numbers)
            {
                Console.Write(item + " ");
            }
            Console.WriteLine();
            Console.WriteLine("After Merge Sort");
            SortMethod(numbers, 0, len - 1);
            foreach (int item in numbers)
            {
                Console.Write(item + " ");
            }
            Console.Read();
        }

    }

    
}
