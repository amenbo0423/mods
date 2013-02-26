package amenbo0423.mods.omurice;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(
	modid = "Omurice",
	name = "Omurice",
	version = "0.0.1"
)
@NetworkMod(
	clientSideRequired = true,
	serverSideRequired = false
)
public class Omurice {
/*
	@SidedProxy(
		clientSide = "amenbo0423.mods.omurice.client.ClientProxy",
		serverSide = "amenbo0423.mods.omurice.CommonProxy"
	)
	public static CommonProxy proxy;
*/
	public static Item itemOmurice;

	@Mod.Init
	public void init(FMLInitializationEvent event){
		itemOmurice = (new ItemOmurice(423))
			.setIconCoord(11, 0)
			.setItemName("itemOmurice")
			.setCreativeTab(CreativeTabs.tabFood);

		LanguageRegistry.addName(itemOmurice, "Omurice");
		LanguageRegistry.instance().addNameForObject(itemOmurice, "ja_JP", "オムライス");

		GameRegistry.addRecipe(
			new ItemStack(itemOmurice, 1),
			new Object[]
			{
				Item.egg, Item.wheat
			});
	}
}
