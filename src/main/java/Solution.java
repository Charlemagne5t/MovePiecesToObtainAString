import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean canChange(String start, String target) {
        int n = target.length();
        Deque<Pair> q = new ArrayDeque<>();
        for(int i = 0; i < n; i++) {
            if(start.charAt(i) != '_') {
                q.offer(new Pair(start.charAt(i), i));
            }
        }
        for(int i = 0; i < n; i++) {
            char ch = target.charAt(i);
            if(q.isEmpty() && ch != '_') {
                return false;
            }
            if(ch == '_'){
                continue;
            }
            if(ch != q.peek().ch) {
                return false;
            }
            if(ch == 'L' && i > q.peek().index) {
                return false;
            }
            if(ch == 'R' && i < q.peek().index){
                return false;
            }
            q.poll();
        }

        return true;
    }
}

class Pair {
    char ch;
    int index;
    Pair(char ch, int index) {
        this.ch = ch;
        this.index = index;
    }
}