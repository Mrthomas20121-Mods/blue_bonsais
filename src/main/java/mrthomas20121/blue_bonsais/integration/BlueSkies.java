package mrthomas20121.blue_bonsais.integration;

import com.legacy.blue_skies.blocks.BlocksSkies;
import com.legacy.blue_skies.blocks.natural.BlockSkySapling;
import com.legacy.blue_skies.items.ItemsSkies;
import mrthomas20121.blue_bonsais.integration.soils.Soils;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.dave.bonsaitrees.api.*;
import org.dave.bonsaitrees.soils.BonsaiSoil;

import java.util.ArrayList;
import java.util.Random;

@BonsaiIntegration(mod = "blue_skies")
public class BlueSkies implements IBonsaiIntegration
{
    private ArrayList<IBonsaiTreeType> trees = new ArrayList<>();

    private TreeTypeSimple CreateTree(String name, Block block)
    {
        return new TreeTypeSimple(name, new ItemStack(block));
    }
    private void addSaplingDrop(TreeTypeSimple treeType, Block block)
    {
        treeType.addDrop(new ItemStack(block, BonsaiDropChances.saplingAmount, 0), BonsaiDropChances.saplingChance);
    }
    private void addLogDrop(TreeTypeSimple treeType, Block block)
    {
        treeType.addDrop(new ItemStack(block, BonsaiDropChances.logAmount, 0), BonsaiDropChances.logChance);
    }
    private void addLeaveDrop(TreeTypeSimple treeType, Block block)
    {
        treeType.addDrop(new ItemStack(block, BonsaiDropChances.leafAmount, 0), BonsaiDropChances.leafChance);
    }
    private void addStickDrop(TreeTypeSimple treeType, Item stick)
    {
        treeType.addDrop(new ItemStack(stick, BonsaiDropChances.stickAmount, 0), BonsaiDropChances.stickChance);
    }
    private void addSoils(TreeTypeSimple treeType, String... soils)
    {
        for(String soil: soils)
        {
            treeType.addCompatibleSoilTag(soil);
        }
    }

