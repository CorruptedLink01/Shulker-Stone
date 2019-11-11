package link.corrupted.shulkerstone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod(value = ShulkerStone.MODID)
public class ShulkerStone {

	public static final String MODID = "shulkerstone";


	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	@ObjectHolder(MODID)
	public static class ShulkerRegistry {

		public static Block shulkerStone;
		public static Block whiteShulkerStone;
		public static Block orangeShulkerStone;
		public static Block magentaShulkerStone;
		public static Block lightBlueShulkerStone;
		public static Block yellowShulkerStone;
		public static Block limeShulkerStone;
		public static Block pinkShulkerStone;
		public static Block grayShulkerStone;
		public static Block lightGrayShulkerStone;
		public static Block cyanShulkerStone;
		public static Block purpleShulkerStone;
		public static Block blueShulkerStone;
		public static Block brownShulkerStone;
		public static Block greenShulkerStone;
		public static Block redShulkerStone;
		public static Block blackShulkerStone;

		public static Item shulkerStoneItem;
		public static Item whiteShulkerStoneItem;
		public static Item orangeShulkerStoneItem;
		public static Item magentaShulkerStoneItem;
		public static Item lightBlueShulkerStoneItem;
		public static Item yellowShulkerStoneItem;
		public static Item limeShulkerStoneItem;
		public static Item pinkShulkerStoneItem;
		public static Item grayShulkerStoneItem;
		public static Item lightGrayShulkerStoneItem;
		public static Item cyanShulkerStoneItem;
		public static Item purpleShulkerStoneItem;
		public static Item blueShulkerStoneItem;
		public static Item brownShulkerStoneItem;
		public static Item greenShulkerStoneItem;
		public static Item redShulkerStoneItem;
		public static Item blackShulkerStoneItem;

		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event) {
			event.getRegistry().registerAll(
					shulkerStone = new ShulkerStoneBlock(null, Block.Properties.create(Material.SHULKER).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F)).setRegistryName("shulker_stone"),
					whiteShulkerStone = new ShulkerStoneBlock(DyeColor.WHITE, Block.Properties.create(Material.SHULKER, MaterialColor.SNOW).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F)).setRegistryName("white_shulker_stone"),
					orangeShulkerStone = new ShulkerStoneBlock(DyeColor.ORANGE, Block.Properties.create(Material.SHULKER, MaterialColor.ADOBE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F)).setRegistryName("orange_shulker_stone"),
					magentaShulkerStone = new ShulkerStoneBlock(DyeColor.MAGENTA, Block.Properties.create(Material.SHULKER, MaterialColor.MAGENTA).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F)).setRegistryName("magenta_shulker_stone"),
					lightBlueShulkerStone = new ShulkerStoneBlock(DyeColor.LIGHT_BLUE, Block.Properties.create(Material.SHULKER, MaterialColor.LIGHT_BLUE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F)).setRegistryName("light_blue_shulker_stone"),
					yellowShulkerStone = new ShulkerStoneBlock(DyeColor.LIGHT_BLUE, Block.Properties.create(Material.SHULKER, MaterialColor.LIGHT_BLUE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F)).setRegistryName("yellow_shulker_stone"),
					limeShulkerStone = new ShulkerStoneBlock(DyeColor.LIME, Block.Properties.create(Material.SHULKER, MaterialColor.LIME).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F)).setRegistryName("lime_shulker_stone"),
					pinkShulkerStone = new ShulkerStoneBlock(DyeColor.PINK, Block.Properties.create(Material.SHULKER, MaterialColor.PINK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F)).setRegistryName("pink_shulker_stone"),
					grayShulkerStone = new ShulkerStoneBlock(DyeColor.GRAY, Block.Properties.create(Material.SHULKER, MaterialColor.GRAY).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F)).setRegistryName("gray_shulker_stone"),
					lightGrayShulkerStone = new ShulkerStoneBlock(DyeColor.LIGHT_GRAY, Block.Properties.create(Material.SHULKER, MaterialColor.LIGHT_GRAY).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F)).setRegistryName("light_gray_shulker_stone"),
					cyanShulkerStone = new ShulkerStoneBlock(DyeColor.CYAN, Block.Properties.create(Material.SHULKER, MaterialColor.CYAN).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F)).setRegistryName("cyan_shulker_stone"),
					purpleShulkerStone = new ShulkerStoneBlock(DyeColor.PURPLE, Block.Properties.create(Material.SHULKER, MaterialColor.PURPLE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F)).setRegistryName("purple_shulker_stone"),
					blueShulkerStone = new ShulkerStoneBlock(DyeColor.BLUE, Block.Properties.create(Material.SHULKER, MaterialColor.BLUE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F)).setRegistryName("blue_shulker_stone"),
					brownShulkerStone = new ShulkerStoneBlock(DyeColor.BROWN, Block.Properties.create(Material.SHULKER, MaterialColor.BROWN).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F)).setRegistryName("brown_shulker_stone"),
					greenShulkerStone = new ShulkerStoneBlock(DyeColor.GREEN, Block.Properties.create(Material.SHULKER, MaterialColor.GREEN).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F)).setRegistryName("green_shulker_stone"),
					redShulkerStone = new ShulkerStoneBlock(DyeColor.RED, Block.Properties.create(Material.SHULKER, MaterialColor.RED).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F)).setRegistryName("red_shulker_stone"),
					blackShulkerStone = new ShulkerStoneBlock(DyeColor.BLACK, Block.Properties.create(Material.SHULKER, MaterialColor.BLACK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0F)).setRegistryName("black_shulker_stone")
			);
		}

		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			event.getRegistry().registerAll(
					shulkerStoneItem = new BlockItem(shulkerStone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(shulkerStone.getRegistryName()),
					whiteShulkerStoneItem = new BlockItem(whiteShulkerStone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(whiteShulkerStone.getRegistryName()),
					orangeShulkerStoneItem = new BlockItem(orangeShulkerStone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(orangeShulkerStone.getRegistryName()),
					magentaShulkerStoneItem = new BlockItem(magentaShulkerStone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(magentaShulkerStone.getRegistryName()),
					lightBlueShulkerStoneItem = new BlockItem(lightBlueShulkerStone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(lightBlueShulkerStone.getRegistryName()),
					yellowShulkerStoneItem = new BlockItem(yellowShulkerStone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(yellowShulkerStone.getRegistryName()),
					limeShulkerStoneItem = new BlockItem(limeShulkerStone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(limeShulkerStone.getRegistryName()),
					pinkShulkerStoneItem = new BlockItem(pinkShulkerStone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(pinkShulkerStone.getRegistryName()),
					grayShulkerStoneItem = new BlockItem(grayShulkerStone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(grayShulkerStone.getRegistryName()),
					lightGrayShulkerStoneItem = new BlockItem(lightGrayShulkerStone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(lightGrayShulkerStone.getRegistryName()),
					cyanShulkerStoneItem = new BlockItem(cyanShulkerStone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(cyanShulkerStone.getRegistryName()),
					purpleShulkerStoneItem = new BlockItem(purpleShulkerStone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(purpleShulkerStone.getRegistryName()),
					blueShulkerStoneItem = new BlockItem(blueShulkerStone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(blueShulkerStone.getRegistryName()),
					brownShulkerStoneItem = new BlockItem(brownShulkerStone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(brownShulkerStone.getRegistryName()),
					greenShulkerStoneItem = new BlockItem(greenShulkerStone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(greenShulkerStone.getRegistryName()),
					redShulkerStoneItem = new BlockItem(redShulkerStone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(redShulkerStone.getRegistryName()),
					blackShulkerStoneItem = new BlockItem(blackShulkerStone, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(blackShulkerStone.getRegistryName())
			);
		}

	}


}
