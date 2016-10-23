package edu.makebu.automeet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Edward on 10/22/2016.
 */

public class TimelineContent {

    public static final List<TimelineHour> ITEMS = new ArrayList<>();

    public static final Map<String, TimelineHour> ITEM_MAP = new HashMap<>();

    private static final int COUNT = 24;

    static {
        // Add some sample items.
        for (int i = 0; i < COUNT; i++) {
            addItem(createTimelineItem(i));
        }
    }

    private static void addItem(TimelineHour item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static TimelineHour createTimelineItem(int position) {
        return new TimelineHour(String.valueOf(position), position+":00", makeDetails(position));
    }

    private static ArrayList<String> makeDetails(int position) {
        ArrayList<String> friends = new ArrayList<>(); // initiate friends
        // populate with friends available at time slot position
        friends.add("Eddy Luo");
        friends.add("Lu Reddy");
        return friends;
    }
}
