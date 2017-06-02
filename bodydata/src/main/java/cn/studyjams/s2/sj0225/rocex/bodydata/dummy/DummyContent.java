package cn.studyjams.s2.sj0225.rocex.bodydata.dummy;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent
{
    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();
    
    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();
    
    static
    {
        addItem(createDummyItem(1, 178, 64.5));
        addItem(createDummyItem(2, 178, 65.6));
        addItem(createDummyItem(3, 178, 66.7));
        addItem(createDummyItem(4, 178, 68.3));
    }
    
    private static void addItem(DummyItem item)
    {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }
    
    private static DummyItem createDummyItem(int position, double stature, double weight)
    {
        return new DummyItem(String.valueOf(position), stature, weight);
    }
    
    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem
    {
        public final String id;
        public final Double stature;  // 身高cm
        public final Double weight; // 体重kg
        public final Double bmi; // 体质指数BMI = weight / (stature / 100 * stature / 100)
        public final Date date;
    
        public DummyItem(String id, Double stature, Double weight)
        {
            this.id = id;
            this.weight = weight;
            this.stature = stature;
    
            this.bmi = weight / (stature / 100 * stature / 100);
    
            date = new Date(System.currentTimeMillis());
        }
        
        @Override
        public String toString()
        {
            return MessageFormat.format("{0}cm, {1}kg, BMI {2}", stature, weight, bmi);
        }
    }
}
