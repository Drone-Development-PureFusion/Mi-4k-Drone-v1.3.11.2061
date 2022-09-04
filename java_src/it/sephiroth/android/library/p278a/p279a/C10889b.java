package it.sephiroth.android.library.p278a.p279a;

import android.annotation.TargetApi;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import it.sephiroth.android.library.widget.AbsHListView;
/* renamed from: it.sephiroth.android.library.a.a.b */
/* loaded from: classes2.dex */
public class C10889b implements AbstractActionMode$CallbackC10888a {

    /* renamed from: a */
    private AbstractActionMode$CallbackC10888a f34899a;

    /* renamed from: b */
    private AbsHListView f34900b;

    public C10889b(AbsHListView absHListView) {
        this.f34900b = absHListView;
    }

    @Override // it.sephiroth.android.library.p278a.p279a.AbstractActionMode$CallbackC10888a
    @TargetApi(11)
    /* renamed from: a */
    public void mo2938a(ActionMode actionMode, int i, long j, boolean z) {
        this.f34899a.mo2938a(actionMode, i, j, z);
        if (this.f34900b.getCheckedItemCount() == 0) {
            actionMode.finish();
        }
    }

    /* renamed from: a */
    public void m2937a(AbstractActionMode$CallbackC10888a abstractActionMode$CallbackC10888a) {
        this.f34899a = abstractActionMode$CallbackC10888a;
    }

    /* renamed from: a */
    public boolean m2939a() {
        return this.f34899a != null;
    }

    @Override // android.view.ActionMode.Callback
    @TargetApi(11)
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f34899a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    @TargetApi(11)
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (this.f34899a.onCreateActionMode(actionMode, menu)) {
            this.f34900b.setLongClickable(false);
            return true;
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    @TargetApi(11)
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f34899a.onDestroyActionMode(actionMode);
        this.f34900b.f35006u = null;
        this.f34900b.m2922a();
        this.f34900b.f35098aK = true;
        this.f34900b.A();
        this.f34900b.requestLayout();
        this.f34900b.setLongClickable(true);
    }

    @Override // android.view.ActionMode.Callback
    @TargetApi(11)
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f34899a.onPrepareActionMode(actionMode, menu);
    }
}
