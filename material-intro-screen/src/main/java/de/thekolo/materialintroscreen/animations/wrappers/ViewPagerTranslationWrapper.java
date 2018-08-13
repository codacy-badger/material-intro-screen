package de.thekolo.materialintroscreen.animations.wrappers;

import android.view.View;

import de.thekolo.materialintroscreen.animations.ViewTranslationWrapper;
import de.thekolo.materialintroscreen.animations.translations.AlphaTranslation;
import de.thekolo.materialintroscreen.animations.translations.DefaultAlphaTranslation;

public class ViewPagerTranslationWrapper extends ViewTranslationWrapper {
    public ViewPagerTranslationWrapper(View view) {
        super(view);

        setDefaultTranslation(new DefaultAlphaTranslation())
                .setExitTranslation(new AlphaTranslation());
    }
}