package de.thekolo.materialintroscreen.animations.wrappers;

import android.view.View;

import de.thekolo.materialintroscreen.animations.ViewTranslationWrapper;
import de.thekolo.materialintroscreen.animations.translations.DefaultPositionTranslation;
import de.thekolo.materialintroscreen.animations.translations.EnterDefaultTranslation;
import de.thekolo.materialintroscreen.animations.translations.ExitDefaultTranslation;

public class SkipButtonTranslationWrapper extends ViewTranslationWrapper {
    public SkipButtonTranslationWrapper(View view) {
        super(view);

        setEnterTranslation(new EnterDefaultTranslation())
                .setDefaultTranslation(new DefaultPositionTranslation())
                .setExitTranslation(new ExitDefaultTranslation());
    }
}