package com.fimi.soul.view;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.utils.C1675p;
import com.fimi.kernel.utils.C1679t;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
import com.fimi.soul.utils.JustifyTextView;
/* renamed from: com.fimi.soul.view.f */
/* loaded from: classes.dex */
public class DialogC3245f extends Dialog {

    /* renamed from: com.fimi.soul.view.f$a */
    /* loaded from: classes.dex */
    public static class C3246a {

        /* renamed from: a */
        private Context f12633a;

        /* renamed from: b */
        private String f12634b;

        /* renamed from: c */
        private String f12635c;

        /* renamed from: d */
        private String f12636d;

        /* renamed from: e */
        private String f12637e;

        /* renamed from: f */
        private int f12638f;

        /* renamed from: g */
        private int f12639g;

        /* renamed from: j */
        private DialogInterface.OnClickListener f12642j;

        /* renamed from: k */
        private DialogInterface.OnClickListener f12643k;

        /* renamed from: l */
        private DialogC3245f f12644l;

        /* renamed from: h */
        private int f12640h = -1;

        /* renamed from: i */
        private int f12641i = -1;

        /* renamed from: m */
        private boolean f12645m = false;

        public C3246a(Context context) {
            this.f12633a = context;
            this.f12644l = new DialogC3245f(this.f12633a, C1704R.style.DropDialog1);
        }

        /* renamed from: a */
        private void m28643a(TextView textView) {
            textView.getPaint().setFakeBoldText(true);
        }

        /* renamed from: a */
        public C3246a m28644a(int i) {
            this.f12638f = i;
            return this;
        }

        /* renamed from: a */
        public C3246a m28641a(String str) {
            this.f12634b = str;
            return this;
        }

        /* renamed from: a */
        public C3246a m28640a(String str, DialogInterface.OnClickListener onClickListener) {
            this.f12643k = onClickListener;
            this.f12636d = str;
            return this;
        }

        /* renamed from: a */
        public C3246a m28639a(boolean z) {
            this.f12645m = z;
            return this;
        }

