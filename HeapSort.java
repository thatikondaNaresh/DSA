public class HeapSort {
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr, int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void heapify(int[] arr, int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
        {
            largest = l;
        }

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
        {
            largest = r;
        }

        // If largest is not root
        if (largest != i) {
            swap(arr, i, largest);

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public static void heapSort(int[] arr, int n)
    {
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 5, 13, 7};

        heapSort(arr, arr.length);

        printArray(arr, arr.length);
    }
}






Quiz : Quiz

1.
How many distinct BSTs can be constructed with 3 distinct keys?


4


5


6


9

2.
Which of the following is false about a binary search tree?


The left child is always lesser than its parent


The right child is always greater than its parent


The left and right subtrees should also be binary search trees


None of these

3.
How to search for a key in a binary search tree?


public Tree search(Tree root, int key)  {
    if( root == null || root.key == key )  {
        return root;
    }
    if( root.key < key )  {
        return search(root.right,key) ;
    }
    else
        return search(root.left,key) ;
}


public Tree search(Tree root, int key)  {
    if( root == null || root.key == key )  {
        return root;
    }
    if( root.key < key )  {
        return search(root.left, key) ;
    }
    else
      return search(root.right,key) ;
}


public Tree search(Tree root, int key)  {
    if( root == null)  {
        return root;
    } 
    if( root.key < key )  {
        return search(root.right,key) ;
    }
    else
        return search(root.left,key) ;
}


None of the Above

4.
What is the speciality about the inorder traversal of a binary search tree?


It traverses in a non increasing order


It traverses in an increasing order


It traverses in a random fashion


None of these

5.
How will you find the minimum element in a binary search tree?


public void min(Tree root)
{
while(root.left != null) 
{
root = root.left ;
}
System.out.println(root.data ) ;
}


public void min(Tree root) 
{
while(root != null) 
{
root = root.left ;
}
System.out.println(root.data) ;
}


public void min(Tree root)
{
while(root.right != null) 
{
root = root.right) ;
}
System.out.println(root.data) ;
}


public void min(Tree root)
{
while(root != null) 
{
root = root.right) ;
}
System.out.println(root.data) ;
}

6.
How will you find the maximum element in a binary search tree?


public void min(Tree root)
{
while(root.left != null)
{
root = root.left) ;
}
System.out.println(root.data) ;
}


public void min(Tree root) 
{
while(root != null)
{
root = root.left);
}
System.out.println(root.data);
}


public void min(Tree root)
{
while(root.right!= null)
{
root = root.right ;
}
System.out.println(root.data);
}


public void min(Tree root)
{
while(root.right != null)
{
root = root.right) ;
}
System.out.println(root.data) ;
}

7.
What are the worst case and average case search complexities of a binary search tree?


O(n) , O(n)


O(logn) , O(logn)


O(logn) , O(n)


O(n) , O(logn)

8.
Nodes with no children can be deleted by replacing them with ___, which is very simple to do?


Nodes


Null


Endpoints


Edges

9.
Replace the deleted node with the node whose value is ____to that of the deleted node if the deletion node only has two children?


Farthest


Behind


Closest


Infinite

10.
Our goal is to find the nearest value, so we move left first, then right as far as possible. The node nearest to us is called the ____?


Farthest Predecessor


Nearest Predecessor


Closest Predecessor


Immediate Predecessor

11.
The ____element of the root node should be replaced with the root node to delete it?


Farthest


Infinite


Closest


None

12.
 In which heap the root node must be greatest among the keys present at all of its children?


min-heap


max-heap


Both A and B


None of the above

13.
What is the complexity of adding an element to the heap?


