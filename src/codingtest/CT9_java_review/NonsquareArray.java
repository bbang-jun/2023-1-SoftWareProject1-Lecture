package codingtest.CT9_java_review;

public class NonsquareArray {
    public static void main(String[] args) {
        int[][] arr = new int[4][];

        for(int i = 0; i < 4; i++){
            arr[i] = new int[i+1];
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j]=j;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