        /* renamed from: a */
        public DialogC3245f m28645a() {
            LayoutInflater layoutInflater = (LayoutInflater) this.f12633a.getSystemService("layout_inflater");
            View inflate = this.f12637e != null ? layoutInflater.inflate(C1704R.layout.vertical_screen_dialog_content_double_button, (ViewGroup) null) : layoutInflater.inflate(C1704R.layout.vertical_screen_dialog_double_button, (ViewGroup) null);
            JustifyTextView justifyTextView = (JustifyTextView) inflate.findViewById(C1704R.C1706id.msg_tv);
            Button button = (Button) inflate.findViewById(C1704R.C1706id.right_btn);
            Button button2 = (Button) inflate.findViewById(C1704R.C1706id.left_btn);
            if (this.f12637e != null) {
                JustifyTextView justifyTextView2 = (JustifyTextView) inflate.findViewById(C1704R.C1706id.content_tv);
                justifyTextView2.setText(this.f12637e);
                C3103au.m29232a(this.f12633a.getAssets(), justifyTextView2);
                if (this.f12641i != -1) {
                    justifyTextView2.setGravity(this.f12641i);
                }
            }
            if (this.f12638f != 0) {
                button.setTextColor(this.f12638f);
            }
            if (this.f12639g > 0) {
                button2.setTextColor(this.f12639g);
            }
            if (this.f12635c != null) {
                button.setText(this.f12635c);
            }
            if (this.f12642j != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.f.a.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        C3246a.this.f12644l.dismiss();
                        C3246a.this.f12642j.onClick(C3246a.this.f12644l, -2);
                    }
                });
            }
            if (this.f12636d != null) {
                button2.setText(this.f12636d);
            }
            if (this.f12643k != null) {
                button2.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.f.a.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        C3246a.this.f12644l.dismiss();
                        C3246a.this.f12643k.onClick(C3246a.this.f12644l, -2);
                    }
                });
            }
            if (this.f12634b != null) {
                justifyTextView.setText(this.f12634b);
            }
            if (this.f12640h != -1) {
                justifyTextView.setGravity(this.f12640h);
            }
            C3103au.m29232a(this.f12633a.getAssets(), justifyTextView, button, button2);
            if (this.f12637e != null) {
                justifyTextView.getPaint().setFakeBoldText(true);
            }
            this.f12644l.setCanceledOnTouchOutside(this.f12645m);
            this.f12644l.setContentView(inflate);
            Window window = this.f12644l.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (((C1675p.m34624b(this.f12633a) > ((float) C1675p.m34635a(this.f12633a)) ? C1675p.m34624b(this.f12633a) : C1675p.m34635a(this.f12633a)) * 1048.0f) / 1920.0f);
            window.setAttributes(attributes);
            this.f12644l.getWindow().getDecorView().setBackgroundColor(0);
            return this.f12644l;
        }

        /* renamed from: b */
        public C3246a m28637b(int i) {
            this.f12639g = i;
            return this;
        }

        /* renamed from: b */
        public C3246a m28635b(String str) {
            this.f12637e = str;
            return this;
        }

        /* renamed from: b */
        public C3246a m28634b(String str, DialogInterface.OnClickListener onClickListener) {
            this.f12642j = onClickListener;
            this.f12635c = str;
            return this;
        }

        /* renamed from: b */
        public DialogC3245f m28638b() {
            return this.f12644l;
        }

        /* renamed from: c */
        public C3246a m28633c(int i) {
            this.f12640h = i;
            return this;
        }

        /* renamed from: c */
        public C3246a m28631c(String str) {
            this.f12635c = str;
            return this;
        }

        /* renamed from: d */
        public C3246a m28630d(int i) {
            this.f12641i = i;
            return this;
        }

        /* renamed from: d */
        public C3246a m28629d(String str) {
            this.f12636d = str;
            return this;
        }
    }

    /* renamed from: com.fimi.soul.view.f$b */
    /* loaded from: classes.dex */
    public static class C3249b {

        /* renamed from: q */
        private static final int f12648q = 0;

        /* renamed from: r */
        private static final int f12649r = 115;

        /* renamed from: a */
        boolean f12650a;

        /* renamed from: b */
        private Context f12651b;

        /* renamed from: c */
        private String f12652c;

        /* renamed from: d */
        private String f12653d;

        /* renamed from: e */
        private int f12654e;

        /* renamed from: f */
        private String f12655f;

        /* renamed from: j */
        private String f12659j;

        /* renamed from: k */
        private String f12660k;

        /* renamed from: n */
        private DialogInterface.OnClickListener f12663n;

        /* renamed from: o */
        private DialogInterface.OnClickListener f12664o;

        /* renamed from: p */
        private SeekBar.OnSeekBarChangeListener f12665p;

        /* renamed from: g */
        private int f12656g = 500;

        /* renamed from: h */
        private int f12657h = 0;

        /* renamed from: i */
        private int f12658i = 0;

        /* renamed from: l */
        private boolean f12661l = true;

        /* renamed from: m */
        private boolean f12662m = false;

        /* renamed from: s */
        private boolean f12666s = false;

        public C3249b(Context context) {
            this.f12650a = false;
            this.f12651b = context;
            this.f12650a = C1642c.m34885e().m34501p();
        }

        /* renamed from: a */
        private void m28625a(TextView textView) {
            textView.getPaint().setFakeBoldText(true);
        }

        /* renamed from: a */
        public C3249b m28627a(int i) {
            this.f12658i = i;
            return this;
        }

        /* renamed from: a */
        public C3249b m28626a(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
            this.f12665p = onSeekBarChangeListener;
            return this;
        }

        /* renamed from: a */
        public C3249b m28623a(String str) {
            this.f12659j = str;
            return this;
        }

        /* renamed from: a */
        public C3249b m28622a(String str, DialogInterface.OnClickListener onClickListener) {
            this.f12664o = onClickListener;
            this.f12653d = str;
            return this;
        }

        /* renamed from: a */
        public C3249b m28621a(boolean z) {
            this.f12662m = z;
            return this;
        }

        /* renamed from: a */
        public DialogC3245f m28628a() {
            final DialogC3245f dialogC3245f = new DialogC3245f(this.f12651b, C1704R.style.DropDialog1);
            View inflate = ((LayoutInflater) this.f12651b.getSystemService("layout_inflater")).inflate(C1704R.layout.vertical_screen_dialog_double_button_progress, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C1704R.C1706id.msg_tv);
            Button button = (Button) inflate.findViewById(C1704R.C1706id.right_btn);
            Button button2 = (Button) inflate.findViewById(C1704R.C1706id.left_btn);
            final SeekBar seekBar = (SeekBar) inflate.findViewById(C1704R.C1706id.seekbar);
            TextView textView2 = (TextView) inflate.findViewById(C1704R.C1706id.min_progress_tv);
            TextView textView3 = (TextView) inflate.findViewById(C1704R.C1706id.max_progress_tv);
            final TextView textView4 = (TextView) inflate.findViewById(C1704R.C1706id.progress_tv);
            TextView textView5 = (TextView) inflate.findViewById(C1704R.C1706id.dialog_unit_tv);
            if (this.f12660k != null) {
                textView5.setText(this.f12660k);
            }
            ((RelativeLayout) inflate.findViewById(C1704R.C1706id.seekbar_ll)).setOnTouchListener(new View.OnTouchListener() { // from class: com.fimi.soul.view.f.b.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    float f = 0.0f;
                    Rect rect = new Rect();
                    seekBar.getHitRect(rect);
                    if (motionEvent.getY() < rect.top - 50 || motionEvent.getY() > rect.bottom + 50) {
                        return false;
                    }
                    float height = rect.top + (rect.height() / 2);
                    float x = motionEvent.getX() - rect.left;
                    if (x >= 0.0f) {
                        f = x > ((float) rect.width()) ? rect.width() : x;
                    }
                    return seekBar.onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), f, height, motionEvent.getMetaState()));
                }
            });
            seekBar.setMax(this.f12657h - this.f12658i);
            if (this.f12661l) {
                textView2.setText(this.f12658i + this.f12659j);
                textView3.setText(this.f12657h + this.f12659j);
                seekBar.setProgress(this.f12656g - this.f12658i);
            } else if (!this.f12650a) {
                textView2.setText(this.f12658i + this.f12659j);
                textView3.setText(this.f12657h + this.f12659j);
                seekBar.setProgress(this.f12656g - this.f12658i);
            } else if (this.f12662m) {
                textView2.setText(Math.round(C1679t.m34551c(this.f12658i)) + this.f12659j);
                textView3.setText(Math.round(C1679t.m34551c(this.f12657h)) + this.f12659j);
                seekBar.setProgress(((int) Math.round(C1679t.m34550d(this.f12656g))) - this.f12658i);
            } else {
                textView2.setText(Math.round(C1679t.m34553b(this.f12658i)) + this.f12659j);
                textView3.setText(Math.round(C1679t.m34553b(this.f12657h)) + this.f12659j);
                seekBar.setProgress(((int) Math.round(C1679t.m34549e(this.f12656g))) - this.f12658i);
            }
            if (this.f12662m) {
                if (this.f12661l) {
                    if (this.f12650a) {
                        if (this.f12656g <= 6) {
                            textView4.setText(this.f12656g + this.f12651b.getString(C1704R.C1707string.speed_unit_mph) + this.f12651b.getString(C1704R.C1707string.setting_speed_low));
                        } else if (this.f12656g <= 6 || this.f12656g > 10) {
                            textView4.setText(this.f12656g + this.f12651b.getString(C1704R.C1707string.speed_unit_mph) + this.f12651b.getString(C1704R.C1707string.setting_speed_hight));
                        } else {
                            textView4.setText(this.f12656g + this.f12651b.getString(C1704R.C1707string.speed_unit_mph) + this.f12651b.getString(C1704R.C1707string.setting_speed_standard));
                        }
                    } else if (this.f12656g <= 6) {
                        textView4.setText(this.f12656g + this.f12651b.getString(C1704R.C1707string.speed_unit_m) + this.f12651b.getString(C1704R.C1707string.setting_speed_low));
                    } else if (this.f12656g <= 6 || this.f12656g > 10) {
                        textView4.setText(this.f12656g + this.f12651b.getString(C1704R.C1707string.speed_unit_m) + this.f12651b.getString(C1704R.C1707string.setting_speed_hight));
                    } else {
                        textView4.setText(this.f12656g + this.f12651b.getString(C1704R.C1707string.speed_unit_m) + this.f12651b.getString(C1704R.C1707string.setting_speed_standard));
                    }
                } else if (this.f12650a) {
                    if (this.f12656g <= C1679t.m34551c(6.0d)) {
                        textView4.setText(this.f12656g + this.f12651b.getString(C1704R.C1707string.speed_unit_mph) + this.f12651b.getString(C1704R.C1707string.setting_speed_low));
                    } else if (this.f12656g <= C1679t.m34551c(6.0d) || this.f12656g > C1679t.m34551c(10.0d)) {
                        textView4.setText(this.f12656g + this.f12651b.getString(C1704R.C1707string.speed_unit_mph) + this.f12651b.getString(C1704R.C1707string.setting_speed_hight));
                    } else {
                        textView4.setText(this.f12656g + this.f12651b.getString(C1704R.C1707string.speed_unit_mph) + this.f12651b.getString(C1704R.C1707string.setting_speed_standard));
                    }
                } else if (this.f12656g <= 6) {
                    textView4.setText(this.f12656g + this.f12651b.getString(C1704R.C1707string.speed_unit_m) + this.f12651b.getString(C1704R.C1707string.setting_speed_low));
                } else if (this.f12656g <= 6 || this.f12656g > 10) {
                    textView4.setText(this.f12656g + this.f12651b.getString(C1704R.C1707string.speed_unit_m) + this.f12651b.getString(C1704R.C1707string.setting_speed_hight));
                } else {
                    textView4.setText(this.f12656g + this.f12651b.getString(C1704R.C1707string.speed_unit_m) + this.f12651b.getString(C1704R.C1707string.setting_speed_standard));
                }
            } else if (this.f12661l) {
                textView4.setText(this.f12656g + this.f12659j);
            } else {
                textView4.setText(this.f12656g + this.f12659j);
            }
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.fimi.soul.view.f.b.2
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                    boolean m34501p = C1642c.m34885e().m34501p();
                    if (C3249b.this.f12662m) {
                        if (C3249b.this.f12661l) {
                            int i2 = C3249b.this.f12658i + i;
                            if (m34501p) {
                                if (i2 <= C1679t.m34551c(6.0d)) {
                                    textView4.setText(i2 + C3249b.this.f12651b.getString(C1704R.C1707string.speed_unit_mph) + C3249b.this.f12651b.getString(C1704R.C1707string.setting_speed_low));
                                } else if (i2 <= C1679t.m34551c(6.0d) || i2 > C1679t.m34551c(10.0d)) {
                                    textView4.setText(i2 + C3249b.this.f12651b.getString(C1704R.C1707string.speed_unit_mph) + C3249b.this.f12651b.getString(C1704R.C1707string.setting_speed_hight));
                                } else {
                                    textView4.setText(i2 + C3249b.this.f12651b.getString(C1704R.C1707string.speed_unit_mph) + C3249b.this.f12651b.getString(C1704R.C1707string.setting_speed_standard));
                                }
                            } else if (i2 <= 6) {
                                textView4.setText(i2 + C3249b.this.f12651b.getString(C1704R.C1707string.speed_unit_m) + C3249b.this.f12651b.getString(C1704R.C1707string.setting_speed_low));
                            } else if (i2 <= 6 || i2 > 10) {
                                textView4.setText(i2 + C3249b.this.f12651b.getString(C1704R.C1707string.speed_unit_m) + C3249b.this.f12651b.getString(C1704R.C1707string.setting_speed_hight));
                            } else {
                                textView4.setText(i2 + C3249b.this.f12651b.getString(C1704R.C1707string.speed_unit_m) + C3249b.this.f12651b.getString(C1704R.C1707string.setting_speed_standard));
                            }
                        } else {
                            int i3 = C3249b.this.f12658i + i;
                            if (m34501p) {
                                if (i3 <= 6) {
                                    textView4.setText(Math.round(C1679t.m34551c(i3)) + C3249b.this.f12651b.getString(C1704R.C1707string.speed_unit_mph) + C3249b.this.f12651b.getString(C1704R.C1707string.setting_speed_low));
                                } else if (i3 <= 6 || i3 > 10) {
                                    textView4.setText(Math.round(C1679t.m34551c(i3)) + C3249b.this.f12651b.getString(C1704R.C1707string.speed_unit_mph) + C3249b.this.f12651b.getString(C1704R.C1707string.setting_speed_hight));
                                } else {
                                    textView4.setText(Math.round(C1679t.m34551c(i3)) + C3249b.this.f12651b.getString(C1704R.C1707string.speed_unit_mph) + C3249b.this.f12651b.getString(C1704R.C1707string.setting_speed_standard));
                                }
                            } else if (i3 <= 6) {
                                textView4.setText(i3 + C3249b.this.f12651b.getString(C1704R.C1707string.speed_unit_m) + C3249b.this.f12651b.getString(C1704R.C1707string.setting_speed_low));
                            } else if (i3 <= 6 || i3 > 10) {
                                textView4.setText(i3 + C3249b.this.f12651b.getString(C1704R.C1707string.speed_unit_m) + C3249b.this.f12651b.getString(C1704R.C1707string.setting_speed_hight));
                            } else {
                                textView4.setText(i3 + C3249b.this.f12651b.getString(C1704R.C1707string.speed_unit_m) + C3249b.this.f12651b.getString(C1704R.C1707string.setting_speed_standard));
                            }
                        }
                    } else if (!m34501p) {
                        textView4.setText((C3249b.this.f12658i + i) + C3249b.this.f12659j);
                    } else if (C3249b.this.f12661l) {
                        textView4.setText((C3249b.this.f12658i + i) + C3249b.this.f12651b.getString(C1704R.C1707string.distance_unit_ft));
                    } else {
                        textView4.setText(Math.round(C1679t.m34553b(C3249b.this.f12658i + i)) + C3249b.this.f12651b.getString(C1704R.C1707string.distance_unit_ft));
                    }
                    C3249b.this.f12665p.onProgressChanged(seekBar2, i, z);
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar2) {
                    C3249b.this.f12665p.onStartTrackingTouch(seekBar2);
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar2) {
                    C3249b.this.f12665p.onStopTrackingTouch(seekBar2);
                }
            });
            if (this.f12653d != null) {
                button.setText(this.f12653d);
            }
            if (this.f12663n != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.f.b.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        dialogC3245f.dismiss();
                        C3249b.this.f12663n.onClick(dialogC3245f, -2);
                    }
                });
            }
            if (this.f12654e != -1) {
                button.setTextColor(this.f12654e);
            }
            if (this.f12655f != null) {
                button2.setText(this.f12653d);
            }
            if (this.f12664o != null) {
                button2.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.f.b.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        dialogC3245f.dismiss();
                        C3249b.this.f12664o.onClick(dialogC3245f, -2);
                    }
                });
            }
            if (this.f12652c != null) {
                textView.setText(this.f12652c);
            }
            C3103au.m29232a(this.f12651b.getAssets(), textView, button, button2, textView5);
            C3103au.m29218b(this.f12651b.getAssets(), textView2, textView3, textView4);
            m28625a(textView);
            m28625a(textView5);
            m28625a(textView4);
            m28625a(textView2);
            m28625a(textView3);
            dialogC3245f.setCanceledOnTouchOutside(this.f12666s);
            dialogC3245f.setContentView(inflate);
            Window window = dialogC3245f.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (((C1675p.m34624b(this.f12651b) > ((float) C1675p.m34635a(this.f12651b)) ? C1675p.m34624b(this.f12651b) : C1675p.m34635a(this.f12651b)) * 1048.0f) / 1920.0f);
            window.setAttributes(attributes);
            dialogC3245f.getWindow().getDecorView().setBackgroundColor(0);
            return dialogC3245f;
        }

        /* renamed from: b */
        public C3249b m28620b(int i) {
            this.f12657h = i;
            return this;
        }

        /* renamed from: b */
        public C3249b m28618b(String str) {
            this.f12660k = str;
            return this;
        }

        /* renamed from: b */
        public C3249b m28617b(String str, DialogInterface.OnClickListener onClickListener) {
            this.f12663n = onClickListener;
            this.f12653d = str;
            return this;
        }

        /* renamed from: b */
        public C3249b m28616b(boolean z) {
            this.f12666s = z;
            return this;
        }

        /* renamed from: c */
        public C3249b m28615c(int i) {
            this.f12656g = i;
            return this;
        }

        /* renamed from: c */
        public C3249b m28613c(String str) {
            this.f12652c = str;
            return this;
        }

        /* renamed from: c */
        public C3249b m28612c(boolean z) {
            this.f12661l = z;
            return this;
        }

        /* renamed from: d */
        public C3249b m28611d(int i) {
            this.f12654e = i;
            return this;
        }

        /* renamed from: d */
        public C3249b m28609d(String str) {
            this.f12653d = str;
            return this;
        }

        /* renamed from: e */
        public C3249b m28607e(String str) {
            this.f12655f = str;
            return this;
        }
    }

    /* renamed from: com.fimi.soul.view.f$c */
    /* loaded from: classes2.dex */
    public static class C3254c {

        /* renamed from: a */
        private Context f12675a;

        /* renamed from: b */
        private String f12676b;

        /* renamed from: c */
        private int f12677c;

        /* renamed from: d */
        private String f12678d;

        /* renamed from: e */
        private String f12679e;

        /* renamed from: f */
        private DialogInterface.OnClickListener f12680f;

        /* renamed from: g */
        private DialogInterface.OnClickListener f12681g;

        /* renamed from: h */
        private DialogInterface.OnClickListener f12682h;

        /* renamed from: j */
        private SeekBar.OnSeekBarChangeListener f12684j;

        /* renamed from: l */
        private int f12686l;

        /* renamed from: m */
        private int f12687m;

        /* renamed from: n */
        private String f12688n;

        /* renamed from: i */
        private int f12683i = -1;

        /* renamed from: k */
        private boolean f12685k = false;

        public C3254c(Context context) {
            this.f12675a = context;
        }

        /* renamed from: a */
        private void m28599a(TextView textView) {
            textView.getPaint().setFakeBoldText(true);
        }

        /* renamed from: a */
        public C3254c m28602a(int i) {
            this.f12677c = i;
            return this;
        }

        /* renamed from: a */
        public C3254c m28601a(DialogInterface.OnClickListener onClickListener) {
            this.f12680f = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C3254c m28600a(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
            this.f12684j = onSeekBarChangeListener;
            return this;
        }

        /* renamed from: a */
        public C3254c m28597a(String str) {
            this.f12688n = str;
            return this;
        }

        /* renamed from: a */
        public C3254c m28596a(boolean z) {
            this.f12685k = z;
            return this;
        }

        /* renamed from: a */
        public DialogC3245f m28603a() {
            final DialogC3245f dialogC3245f = new DialogC3245f(this.f12675a, C1704R.style.DropDialog1);
            final View inflate = ((LayoutInflater) this.f12675a.getSystemService("layout_inflater")).inflate(C1704R.layout.horizontal_screen_dialog_double_button_progress, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C1704R.C1706id.msg_tv);
            Button button = (Button) inflate.findViewById(C1704R.C1706id.right_btn);
            Button button2 = (Button) inflate.findViewById(C1704R.C1706id.left_btn);
            final SeekBar seekBar = (SeekBar) inflate.findViewById(C1704R.C1706id.seekbar);
            TextView textView2 = (TextView) inflate.findViewById(C1704R.C1706id.min_progress_tv);
            TextView textView3 = (TextView) inflate.findViewById(C1704R.C1706id.max_progress_tv);
            TextView textView4 = (TextView) inflate.findViewById(C1704R.C1706id.height_lable_tv);
            TextView textView5 = (TextView) inflate.findViewById(C1704R.C1706id.height_unit_tv);
            final Button button3 = (Button) inflate.findViewById(C1704R.C1706id.height_value_btn);
            inflate.findViewById(C1704R.C1706id.seekbar_ll).setVisibility(8);
            ((RelativeLayout) inflate.findViewById(C1704R.C1706id.seekbar_ll)).setOnTouchListener(new View.OnTouchListener() { // from class: com.fimi.soul.view.f.c.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    float f = 0.0f;
                    Rect rect = new Rect();
                    seekBar.getHitRect(rect);
                    if (motionEvent.getY() < rect.top - 50 || motionEvent.getY() > rect.bottom + 50) {
                        return false;
                    }
                    float height = rect.top + (rect.height() / 2);
                    float x = motionEvent.getX() - rect.left;
                    if (x >= 0.0f) {
                        f = x > ((float) rect.width()) ? rect.width() : x;
                    }
                    return seekBar.onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), f, height, motionEvent.getMetaState()));
                }
            });
            if (this.f12688n != null) {
                textView5.setText(this.f12688n);
            }
            textView2.setText(String.valueOf(this.f12687m));
            textView3.setText(String.valueOf(this.f12686l));
            seekBar.setMax(this.f12686l - this.f12687m);
            seekBar.setProgress(this.f12677c - this.f12687m);
            button3.setText(String.valueOf(this.f12677c));
            if (this.f12682h != null) {
                button3.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.f.c.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        inflate.findViewById(C1704R.C1706id.seekbar_ll).setVisibility(0);
                    }
                });
            }
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.fimi.soul.view.f.c.3
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                    button3.setText(String.valueOf(C3254c.this.f12687m + i));
                    C3254c.this.f12684j.onProgressChanged(seekBar2, C3254c.this.f12687m + i, z);
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar2) {
                    C3254c.this.f12684j.onStartTrackingTouch(seekBar2);
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar2) {
                    C3254c.this.f12684j.onStopTrackingTouch(seekBar2);
                }
            });
            if (this.f12678d != null) {
                button.setText(this.f12678d);
            }
            if (this.f12680f != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.f.c.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        dialogC3245f.dismiss();
                        C3254c.this.f12680f.onClick(dialogC3245f, -2);
                    }
                });
            }
            if (this.f12683i != -1) {
                button.setTextColor(this.f12683i);
            }
            if (this.f12679e != null) {
                button2.setText(this.f12678d);
            }
            if (this.f12681g != null) {
                button2.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.f.c.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        dialogC3245f.dismiss();
                        C3254c.this.f12681g.onClick(dialogC3245f, -2);
                    }
                });
            }
            if (this.f12676b != null) {
                textView.setText(this.f12676b);
            }
            C3103au.m29232a(this.f12675a.getAssets(), textView, button, button2, textView4, textView5, button3);
            C3103au.m29218b(this.f12675a.getAssets(), textView2, textView3);
            m28599a(textView);
            dialogC3245f.setCanceledOnTouchOutside(this.f12685k);
            dialogC3245f.setContentView(inflate);
            Window window = dialogC3245f.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (((C1675p.m34624b(this.f12675a) < ((float) C1675p.m34635a(this.f12675a)) ? C1675p.m34624b(this.f12675a) : C1675p.m34635a(this.f12675a)) * 1034.0f) / 1080.0f);
            window.setAttributes(attributes);
            dialogC3245f.getWindow().getDecorView().setBackgroundColor(0);
            return dialogC3245f;
        }

        /* renamed from: b */
        public C3254c m28595b(int i) {
            this.f12683i = i;
            return this;
        }

        /* renamed from: b */
        public C3254c m28594b(DialogInterface.OnClickListener onClickListener) {
            this.f12681g = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C3254c m28592b(String str) {
            this.f12676b = str;
            return this;
        }

        /* renamed from: c */
        public C3254c m28591c(int i) {
            this.f12686l = i;
            return this;
        }

        /* renamed from: c */
        public C3254c m28590c(DialogInterface.OnClickListener onClickListener) {
            this.f12682h = onClickListener;
            return this;
        }

        /* renamed from: c */
        public C3254c m28588c(String str) {
            this.f12678d = str;
            return this;
        }

        /* renamed from: d */
        public C3254c m28587d(int i) {
            this.f12687m = i;
            return this;
        }

        /* renamed from: d */
        public C3254c m28585d(String str) {
            this.f12679e = str;
            return this;
        }
    }

    /* renamed from: com.fimi.soul.view.f$d */
    /* loaded from: classes2.dex */
    public static class C3260d {

        /* renamed from: a */
        private DialogC3245f f12699a;

        /* renamed from: b */
        private Context f12700b;

        /* renamed from: c */
        private String f12701c;

        /* renamed from: d */
        private String f12702d;

        /* renamed from: e */
        private DialogInterface.OnClickListener f12703e;

        /* renamed from: f */
        private boolean f12704f = false;

        public C3260d(Context context) {
            this.f12700b = context;
            this.f12699a = new DialogC3245f(this.f12700b, C1704R.style.DropDialog1);
        }

        /* renamed from: a */
        public C3260d m28583a(DialogInterface.OnClickListener onClickListener) {
            this.f12703e = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C3260d m28581a(String str) {
            this.f12701c = str;
            return this;
        }

        /* renamed from: a */
        public C3260d m28580a(String str, DialogInterface.OnClickListener onClickListener) {
            this.f12703e = onClickListener;
            this.f12702d = str;
            return this;
        }

        /* renamed from: a */
        public C3260d m28579a(boolean z) {
            this.f12704f = z;
            return this;
        }

        /* renamed from: a */
        public DialogC3245f m28584a() {
            View inflate = ((LayoutInflater) this.f12700b.getSystemService("layout_inflater")).inflate(C1704R.layout.horizon_single_button_dialog, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C1704R.C1706id.msg_tv);
            Button button = (Button) inflate.findViewById(C1704R.C1706id.single_btn);
            if (this.f12702d != null) {
                button.setText(this.f12702d);
            }
            if (this.f12701c != null) {
                textView.setText(this.f12701c);
            }
            if (this.f12703e != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.f.d.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        C3260d.this.f12699a.dismiss();
                        C3260d.this.f12703e.onClick(C3260d.this.f12699a, -2);
                    }
                });
            }
            C3103au.m29232a(this.f12700b.getAssets(), textView, button);
            this.f12699a.setCanceledOnTouchOutside(this.f12704f);
            this.f12699a.setContentView(inflate);
            Window window = this.f12699a.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (((C1675p.m34624b(this.f12700b) > ((float) C1675p.m34635a(this.f12700b)) ? C1675p.m34624b(this.f12700b) : C1675p.m34635a(this.f12700b)) * 1032.0f) / 1920.0f);
            window.setAttributes(attributes);
            this.f12699a.getWindow().getDecorView().setBackgroundColor(0);
            return this.f12699a;
        }

        /* renamed from: b */
        public C3260d m28576b(String str) {
            this.f12702d = str;
            return this;
        }

        /* renamed from: b */
        public DialogC3245f m28578b() {
            return this.f12699a;
        }
    }

    /* renamed from: com.fimi.soul.view.f$e */
    /* loaded from: classes.dex */
    public static class C3262e {

        /* renamed from: a */
        private Context f12706a;

        /* renamed from: b */
        private String f12707b;

        /* renamed from: c */
        private String f12708c;

        /* renamed from: e */
        private String f12710e;

        /* renamed from: f */
        private int f12711f;

        /* renamed from: g */
        private CharSequence f12712g;

        /* renamed from: h */
        private CharSequence f12713h;

        /* renamed from: i */
        private DialogInterface.OnClickListener f12714i;

        /* renamed from: d */
        private int f12709d = 0;

        /* renamed from: j */
        private boolean f12715j = false;

        /* renamed from: k */
        private boolean f12716k = false;

        /* renamed from: l */
        private boolean f12717l = true;

        public C3262e(Context context) {
            this.f12706a = context;
        }

        /* renamed from: a */
        private void m28573a(TextView textView) {
            textView.getPaint().setFakeBoldText(true);
        }

        /* renamed from: a */
        public C3262e m28574a(int i) {
            this.f12709d = i;
            return this;
        }

        /* renamed from: a */
        public C3262e m28571a(CharSequence charSequence) {
            this.f12712g = charSequence;
            return this;
        }

        /* renamed from: a */
        public C3262e m28570a(String str) {
            this.f12707b = str;
            return this;
        }

        /* renamed from: a */
        public C3262e m28569a(String str, DialogInterface.OnClickListener onClickListener) {
            this.f12714i = onClickListener;
            this.f12708c = str;
            return this;
        }

        /* renamed from: a */
        public C3262e m28568a(boolean z) {
            this.f12717l = z;
            return this;
        }

        @TargetApi(16)
        /* renamed from: a */
        public DialogC3245f m28575a() {
            LayoutInflater layoutInflater = (LayoutInflater) this.f12706a.getSystemService("layout_inflater");
            final DialogC3245f dialogC3245f = new DialogC3245f(this.f12706a, C1704R.style.DropDialog1);
            View inflate = (this.f12710e == null && this.f12713h == null) ? layoutInflater.inflate(C1704R.layout.usb_share_dialog, (ViewGroup) null) : layoutInflater.inflate(C1704R.layout.dialog_content_image, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C1704R.C1706id.msg_tv);
            ImageView imageView = (ImageView) inflate.findViewById(C1704R.C1706id.imageview);
            Button button = (Button) inflate.findViewById(C1704R.C1706id.single_btn);
            if (this.f12709d != 0) {
                imageView.setBackground(this.f12706a.getResources().getDrawable(this.f12709d));
            }
            if (this.f12707b != null && this.f12717l) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f12707b);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f12706a.getResources().getColor(C1704R.color.setting_dialog_force_attitude)), 4, 18, 33);
                textView.setText(spannableStringBuilder);
            } else if (this.f12707b != null) {
                textView.setText(this.f12707b);
            }
            if (this.f12708c != null) {
                button.setText(this.f12708c);
            }
            if (this.f12714i != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.f.e.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        dialogC3245f.dismiss();
                        C3262e.this.f12714i.onClick(dialogC3245f, -2);
                    }
                });
            }
            if (this.f12710e != null) {
                TextView textView2 = (TextView) inflate.findViewById(C1704R.C1706id.content_tv);
                textView2.setText(this.f12710e);
                C3103au.m29232a(this.f12706a.getAssets(), textView2);
            }
            if (this.f12713h != null) {
                TextView textView3 = (TextView) inflate.findViewById(C1704R.C1706id.content_tv);
                textView3.setText(this.f12713h);
                C3103au.m29232a(this.f12706a.getAssets(), textView3);
            }
            if (this.f12715j) {
                m28573a(textView);
            }
            if (this.f12711f != 0) {
                textView.setTextColor(this.f12711f);
            }
            C3103au.m29232a(this.f12706a.getAssets(), textView, button);
            dialogC3245f.setCanceledOnTouchOutside(this.f12716k);
            dialogC3245f.setContentView(inflate);
            Window window = dialogC3245f.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = (int) (((C1675p.m34624b(this.f12706a) > ((float) C1675p.m34635a(this.f12706a)) ? C1675p.m34624b(this.f12706a) : C1675p.m34635a(this.f12706a)) * 1032.0f) / 1920.0f);
            window.setAttributes(attributes);
            dialogC3245f.getWindow().getDecorView().setBackgroundColor(0);
            return dialogC3245f;
        }

        /* renamed from: b */
        public C3262e m28567b(int i) {
            this.f12711f = i;
            return this;
        }

        /* renamed from: b */
        public C3262e m28566b(CharSequence charSequence) {
            this.f12713h = charSequence;
            return this;
        }

        /* renamed from: b */
        public C3262e m28565b(String str) {
            this.f12708c = str;
            return this;
        }

        /* renamed from: b */
        public C3262e m28564b(boolean z) {
            this.f12715j = z;
            return this;
        }

        /* renamed from: c */
        public C3262e m28563c(String str) {
            this.f12710e = str;
            return this;
        }
    }

    public DialogC3245f(Context context) {
        super(context);
    }

    public DialogC3245f(Context context, int i) {
        super(context, i);
    }

    public DialogC3245f(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
    }
}
