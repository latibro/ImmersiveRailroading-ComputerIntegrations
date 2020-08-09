package latibro.immersiverailroading.computerintegrations;

import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = "immersiverailroading-computerintegrations",
        name = "ImmersiveRailroading Computer Integrations",
        version = "0.1.0",
        dependencies = "required-before: immersiverailroading;" +
                "before: opencomputers;" +
                "before: computercraft"
)
public class IRComputerIntegrationsMod {

    @Mod.Instance
    public static IRComputerIntegrationsMod instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("preInit mod");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("init mod");
    }

}
