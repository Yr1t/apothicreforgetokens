
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.yrit.apotheosisreforgetoken.init;

import net.yrit.apotheosisreforgetoken.item.HeirloomTokenItem;
import net.yrit.apotheosisreforgetoken.item.EsotericTokenItem;
import net.yrit.apotheosisreforgetoken.item.ArtifactTokenItem;
import net.yrit.apotheosisreforgetoken.item.AncientTokenItem;
import net.yrit.apotheosisreforgetoken.ApotheosisReforgeTokenMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class ApotheosisReforgeTokenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ApotheosisReforgeTokenMod.MODID);
	public static final RegistryObject<Item> HEIRLOOM_TOKEN = REGISTRY.register("heirloom_token", () -> new HeirloomTokenItem());
	public static final RegistryObject<Item> ARTIFACT_TOKEN = REGISTRY.register("artifact_token", () -> new ArtifactTokenItem());
	public static final RegistryObject<Item> ANCIENT_TOKEN = REGISTRY.register("ancient_token", () -> new AncientTokenItem());
	public static final RegistryObject<Item> ESOTERIC_TOKEN = REGISTRY.register("esoteric_token", () -> new EsotericTokenItem());
	// Start of user code block custom items
	// End of user code block custom items
}
