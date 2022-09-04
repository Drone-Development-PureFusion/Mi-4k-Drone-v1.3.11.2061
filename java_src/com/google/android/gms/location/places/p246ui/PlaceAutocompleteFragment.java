package com.google.android.gms.location.places.p246ui;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
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
@TargetApi(12)
/* renamed from: com.google.android.gms.location.places.ui.PlaceAutocompleteFragment */
/* loaded from: classes2.dex */
public class PlaceAutocompleteFragment extends Fragment {

    /* renamed from: a */
    private View f27191a;

    /* renamed from: b */
    private View f27192b;

    /* renamed from: c */
    private EditText f27193c;

    /* renamed from: d */
    private boolean f27194d;
    @Nullable

    /* renamed from: e */
    private LatLngBounds f27195e;
    @Nullable

    /* renamed from: f */
    private AutocompleteFilter f27196f;
    @Nullable

    /* renamed from: g */
    private AbstractC8321c f27197g;

    /* renamed from: a */
    private void m12097a() {
        int i = 0;
        boolean z = !this.f27193c.getText().toString().isEmpty();
        View view = this.f27192b;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m12091b() {
        int i;
        try {
            Intent mo12064a = new C8317a.C8318a(2).m12075a(this.f27195e).m12076a(this.f27196f).m12074a(this.f27193c.getText().toString()).m12077a(1).mo12064a(getActivity());
            this.f27194d = true;
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
    public void m12096a(@Nullable AutocompleteFilter autocompleteFilter) {
        this.f27196f = autocompleteFilter;
    }

    /* renamed from: a */
    public void m12094a(AbstractC8321c abstractC8321c) {
        this.f27197g = abstractC8321c;
    }

    /* renamed from: a */
    public void m12093a(@Nullable LatLngBounds latLngBounds) {
        this.f27195e = latLngBounds;
    }

    /* renamed from: a */
    public void m12092a(CharSequence charSequence) {
        this.f27193c.setText(charSequence);
        m12097a();
    }

    /* renamed from: b */
    public void m12089b(CharSequence charSequence) {
        this.f27193c.setHint(charSequence);
        this.f27191a.setContentDescription(charSequence);
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f27194d = false;
        if (i == 30421) {
            if (i2 == -1) {
                AbstractC8240d m12079a = C8317a.m12079a(getActivity(), intent);
                if (this.f27197g != null) {
                    this.f27197g.m12067a(m12079a);
                }
                m12092a(m12079a.mo12180g().toString());
            } else if (i2 == 2) {
                Status m12078b = C8317a.m12078b(getActivity(), intent);
                if (this.f27197g != null) {
                    this.f27197g.m12068a(m12078b);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C3424R.layout.place_autocomplete_fragment, viewGroup, false);
        this.f27191a = inflate.findViewById(C3424R.C3426id.place_autocomplete_search_button);
        this.f27192b = inflate.findViewById(C3424R.C3426id.place_autocomplete_clear_button);
        this.f27193c = (EditText) inflate.findViewById(C3424R.C3426id.place_autocomplete_search_input);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.gms.location.places.ui.PlaceAutocompleteFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!PlaceAutocompleteFragment.this.f27194d) {
                    PlaceAutocompleteFragment.this.m12091b();
                }
            }
        };
        this.f27191a.setOnClickListener(onClickListener);
        this.f27193c.setOnClickListener(onClickListener);
        this.f27192b.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.location.places.ui.PlaceAutocompleteFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PlaceAutocompleteFragment.this.m12092a("");
            }
        });
        m12097a();
        return inflate;
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.f27191a = null;
        this.f27192b = null;
        this.f27193c = null;
        super.onDestroyView();
    }
}
