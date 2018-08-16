package de.thekolo.materialintroscreen.animations.wrappers;

import android.view.View;

import de.thekolo.materialintroscreen.R;
import de.thekolo.materialintroscreen.animations.ViewTranslationWrapper;
import de.thekolo.materialintroscreen.animations.translations.DefaultPositionTranslation;
import de.thekolo.materialintroscreen.animations.translations.ExitDefaultTranslation;

public class NextButtonTranslationWrapper extends ViewTranslationWrapper {
    public NextButtonTranslationWrapper(View view) {
        super(view);

        setExitTranslation(new ExitDefaultTranslation())
                .setDefaultTranslation(new DefaultPositionTranslation())
                .setErrorAnimation(R.anim.mis_shake_it);
    }
}