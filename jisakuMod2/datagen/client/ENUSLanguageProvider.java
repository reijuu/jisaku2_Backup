package reijuu.jisakuMod2.datagen.client;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import reijuu.jisakuMod2.Item.JisakuItems;
import reijuu.jisakuMod2.JisakuMod2;
import reijuu.jisakuMod2.block.JisakBlocks;

import java.util.Locale;

public class ENUSLanguageProvider extends LanguageProvider {
    public ENUSLanguageProvider(PackOutput output) {
        super(output, JisakuMod2.MODID, Locale.US.toString().toLowerCase());
    }

    @Override
    protected void addTranslations() {
        addItem(JisakuItems.RAW_ORIHALCON,"Raw Orihalcon");
        addItem(JisakuItems.ORIHALCON_INGOT, "Orihalcon Ingot");
        addItem(JisakuItems.JISAKU_ARROW, "jisaku aarrow");
        addItem(JisakuItems.JISAKU_BOW, "jisaku bow");
        addItem(JisakuItems.ORIHALCON_SWORD, "orihalcon sword");
        addItem(JisakuItems.ORIHALCON_HELMET, "orihalcon helmet");
        addItem(JisakuItems.ORIHALCON_CHESTPLATE, "orihalcon chestplate");
        addItem(JisakuItems.ORIHALCON_LEGGINGS, "orihalcon leggings");
        addItem(JisakuItems.ORIHALCON_BOOTS, "orihalcon boots");



        add("creativetabs.item_tab", "jisaku");

        addBlock(JisakBlocks.ORIHALCON_BLOCK, "Orihalcon Block");
        addBlock(JisakBlocks.RAW_ORIHALCON_BLOCK, "Raw Orihalcon Block");
        addBlock(JisakBlocks.ORIHALCON_ORE, "Orihalcon Ore");
        addBlock(JisakBlocks.DEEPSLATE_ORIHALCON_ORE, "Deepslate Orihalcon Ore");
        addBlock(JisakBlocks.RANDOM_EXP_BLOCK,"random exp bllock");


    }
}
