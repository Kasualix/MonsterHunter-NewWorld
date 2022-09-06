package com.carro1001.mhnw.registration;

import com.carro1001.mhnw.entities.*;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.carro1001.mhnw.registration.ModEntities.*;
import static com.carro1001.mhnw.utils.MHNWReferences.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistrationHelper {
    @SubscribeEvent
    public static void onAttributeCreate(EntityAttributeCreationEvent event) {
        event.put(APTONOTH.get(), AptonothEntity.prepareAttributes().build());
        event.put(RATHIAN.get(), RathianEntity.prepareAttributes().build());
        event.put(RATHALOS.get(), RathalosEntity.prepareAttributes().build());
        event.put(BITTERBUG.get(), BitterbugEntity.prepareAttributes().build());
        event.put(TOAD.get(), ToadEntity.prepareAttributes().build());
        event.put(BLANGO.get(), BlangoEntity.prepareAttributes().build());
        event.put(BLANGONGA.get(), BlangongaEntity.prepareAttributes().build());
        event.put(IZUCHI.get(), IzuchiEntity.prepareAttributes().build());
        event.put(GIZUCHI.get(), GreatIzuchiEntity.prepareAttributes().build());
        event.put(ZINOGRE.get(), ZinogreEntity.prepareAttributes().build());

    }
}