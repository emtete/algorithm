import java.util.HashMap;

/**
 * Created by victor on 2016. 7. 11..
 */
public class BatchSystemBySite {

    public int[] schedule(int[] duration, String[] user){
        int n = user.length;
        User[] users = new User[n];
        HashMap<String, Long> map = new HashMap<String, Long>();
//        for(int i=0; i < n; i++) users[i]


        return null;
    }

    public class User implements Comparable<User>{
        String user = "";
        long duration = 0;
        int index = 0;

        public User(){

        }

        public User(String user, long duration, int index){
            this.user = user;
            this.duration = duration;
            this.index = index;
        }

        public int compareTo(User u){
            if( this.duration > u.duration )
                return 1;
            else if( this.duration < u.duration )
                return -1;
            else
                return this.index - u.index;
        }
    }
}
