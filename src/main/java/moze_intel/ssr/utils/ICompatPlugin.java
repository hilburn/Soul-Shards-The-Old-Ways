package moze_intel.ssr.utils;

public interface ICompatPlugin {
	// Mod ID the plugin handles
	public abstract String getModId();

	// Called during TCon Init
	public abstract void init();

	// Called during TCon PostInit
	public abstract void postInit();

	// Called during TCon PreInit
	public abstract void preInit();
}