package net.yrit.apotheosisreforgetoken.procedures;

import net.yrit.apotheosisreforgetoken.init.ApotheosisReforgeTokenModItems;
import net.yrit.apotheosisreforgetoken.ApotheosisReforgeTokenMod;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.concurrent.atomic.AtomicReference;

public class AncientTokenRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(40, entity)).getItem() == ApotheosisReforgeTokenModItems.ANCIENT_TOKEN.get()) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Reforging item in main hand in 5 seconds"), true);
			ApotheosisReforgeTokenMod.queueServerWork(20, () -> {
				if ((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(40, entity)).getItem() == ApotheosisReforgeTokenModItems.ANCIENT_TOKEN.get()) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Reforging item in main hand in 4 seconds"), true);
					ApotheosisReforgeTokenMod.queueServerWork(20, () -> {
						if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(40, entity)).getItem() == ApotheosisReforgeTokenModItems.ANCIENT_TOKEN.get()) {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Reforging item in main hand in 3 seconds"), true);
							ApotheosisReforgeTokenMod.queueServerWork(20, () -> {
								if ((new Object() {
									public ItemStack getItemStack(int sltid, Entity entity) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
										return _retval.get();
									}
								}.getItemStack(40, entity)).getItem() == ApotheosisReforgeTokenModItems.ANCIENT_TOKEN.get()) {
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal("Reforging item in main hand in 2 seconds"), true);
									ApotheosisReforgeTokenMod.queueServerWork(20, () -> {
										if ((new Object() {
											public ItemStack getItemStack(int sltid, Entity entity) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
												return _retval.get();
											}
										}.getItemStack(40, entity)).getItem() == ApotheosisReforgeTokenModItems.ANCIENT_TOKEN.get()) {
											if (entity instanceof Player _player && !_player.level().isClientSide())
												_player.displayClientMessage(Component.literal("Reforging item in main hand in 1 seconds"), true);
											ApotheosisReforgeTokenMod.queueServerWork(20, () -> {
												if ((new Object() {
													public ItemStack getItemStack(int sltid, Entity entity) {
														AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
														entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
															_retval.set(capability.getStackInSlot(sltid).copy());
														});
														return _retval.get();
													}
												}.getItemStack(40, entity)).getItem() == ApotheosisReforgeTokenModItems.ANCIENT_TOKEN.get()) {
													if (entity instanceof Player _player) {
														ItemStack _stktoremove = new ItemStack(ApotheosisReforgeTokenModItems.ANCIENT_TOKEN.get());
														_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
													}
													{
														Entity _ent = entity;
														if (!_ent.level().isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																	_ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent),
																	"apoth lootify apotheosis:ancient");
														}
													}
												} else {
													if (entity instanceof Player _player && !_player.level().isClientSide())
														_player.displayClientMessage(Component.literal("You are not holding the token in your offhand! Reforging canceled."), true);
												}
											});
										} else {
											if (entity instanceof Player _player && !_player.level().isClientSide())
												_player.displayClientMessage(Component.literal("You are not holding the token in your offhand! Reforging canceled."), true);
										}
									});
								} else {
									if (entity instanceof Player _player && !_player.level().isClientSide())
										_player.displayClientMessage(Component.literal("You are not holding the token in your offhand! Reforging canceled."), true);
								}
							});
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("You are not holding the token in your offhand! Reforging canceled."), true);
						}
					});
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You are not holding the token in your offhand! Reforging canceled."), true);
				}
			});
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You are not holding this in your offhand!"), true);
		}
	}
}
