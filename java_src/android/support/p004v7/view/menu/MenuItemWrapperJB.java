package android.support.p004v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.p001v4.internal.view.SupportMenuItem;
import android.support.p001v4.view.ActionProvider;
import android.support.p004v7.view.menu.MenuItemWrapperICS;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(16)
/* renamed from: android.support.v7.view.menu.MenuItemWrapperJB */
/* loaded from: classes.dex */
public class MenuItemWrapperJB extends MenuItemWrapperICS {

    /* renamed from: android.support.v7.view.menu.MenuItemWrapperJB$ActionProviderWrapperJB */
    /* loaded from: classes.dex */
    class ActionProviderWrapperJB extends MenuItemWrapperICS.ActionProviderWrapper implements ActionProvider.VisibilityListener {
        ActionProvider.VisibilityListener mListener;

        public ActionProviderWrapperJB(Context context, android.view.ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // android.support.p001v4.view.ActionProvider
        public boolean isVisible() {
            return this.mInner.isVisible();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.mListener != null) {
                this.mListener.onActionProviderVisibilityChanged(z);
            }
        }

        @Override // android.support.p001v4.view.ActionProvider
        public View onCreateActionView(MenuItem menuItem) {
            return this.mInner.onCreateActionView(menuItem);
        }

        @Override // android.support.p001v4.view.ActionProvider
        public boolean overridesItemVisibility() {
            return this.mInner.overridesItemVisibility();
        }

        @Override // android.support.p001v4.view.ActionProvider
        public void refreshVisibility() {
            this.mInner.refreshVisibility();
        }

        @Override // android.support.p001v4.view.ActionProvider
        public void setVisibilityListener(ActionProvider.VisibilityListener visibilityListener) {
            this.mListener = visibilityListener;
            android.view.ActionProvider actionProvider = this.mInner;
            if (visibilityListener == null) {
                this = null;
            }
            actionProvider.setVisibilityListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuItemWrapperJB(Context context, SupportMenuItem supportMenuItem) {
        super(context, supportMenuItem);
    }

    @Override // android.support.p004v7.view.menu.MenuItemWrapperICS
    MenuItemWrapperICS.ActionProviderWrapper createActionProviderWrapper(android.view.ActionProvider actionProvider) {
        return new ActionProviderWrapperJB(this.mContext, actionProvider);
    }
}
