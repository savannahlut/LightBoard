public class LightBoard{

/** The lights on the board, where true represents on and false represents off. */
private boolean[][] lights;

/** Constructs a LightBoard object having numRows rows and numCols columns.
* Precondition: numRows > 0, numCols > 0
* Postcondition: each light has a 40% probability of being set to on. */
public LightBoard(int numRows, int numCols){ 
    lights = new boolean[numRows][numCols];
    for(int i=0; i<numRows ; i++){
        for(int j=0; j<numCols ; j++){
            if(0.40 >= Math.random()) lights[i][j] = true;
        }
    }
}

/** Evaluates a light in row index row and column index col and returns a status
* as described in part (b).
* Precondition: row and col are valid indexes in lights.
*/
public boolean evaluateLight(int row, int col){
    boolean currentLight = lights[row][col];
    int on = 0;
    for(int i=0; i<lights.length ; i++){
        if (currentLight) on++;
    }
    if(currentLight){
        if(on % 2 == 0) return false;
    }
    if(!currentLight){
        if(on % 3 == 0) return true;
    }
    return currentLight;
}

// There may be additional instance variables, constructors, and methods not shown.
public String toString(){
    String result = "[ " ;
    for(boolean[] r : lights){
        for(boolean c : r){
            result += c + ", " ;
        }
        result += "\n" ;
    }
    return result + " ]";
}
}