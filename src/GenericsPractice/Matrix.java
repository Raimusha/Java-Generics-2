package GenericsPractice;

import java.util.ArrayList;

/**
 * A generic Matrix class that stores elements in a two-dimensional arrangement.
 * Elements can be accessed using a row and column index.
 *
 * @param <T> the type of elements stored in the matrix
 */
public class Matrix<T> {
    /**
     * The elements of the matrix
     */
    private ArrayList<ArrayList<T>> elements; 
    /**
     * The number of rows in the matrix
     */
    private int rows; 
    /**
     * The number of columns in the matrix
     */
    private int columns; 
    
    /**
     * Constructs a new Matrix with the specified number of rows and columns.
     *
     * @param rows the number of rows in the matrix
     * @param columns the number of columns in the matrix
     */
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        elements = new ArrayList<ArrayList<T>>();
        for (int i = 0; i < rows; i++) {
            ArrayList<T> row = new ArrayList<T>();
            for (int j = 0; j < columns; j++)
                row.add(null);
            elements.add(row);
        }
    }
    
    /**
     * Sets the value at the specified row and column in the matrix.
     *
     * @param row the row index
     * @param column the column index
     * @param value the value to set
     */
    public void put(int row, int column, T value) {
        elements.get(row).set(column, value);
    }
    
    /**
     * Returns the value at the specified row and column in the matrix.
     *
     * @param row the row index
     * @param column the column index
     * @return the value at the specified row and column
     */
    public T get(int row, int column) {
        return elements.get(row).get(column);
    }
    
    /**
     * Returns the number of rows in the matrix.
     *
     * @return the number of rows in the matrix
     */
    public int getRows() {
        return rows;
    }
    
    /**
     * Returns the number of columns in the matrix.
     *
     * @return the number of columns in the matrix
     */
    public int getColumns() {
        return columns;
    }
}