O(log n. , n is the total number of elements in the heap


O(log h. , h is the height of heap-tree


O(h. , h is height of heap-tree


 Both A and C

14.
 An array consists of n elements. We want to create a heap using the elements. The worst time complexity of building a heap will be in order of


O(n*n*logn)


O(n*logN) 


O(n*n) 


O(n *logn *logn)

15.
Which one of the following array elements represents a binary min heap?


12 10 8 25 14 17


8 10 12 25 14 17


25 17 14 12 10 8


14 17 25 10 12 8

16.
Given an array of elements 5, 7, 9, 1, 3, 10, 8, 4. Which of the following is the correct sequence of elements after inserting all the elements in a min-heap?


1,3,4,5,7,8,9,10


1,4,3,9,8,5,7,10


1,3,4,5,8,7,9,10
 


1,3,7,4,8,5,9,10

17.
What would be the DFS traversal of the given Graph?




ABCDE


AEDCB


EDCBA


ADECB

18.
What sequence would the BFS traversal of the given graph yield if we start from A only?




ABDFEC


ADBFCE


ABDCF


ADFBC

19.
How many topological sortings are possible for the given graph. 




5


6


4


3

20.
Which of the following is the valid topological ordering of graph G given below?




ABCD


ABDC


ACDB


ADBC

21.
Find if the following graph contains cycle?




True


False

22.
The Breadth-First Search algorithm has been implemented with the help of a queue. What is a possible order of visiting the nodes of the following graph is




NQMPOR


QMNPRO


QMNPOR


MNOPQR

23.
What are the suitable Data Structures for the following algorithms?

 

1) Breadth-First Search                           

 

2) Depth First Search                            

 

3) Prim's Minimum Spanning Tree                 

 

4) Kruskal's Minimum Spanning Tree    


 1) Stack

 

2) Queue

 

3) Priority Queue

 

4) Union Find


1) Queue

 

2) Stack

 

3) Priority Queue

 

4) Union Find


1) Stack

 

2) Queue

 

3) Union Find

 

4) Priority Queue 


1) Priority Queue

 

2) Queue

 

3) Stack

 

4) Union Find

24.
Find the total number of topological sorts of the following graph. 




1


2


4


6

25.
Consider the following graph. 



Apply Dijkstr;s Algorithms from vertex S = {A}. Which of the following statements are true? [Multiple Choice Questions] 


The 4th vertex added to the S is E


The shortest path from A to L is 15


There is exactly one shortest path from A to F


The cost of the shortest path from A->G, A->H and A-> L is the same. 


1.
Which of these packages contain all the collection classes?


java.lang


java.util


java.net


java.awt

2.
Which of these methods deletes all the elements from invoking collection?


clear()


reset()


delete()


refresh()

3.
 What is Collection in Java?


A group of objects


A group of classes


A group of interfaces


None of the mentioned

4.
 Which of these return type of hasNext() method of an iterator?


Integer


Double


Boolean


Collections Object

5.
 Which of these methods is used to obtain an iterator to the start of collection?


start()


begin()


iteratorSet()


iterator()

6.
Which of these methods can be used to move to the next element in a collection?


next()


move()


shuffle()


hasNext()

7.
 Which of these iterators can be used only with List?


Setiterator


ListIterator


Literator


None of the mentioned

8.
Which of these is a method of ListIterator used to obtain an index of a previous element?


previous()


previousIndex()


back()


goBack()

9.
Which of these is not an interface in the Collections Framework?


Set


List


Group


Collection

10.
Which collection allows indexed access to its elements, but its methods are not synchronized?


Vector


TreeMap


HashSet


ArrayList

11.
 Collection stores only ?


object type data


string type data


primitive type data


All of the above

12.
The collection is a ____________


framework and interface


framework and class


only interface


only class

13.
What does the get(int index) method defined by List interface do ?


stores an object at the specified index


returns a list containing elements between specified index and end in the collection.


returns an object stored at the specified index


none of the above.

14.
Which interface restricts duplicate elements?


Set


List


Map


All of these

15.
The Comparable interface contains which called?


compare


compareTo


toCompare


compareWith

16.
 Which of these interface handle sequences?


Set


List


Comparator


Collection

17.
Which of these is the Basic interface that all other interface inherit?


Set


Array


List


Collection

18.
Which method is used by the contains() method of a list to search an element?


equals()


hashCode()


compareTo()


Both equals() & hashCode()

19.
 Which of the following collection is not of Iterable type?


ArrayList


Vector


TreeSet


HashMap

20.
Which of the following is a legacy class in java?


Arraylist


Vector


Hashtable


Only B & C

21.
Which among the following Sets maintains insertion order?


HashSet


TreeSet


LinkedHashSet


Both B & C

22.
What are generic methods?


Generic methods are the methods defined in a generic class


Generic methods are the methods that extend generic class methods


Generic methods are methods that introduce their own type parameters


Generic methods are methods that take void parameters

