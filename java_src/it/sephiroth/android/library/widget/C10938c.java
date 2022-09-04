package it.sephiroth.android.library.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: it.sephiroth.android.library.widget.c */
/* loaded from: classes2.dex */
public class C10938c implements Filterable, WrapperListAdapter {

    /* renamed from: c */
    static final ArrayList<HListView.C10934b> f35274c = new ArrayList<>();

    /* renamed from: a */
    ArrayList<HListView.C10934b> f35275a;

    /* renamed from: b */
    ArrayList<HListView.C10934b> f35276b;

    /* renamed from: d */
    boolean f35277d;

    /* renamed from: e */
    private final ListAdapter f35278e;

    /* renamed from: f */
    private final boolean f35279f;

    public C10938c(ArrayList<HListView.C10934b> arrayList, ArrayList<HListView.C10934b> arrayList2, ListAdapter listAdapter) {
        this.f35278e = listAdapter;
        this.f35279f = listAdapter instanceof Filterable;
        if (arrayList == null) {
            this.f35275a = f35274c;
        } else {
            this.f35275a = arrayList;
        }
        if (arrayList2 == null) {
            this.f35276b = f35274c;
        } else {
            this.f35276b = arrayList2;
        }
        this.f35277d = m2644a(this.f35275a) && m2644a(this.f35276b);
    }

    /* renamed from: a */
    private boolean m2644a(ArrayList<HListView.C10934b> arrayList) {
        if (arrayList != null) {
            Iterator<HListView.C10934b> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!it2.next().f35208c) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public int m2646a() {
        return this.f35275a.size();
    }

    /* renamed from: a */
    public boolean m2645a(View view) {
        boolean z = false;
        for (int i = 0; i < this.f35275a.size(); i++) {
            if (this.f35275a.get(i).f35206a == view) {
                this.f35275a.remove(i);
                if (m2644a(this.f35275a) && m2644a(this.f35276b)) {
                    z = true;
                }
                this.f35277d = z;
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        if (this.f35278e != null) {
            return this.f35277d && this.f35278e.areAllItemsEnabled();
        }
        return true;
    }

    /* renamed from: b */
    public int m2643b() {
        return this.f35276b.size();
    }

    /* renamed from: b */
    public boolean m2642b(View view) {
        boolean z = false;
        for (int i = 0; i < this.f35276b.size(); i++) {
            if (this.f35276b.get(i).f35206a == view) {
                this.f35276b.remove(i);
                if (m2644a(this.f35275a) && m2644a(this.f35276b)) {
                    z = true;
                }
                this.f35277d = z;
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f35278e != null ? m2643b() + m2646a() + this.f35278e.getCount() : m2643b() + m2646a();
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f35279f) {
            return ((Filterable) this.f35278e).getFilter();
        }
        return null;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        int m2646a = m2646a();
        if (i < m2646a) {
            return this.f35275a.get(i).f35207b;
        }
        int i2 = i - m2646a;
        int i3 = 0;
        return (this.f35278e == null || i2 >= (i3 = this.f35278e.getCount())) ? this.f35276b.get(i2 - i3).f35207b : this.f35278e.getItem(i2);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        int i2;
        int m2646a = m2646a();
        if (this.f35278e == null || i < m2646a || (i2 = i - m2646a) >= this.f35278e.getCount()) {
            return -1L;
        }
        return this.f35278e.getItemId(i2);
    }

    @Override // android.widget.Adapter
    public int getItemViewType(int i) {
        int i2;
        int m2646a = m2646a();
        if (this.f35278e == null || i < m2646a || (i2 = i - m2646a) >= this.f35278e.getCount()) {
            return -2;
        }
        return this.f35278e.getItemViewType(i2);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int m2646a = m2646a();
        if (i < m2646a) {
            return this.f35275a.get(i).f35206a;
        }
        int i2 = i - m2646a;
        int i3 = 0;
        return (this.f35278e == null || i2 >= (i3 = this.f35278e.getCount())) ? this.f35276b.get(i2 - i3).f35206a : this.f35278e.getView(i2, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public int getViewTypeCount() {
        if (this.f35278e != null) {
            return this.f35278e.getViewTypeCount();
        }
        return 1;
    }

    @Override // android.widget.WrapperListAdapter
    public ListAdapter getWrappedAdapter() {
        return this.f35278e;
    }

    @Override // android.widget.Adapter
    public boolean hasStableIds() {
        if (this.f35278e != null) {
            return this.f35278e.hasStableIds();
        }
        return false;
    }

    @Override // android.widget.Adapter
    public boolean isEmpty() {
        return this.f35278e == null || this.f35278e.isEmpty();
    }

    @Override // android.widget.ListAdapter
    public boolean isEnabled(int i) {
        int m2646a = m2646a();
        if (i < m2646a) {
            return this.f35275a.get(i).f35208c;
        }
        int i2 = i - m2646a;
        int i3 = 0;
        return (this.f35278e == null || i2 >= (i3 = this.f35278e.getCount())) ? this.f35276b.get(i2 - i3).f35208c : this.f35278e.isEnabled(i2);
    }

    @Override // android.widget.Adapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f35278e != null) {
            this.f35278e.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f35278e != null) {
            this.f35278e.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
