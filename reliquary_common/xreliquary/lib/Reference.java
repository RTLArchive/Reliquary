package xreliquary.lib;

import net.minecraft.util.ResourceLocation;

public class Reference {
	// class for all the mod related constants
	public static final String VERSION = "1.5.2";
	public static final String MOD_ID = "xreliquary";
	public static final String MOD_NAME = "Xeno's Reliquary";
	public static final String CLIENT_PROXY = "xreliquary.client.ClientProxy";
	public static final String COMMON_PROXY = "xreliquary.common.CommonProxy";
	// these are ugly, but thankfully I'll probably be getting rid of them soon.
	public static final int WATER_SPRITE = 0;
	public static final int SPLASH_POTION_SPRITE = 1;
	public static final int GRENADE_SPRITE = 12;
	// gunpowder cost, may eventually be made configurable.
	public static final int DESTRUCTION_CATALYST_COST = 3;
	// the amount of capacity each upgrade yields. may eventually be made
	// configurable.
	public static final int CAPACITY_UPGRADE_INCREMENT = 64;
	// the limit to any amount of capacity increases. this will have a hard
	// coded config
	// cap of 32000, regardless of how high it is set.
	public static final int CAPACITY_UPGRADE_MAXIMUM = 32000;
	// art path constants
	public static final String ART_PATH_ENTITIES = "textures/entities/";
	public static final ResourceLocation THROWN_ITEM_SPRITES = getResourceLocation("thrownItemsSheet.png");
	public static final String MODEL_TEXTURE_PATH = "textures/models/";
	//public static final String HANDGUN_TEXTURE = MODEL_TEXTURE_PATH + "handgun.png";
	public static final ResourceLocation HANDGUN_TEXTURE = getResourceLocation(MODEL_TEXTURE_PATH + "handgun.png");
	// these are the shot paths which will probably be removed soon
	public static final ResourceLocation NEUTRAL = getResourceLocation(ART_PATH_ENTITIES + "neutralShot.png");
	public static final ResourceLocation EXORCISM = getResourceLocation(ART_PATH_ENTITIES + "exorcismShot.png");
	public static final ResourceLocation BLAZE = getResourceLocation(ART_PATH_ENTITIES + "blazeShot.png");
	public static final ResourceLocation ENDER = getResourceLocation(ART_PATH_ENTITIES + "enderShot.png");
	public static final ResourceLocation CONCUSSIVE = getResourceLocation(ART_PATH_ENTITIES + "concussiveShot.png");
	public static final ResourceLocation BUSTER = getResourceLocation(ART_PATH_ENTITIES + "busterShot.png");
	public static final ResourceLocation SEEKER = getResourceLocation(ART_PATH_ENTITIES + "seekerShot.png");
	public static final ResourceLocation SAND = getResourceLocation(ART_PATH_ENTITIES + "sandShot.png");
	public static final ResourceLocation STORM = getResourceLocation(ART_PATH_ENTITIES + "stormShot.png");
	
	// sound path constants
	public static final String SOUND_PREFIX = "xreliquary:";
	public static final String SOUND_RESOURCE_LOCATION = SOUND_PREFIX;
	
	public static final String LOAD_SOUND = SOUND_PREFIX + "load";
	public static final String SHOT_SOUND = SOUND_PREFIX + "shot";
	public static final String[] soundFiles = { SOUND_RESOURCE_LOCATION + "load.ogg", SOUND_RESOURCE_LOCATION + "shot.ogg" };
	// Misc options for configuration
	public static final boolean DISABLE_COIN_AUDIO_DEFAULT = false;
	public static final boolean DISABLE_GUN_ITEMS_DEFAULT = false;
	public static final boolean DISABLE_POTION_ITEMS_DEFAULT = false;
	
	private static ResourceLocation getResourceLocation(String string) {
		return new ResourceLocation(MOD_ID.toLowerCase(), string);
	}
	
	
}