23.
 Which of these type parameters is used for a generic methods to return and accept any type of object?


K


N


T


V

24.
Which of these types cannot be used to initiate a generic type?


Integer class


Float class


Primitive Types


Collections

25.
Which of these object stores association between keys and values?


Hash table


Map


Array


String

26.
Which of these classes provide implementation of map interface?


ArrayList


HashMap


LinkedList


DynamicList

27.
Which of these methods is used to obtain an element in the map having a specified key?


search()


get()


set()


look()

28.
Which of these methods can be used to obtain a set of all keys in a map?


getAll()


getKeys()


keyall()


keySet()

29.
Which of these method is used to add an element and corresponding key to a map?


put()


set()


redo()


add()

30.
Which version of Java introduced annotation?


Java 5


Java 6


Java 7


Java 8

31.
Annotation type definition looks similar to which of the following?


Method


Class


Interface


Field

32.
Which of the following is not a pre defined annotation in Java?


@Deprecated


@Overriden


@SafeVarags


@FunctionInterface

33.
Which is the Parent class of annotation class?


Class


Object


Main


Super

34.
How is Date stored in the database?


java.sql.Date


java.util.Date


java.sql.DateTime


java.util.DateTime

35.
Which of these streams contains the classes which can work on character stream?


InputStream


OutputStream


Character Stream


All of the mentioned

36.
What is the order of variables in Enum?


Ascending order


Descending order


Random order


Depends on the order() method

37.
Can we create an instance of Enum outside of Enum itself?


True


False

38.
Which method returns the elements of Enum class?


getEnums()


getEnumConstants()


getEnumList()


getEnum()

39.
Which class does all the Enums extend?


Object


Enums


Enum


EnumClass

40.
Are enums type-safe?


True


False

41.
What are the components of a marker interface?


Fields and methods


No fields, only methods


Fields, no methods


No fields, No methods

42.
Which of these class contains the methods used to write in a file?


FileStream


FileInputStream


BUfferedOutputStream


FileBufferStream

43.
Which of these exception is thrown in cases when the file specified for writing is not found?


IOException


FileException


FileNotFoundException


FileInputException

44.
Which of these methods are used to read in from a file?


get()


read()


scan()


readFileInput()

45.
 Which of these values is returned by the read() method if the end of file (EOF) is encountered?


0


1


-1


Null

46.
Which of these exception is thrown by close() and read() methods?


IOException


FileException


FileNotFoundException


FileInputOutputException

47.
Which of these methods is used to write() into a file?


put()


putFile()


write()


writeFile()

48.
Which of these class is used to read and write bytes in a file?


FileReader


FileWriter


FileInputStream


InputStreamReader

49.
 Which of these method of InputStream is used to read integer representation of the next available byte input?


read()


scanf()


get()


getInteger()

50.
Which of these data type is returned by every method of OutputStream?


int


float


byte


none of the mentioned

51.
Which of these is a method to clear all the data present in output buffers?


clear()


flush()


fflush()


close()

52.
Which of these stream contains the classes which can work on character stream?


InputStream


OutputStream


Character Stream


All of the mentioned

53.
Which of these class is used to read characters in a file?


FileReader


FileWriter


FileInputStream


InputStreamReader

54.
Which of these class is used to read from byte array?


InputStream


BufferedInputStream


ArrayInputStream


ByteArrayInputStream

55.
Which of these classes are used by character streams for input and output operations?


InputStream


Writer


ReadStream


InputOutputStream

56.
Which of these classes are used by Byte streams for input and output operation?


InputStream


InputOutputStream


Reader


All of the mentioned

57.
Which of these class is implemented by the FilterInputStream class?


InputStream


InputOutputStream


BufferedInputStream


SequenceInputStream

58.
 Which of these class contains the methods print() & println()?


System


System.out


BUfferedOutputStream


PrintStream

59.
Java I/O is used to process the?


input 


output


Both A and B


None of the above

60.
Which of these class is not a member class of the java.io package?


File


StringReader


Writer


String

1.
JDK stands for ____.


Java development kit


Java deployment kit


JavaScript deployment kit


None of these

2.
 JRE stands for ___.


Java run ecosystem


JDK runtime Environment


Java Runtime Environment


None of these

3.
What makes the Java platform independent?


