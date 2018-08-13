package de.thekolo.materialintroscreen.animations.wrappers;

import android.view.View;

import de.thekolo.materialintroscreen.animations.ViewTranslationWrapper;
import de.thekolo.materialintroscreen.animations.translations.DefaultPositionTranslation;
import de.thekolo.materialintroscreen.animations.translations.ExitDefaultTranslation;

public class PageIndicatorTranslationWrapper extends ViewTranslationWrapper {
    public PageIndicatorTranslationWrapper(View view) {
        super(view);

        setDefaultTranslation(new DefaultPositionTranslation())
                .setExitTranslation(new ExitDefaultTranslation());
    }
}