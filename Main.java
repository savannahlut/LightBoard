public class Main{
    public static void main(String[] args) {
        LightBoard LB1 = new LightBoard(5, 5);
        System.out.println(LB1);

        LightBoard LBJ = new LightBoard(7, 5);
        LBJ.setlights(
        new boolean[][]{{true, true, false, true, true},
                        {true, false, false, true, false},
                        {true, false, false, true, true},
                        {true, false, false, false, true},
                        {true, false, false, false, true},
                        {true, true, false, true, true},
                        {false, false, false, false, false}});
        System.out.println(LBJ);  
        System.out.println(LBJ.evaluateLight(0, 3));
        System.out.println(LBJ.evaluateLight(6, 0));
        System.out.println(LBJ.evaluateLight(4, 1));
        System.out.println(LBJ.evaluateLight(5, 4));
    }
}