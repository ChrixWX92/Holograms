package gt.creeperface.holograms.util;

import cn.nukkit.item.Item;
import lombok.experimental.UtilityClass;

/**
 * @author CreeperFace
 */
@UtilityClass
public class Values {

    public static final double LINE_SPACE = 0.3;

    public static final int WINDOW_ID = 9467281;
    public static final int GENERAL_WINDOW_ID = 9467282;
    public static final int TEXT_WINDOW_ID = 9467283;
    public static final int GRID_WINDOW_ID = 9467284;
    public static final int GRID_GENERAL_ID = 9467285;
    public static final int GRID_COLUMNS_ID = 9467286;

    public static final int MAX_WINDOW_ID = 9467381;

    public static final double SEARCH_RADIUS = 3;

    public static final Item AIR = Item.get(Item.AIR);

    public static boolean BATCH_PACKETS_ASYNC = false;

    public static final String COLUMN_TEMPLATE_PLACEHOLDER = "{$DATA}";
}
