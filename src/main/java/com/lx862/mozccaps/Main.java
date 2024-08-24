package com.lx862.mozccaps;

import com.lx862.mozccaps.armor.CapArmorMaterial;
import com.lx862.mozccaps.network.Networking;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
	public static final Item CAPS = new ArmorItem(new CapArmorMaterial(), EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));
	public static final Item CAPS_STRAPPED = new ArmorItem(new CapArmorMaterial(), EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("mozc_caps", "caps"), CAPS);
		Registry.register(Registry.ITEM, new Identifier("mozc_caps", "caps_strapped"), CAPS_STRAPPED);
		Networking.registerReceiverServer();
	}
}