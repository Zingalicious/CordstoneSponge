package us.zingalicio.cordstone.index;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import org.spongepowered.api.block.BlockType;
import org.spongepowered.api.block.BlockTypes;
import org.spongepowered.api.effect.sound.SoundType;
import org.spongepowered.api.effect.sound.SoundTypes;

public enum Block 
{
	AIR(BlockTypes.AIR, null, "Air", "air", "nothing"),
	STONE(BlockTypes.STONE, SoundTypes.DIG_STONE, "Stone", "stone", "rock"),
	GRASS(BlockTypes.GRASS, SoundTypes.DIG_GRASS, "Grass", "grass"),
	DIRT(BlockTypes.DIRT, SoundTypes.DIG_GRAVEL, "Dirt", "dirt"),
	COBBLESTONE(BlockTypes.COBBLESTONE, SoundTypes.DIG_STONE, "Cobblestone", "cobblestone", "cobble"),
	PLANKS(BlockTypes.PLANKS, SoundTypes.DIG_WOOD, "Planks", "planks", "wood", "plank"),
	SAPLING(BlockTypes.SAPLING, SoundTypes.DIG_GRASS, "Sapling", "sapling"),
	BEDROCK(BlockTypes.BEDROCK, SoundTypes.DIG_STONE, "Bedrock", "bedrock", "adamantite"),
	FLOWING_WATER(BlockTypes.FLOWING_WATER, SoundTypes.SPLASH, "Water", "flowingwater", "waterblock", "movingwater"),
	STATIONARY_WATER(BlockTypes.WATER, SoundTypes.SPLASH, "Stationary Water", "stationarywater", "watersource"),
	FLOWING_LAVA(BlockTypes.FLOWING_LAVA, SoundTypes.FIZZ, "Lava", "flowinglava", "lavablock", "movinglava"),
	STATIONARY_LAVA(BlockTypes.LAVA, SoundTypes.FIZZ, "Stationary Lava", "stationarylava", "lavasource"),
	SAND(BlockTypes.SAND, SoundTypes.DIG_GRAVEL, "Sand", "sand"),
	GRAVEL(BlockTypes.GRAVEL, SoundTypes.DIG_GRAVEL, "Gravel", "gravel"),
	GOLD_ORE(BlockTypes.GOLD_ORE, SoundTypes.DIG_STONE, "Gold Ore", "goldore"),
	IRON_ORE(BlockTypes.IRON_ORE, SoundTypes.DIG_STONE, "Iron Ore", "ironore"),
	COAL_ORE(BlockTypes.COAL_ORE, SoundTypes.DIG_STONE, "Coal Ore", "coalore"),
	LOG(BlockTypes.LOG, SoundTypes.DIG_WOOD, "Log", "log"),
	LEAVES(BlockTypes.LEAVES, SoundTypes.DIG_GRASS, "Leaves", "leaves"),
	SPONGE(BlockTypes.SPONGE, SoundTypes.DIG_WOOL, "Sponge", "sponge"),
	GLASS(BlockTypes.GLASS, SoundTypes.GLASS, "Glass", "glass", "glass block"),
	LAPIS_LAZULI_ORE(BlockTypes.LAPIS_ORE, SoundTypes.DIG_STONE, "Lapis Lazuli Ore", "lapislazuliore", "lapisore", "lazuliore"),
	LAPIS_LAZULI(BlockTypes.LAPIS_BLOCK, SoundTypes.DIG_STONE, "Lapis Lazuli", "lapislazuliblock", "lapisblock", "lazuliblock"),
	DISPENSER(BlockTypes.DISPENSER, SoundTypes.DIG_STONE, "Dispenser", "dispenser"), //OOOOOOOOOOOOOOOO
	SANDSTONE(BlockTypes.SANDSTONE, SoundTypes.DIG_STONE, "Sandstone", "sandstone"), //OOOOOOOOOOOOOOOO
	NOTE(BlockTypes.NOTEBLOCK, SoundTypes.DIG_WOOD, "Note Block", "noteblock"), //OOOOOOOOOOOOOOOO
	BED(BlockTypes.BED, SoundTypes.DIG_WOOL, "Bed", "bedblock"), //OOOOOOOOOOOOOOOO
	POWERED_RAIL(BlockTypes.GOLDEN_RAIL, SoundTypes.DIG_WOOD, "Powered Rail", "poweredrail", "boostrail", "powerrail"), //OOOOOOOOOOOOOOOO
	DETECTOR_RAIL(BlockTypes.DETECTOR_RAIL, SoundTypes.DIG_WOOD, "Detector Rail", "detectorrail", "redstonerail"), //OOOOOOOOOOOOOOOO
	STICKY_PISTON(BlockTypes.STICKY_PISTON, SoundTypes.DIG_WOOD, "Sticky Piston", "stickypiston", "stickypistonbase"), //OOOOOOOOOOOOOOOO
	COBWEB(BlockTypes.WEB, SoundTypes.DIG_WOOL, "Cobweb", "cobweb", "web", "spiderweb", "webs"),
	SHRUB(BlockTypes.TALLGRASS, SoundTypes.DIG_GRASS, "Shrub", "shrub", "tallgrass", "longgrass"), //OOOOOOOOOOOOOOOO
	DEAD_SHRUB(BlockTypes.DEADBUSH, SoundTypes.DIG_GRASS, "Dead Shrub", "deadshrub", "deadbush", "desertbush"),
	PISTON(BlockTypes.PISTON, SoundTypes.DIG_WOOD, "Piston", "piston", "pistonbase"), //OOOOOOOOOOOOOOOO
	PISTON_HEAD(BlockTypes.PISTON_EXTENSION, SoundTypes.DIG_WOOD, "Piston Head", "pistonhead"), //OOOOOOOOOOOOOOOO
	WOOL(BlockTypes.WOOL, SoundTypes.DIG_WOOL, "Wool", "wool", "cloth", "fabric"), //OOOOOOOOOOOOOOOO
	PISTON_EXTENSION(BlockTypes.PISTON_EXTENSION, SoundTypes.DIG_STONE, "Piston Extension"),
	DANDELION(BlockTypes.YELLOW_FLOWER, SoundTypes.DIG_GRASS, "Dandelion", "dandelion", "yellowflower"),
	FLOWER(BlockTypes.RED_FLOWER, SoundTypes.DIG_GRASS, "Flower", "flower", "rose", "orchid", "tulip"), //OOOOOOOOOOOOOOOO
	BROWN_MUSHROOM(BlockTypes.BROWN_MUSHROOM, SoundTypes.DIG_GRASS, "Brown Mushroom", "brownmushroom", "mushroom"),
	RED_MUSHROOM(BlockTypes.RED_MUSHROOM, SoundTypes.DIG_GRASS, "Red Mushroom", "redmushroom", "magicmushroom"),
	GOLD(BlockTypes.GOLD_BLOCK, SoundTypes.DIG_STONE, "Gold", "goldblock", "blockofgold"),
	IRON(BlockTypes.IRON_BLOCK, SoundTypes.DIG_STONE, "Iron", "ironblock", "blockofiron"),
	DOUBLE_STONE_SLAB(BlockTypes.DOUBLE_STONE_SLAB, SoundTypes.DIG_STONE, "Double Slab", "doubleslab", "doublestoneslab", "fullslab", "doublestep", "doublestonestep"), //OOOOOOOOOOOOOOOO
	STONE_SLAB(BlockTypes.STONE_SLAB, SoundTypes.DIG_STONE, "Slab", "slab", "stoneslab", "step", "stonestep"), //OOOOOOOOOOOOOOOO
	BRICKS(BlockTypes.BRICK_BLOCK, SoundTypes.DIG_STONE, "Bricks", "bricks", "brickblock"),
	TNT(BlockTypes.TNT, SoundTypes.DIG_WOOD, "Explosives", "explosives", "tnt", "dynamite"),
	BOOKSHELF(BlockTypes.BOOKSHELF, SoundTypes.DIG_WOOD, "Bookshelf", "bookshelf", "shelf", "shelves", "bookshelves"),
	MOSSY_COBBLESTONE(BlockTypes.MOSSY_COBBLESTONE, SoundTypes.DIG_STONE, "Mossy Cobblestone", "mossycobblestone", "mossycobble", "wetcobble", "mossstone", "mosscobble", "mosscobblestone"),
	OBSIDIAN(BlockTypes.OBSIDIAN, SoundTypes.DIG_STONE, "Obsidian", "obsidian"),
	TORCH(BlockTypes.TORCH, SoundTypes.DIG_WOOD, "Torch", "torch", "light"), //OOOOOOOOOOOOOOOO
	FIRE(BlockTypes.FIRE, SoundTypes.FIZZ, "Fire", "fire", "flame", "flames"),
	MOB_CAGE(BlockTypes.MOB_SPAWNER, SoundTypes.DIG_STONE, "Mob Cage", "mobcage", "mobspawner", "monstercage", "monsterspawner", "mobspawn"),
	OAK_STAIRS(BlockTypes.OAK_STAIRS, SoundTypes.DIG_WOOD, "Oak Stairs", "oakstairs", "oakstair", "woodstairs", "woodenstairs", "woodstair", "woodenstair"), //1OOOOOOOOOOOOOOO
	REDSTONE_WIRE(BlockTypes.REDSTONE_WIRE, SoundTypes.DIG_STONE, "Redstone Wire", "redstonewire"),
	DIAMOND_ORE(BlockTypes.DIAMOND_ORE, SoundTypes.DIG_STONE, "Diamond Ore", "diamondore"),
	DIAMOND(BlockTypes.DIAMOND_BLOCK, SoundTypes.DIG_STONE, "Diamond Block", "diamondblock", "blockofdiamond"),
	WORKBENCH(BlockTypes.CRAFTING_TABLE, SoundTypes.DIG_WOOD, "Workbench", "workbench", "craftingtable", "workstation", "crafttable", "craftingbench"),
	WHEAT(BlockTypes.WHEAT, SoundTypes.DIG_GRASS, "Wheat", "wheatcrops", "crops", "growingwheat"), //OOOOOOOOOOOOOOOO
	SOIL(BlockTypes.FARMLAND, SoundTypes.DIG_GRAVEL, "Soil", "soil", "farmland", "fertiledirt"), //OOOOOOOOOOOOOOOO
	FURNACE(BlockTypes.FURNACE, SoundTypes.DIG_STONE, "Furnace", "furnace", "oven"), //OOOOOOOOOOOOOOOO
	BURNING_FURNACE(BlockTypes.LIT_FURNACE, SoundTypes.DIG_STONE, "Burning Furnace", "burningfurnace", "litfurnace", "furnaceon"), //OOOOOOOOOOOOOOOO
	SIGN_POST(BlockTypes.STANDING_SIGN, SoundTypes.DIG_WOOD, "Sign Post", "signpost", "standingsign"), //
	OAK_DOOR(BlockTypes.WOODEN_DOOR, SoundTypes.DIG_WOOD, "Oak Door", "oakdoorblock", "wooddoorblock", "woodendoorblock"), //OOOOOOOOOOOOOOOO
	LADDER(BlockTypes.LADDER, SoundTypes.DIG_WOOD, "Ladder", "ladder"), //OOOOOOOOOOOOOOOO
	RAILS(BlockTypes.RAIL, SoundTypes.DIG_WOOD, "Rails", "rails", "rail", "railing", "track", "tracks"), //OOOOOOOOOOOOOOOO
	COBBLESTONE_STAIRS(BlockTypes.STONE_STAIRS, SoundTypes.DIG_STONE, "Cobblestone Stairs", "cobblestonestairs", "cobblestairs", "cobblestonestair", "cobblestair"), //1OOOOOOOOOOOOOOO
	WALL_SIGN(BlockTypes.WALL_SIGN, SoundTypes.DIG_WOOD, "Wall Sign", "wallsign", "mountedsign"), //OOOOOOOOOOOOOOOO
	LEVER(BlockTypes.LEVER, SoundTypes.DIG_WOOD, "Lever", "lever"), //OOOOOOOOOOOOOOOO
	STONE_PRESSURE_PLATE(BlockTypes.STONE_PRESSURE_PLATE, SoundTypes.DIG_STONE, "Stone Pressure Plate", "pressureplate", "pressureplate", "stoneplate"), //OOOOOOOOOOOOOOOO
	IRON_DOOR(BlockTypes.IRON_DOOR, SoundTypes.DIG_STONE, "Iron Door", "irondoorblock", "redstonedoorblock"), //OOOOOOOOOOOOOOOO
	WOODEN_PRESSURE_PLATE(BlockTypes.WOODEN_PRESSURE_PLATE, SoundTypes.DIG_WOOD, "Wooden Pressure Plate", "woodenpressureplate", "woodenplate", "woodplate"), //OOOOOOOOOOOOOOOO
	REDSTONE_ORE(BlockTypes.REDSTONE_ORE, SoundTypes.DIG_STONE, "Redstone Ore", "redstoneore"),
	GLOWING_REDSTONE_ORE(BlockTypes.LIT_REDSTONE_ORE, SoundTypes.DIG_STONE, "Glowing Redstone Ore", "glowingredstoneore", "litredstoneore"),
	REDSTONE_TORCH_OFF(BlockTypes.UNLIT_REDSTONE_TORCH, SoundTypes.DIG_WOOD, "Unpowered Redstone Torch", "depoweredredstonetorch", "unpoweredredstonetorch", "redstonetorchoff"), //OOOOOOOOOOOOOOOO
	REDSTONE_TORCH_ON(BlockTypes.REDSTONE_TORCH, SoundTypes.DIG_WOOD, "Redstone Torch", "redstonetorch", "litredstonetorch", "redstonetorchon"), //OOOOOOOOOOOOOOOO
	STONE_BUTTON(BlockTypes.STONE_BUTTON, SoundTypes.DIG_STONE, "Stone Button", "stonebutton", "button"), //OOOOOOOOOOOOOOOO
	PARTIAL_SNOW(BlockTypes.SNOW_LAYER, SoundTypes.DIG_SNOW, "Partial Snow", "partialsnow", "snowlayer", "thinsnow"), //OOOOOOOOOOOOOOOO
	ICE(BlockTypes.ICE, SoundTypes.GLASS, "Ice", "ice", "iceblock"),
	SNOW(BlockTypes.SNOW, SoundTypes.DIG_SNOW, "Snow", "snow", "snowblock"),
	CACTUS(BlockTypes.CACTUS, SoundTypes.DIG_WOOL, "Cactus", "cactus", "cactusblock"),
	CLAY(BlockTypes.CLAY, SoundTypes.DIG_GRAVEL, "Clay", "clay", "clayblock"),
	SUGAR_CANE(BlockTypes.REEDS, SoundTypes.DIG_GRASS, "Sugar Cane", "sugarcane", "reeds", "reed", "bamboo", "cane"),
	JUKEBOX(BlockTypes.JUKEBOX, SoundTypes.DIG_WOOD, "Jukebox", "jukebox", "musicbox", "boombox"),
	OAK_FENCE(BlockTypes.FENCE, SoundTypes.DIG_WOOD, "Oak Fence", "oakfence", "fence", "woodfence", "woodenfence"),
	PUMPKIN(BlockTypes.PUMPKIN, SoundTypes.DIG_WOOD, "Pumpkin", "pumpkin", "unlitjackolantern"), //OOOOOOOOOOOOOOOO
	NETHERRACK(BlockTypes.NETHERRACK, SoundTypes.DIG_STONE, "Netherrack", "netherrack", "netherstone", "netherrock"),
	SOUL_SAND(BlockTypes.SOUL_SAND, SoundTypes.DIG_GRAVEL, "Soul Sand", "soulsand", "nethersand", "souldirt", "sludge"),
	GLOWSTONE(BlockTypes.GLOWSTONE, SoundTypes.GLASS, "Glowstone", "glowstone", "lightstone"),
	NETHER_PORTAL(BlockTypes.PORTAL, SoundTypes.GLASS, "Nether Portal", "netherportal", "portal", "hellportal"),
	JACK_O_LANTERN(BlockTypes.SEA_LANTERN, SoundTypes.DIG_WOOD, "Jack O' Lantern", "jackolantern", "litpumpkin"), //OOOOOOOOOOOOOOOO
	CAKE(BlockTypes.CAKE, SoundTypes.DIG_WOOL, "Cake", "cakeblock"), //OOOOOOOOOOOOOOOO
	REDSTONE_REPEATER_OFF(BlockTypes.UNPOWERED_REPEATER, SoundTypes.DIG_STONE, "Redstone Repeater", "redstonerepeaterblock"), //OOOOOOOOOOOOOOOO
	REDSTONE_REPEATER_ON(BlockTypes.POWERED_REPEATER, SoundTypes.DIG_STONE, "Powered Redstone Repeater", "redstonerepeaterblockon", "poweredredstonerepeater", "redstonerepeateron"), //OOOOOOOOOOOOOOOO
	STAINED_GLASS(BlockTypes.STAINED_GLASS, SoundTypes.GLASS, "Stained Glass", "stainedglass", "coloredglass", "colouredglass"), //OOOOOOOOOOOOOOOO
	TRAPDOOR(BlockTypes.TRAPDOOR, SoundTypes.DIG_WOOD, "Wooden Trapdoor", "woodentrapdoor", "woodtrapdoor", "trapdoor", "hatch"), //OOOOOOOOOOOOOOOO
	SILVERFISH_BLOCK(BlockTypes.MONSTER_EGG, SoundTypes.DIG_STONE, "Silverfish Block", "silverfishblock", "monsterstone", "silverfishstone", "monstereggblock"), //OOOOOOOOOOOOOOOO
	STONE_BRICKS(BlockTypes.STONEBRICK, SoundTypes.DIG_STONE, "Stone Bricks", "smoothbricks", "stonebricks", "smoothbrick", "stonebrick"), //OOOOOOOOOOOOOOOO
	RED_MUSHROOM_CAP(BlockTypes.RED_MUSHROOM_BLOCK, SoundTypes.DIG_WOOL, "Red Mushroom Cap", "redmushroomcap", "giantredmushroom", "hugeredmushroom", "redmushroomblock"), //OOOOOOOOOOOOOOOO
	BROWN_MUSHROOM_CAP(BlockTypes.BROWN_MUSHROOM_BLOCK, SoundTypes.DIG_WOOL, "Brown Mushroom Cap", "brownmushroomcap", "giantbrownmushroom", "mushroomcap", "giantmushroom", "hugemushroom", "brownmushroomblock", "mushroomblock", "hugebrownmushroom"), //OOOOOOOOOOOOOOOO
	IRON_BARS(BlockTypes.IRON_BARS, SoundTypes.DIG_STONE, "Iron Bars", "ironbars", "metalbars", "ironfence", "metalfence"),
	GLASS_PANE(BlockTypes.GLASS, SoundTypes.GLASS, "Glass Pane", "glasspane", "thinglass", "window"),
	MELON(BlockTypes.MELON_BLOCK, SoundTypes.DIG_WOOD, "Melon", "melonblock", "watermelonblock"),
	PUMPKIN_STEM(BlockTypes.PUMPKIN_STEM, SoundTypes.DIG_GRASS, "Pumpkin Stem", "pumpkinstem"), //OOOOOOOOOOOOOOOO
	MELON_STEM(BlockTypes.MELON_STEM, SoundTypes.DIG_GRASS, "Melon Stem", "melonstem"), //OOOOOOOOOOOOOOOO
	VINES(BlockTypes.VINE, SoundTypes.DIG_GRASS, "Vines", "vines", "vine"), //OOOOOOOOOOOOOOOO
	OAK_FENCE_GATE(BlockTypes.FENCE_GATE, SoundTypes.DIG_WOOD, "Oak Fence Gate", "oakfencegate", "fencegate", "oakgate", "gate"), //OOOOOOOOOOOOOOOO
	BRICK_STAIRS(BlockTypes.BRICK_STAIRS, SoundTypes.DIG_STONE, "Brick Stairs", "brickstairs", "brickstair"), //1OOOOOOOOOOOOOOO
	STONE_BRICK_STAIRS(BlockTypes.BRICK_STAIRS, SoundTypes.DIG_STONE, "Stone Brick Stairs", "stonebrickstairs", "stonebrickstair", "smoothbrickstairs", "smoothbrickstair"), //1OOOOOOOOOOOOOOO
	MYCELLIUM(BlockTypes.MYCELIUM, SoundTypes.DIG_GRASS, "Mycellium", "mycellium", "mycel", "mushroomgrass", "sporegrass", "muck", "graveldirt"),
	LILY_PAD(BlockTypes.WATERLILY, SoundTypes.DIG_GRASS, "Lily Pad", "waterlily", "lilypad", "lily"),
	NETHER_BRICK(BlockTypes.NETHER_BRICK, SoundTypes.DIG_STONE, "Nether Bricks", "netherbricks", "netherbrickblock"),
	NETHER_BRICK_FENCE(BlockTypes.NETHER_BRICK_FENCE, SoundTypes.DIG_STONE, "Nether Brick Fence", "netherbrickfence", "netherfence"),
	NETHER_BRICK_STAIRS(BlockTypes.NETHER_BRICK_STAIRS, SoundTypes.DIG_STONE, "Nether Brick Stairs", "netherbrickstairs", "netherbrickstair", "netherstairs", "netherstair"), //1OOOOOOOOOOOOOOO
	NETHERWART(BlockTypes.NETHER_WART, SoundTypes.DIG_GRASS, "Netherwart", "netherwartblock", "netherstalk", "netherberries"), //OOOOOOOOOOOOOOOO
	ENCHANTMENT_TABLE(BlockTypes.ENCHANTING_TABLE, SoundTypes.DIG_STONE, "Enchantment Table", "enchantmenttable", "enchantingtable"),
	BREWING_STAND(BlockTypes.BREWING_STAND, SoundTypes.DIG_STONE, "Brewing Stand", "brewingstandblock", "potionstandblock", "alchemyblock"), //OOOOOOOOOOOOOOOO
	CAULDRON(BlockTypes.CAULDRON, SoundTypes.DIG_STONE, "Cauldron", "cauldronblock"), //OOOOOOOOOOOOOOOO
	END_PORTAL(BlockTypes.END_PORTAL, SoundTypes.GLASS, "End Portal", "endportal", "enderportal"),
	END_PORTAL_FRAME(BlockTypes.END_PORTAL_FRAME, SoundTypes.DIG_STONE, "End Portal Frame", "enderportalframe", "endportalframe", "portalframe"), //OOOOOOOOOOOOOOOO
	END_STONE(BlockTypes.END_STONE, SoundTypes.DIG_STONE, "End Stone", "endstone", "enderstone"),
	DRAGON_EGG(BlockTypes.DRAGON_EGG, SoundTypes.DIG_STONE, "Dragon Egg", "dragonegg", "enddragonegg", "enderdragonegg"),
	REDSTONE_LAMP_OFF(BlockTypes.REDSTONE_LAMP, SoundTypes.GLASS, "Redstone Lamp", "redstonelamp", "redstonelight"),
	REDSTONE_LAMP_ON(BlockTypes.LIT_REDSTONE_LAMP, SoundTypes.GLASS, "Lit Redstone Lamp", "litredstonelamp", "litredstonelight"),
	DOUBLE_WOOD_SLAB(BlockTypes.DOUBLE_WOODEN_SLAB, SoundTypes.DIG_WOOD, "Wooden Double Slab", "woodendoubleslab", "wooddoubleslab", "woodendoublestep", "wooddoublestep"), //OOOOOOOOOOOOOOOO
	WOOD_SLAB(BlockTypes.WOODEN_SLAB, SoundTypes.DIG_WOOD, "Wooden Slab", "woodenslab", "woodslab", "woodstep", "woodenstep"), //OOOOOOOOOOOOOOOO
	COCOA_BEAN(BlockTypes.COCOA, SoundTypes.DIG_WOOD, "Cocoa Bean", "cocoabean", "cocoaplant"), //OOOOOOOOOOOOOOOO
	SANDSTONE_STAIRS(BlockTypes.SANDSTONE_STAIRS, SoundTypes.DIG_STONE, "Sandstone Stairs", "sandstonestairs", "sandstonestair"), //1OOOOOOOOOOOOOOO
	EMERALD_ORE(BlockTypes.EMERALD_ORE, SoundTypes.DIG_STONE, "Emerald Ore", "emeraldore"),
	ENDER_CHEST(BlockTypes.ENDER_CHEST, SoundTypes.DIG_STONE, "Ender Chest", "enderchest", "endchest"), //OOOOOOOOOOOOOOOO
	TRIPWIRE_HOOK(BlockTypes.TRIPWIRE_HOOK, SoundTypes.DIG_WOOD, "Tripwire Hook", "tripwirehook", "hook"), //OOOOOOOOOOOOOOOO
	TRIPWIRE(BlockTypes.TRIPWIRE, SoundTypes.DIG_WOOL, "Tripwire", "tripwire"), //OOOOOOOOOOOOOOOO
	EMERALD(BlockTypes.EMERALD_BLOCK, SoundTypes.DIG_STONE, "Emerald", "emeraldblock"),
	SPRUCE_STAIRS(BlockTypes.SPRUCE_STAIRS, SoundTypes.DIG_WOOD, "Spruce Stairs", "sprucestairs", "sprucestair", "pinestairs", "pinestair", "sprucewoodstairs", "sprucewoodstair", "pinewoodstairs", "pinewoodstair"), //1OOOOOOOOOOOOOOO
	BIRCH_STAIRS(BlockTypes.BIRCH_STAIRS, SoundTypes.DIG_WOOD, "Birch Stairs", "birchstairs", "birchstair", "birchwoodstairs", "birchwoodstair"), //1OOOOOOOOOOOOOOO
	JUNGLE_STAIRS(BlockTypes.JUNGLE_STAIRS, SoundTypes.DIG_WOOD, "Jungle Stairs", "junglestairs", "junglestair", "junglewoodstairs", "junglewoodstair"), //1OOOOOOOOOOOOOOO
	COMMAND(BlockTypes.COMMAND_BLOCK, SoundTypes.DIG_STONE, "Command Block", "commandblock"),
	BEACON(BlockTypes.BEACON, SoundTypes.DIG_STONE, "Beacon", "beacon"),
	COBBLESTONE_WALL(BlockTypes.COBBLESTONE_WALL, SoundTypes.DIG_STONE, "Cobblestone Wall", "cobblestonewall", "cobblewall", "stonewall", "wall"), //OOOOOOOOOOOOOOOO
	FLOWER_POT(BlockTypes.FLOWER_POT, SoundTypes.DIG_STONE, "Flower Pot", "flowerpotblock", "potblock"),
	CARROTS(BlockTypes.CARROTS, SoundTypes.DIG_GRASS, "Carrots", "carrotcrops", "carrotblock"), //OOOOOOOOOOOOOOOO
	POTATOES(BlockTypes.POTATOES, SoundTypes.DIG_GRASS, "Potatoes", "potatocrops", "potatoblock"), //OOOOOOOOOOOOOOOO
	WOODEN_BUTTON(BlockTypes.WOODEN_BUTTON, SoundTypes.DIG_WOOD, "Wooden Button", "woodenbutton", "woodbutton"), //OOOOOOOOOOOOOOOO
	HEAD(BlockTypes.SKULL, SoundTypes.DIG_STONE, "Head", "head", "skull", "mobhead"), //OOOOOOOOOOOOOOOO
	ANVIL(BlockTypes.ANVIL, SoundTypes.ANVIL_BREAK, "Anvil", "anvil"), //OOOOOOOOOOOOOOOO
	TRAPPED_CHEST(BlockTypes.TRAPPED_CHEST, SoundTypes.DIG_WOOD, "Trapped Chest", "trappedchest", "trapchest"),
	GOLD_PRESSURE_PLATE(BlockTypes.LIGHT_WEIGHTED_PRESSURE_PLATE, SoundTypes.DIG_STONE, "Golden Pressure Plate", "goldenpressureplate", "goldpressureplate", "goldenplate", "goldplate", "lightpressureplate", "lightplate", "lightweightedplate", "lightweightedpressureplate"),
	IRON_PRESSURE_PLATE(BlockTypes.HEAVY_WEIGHTED_PRESSURE_PLATE, SoundTypes.DIG_STONE, "Iron Pressure Plate", "ironpressureplate", "heavyweightedpressureplate", "heavyweightedplate", "ironplate", "heavyplate"),
	REDSTONE_COMPARATOR_OFF(BlockTypes.UNPOWERED_COMPARATOR, SoundTypes.DIG_WOOD, "Redstone Comparator", "redstonecomparator", "unpoweredcomparator", "unpoweredredstonecomparator", "comparator"),
	REDSTONE_COMPARATOR_ON(BlockTypes.POWERED_COMPARATOR, SoundTypes.DIG_WOOD, "Lit Redstone Comparator", "litredstonecomparator", "poweredcomparator", "litcomparator", "poweredredstonecomparator"),
	DAYLIGHT_SENSOR(BlockTypes.DAYLIGHT_DETECTOR, SoundTypes.DIG_WOOD, "Daylight Sensor", "daylightsensor", "daylightdetector", "lightsensor", "lightdetector"),
	REDSTONE(BlockTypes.REDSTONE_BLOCK, SoundTypes.DIG_STONE, "Redstone Block"),
	NETHER_QUARTZ_ORE(BlockTypes.QUARTZ_ORE, SoundTypes.DIG_STONE, "Nether Quartz Ore", "netherquartzore", "quartzore", "netherore"),
	HOPPER(BlockTypes.HOPPER, SoundTypes.DIG_STONE, "Hopper", "funnel"),
	QUARTZ(BlockTypes.QUARTZ_BLOCK, SoundTypes.DIG_STONE, "Quartz Block", "quartzblock", "blockofquartz", "marble"),
	QUARTZ_STAIRS(BlockTypes.QUARTZ_STAIRS, SoundTypes.DIG_STONE, "Quartz Stairs", "quartzstairs", "quartzstair", "marblestair", "marblestairs"),
	ACTIVATOR_RAIL(BlockTypes.ACTIVATOR_RAIL, SoundTypes.DIG_WOOD, "Activator Rail", "activatorrail", "activatorrails"),
	DROPPER(BlockTypes.DROPPER, SoundTypes.DIG_STONE, "Dropper", "dropper"),
	STAINED_CLAY(BlockTypes.STAINED_HARDENED_CLAY, SoundTypes.DIG_STONE, "Stained Clay", "stainedclay", "stainedhardenedclay", "colouredclay", "coloredclay"),
	STAINED_GLASS_PANE(BlockTypes.STAINED_GLASS_PANE, SoundTypes.GLASS, "Stained Glass Pane", "stainedglasspane", "stainedpane", "colouredglasspane"),
	LEAVES2(BlockTypes.LEAVES2, SoundTypes.DIG_GRASS, "Leaves", "leaves2"),
	LOG2(BlockTypes.LOG2, SoundTypes.DIG_WOOD, "Log", "log2"),
	ACACIA_STAIRS(BlockTypes.ACACIA_STAIRS, SoundTypes.DIG_WOOD, "Acacia Stairs", "acaciastairs", "acaciawoodstairs", "acaciastair", "acaciawoodstair"),
	DARK_OAK_STAIRS(BlockTypes.DARK_OAK_STAIRS, SoundTypes.DIG_WOOD, "Dark Oak Stairs", "darkoakstairs", "darkoakstair", "darkoakwoodstairs", "darkoakwoodstair"),
	SLIME(BlockTypes.SLIME, SoundTypes.SLIME_ATTACK, "Slime Block", "slimeblock", "blockofslime"),
	BARRIER(BlockTypes.BARRIER, SoundTypes.DIG_STONE, "Barrier", "barrier", "barrierblock", "invisibleblock"),
	IRON_TRAPDOOR(BlockTypes.IRON_TRAPDOOR, SoundTypes.DIG_STONE, "Iron Trapdoor", "irontrapdoor", "ironhatch", "metaltrapdoor", "metalhatch"),
	PRISMARINE(BlockTypes.PRISMARINE, SoundTypes.DIG_STONE, "Prismarine", "prismarine"),
	SEA_LANTERN(BlockTypes.SEA_LANTERN, SoundTypes.GLASS, "Sea Lantern", "sealantern", "bluelantern"),
	HAY_BALE(BlockTypes.HAY_BLOCK, SoundTypes.DIG_GRASS, "Hay Bale", "haybale", "hayblock", "hay"),
	CARPET(BlockTypes.CARPET, SoundTypes.DIG_WOOL, "Carpet", "carpet", "woolcarpet", "clothcarpet"),
	HARDENED_CLAY(BlockTypes.HARDENED_CLAY, SoundTypes.DIG_STONE, "Hardened Clay", "hardenedclay", "hardclay"),
	COAL(BlockTypes.COAL_BLOCK, SoundTypes.DIG_STONE, "Block of Coal", "blockofcoal", "coalblock"),
	PACKED_ICE(BlockTypes.PACKED_ICE, SoundTypes.GLASS, "Packed Ice", "packedice", "hardenedice", "hardice", "unmeltingice", "opaqueice"),
	SUNFLOWER(BlockTypes.DOUBLE_PLANT, SoundTypes.DIG_GRASS, "Double Plant", "doubleplant", "doublehighplant", "tallplant", "doubletallplant", "doubleblockplant"),
	STANDING_BANNER(BlockTypes.STANDING_BANNER, SoundTypes.DIG_WOOD, "Banner", "banner", "standingbanner"),
	WALL_BANNER(BlockTypes.WALL_BANNER, SoundTypes.DIG_WOOD, "Wall Banner", "wallbanner"),
	INVERTED_DAYLIGHT_SENSOR(BlockTypes.DAYLIGHT_DETECTOR_INVERTED, SoundTypes.DIG_WOOD, "Inverted Daylight Sensor", "inverteddaylightsensor", "inverteddaylightdetector", "invertedlightsensor", "invertedlightdetector"),
	RED_SANDSTONE(BlockTypes.RED_SANDSTONE, SoundTypes.DIG_STONE, "Red Sandstone", "redsandstone"),
	RED_SANDSTONE_STAIRS(BlockTypes.RED_SANDSTONE_STAIRS, SoundTypes.DIG_STONE, "Red Sandstone Stairs", "redsandstonestairs", "redsandstonestair"),
	DOUBLE_RED_SANDSTONE_SLAB(BlockTypes.DOUBLE_STONE_SLAB2, SoundTypes.DIG_STONE, "Double Stone Slab", "doublestoneslab2", "doubleredsandstoneslab", "redsandstonedoubleslab", "doublestonestep2", "doubleredsandstonestep", "redsandstonedoublestep"),
	RED_SANDSTONE_SLAB(BlockTypes.STONE_SLAB2, SoundTypes.DIG_STONE, "Stone Slab", "stoneslab2", "redsandstoneslab", "redsandstonestep", "stonestep2"),
	SPRUCE_FENCE_GATE(BlockTypes.SPRUCE_FENCE_GATE, SoundTypes.DIG_WOOD, "Spruce Fence Gate", "sprucefencegate", "sprucegate", "pinefencegate", "pinegate"),
	BIRCH_FENCE_GATE(BlockTypes.BIRCH_FENCE_GATE, SoundTypes.DIG_WOOD, "Birch Fence Gate", "birchfencegate", "birchgate"),
	JUNGLE_FENCE_GATE(BlockTypes.JUNGLE_FENCE_GATE, SoundTypes.DIG_WOOD, "Jungle Fence Gate", "junglefencegate", "junglegate"),
	DARK_OAK_FENCE_GATE(BlockTypes.DARK_OAK_FENCE_GATE, SoundTypes.DIG_WOOD, "Dark Oak Fence Gate", "darkoakfencegate", "darkoakgate"),
	ACACIA_FENCE_GATE(BlockTypes.ACACIA_FENCE_GATE, SoundTypes.DIG_WOOD, "Acacia Fence Gate", "acaciafencegate", "acaciagate"),
	SPRUCE_FENCE(BlockTypes.SPRUCE_FENCE, SoundTypes.DIG_WOOD, "Spruce Fence", "sprucefence", "pinefence"),
	BIRCH_FENCE(BlockTypes.BIRCH_FENCE, SoundTypes.DIG_WOOD, "Birch Fence", "birchfence"),
	JUNGLE_FENCE(BlockTypes.JUNGLE_FENCE, SoundTypes.DIG_WOOD, "Jungle Fence", "junglefence"),
	DARK_OAK_FENCE(BlockTypes.DARK_OAK_FENCE, SoundTypes.DIG_WOOD, "Dark Oak Fence", "darkoakfence"),
	ACACIA_FENCE(BlockTypes.ACACIA_FENCE, SoundTypes.DIG_WOOD, "Acacia Fence", "acaciafence"),
	SPRUCE_DOOR(BlockTypes.SPRUCE_DOOR, SoundTypes.DIG_WOOD, "Spruce Door", "sprucedoorblock", "pinedoorblock"),
	BIRCH_DOOR(BlockTypes.BIRCH_DOOR, SoundTypes.DIG_WOOD, "Birch Door", "birchdoorblock"),
	JUNGLE_DOOR(BlockTypes.JUNGLE_DOOR, SoundTypes.DIG_WOOD, "Jungle Door", "jungledoorblock"),
	ACACIA_DOOR(BlockTypes.ACACIA_DOOR, SoundTypes.DIG_WOOD, "Acacia Door", "acaciadoorblock"),
	DARK_OAK_DOOR(BlockTypes.DARK_OAK_DOOR, SoundTypes.DIG_WOOD, "Dark Oak Door", "darkoakdoorblock")
	;
	
	
	public final BlockType type;
	public final SoundType sound;
	public final String name;
	private final String[] altNames;
	
	private static final Map<String, Block> lookups = new HashMap<String, Block>();
	
	static
	{
		for (Block block : EnumSet.allOf(Block.class))
		{
			for (String altName : block.altNames)
			{
				lookups.put(altName, block);
			}
		}
	}

	private Block(BlockType type, SoundType sound, String name, String... altNames)
	{
		this.type = type;
		this.sound = sound;
		this.name = name;
		this.altNames = altNames;
	}
	
	public static Block lookup(String name)
	{
		name = name.replace(" ", "").replace("_", "").toLowerCase();
		return lookups.get(name);
	}
}
	