Advanced programming language


It uses bytecode for execution


Class compilation


All of these

4.
Can we keep a different name for the java class name and java file name?


Yes


No

5.
 What are the types of memory allocated in memory in java?


Heap memory


Stack memory


Both A and B


None of these

6.
Multiline comment is created using ___.


//


/* */


!--  – 


All of these

7.
 What is the entry point of a program in Java?


main() method


The first line of code


Last line of code


main class

8.
 Can we write a program without a main method in Java?


Yes


No

9.
 Can the main() method be overloaded in Java?


Yes


No

10.
 Which class in Java is used to take input from the user?


Scanner


Input


Applier


None of these

11.
 Method used to take a string as input in Java?


next()


nextLine()


Both A. and B.


None of these

12.
 Which of the following is the correct syntax to create a variable in Java?


var name;


int name;


var name int;


All of these

13.
 Is string mutable in Java?


Yes


No

14.
 Which of these is a type of variable in Java?


Instance Variable


Local Variable


Static Variable


All of these

15.
 What will be the output of the following Java code?

public class Main {

   public static void main(String[] args) {

    String str = "Hello";

     str = "Bye";

    System.out.println(str);

  }

}


Hello


Bye


Error


All of these

16.
What is type casting in Java?


It is converting type of a variable from one type to another


Casting variable to the class


Creating a new variable


All of these

17.
The break statement in Java is used to ___.


Terminates from the loop immediately


Terminates from the program immediately


Skips the current iteration


All of these

18.
What will be the output of the following Java code?

public class Main {

  public static void main(String arg[]) {

     int i;

     for (i = 1; i <= 12; i += 2) {

        if (i == 8) {

         System.out.println(i);

        break;

       }

     }

   }

}


1


No output


8


1357911

19.
 Array in java is ___.


Collection of similar elements


Collection of elements of different types


The data type of consisting of characters


None of these

20.
 Which of these is the correct method to create an array in java?


int[] arr = {1, 3, 5};


int[] arr;


arr = new int[] {3, 1, 8};


int arr[] = {1, 4, 6};


All of these

21.
 Objects in java are ___.


Classes


References


Iterators


None of these

22.
 What is garbage collection in java?


Method to manage memory in java


Create new garbage values


Delete all values


All of these

23.
Static variables in java are declared as ___.


final variables


new variables


Constants


All of these

24.
'this' keyword in java is ___.


Used to hold the reference of the current object


Holds object value


Used to create a new instance


All of these

25.
What will be the output of the following Java code?

import java.util.Scanner;

class ThisKeyword {

    private int a = 4;

   private int b = 1;

void getSum(int a, int b) {

     this.a = a;

     this.b = b;

     System.out.println(this.a + this.b);

   }

}

 

public class Main {

   public static void main(String args[]) {

     ThisKeyword T = new ThisKeyword();

     T.getSum(3, 5);

  }

}


5


9


8


4

26.
 The 'super' keyword is used to ___.


Access instance of the parent class


Access instance of the same class


Access instance of child class


Access instance of friend class

27.
 The super() method is used to ___.


Call constructor of friend class


Is a declared method


Call constructor of the parent class


Call constructor

28.
 What is stringBuffer in java?


Class to create a string array


Class to create a mutable string in java


Class to create a string from i/o buffer


All of these

29.
Which Java method is used to convert an object to string?


createString()


toString()


object.string()


newString()

30.
 Which of these is a non-access modifier?


public


private


native


All of these

31.
Which of the following methods is used to extract the length of a string in Java?


length()


len()


sizeof()


size()

32.
 The trim() method in Java used to ___.


Remove the given character


Remove the values after the given index


Remove leading and trailing spaces


None of these

33.
What will be the output of the following code?

public class ConcatNull {

   public static void main(String[] args) {

     String str1 = "include";

     String str2 = "help";

      System.out.println(str1 + str2);

   }

}


includehelp


include


help


None of these

34.
What will be the output of the following Java code?

   int arr[] = new int [5];

     System.out.print(arr);


0


value stored in arr[0]


00000


Class name@ hashcode in hexadecimal form

35.
Which of these operators is used to allocate memory to array variables in Java?


malloc


alloc


new


new malloc

