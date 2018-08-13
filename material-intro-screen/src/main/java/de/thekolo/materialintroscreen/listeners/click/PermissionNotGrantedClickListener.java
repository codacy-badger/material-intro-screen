package de.thekolo.materialintroscreen.listeners.click;

import android.view.View;

import de.thekolo.materialintroscreen.MaterialIntroActivity;
import de.thekolo.materialintroscreen.animations.ViewTranslationWrapper;

public class PermissionNotGrantedClickListener implements View.OnClickListener {
    private final MaterialIntroActivity activity;
    private final ViewTranslationWrapper translationWrapper;

    public PermissionNotGrantedClickListener(MaterialIntroActivity activity, ViewTranslationWrapper translationWrapper) {
        this.activity = activity;
        this.translationWrapper = translationWrapper;
    }

    @Override
    public void onClick(View v) {
        translationWrapper.error();
        activity.showPermissionsNotGrantedError();
    }
}