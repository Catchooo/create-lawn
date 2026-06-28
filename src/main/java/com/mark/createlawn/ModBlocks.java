package com.mark.createlawn.register;

import com.mark.createlawn.CreateLawn;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class ModBlocks {

    // Створюємо посилання на реєстратор Create
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreateLawn.MOD_ID);

    // Наш перший блок - Англійський газон
    public static final BlockEntry<Block> ENGLISH_LAWN = REGISTRATE.block("english_lawn", Block::new)
            .initialProperties(() -> Blocks.GRASS_BLOCK) // Копіюємо властивості звичайної трави
            .properties(p -> p.mapColor(MapColor.COLOR_GREEN).sound(SoundType.GRASS))
            .simpleItem() // Автоматично створює предмет для цього блоку
            .register();

    public static void register() {
        // Метод для ініціалізації класу в головному моді
    }
}
