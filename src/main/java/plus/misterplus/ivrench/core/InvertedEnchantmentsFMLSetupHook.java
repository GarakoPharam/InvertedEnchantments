package plus.misterplus.ivrench.core;

import net.minecraftforge.fml.relauncher.IFMLCallHook;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

import java.util.Map;

public class InvertedEnchantmentsFMLSetupHook implements IFMLCallHook {

    @Override
    public void injectData(Map<String, Object> data) {
    }

    @Override
    public Void call() {
        MixinBootstrap.init();
        Mixins.addConfiguration("mixins.ivrench.json");
        return null;
    }
}
