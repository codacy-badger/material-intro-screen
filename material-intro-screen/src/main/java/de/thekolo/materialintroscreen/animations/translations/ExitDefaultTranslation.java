package de.thekolo.materialintroscreen.animations.translations;

import android.support.annotation.FloatRange;
import android.view.View;

import de.thekolo.materialintroscreen.R;
import de.thekolo.materialintroscreen.animations.IViewTranslation;

public class ExitDefaultTranslation implements IViewTranslation {
    @Override
    public void translate(View view, @FloatRange(from = 0, to = 1.0) float percentage) {
        view.setTranslationY(percentage * view.getResources().getDimensionPixelOffset(R.dimen.mis_y_offset));
    }
}
