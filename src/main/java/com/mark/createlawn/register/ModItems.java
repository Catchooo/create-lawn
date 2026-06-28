package com.mark.createlawn.register;

import com.mark.createlawn.CreateLawn;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

public class ModItems {

    // Використовуємо реєстратор Create
    public static final CreateRegistrate REGISTRATE = ModBlocks.REGISTRATE;

    // 1. Садовий шланг (базовий предмет)
    public static final ItemEntry<Item> GARDEN_HOSE = REGISTRATE.item("garden_hose", Item::new)
            .register();

    // 2. Ручна газонокосарка (яку штовхаємо/несемо в руках)
    public static final ItemEntry<Item> HAND_MOWER = REGISTRATE.item("hand_mower", Item::new)
            .properties(p -> p.stacksTo(1)) // Косарка не повинна стакатися
            .register();

    // 3. Круговий розпилювач (наш спринклер з фото!)
    public static final ItemEntry<Item> LAWN_SPRINKLER = REGISTRATE.item("lawn_sprinkler", Item::new)
            .register();

    public static void register() {
        // Метод для ініціалізації класу
    }
}
