package dev.bladeender.utilsplugin;

import dev.bladeender.utilsplugin.comands.FeedCommand;
import dev.bladeender.utilsplugin.comands.FlyCommand;
import dev.bladeender.utilsplugin.comands.GodCommand;
import dev.bladeender.utilsplugin.listeners.GuiListeners;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

    @Override
    public void onEnable()
    {
        saveDefaultConfig();
        new GodCommand(this);
        new GuiListeners(this);
        new FeedCommand(this);
        new FlyCommand(this);
    }

}
