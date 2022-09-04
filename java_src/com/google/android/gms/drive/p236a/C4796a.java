package com.google.android.gms.drive.p236a;

import android.content.Context;
import android.database.CursorIndexOutOfBoundsException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.common.data.AbstractC4522b;
import com.google.android.gms.drive.internal.C4938by;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.google.android.gms.drive.a.a */
/* loaded from: classes2.dex */
public class C4796a<T> extends BaseAdapter {

    /* renamed from: a */
    private final Context f17552a;

    /* renamed from: b */
    private final int f17553b;

    /* renamed from: c */
    private int f17554c;

    /* renamed from: d */
    private final int f17555d;

    /* renamed from: e */
    private final List<AbstractC4522b<T>> f17556e;

    /* renamed from: f */
    private final LayoutInflater f17557f;

    /* renamed from: g */
    private boolean f17558g;

    public C4796a(Context context, int i) {
        this(context, i, 0, new ArrayList());
    }

    public C4796a(Context context, int i, int i2) {
        this(context, i, i2, new ArrayList());
    }

    public C4796a(Context context, int i, int i2, List<AbstractC4522b<T>> list) {
        this.f17558g = true;
        this.f17552a = context;
        this.f17554c = i;
        this.f17553b = i;
        this.f17555d = i2;
        this.f17556e = list;
        this.f17557f = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public C4796a(Context context, int i, int i2, AbstractC4522b<T>... abstractC4522bArr) {
        this(context, i, i2, Arrays.asList(abstractC4522bArr));
    }

    public C4796a(Context context, int i, List<AbstractC4522b<T>> list) {
        this(context, i, 0, list);
    }

    public C4796a(Context context, int i, AbstractC4522b<T>... abstractC4522bArr) {
        this(context, i, 0, Arrays.asList(abstractC4522bArr));
    }

    /* renamed from: a */
    private View m22708a(int i, View view, ViewGroup viewGroup, int i2) {
        View inflate = view == null ? this.f17557f.inflate(i2, viewGroup, false) : view;
        try {
            TextView textView = this.f17555d == 0 ? (TextView) inflate : (TextView) inflate.findViewById(this.f17555d);
            T item = getItem(i);
            if (item instanceof CharSequence) {
                textView.setText((CharSequence) item);
            } else {
                textView.setText(item.toString());
            }
            return inflate;
        } catch (ClassCastException e) {
            C4938by.m22379a("DataBufferAdapter", e, "You must supply a resource ID for a TextView");
            throw new IllegalStateException("DataBufferAdapter requires the resource ID to be a TextView", e);
        }
    }

    /* renamed from: a */
    public void m22710a() {
        for (AbstractC4522b<T> abstractC4522b : this.f17556e) {
            abstractC4522b.mo7804b();
        }
        this.f17556e.clear();
        if (this.f17558g) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void m22709a(int i) {
        this.f17554c = i;
    }

    /* renamed from: a */
    public void m22707a(AbstractC4522b<T> abstractC4522b) {
        this.f17556e.add(abstractC4522b);
        if (this.f17558g) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void m22706a(boolean z) {
        this.f17558g = z;
    }

    /* renamed from: b */
    public Context m22705b() {
        return this.f17552a;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int i = 0;
        Iterator<AbstractC4522b<T>> it2 = this.f17556e.iterator();
        while (true) {
            int i2 = i;
            if (it2.hasNext()) {
                i = it2.next().mo23826c() + i2;
            } else {
                return i2;
            }
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return m22708a(i, view, viewGroup, this.f17554c);
    }

    @Override // android.widget.Adapter
    public T getItem(int i) {
        int i2 = i;
        for (AbstractC4522b<T> abstractC4522b : this.f17556e) {
            int mo23826c = abstractC4522b.mo23826c();
            if (mo23826c > i2) {
                try {
                    return abstractC4522b.mo9715a(i2);
                } catch (CursorIndexOutOfBoundsException e) {
                    throw new CursorIndexOutOfBoundsException(i, getCount());
                }
            }
            i2 -= mo23826c;
        }
        throw new CursorIndexOutOfBoundsException(i, getCount());
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return m22708a(i, view, viewGroup, this.f17553b);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f17558g = true;
    }
}
