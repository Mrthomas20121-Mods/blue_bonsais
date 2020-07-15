package mrthomas20121.blue_bonsais.integration.soils;

import com.legacy.blue_skies.blocks.BlocksSkies;
import net.minecraft.item.ItemStack;
import org.dave.bonsaitrees.soils.BonsaiSoil;

import java.util.ArrayList;

public class Soils
{
    public static ArrayList<BonsaiSoil> getSoils()
    {
        ArrayList<BonsaiSoil> soils = new ArrayList<>();
        // turquoise
        soils.add(registerSoil("blue_skies:turquoise_dirt", new ItemStack(BlocksSkies.turquoise_dirt, 1, 0), 0.9f, 1.1f, false, "turquoise_dirt"));
        soils.add(registerSoil("blue_skies:turquoise_grass", new ItemStack(BlocksSkies.turquoise_grass, 1, 0), 1f, 1, false, "turquoise_grass"));

        soils.add(registerSoil("blue_skies:lunar_dirt", new ItemStack(BlocksSkies.lunar_dirt, 1, 0), 0.9f, 1.1f, false, "lunar_dirt"));
        soils.add(registerSoil("blue_skies:lunar_grass", new ItemStack(BlocksSkies.lunar_grass, 1, 0), 1f, 1, false, "lunar_grass"));

        soils.add(registerSoil("blue_skies:cherry_grass", new ItemStack(BlocksSkies.everbright_cherry_grass, 1, 0), 1.30f, 1.1f, false, "cherry"));
        soils.add(registerSoil("blue_skies:cherry_grass", new ItemStack(BlocksSkies.everdawn_cherry_grass, 1, 0), 1.30f, 1.1f, false, "cherry"));

        return soils;
    }
    public static BonsaiSoil registerSoil(String name, ItemStack soilStack, float modifierSpeed, float modifierDropChance, boolean meta, String... tags)
    {
        BonsaiSoil soil = new BonsaiSoil(name, soilStack);
        soil.setModifierSpeed(modifierSpeed);
        soil.setModifierDropChance(modifierDropChance);
        for(String tag : tags)
        {
            soil.addProvidedTag(tag);
        }
        return soil;
    }
}
