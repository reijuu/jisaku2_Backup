package reijuu.jisakuMod2.loot;

import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import reijuu.jisakuMod2.JisakuMod2;

public class JisakuLootModeifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS,
                    JisakuMod2.MODID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_ITEM =
            LOOT_MODIFIER_SERIALIZERS.register("add_item",AddItemModifier.CODEC);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> REPLACE_ITEM =
            LOOT_MODIFIER_SERIALIZERS.register("replace_item",ReplaceItemModifier.CODEC);

    public static void register(IEventBus eventBus){
    LOOT_MODIFIER_SERIALIZERS.register(eventBus);
    }
}
