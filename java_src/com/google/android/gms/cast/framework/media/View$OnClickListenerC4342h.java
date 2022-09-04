package com.google.android.gms.cast.framework.media;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.gms.C3424R;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.cast.framework.media.h */
/* loaded from: classes2.dex */
public class View$OnClickListenerC4342h extends ArrayAdapter<MediaTrack> implements View.OnClickListener {

    /* renamed from: a */
    private final Context f16436a;

    /* renamed from: b */
    private int f16437b;

    /* renamed from: com.google.android.gms.cast.framework.media.h$a */
    /* loaded from: classes2.dex */
    private class C4344a {

        /* renamed from: a */
        final TextView f16438a;

        /* renamed from: b */
        final RadioButton f16439b;

        private C4344a(TextView textView, RadioButton radioButton) {
            this.f16438a = textView;
            this.f16439b = radioButton;
        }
    }

    public View$OnClickListenerC4342h(Context context, List<MediaTrack> list, int i) {
        super(context, C3424R.layout.cast_tracks_chooser_dialog_row_layout, list == null ? new ArrayList<>() : list);
        this.f16437b = -1;
        this.f16436a = context;
        this.f16437b = i;
    }

    /* renamed from: a */
    public MediaTrack m24478a() {
        if (this.f16437b < 0 || this.f16437b >= getCount()) {
            return null;
        }
        return getItem(this.f16437b);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C4344a c4344a;
        View view2;
        if (view == null) {
            View inflate = ((LayoutInflater) this.f16436a.getSystemService("layout_inflater")).inflate(C3424R.layout.cast_tracks_chooser_dialog_row_layout, viewGroup, false);
            c4344a = new C4344a((TextView) inflate.findViewById(C3424R.C3426id.text), (RadioButton) inflate.findViewById(C3424R.C3426id.radio));
            inflate.setTag(c4344a);
            view2 = inflate;
        } else {
            c4344a = (C4344a) view.getTag();
            view2 = view;
        }
        if (c4344a == null) {
            return null;
        }
        c4344a.f16439b.setTag(Integer.valueOf(i));
        c4344a.f16439b.setChecked(this.f16437b == i);
        view2.setOnClickListener(this);
        String m25025f = getItem(i).m25025f();
        if (TextUtils.isEmpty(m25025f)) {
            m25025f = this.f16436a.getString(C3424R.C3427string.cast_tracks_chooser_dialog_default_track_name, Integer.valueOf(i));
        }
        c4344a.f16438a.setText(m25025f);
        return view2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f16437b = ((Integer) ((C4344a) view.getTag()).f16439b.getTag()).intValue();
        notifyDataSetChanged();
    }
}
