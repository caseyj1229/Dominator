public class Dominator {
    public static int solution(int[] A){
        //Initial count is 1, initial dominator candidate is A[0]
        if(A.length == 0){
            return -1;
        }

        int count = 0;
        int candidate = A[0];

        //For every element i in A
        for(int i : A){
            //if i equals the current element, increase the count
            if(i == candidate){
                count++;
            }
            else{
                //If the count is 0, then the current element becomes
                //the new candidate, with a count of 1
                if(count == 0){
                    candidate = i;
                    count++;
                }
                //The element is not a candidate and count is not 0
                //so decrement the count by 1 and continue searching
                else{
                    count--;
                }
            }
        }
        int index = 0;
        int cnt = 0;

        for(int i = 0; i<A.length; i++){
            if(A[i] == candidate){
                cnt++;
                index = i;
            }
        }

        if(cnt > (A.length)*(0.5)){
            return index;
        }
        else {
            return -1;
        }
    }
}
