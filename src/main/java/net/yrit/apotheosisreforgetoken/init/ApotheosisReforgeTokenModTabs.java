
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.yrit.apotheosisreforgetoken.init;

import net.yrit.apotheosisreforgetoken.ApotheosisReforgeTokenMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class ApotheosisReforgeTokenModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ApotheosisReforgeTokenMod.MODID);
	public static final RegistryObject<CreativeModeTab> TOKEN_CREATIVE = REGISTRY.register("token_creative",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.apotheosis_reforge_token.token_creative")).icon(() -> new ItemStack(ApotheosisReforgeTokenModItems.ANCIENT_TOKEN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ApotheosisReforgeTokenModItems.HEIRLOOM_TOKEN.get());
				tabData.accept(ApotheosisReforgeTokenModItems.ARTIFACT_TOKEN.get());
				tabData.accept(ApotheosisReforgeTokenModItems.ANCIENT_TOKEN.get());
				tabData.accept(ApotheosisReforgeTokenModItems.ESOTERIC_TOKEN.get());
			})

					.build());
}