36.
What will be the output of the following Java code?

     class Demo 

     {

         public static void main(String args[]) {

         int arr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};

         int n = 6;

                n = arr[arr[n] / 2];

         System.out.println(arr[n] / 2);

             } 

     }


3


0


6


1

37.
What will be the output of the following Java code?

     class Demo

     {

         public static void main(String args[]) 

         {

             char array_variable [] = new char[10];

     for (int i = 0; i < 10; ++i) 

             {

                 array_variable[i] = 'i';

                  System.out.print(array_variable[i] + "");

             }

         } 

    }


1 2 3 4 5 6 7 8 9 10


0 1 2 3 4 5 6 7 8 9 10


i j k l m n o p q r


i i i i i i i i i i

38.
 What will be the output of the following Java code?

     class Test

     {

         public static void main(String args[]) 

         {

             int array_variable[][] = {{ 1, 2, 3}, { 4 , 5, 6}, { 7, 8, 9}};

             int sum = 0;

             for (int i = 0; i < 3; ++i)

                 for (int j = 0; j <  3 ; ++j)

                     sum = sum + array_variable[i][j];

             System.out.print(sum / 5);

         } 

     }


8


9


10


11

39.
What will be the output of the following Java code?

    class Increment {

        public static void main(String args[]) 

         {        

              int g = 3;

              System.out.print(++g * 8);

         } 

     }


32


33


24


25

40.
Which one of the following is not a Java feature?


Object-oriented


Use of pointers


Portable


Dynamic and Extensible

41.
 Which of these cannot be used for a variable name in Java?


identifier & keyword


identifier


keyword


none of the mentioned

42.
 What is the extension of compiled java classes?


.txt


.js


.class


.java

43.
 Which of these are selection statements in Java?


break


continue


for()


if()

44.
What will be the output of the following Java program?

 

    class Test 

    {

        public static void main(String args[])

        { 

           StringBuffer s1 = new StringBuffer("Quiz");

           StringBuffer s2 = s1.reverse();

           System.out.println(s2);

        }

    }


QuizziuQ


ziuQQuiz


Quiz


ziuQ

45.
  Number of primitive data types in Java are?


 6


7


8


9

46.
Automatic type conversion is possible in which of the possible cases?


Byte to int


Int to Long


Long to int


Short to int

47.
 Find the output of the following program.

public class Solution{

        public static void main(String[] args){

                      short x = 10;

                      x =  x * 5;

                      System.out.print(x);

        }

}


50


10


Compile Error


Exception

48.
  Find the value of A[1] after execution of the following program.

int[] A = {0,2,4,1,3};

for(int i = 0; i < a.length; i++){

     a[i] = a[(a[i] + 3) % a.length];

}


0


1


2


3

49.
compareTo() returns


 True


 False


 An int value


None

50.
Identify the output of the following program.

String str = “abcde”;

System.out.println(str.substring(1, 3));


abc


bc


bcd


cd

51.
 Identify the output of the following program.

String str = “Hellow”;

System.out.println(str.indexOf(‘t));


0


1


true


-1

52.
Identify the output of the following program.

public class Test{

           public static void main(String args[]){

                    String str1 = “one”;

                    String str2 = “two”;

                    System.out.println(str1.concat(str2));

          }

}


one


two


onetwo


twoone

53.
 Find the output of the following code.

int ++a = 100;

System.out.println(++a);


101


Compile error as ++a is not valid identifier


100


None
 

54.
 Identify the return type of a method that does not return any value.


 int


void


 double


None

55.
Where does the system store parameters and local variables whenever a method is invoked?


 Heap


Stack


Array


 Tree

56.
 Identify the modifier which cannot be used for constructor.


 public


 protected


 private


static

57.
What are the variables declared in a class for the use of all methods of the class called?


 Object


 Instance variables


Reference variables


None

58.
What is the implicit return type of constructor?


No return type


A class object in which it is defined


void


 None

59.
Identify the infinite loop.


 for(;;)


for(int i=0;i<1;i--)


for(int i=0;;i++)


all of the above

60.
 What would be the behaviour if this() and super() were used in a method?


Runtime error


throws exception


compile time error


Runs successfully

61.
 What is false about constructor?


Constructors cannot be synchronized in Java


Java does not provide default copy constructor


Constructor can have a return type


“this” and “super” can be used in a constructor