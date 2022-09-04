package com.fimi.soul.module.setting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.p173b.AbstractC1792f;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.fimi.soul.module.setting.a */
/* loaded from: classes.dex */
public abstract class AbstractC2900a implements AbstractC1792f<X11RespCmd> {

    /* renamed from: a */
    private View f10367a;

    /* renamed from: b */
    private ViewGroup f10368b;

    /* renamed from: c */
    private Context f10369c;

    /* renamed from: d */
    private Map<String, View> f10370d = new HashMap();

    /* renamed from: e */
    private LayoutInflater f10371e;

    /* renamed from: f */
    private C1827d f10372f;

    /* renamed from: com.fimi.soul.module.setting.a$a */
    /* loaded from: classes.dex */
    public class C2901a {

        /* renamed from: b */
        private Button f10374b;

        /* renamed from: c */
        private Button f10375c;

        public C2901a() {
        }

        /* renamed from: a */
        public Button m30029a() {
            return this.f10374b;
        }

        /* renamed from: a */
        public void m30028a(Button button) {
            this.f10374b = button;
        }

        /* renamed from: b */
        public Button m30027b() {
            return this.f10375c;
        }

        /* renamed from: b */
        public void m30026b(Button button) {
            this.f10375c = button;
        }
    }

    public AbstractC2900a(Context context) {
        m30047a(context);
        this.f10371e = LayoutInflater.from(context);
        this.f10367a = this.f10371e.inflate(C1704R.layout.layout_camera_setting_main, (ViewGroup) null);
        this.f10368b = (ViewGroup) this.f10367a.findViewById(C1704R.C1706id.lv_viewContent);
    }

    /* renamed from: a */
    private Button m30044a(View view, String str, String str2, View.OnClickListener onClickListener) {
        ((TextView) view.findViewById(C1704R.C1706id.tv_settingTitle)).setText(str);
        Button button = (Button) view.findViewById(C1704R.C1706id.btn_settingAction);
        button.setOnClickListener(onClickListener);
        button.setText(str2);
        m30031e().addView(view);
        return button;
    }

    /* renamed from: a */
    private void m30045a(View view, String str) {
        ((TextView) view.findViewById(C1704R.C1706id.tv_settingTitle)).setText(str);
    }

    /* renamed from: a */
    protected LayoutInflater m30049a() {
        return this.f10371e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public Button m30048a(int i, String str, View.OnClickListener onClickListener) {
        return m30038a(m30030f().getText(i).toString(), str, onClickListener);
    }

    /* renamed from: a */
    protected Button m30041a(String str) {
        return m30040a(str, (View.OnClickListener) null);
    }

    /* renamed from: a */
    protected Button m30040a(String str, View.OnClickListener onClickListener) {
        View inflate = this.f10371e.inflate(C1704R.layout.item_setting_center_button, (ViewGroup) null);
        Button button = (Button) inflate.findViewById(C1704R.C1706id.btn_settingAction);
        button.setText(str);
        button.setOnClickListener(onClickListener);
        m30031e().addView(inflate);
        return button;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public Button m30038a(String str, String str2, View.OnClickListener onClickListener) {
        return m30044a(m30049a().inflate(C1704R.layout.item_setting_short_button, (ViewGroup) null), str, str2, onClickListener);
    }

    /* renamed from: a */
    protected SwitchButton m30037a(String str, boolean z, SwitchButton.AbstractC1695a abstractC1695a) {
        View inflate = m30049a().inflate(C1704R.layout.item_setting_switch_button, (ViewGroup) null);
        ((TextView) inflate.findViewById(C1704R.C1706id.tv_settingTitle)).setText(str);
        SwitchButton switchButton = (SwitchButton) inflate.findViewById(C1704R.C1706id.sb_settingAction);
        switchButton.setSwitchState(z);
        switchButton.setOnSwitchListener(abstractC1695a);
        m30031e().addView(inflate);
        return switchButton;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C2901a m30039a(String str, String str2) {
        View inflate = this.f10371e.inflate(C1704R.layout.item_setting_double_button, (ViewGroup) null);
        C2901a c2901a = new C2901a();
        Button button = (Button) inflate.findViewById(C1704R.C1706id.btn_settingActionFirst);
        button.setText(str);
        Button button2 = (Button) inflate.findViewById(C1704R.C1706id.btn_settingActionSecond);
        button2.setText(str2);
        c2901a.m30028a(button);
        c2901a.m30026b(button2);
        m30031e().addView(inflate);
        return c2901a;
    }

    /* renamed from: a */
    protected void m30047a(Context context) {
        this.f10369c = context;
    }

    /* renamed from: a */
    protected void m30046a(LayoutInflater layoutInflater) {
        this.f10371e = layoutInflater;
    }

    /* renamed from: a */
    protected void m30043a(ViewGroup viewGroup) {
        this.f10368b = viewGroup;
    }

    /* renamed from: a */
    public void m30042a(C1827d c1827d) {
        this.f10372f = c1827d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public View m30036b() {
        return this.f10367a;
    }

    /* renamed from: b */
    protected Button m30034b(String str, String str2, View.OnClickListener onClickListener) {
        return m30044a(m30049a().inflate(C1704R.layout.item_setting_long_button, (ViewGroup) null), str, str2, onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public EditText m30035b(String str, String str2) {
        View inflate = m30049a().inflate(C1704R.layout.item_setting_edit, (ViewGroup) null);
        m30045a(inflate, str);
        EditText editText = (EditText) inflate.findViewById(C1704R.C1706id.et_settingAction);
        editText.setText(str2);
        m30031e().addView(inflate);
        return editText;
    }

    /* renamed from: c */
    public abstract View mo30019c();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public TextView m30033c(String str, String str2) {
        View inflate = m30049a().inflate(C1704R.layout.item_setting_text, (ViewGroup) null);
        m30045a(inflate, str);
        TextView textView = (TextView) inflate.findViewById(C1704R.C1706id.tv_settingAction);
        textView.setText(str2);
        m30031e().addView(inflate);
        return textView;
    }

    /* renamed from: d */
    public C1827d m30032d() {
        return this.f10372f;
    }

    /* renamed from: e */
    public ViewGroup m30031e() {
        return this.f10368b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public Context m30030f() {
        return this.f10369c;
    }
}
