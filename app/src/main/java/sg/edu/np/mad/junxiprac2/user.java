package sg.edu.np.mad.junxiprac2;

public class user {
    String name;
    String description;
    int id;
    boolean followed;



    public user(String n, String desc, int num, boolean follow) {
        name = n;
        description = desc;
        id = num;
        followed = follow;
    }
}

