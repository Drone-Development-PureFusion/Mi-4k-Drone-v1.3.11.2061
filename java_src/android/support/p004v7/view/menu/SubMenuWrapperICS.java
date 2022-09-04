package android.support.p004v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p001v4.internal.view.SupportSubMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.SubMenuWrapperICS */
/* loaded from: classes.dex */
public class SubMenuWrapperICS extends MenuWrapperICS implements SubMenu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SubMenuWrapperICS(Context context, SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        mo40029getWrappedObject().clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return getMenuItemWrapper(mo40029getWrappedObject().getItem());
    }

    @Override // android.support.p004v7.view.menu.BaseWrapper
    /* renamed from: getWrappedObject */
    public SupportSubMenu mo40029getWrappedObject() {
        return (SupportSubMenu) this.mWrappedObject;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        mo40029getWrappedObject().setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        mo40029getWrappedObject().setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        mo40029getWrappedObject().setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        mo40029getWrappedObject().setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        mo40029getWrappedObject().setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        mo40029getWrappedObject().setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        mo40029getWrappedObject().setIcon(drawable);
        return this;
    }
}
