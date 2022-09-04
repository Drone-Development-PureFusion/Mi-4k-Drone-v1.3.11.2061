package com.google.android.gms.location.places.p246ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.p001v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.gms.C3424R;
import com.google.android.gms.common.C4515b;
import com.google.android.gms.common.C4516c;
import com.google.android.gms.common.C4517d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AbstractC8240d;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.p246ui.C8317a;
import com.google.android.gms.maps.model.LatLngBounds;
/* renamed from: com.google.android.gms.location.places.ui.SupportPlaceAutocompleteFragment */
/* loaded from: classes2.dex */
public class SupportPlaceAutocompleteFragment extends Fragment {

    /* renamed from: a */
    private View f27200a;

    /* renamed from: b */
    private View f27201b;

    /* renamed from: c */
    private EditText f27202c;

    /* renamed from: d */
    private boolean f27203d;
    @Nullable

    /* renamed from: e */
    private LatLngBounds f27204e;
    @Nullable

    /* renamed from: f */
    private AutocompleteFilter f27205f;
    @Nullable

    /* renamed from: g */
    private AbstractC8321c f27206g;

    /* renamed from: a */
    private void m12088a() {
        int i = 0;
        boolean z = !this.f27202c.getText().toString().isEmpty();
        View view = this.f27201b;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m12082b() {
        int i;
        try {
            Intent mo12064a = new C8317a.C8318a(2).m12075a(this.f27204e).m12076a(this.f27205f).m12074a(this.f27202c.getText().toString()).m12077a(1).mo12064a(getActivity());
            this.f27203d = true;
            startActivityForResult(mo12064a, 30421);
            i = -1;
        } catch (C4516c e) {
            int i2 = e.f16879a;
            Log.e("Places", "Could not open autocomplete activity", e);
            i = i2;
        } catch (C4517d e2) {
            int m23905a = e2.m23905a();
            Log.e("Places", "Could not open autocomplete activity", e2);
            i = m23905a;
        }
        if (i != -1) {
            C4515b.m23920a().m23908b(getActivity(), i, 30422);
        }
    }

    /* renamed from: a */
    public void m12087a(@Nullable AutocompleteFilter autocompleteFilter) {
        this.f27205f = autocompleteFilter;
    }

    /* renamed from: a */
    public void m12085a(AbstractC8321c abstractC8321c) {
        this.f27206g = abstractC8321c;
    }

    /* renamed from: a */
    public void m12084a(@Nullable LatLngBounds latLngBounds) {
        this.f27204e = latLngBounds;
    }

    /* renamed from: a */
    public void m12083a(CharSequence charSequence) {
        this.f27202c.setText(charSequence);
        m12088a();
    }

    /* renamed from: b */
    public void m12080b(CharSequence charSequence) {
        this.f27202c.setHint(charSequence);
        this.f27200a.setContentDescription(charSequence);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f27203d = false;
        if (i == 30421) {
            if (i2 == -1) {
                AbstractC8240d m12079a = C8317a.m12079a(getActivity(), intent);
                if (this.f27206g != null) {
                    this.f27206g.m12067a(m12079a);
                }
                m12083a(m12079a.mo12180g().toString());
            } else if (i2 == 2) {
                Status m12078b = C8317a.m12078b(getActivity(), intent);
                if (this.f27206g != null) {
                    this.f27206g.m12068a(m12078b);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C3424R.layout.place_autocomplete_fragment, viewGroup, false);
        this.f27200a = inflate.findViewById(C3424R.C3426id.place_autocomplete_search_button);
        this.f27201b = inflate.findViewById(C3424R.C3426id.place_autocomplete_clear_button);
        this.f27202c = (EditText) inflate.findViewById(C3424R.C3426id.place_autocomplete_search_input);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.gms.location.places.ui.SupportPlaceAutocompleteFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!SupportPlaceAutocompleteFragment.this.f27203d) {
                    SupportPlaceAutocompleteFragment.this.m12082b();
                }
            }
        };
        this.f27200a.setOnClickListener(onClickListener);
        this.f27202c.setOnClickListener(onClickListener);
        this.f27201b.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.location.places.ui.SupportPlaceAutocompleteFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SupportPlaceAutocompleteFragment.this.m12083a("");
            }
        });
        m12088a();
        return inflate;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroyView() {
        this.f27200a = null;
        this.f27201b = null;
        this.f27202c = null;
        super.onDestroyView();
    }
}
