package Chapter10;

public class SortGrades
{

public static void main (String[] args)
{
int[] grades = {89, 94, 69, 80, 97,97, 85, 73, 91, 77, 85, 93};

for (int i : grades)
System.out.print (i + " ");
System.out.println ();

Sorts.selectionSort(grades);
//Sorts.selectionSort (grades);
for (int x : grades)
System.out.print (x + " ");
System.out.println ();

Sorts.insertionSort (grades);

for (int x : grades)
System.out.print (x + " ");
System.out.println ();

Sorts.insertionSort_R (grades);

for (int x : grades)
System.out.print (x + " ");
}
}