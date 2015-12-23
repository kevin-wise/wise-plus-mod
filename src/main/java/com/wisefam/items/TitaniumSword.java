package com.wisefam.items;

import com.wisefam.materials.TitaniumMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumSword extends ItemSword {

    private final String name = "titaniumSword";

    public TitaniumSword() {
        super(TitaniumMaterial.TOOL);

        GameRegistry.registerItem(this, name);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName(name);
    }

    public String getName() {
        return name;
    }
}
