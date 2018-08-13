package de.thekolo.materialintroscreen.animations.translations;

import android.support.annotation.FloatRange;
import android.view.View;

import de.thekolo.materialintroscreen.animations.IViewTranslation;

public class NoTranslation implements IViewTranslation {
    @Override
    public void translate(View view, @FloatRange(from = 0, to = 1.0) float percentage) {
        //This method is intentionally left blank, as it should do nothing
    }
}