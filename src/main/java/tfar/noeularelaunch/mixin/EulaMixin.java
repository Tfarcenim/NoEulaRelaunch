package tfar.noeularelaunch.mixin;

import net.minecraft.server.Eula;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Eula.class)
public class EulaMixin {
	@Inject(at = @At("HEAD"), method = "hasAgreedToEULA",cancellable = true)
	private void alwaysAgreeToEula(CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(true);
	}
}
