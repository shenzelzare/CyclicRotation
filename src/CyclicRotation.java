public class CyclicRotation {
    private int[] solution(int[] A,int K){
        if(A.length==0 || A.length==K){
            return A;
        }
        for (int i=0 ; i<K; i++){
            int last= A[A.length-1];
            for (int j=A.length-2;j>=0;j--){
                A[j+1]=A[j];
            }
            A[0]=last;
        }
        return A;

    }

    public static void main(String[] args) {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] result = cyclicRotation.solution(new int[]{3,8,9,7,6},3);
        for (int i:result ){
            System.out.println(i);
        }
    }
}
