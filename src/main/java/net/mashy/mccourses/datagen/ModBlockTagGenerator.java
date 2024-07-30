package net.mashy.mccourses.datagen;

import net.mashy.mccourses.MCCourseMod;
import net.mashy.mccourses.block.ModBlocks;
import net.mashy.mccourses.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MCCourseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider nProvider) {
         this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES).add(ModBlocks.ALEXANDRITE_BLOCK.get())
                 .addTag(Tags.Blocks.ORES);

         this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                 .add(ModBlocks.ALEXANDRITE_BLOCK.get(),
                         ModBlocks.RAW_ALEXANDRITE_BLOCK.get(),
                         ModBlocks.ALEXANDRITE_ORE.get(),
                         ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(),
                         ModBlocks.NETHER_ALEXANDRITE_ORE.get(),
                         ModBlocks.END_STONE_ALEXANDRITE_ORE.get(),
                         ModBlocks.SOUND_BLOCK.get(),
                         ModBlocks.ALEXANDRITE_STAIRS.get(),
                         ModBlocks.ALEXANDRITE_SLABS.get());
         this.tag(BlockTags.NEEDS_IRON_TOOL)
                 .add(ModBlocks.ALEXANDRITE_BLOCK.get(),
                         ModBlocks.RAW_ALEXANDRITE_BLOCK.get(),
                         ModBlocks.ALEXANDRITE_ORE.get(),
                         ModBlocks.SOUND_BLOCK.get(),
                         ModBlocks.ALEXANDRITE_STAIRS.get(),
                         ModBlocks.ALEXANDRITE_SLABS.get());

         this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                 .add(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(),
                         ModBlocks.END_STONE_ALEXANDRITE_ORE.get());

        this.tag(ModTags.Blocks.NEEDS_ALEXANDRITE_TOOL)
                .add(ModBlocks.NETHER_ALEXANDRITE_ORE.get());

         this.tag(BlockTags.FENCES)
                 .add(ModBlocks.ALEXANDRITE_FENCE.get());
         this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.ALEXANDRITE_FENCE_GATE.get());
         this.tag(BlockTags.WALLS)
                .add(ModBlocks.ALEXANDRITE_WALL.get());


    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
