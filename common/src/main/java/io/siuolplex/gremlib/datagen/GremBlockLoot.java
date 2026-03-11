package io.siuolplex.gremlib.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.Set;

public class GremBlockLoot extends BlockLootSubProvider {
    public GremBlockLoot(Set<Item> explosionResistant, FeatureFlagSet enabledFeatures, HolderLookup.Provider registries) {
        super(explosionResistant, enabledFeatures, registries);
    }

    @Override
    public void generate() {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        HolderLookup.RegistryLookup<Item> items = this.registries.lookupOrThrow(Registries.ITEM);

    }

    public LootTable.Builder createDoorTable(DoorBlock block) {
        return super.createDoorTable(block);
    }

    public LootTable.Builder createSlabItemTable(SlabBlock slab) {
        return super.createSlabItemTable(slab);
    }
}
