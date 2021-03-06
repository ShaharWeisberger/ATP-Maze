package algorithms.mazeGenerators;

public class Position implements java.io.Serializable{

    private int rowIndex;
    private  int columnIndex;

    public Position(int row,int column) {
        this.rowIndex = row;
        this.columnIndex = column;
    }

    public int getRowIndex() { return  rowIndex; }
    public int getColumnIndex() { return  columnIndex; }

    public String getKey(){
        return ""+getRowIndex() +"$"+getColumnIndex();
    }
    public String toString() { return "{" + rowIndex + "," + columnIndex + "}"; }

}