    @Override
    public void registerTrees(ITreeTypeRegistry registry)
    {
        // lunar
        TreeTypeSimple lunarSapling = CreateTree("blue_skies:lunar", BlocksSkies.lunar_sapling);
        addSaplingDrop(lunarSapling, BlocksSkies.lunar_sapling);
        addLeaveDrop(lunarSapling, BlocksSkies.lunar_leaves);
        addLogDrop(lunarSapling, BlocksSkies.lunar_log);
        addStickDrop(lunarSapling, ItemsSkies.lunar_stick);
        addSoils(lunarSapling, "lunar_dirt", "lunar_grass", "cherry");
        registry.registerTreeType(this, lunarSapling);
        trees.add(lunarSapling);

        // dusk
        TreeTypeSimple duskSapling = CreateTree("blue_skies:dusk", BlocksSkies.dusk_sapling);
        addSaplingDrop(duskSapling, BlocksSkies.dusk_sapling);
        addLeaveDrop(duskSapling, BlocksSkies.dusk_leaves);
        addLogDrop(duskSapling, BlocksSkies.dusk_log);
        addStickDrop(duskSapling, ItemsSkies.lunar_stick);
        addSoils(duskSapling, "lunar_dirt", "lunar_grass", "cherry");
        registry.registerTreeType(this, duskSapling);
        trees.add(duskSapling);

        // nectarine
        TreeTypeSimple nectarineSapling = CreateTree("blue_skies:nectarine", BlocksSkies.nectarine_sapling);
        addSaplingDrop(nectarineSapling, BlocksSkies.nectarine_sapling);
        addLeaveDrop(nectarineSapling, BlocksSkies.nectarine_leaves);
        addLogDrop(nectarineSapling, BlocksSkies.dusk_log);
        addStickDrop(nectarineSapling, ItemsSkies.lunar_stick);
        addSoils(nectarineSapling, "lunar_dirt", "lunar_grass", "cherry");
        nectarineSapling.addDrop(new ItemStack(ItemsSkies.nectarine, 1), 0.05f);
        registry.registerTreeType(this, nectarineSapling);
        trees.add(nectarineSapling);

        // maple
        TreeTypeSimple mapleSapling = CreateTree("blue_skies:maple", BlocksSkies.maple_sapling);
        addSaplingDrop(mapleSapling, BlocksSkies.maple_sapling);
        addLeaveDrop(mapleSapling, BlocksSkies.maple_leaves);
        addLogDrop(mapleSapling, BlocksSkies.maple_log);
        addStickDrop(mapleSapling, Items.STICK);
        addSoils(mapleSapling, "lunar_dirt", "lunar_grass", "cherry");
        registry.registerTreeType(this, mapleSapling);
        trees.add(mapleSapling);

        // starlit
        TreeTypeSimple starlitSapling = CreateTree("blue_skies:starlit", BlocksSkies.starlit_sapling);
        addSaplingDrop(starlitSapling, BlocksSkies.starlit_sapling);
        addLeaveDrop(starlitSapling, BlocksSkies.starlit_leaves);
        addLogDrop(starlitSapling, BlocksSkies.starlit_log);
        addStickDrop(starlitSapling, ItemsSkies.bluebright_stick);
        addSoils(starlitSapling, "turquoise_dirt", "turquoise_grass", "cherry");
        registry.registerTreeType(this, starlitSapling);
        trees.add(starlitSapling);

        // blue bright
        TreeTypeSimple bluebrightSapling = CreateTree("blue_skies:bluebright", BlocksSkies.bluebright_sapling);
        addSaplingDrop(bluebrightSapling, BlocksSkies.bluebright_sapling);
        addLeaveDrop(bluebrightSapling, BlocksSkies.bluebright_leaves);
        addLogDrop(bluebrightSapling, BlocksSkies.bluebright_log);
        addStickDrop(bluebrightSapling, ItemsSkies.bluebright_stick);
        addSoils(bluebrightSapling, "turquoise_dirt", "turquoise_grass", "cherry");
        registry.registerTreeType(this, bluebrightSapling);
        trees.add(bluebrightSapling);

        // frostbright
        TreeTypeSimple frostBrightSapling = CreateTree("blue_skies:frostbright", BlocksSkies.frostbright_sapling);
        addSaplingDrop(frostBrightSapling, BlocksSkies.frostbright_sapling);
        addLeaveDrop(frostBrightSapling, BlocksSkies.frostbright_leaves);
        addLogDrop(frostBrightSapling, BlocksSkies.frostbright_log);
        addStickDrop(frostBrightSapling, Items.STICK);
        addSoils(frostBrightSapling, "turquoise_dirt", "turquoise_grass", "cherry");
        registry.registerTreeType(this, frostBrightSapling);
        trees.add(frostBrightSapling);

        // cherry
        TreeTypeSimple cherrySapling = CreateTree("blue_skies:cherry", BlocksSkies.cherry_sapling);
        addSaplingDrop(cherrySapling, BlocksSkies.cherry_sapling);
        addLeaveDrop(cherrySapling, BlocksSkies.cherry_leaves);
        addLogDrop(cherrySapling, BlocksSkies.cherry_log);
        addStickDrop(cherrySapling,ItemsSkies.cherry_stick);
        addSoils(cherrySapling, "cherry");
        cherrySapling.addDrop(new ItemStack(ItemsSkies.cherry, 1), 0.05f);
        registry.registerTreeType(this, cherrySapling);
        trees.add(cherrySapling);

    }

    @Override
    public void generateTree(IBonsaiTreeType type, World world, BlockPos pos, Random rand)
    {
        Block sapling = ((ItemBlock) type.getExampleStack().getItem()).getBlock();

        if(trees.contains(type))
        {
            world.setBlockState(pos, sapling.getDefaultState());
            BlockSkySapling sap = (BlockSkySapling)sapling;
            sap.generateTree(world, pos, null, rand);
        }
    }
    @Override
    public void registerSoils(IBonsaiSoilRegistry registry)
    {
        for(BonsaiSoil soil : Soils.getSoils())
        {
            registry.registerBonsaiSoilIntegration(this, soil);
        }
    }

}
