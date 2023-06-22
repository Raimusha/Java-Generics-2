# Java-Generics-2

Instructions
Copy
1
2
3
4
5
6
7
.
├── src/
│  └── GenericsPractice/
│     └── Matrix.java
└── test/
  └── GenericsPractice/
      └── MatrixTest.java
After you read the following, check them off -


Your task is to complete the implementation of a generic Matrix class.


Currently, the Matrix class is empty.


A matrix is a two-dimensional arrangement of elements. You access elements with a row and column index. For example -

Copy
1
2
3
Matrix<String> tttBoard = new Matrix<String>(3, 3);
tttBoard.put(0, 0, "x");
if (tttBoard.get(1, 2).equals("o")) . . .

Please implement put and get methods based on the above usage description. Here, the first argument is the row index and the second is the column index.


Since we are not allowed to use generic arrays, we use an arraylist of arraylists instead (an arraylist that contains another arraylist inside of it)


First sketch in a notebook how you envision the rows and columns of a matrix being stored inside this arraylist of arraylists.


This arraylist should be called elements


There should also be two integer members of this class - rows, and columns - that store the size of the matrix.


Complete the implementations of the class. Be sure to implement getters and setters.


This is what the constructor should look like 
    public Matrix(int rows, int columns)
   {
      this.rows = rows;
      this.columns = columns;
      elements = new ArrayList<ArrayList<T>>();
      for (int i = 0; i < rows; i++)
      {
         ArrayList<T> row = new ArrayList<T>();
         for (int j = 0; j < columns; j++)
            row.add(null);
         
         elements.add(row);
      }
   }

This constructor implementation also tells you what the fields of the Matrix class should be.
