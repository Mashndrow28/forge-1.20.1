package net.mashy.mccourses.datagen;

import net.mashy.mccourses.MCCourseMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PaintingVariantTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.PaintingVariantTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModPaintingVariantTagProvider extends PaintingVariantTagsProvider {
    public ModPaintingVariantTagProvider(PackOutput packOutput,
                                         CompletableFuture<HolderLookup.Provider> completableFuture,
                                         @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, MCCourseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(PaintingVariantTags.PLACEABLE)
                .addOptional(new ResourceLocation(MCCourseMod.MOD_ID,"saw_them"))
                .addOptional(new ResourceLocation(MCCourseMod.MOD_ID,"world"))
                .addOptional(new ResourceLocation(MCCourseMod.MOD_ID,"shrimp"));
    }
}
