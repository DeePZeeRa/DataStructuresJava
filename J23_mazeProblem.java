import java.util.ArrayList;

public class J23_mazeProblem {
    public static void main(String[] args) {
        System.out.println(mazeCountMoves(3, 3));
        path(3, 3, "");
        System.out.println(pathArrayList(3,3,""));
    }

    // this function will give you no moves can be made in 3*3 maze
    static int mazeCountMoves(int rows, int cols){
        if(rows==1||cols == 1){
            return 1;
        }
        int left = mazeCountMoves(rows-1, cols);
        int right = mazeCountMoves(rows, cols-1);
        return left+right;
    }
    static void path(int r, int c, String path){
        if(r==1 && c == 1){
            System.out.println(path);
            return;
        } 

        if(r>1){
            path(r-1, c, path+'D');
        }
        if(c>1){
            path(r,c-1,path+'R');
        }
    }
    static ArrayList<String> pathArrayList(int r, int c, String path) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(pathArrayList(r - 1, c, path + 'D'));
        }
        if (c > 1) {
            list.addAll(pathArrayList(r, c - 1, path + 'R'));
        }

        return list;
    }
}

//!path
// DDRR
// DRDR
// DRRD
// RDDR
// RDRD
// RRDD