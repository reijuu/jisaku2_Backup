package reijuu.jisakuMod2.datagen.server.loot;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class JisakuLootTables {
    public static LootTableProvider create(PackOutput output){
        return  new LootTableProvider(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(
                        JisakuBlockLootTables::new, LootContextParamSets.BLOCK
                )
        ));
    }
}
