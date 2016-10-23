package edu.makebu.automeet;

import java.util.ArrayList;

/**
 * Created by Edward on 10/22/2016.
 */

public class TimelineHour {
    public final String id;
    public final String content;
    public final ArrayList<String> friendsAvailable;

    public TimelineHour(String id, String content, ArrayList<String> friendsAvailable) {
        this.id = id; // current hour
        this.content = content;
        this.friendsAvailable = friendsAvailable;

    }

    @Override
    public String toString() {
        return content;
    }
}
