package Stack;

import java.util.Stack;

public class Asteroid_Collision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while(i < asteroids.length){
            if(st.isEmpty() || asteroids[i]>0 || st.peek() < 0){
                st.push(asteroids[i]);
                i++;
            }else{
                if(-asteroids[i] == st.peek()){
                    st.pop();
                    i++;
                }else if(-asteroids[i] > st.peek()){
                    st.pop();
                }else{
                    i++;
                }
            }
        }

        int[] res = new int[st.size()];
        for(int j=res.length-1; j>=0; j--){
            res[j] = st.pop();
        }

        return res;
    }
}
