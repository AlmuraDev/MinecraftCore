package net.technicpack.minecraftcore.launch;

public interface ILaunchOptions {
    String getClientId();
    String getJavaArgs();
    WindowType getLaunchWindowType();
    int getCustomWidth();
    int getCustomHeight();
    boolean shouldUseStencilBuffer();
}
