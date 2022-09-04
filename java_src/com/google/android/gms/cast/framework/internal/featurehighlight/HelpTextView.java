package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.C3424R;
import com.google.android.gms.internal.C6981fq;
@Keep
/* loaded from: classes2.dex */
public class HelpTextView extends LinearLayout implements AbstractC4275b {

    /* renamed from: ok */
    private TextView f16180ok;

    /* renamed from: ol */
    private TextView f16181ol;

    @Keep
    public HelpTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void zza(TextView textView, @Nullable CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Override // com.google.android.gms.cast.framework.internal.featurehighlight.AbstractC4275b
    @Keep
    public View asView() {
        return this;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f16180ok = (TextView) C6981fq.m15841a((TextView) findViewById(C3424R.C3426id.cast_featurehighlight_help_text_header_view));
        this.f16181ol = (TextView) C6981fq.m15841a((TextView) findViewById(C3424R.C3426id.cast_featurehighlight_help_text_body_view));
    }

    @Override // com.google.android.gms.cast.framework.internal.featurehighlight.AbstractC4275b
    @Keep
    public void setText(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        zza(this.f16180ok, charSequence);
        zza(this.f16181ol, charSequence2);
    }
}
