package com.example.examplemod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import ButterBlock.bbmodel;
import 
@Mod(modid = ButterMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod {

    public static final String MODID = "Butter Mod";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        Block Butter = new BlockHoney().setBlockName("Block Of Butter").setBlock
                                          TextureName("Butter Mod:Block Of Butter");
        GameRegistry.registerBlock(Block.Butter, "Block Of Butter");
    
        GameRegistry.registerItem(Item.Butter, "Stick Of Butter");
    
        
 }
 }