package net.heaper.tech_mod.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.heaper.tech_mod.block.ModBlocks;
import net.heaper.tech_mod.item.ModItems;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModEnglishLangProvider extends FabricLanguageProvider {
    public ModEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        //Uranium Related translations
        translationBuilder.add(ModItems.RAW_URANIUM, "Raw Uranium");
        translationBuilder.add(ModItems.URANIUM_PELLET, "Uranium Pellet");
        translationBuilder.add(ModItems.SMALL_URANIUM_PELLET, "Small Uranium Pellet");
        translationBuilder.add(ModItems.DIRTY_URANIUM_POWDER, "Dirty Uranium Powder");
        translationBuilder.add(ModItems.URANIUM_POWDER, "Uranium Powder");
        translationBuilder.add(ModItems.PURIFIED_URANIUM_POWDER, "Purified Uranium Powder");

        translationBuilder.add(ModBlocks.URANIUM_ORE.asItem().getTranslationKey(), "Uranium Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_URANIUM_ORE.asItem().getTranslationKey(), "Deepslate Uranium Ore");
        translationBuilder.add(ModBlocks.RAW_URANIUM_BLOCK.asItem().getTranslationKey(), "Block of Raw Uranium");
        translationBuilder.add(ModBlocks.URANIUM_BLOCK.asItem().getTranslationKey(), "Uranium Block");

        //Arentinium related translations
        translationBuilder.add(ModItems.RAW_ARENTINIUM, "Raw Arentinium");
        translationBuilder.add(ModItems.ARENTINIUM_INGOT, "Arentinium Ingot");

        translationBuilder.add(ModBlocks.ARENTINIUM_ORE.asItem(), "Arentinium Ore");
        translationBuilder.add(ModBlocks.RAW_ARENTINIUM_BLOCK.asItem(), "Block of Raw Arentinium");

        //Coal related translations

        //Copper related translations

        //Iron related translations

        //Gold related translations

        //Diamond related translations
        translationBuilder.add(ModItems.DIAMOND_CRYSTAL, "Diamond Crystal");
        translationBuilder.add(ModItems.EMERALD_CRYSTAL, "Emerald Crystal");

        //Emerald related translations

        //Item groups translations
        translationBuilder.add("itemGroup.tech_mod.items", "Items");
        translationBuilder.add("itemGroup.tech_mod.blocks", "Blocks");
    }
}
