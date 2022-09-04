package android.support.p004v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.ArrayRes;
import android.support.annotation.AttrRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;
import android.support.p004v7.app.AlertController;
import android.support.p004v7.appcompat.C0176R;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
/* renamed from: android.support.v7.app.AlertDialog */
/* loaded from: classes.dex */
public class AlertDialog extends AppCompatDialog implements DialogInterface {
    static final int LAYOUT_HINT_NONE = 0;
    static final int LAYOUT_HINT_SIDE = 1;
    private final AlertController mAlert;

    /* renamed from: android.support.v7.app.AlertDialog$Builder */
    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: P */
        private final AlertController.AlertParams f123P;
        private final int mTheme;

        public Builder(@NonNull Context context) {
            this(context, AlertDialog.resolveDialogTheme(context, 0));
        }

        public Builder(@NonNull Context context, @StyleRes int i) {
            this.f123P = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, i)));
            this.mTheme = i;
        }

        public AlertDialog create() {
            AlertDialog alertDialog = new AlertDialog(this.f123P.mContext, this.mTheme);
            this.f123P.apply(alertDialog.mAlert);
            alertDialog.setCancelable(this.f123P.mCancelable);
            if (this.f123P.mCancelable) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.f123P.mOnCancelListener);
            alertDialog.setOnDismissListener(this.f123P.mOnDismissListener);
            if (this.f123P.mOnKeyListener != null) {
                alertDialog.setOnKeyListener(this.f123P.mOnKeyListener);
            }
            return alertDialog;
        }

        @NonNull
        public Context getContext() {
            return this.f123P.mContext;
        }

        public Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            this.f123P.mAdapter = listAdapter;
            this.f123P.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setCancelable(boolean z) {
            this.f123P.mCancelable = z;
            return this;
        }

        public Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            this.f123P.mCursor = cursor;
            this.f123P.mLabelColumn = str;
            this.f123P.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setCustomTitle(View view) {
            this.f123P.mCustomTitleView = view;
            return this;
        }

        public Builder setIcon(@DrawableRes int i) {
            this.f123P.mIconId = i;
            return this;
        }

        public Builder setIcon(Drawable drawable) {
            this.f123P.mIcon = drawable;
            return this;
        }

        public Builder setIconAttribute(@AttrRes int i) {
            TypedValue typedValue = new TypedValue();
            this.f123P.mContext.getTheme().resolveAttribute(i, typedValue, true);
            this.f123P.mIconId = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public Builder setInverseBackgroundForced(boolean z) {
            this.f123P.mForceInverseBackground = z;
            return this;
        }

        public Builder setItems(@ArrayRes int i, DialogInterface.OnClickListener onClickListener) {
            this.f123P.mItems = this.f123P.mContext.getResources().getTextArray(i);
            this.f123P.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            this.f123P.mItems = charSequenceArr;
            this.f123P.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setMessage(@StringRes int i) {
            this.f123P.mMessage = this.f123P.mContext.getText(i);
            return this;
        }

        public Builder setMessage(CharSequence charSequence) {
            this.f123P.mMessage = charSequence;
            return this;
        }

        public Builder setMultiChoiceItems(@ArrayRes int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.f123P.mItems = this.f123P.mContext.getResources().getTextArray(i);
            this.f123P.mOnCheckboxClickListener = onMultiChoiceClickListener;
            this.f123P.mCheckedItems = zArr;
            this.f123P.mIsMultiChoice = true;
            return this;
        }

        public Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.f123P.mCursor = cursor;
            this.f123P.mOnCheckboxClickListener = onMultiChoiceClickListener;
            this.f123P.mIsCheckedColumn = str;
            this.f123P.mLabelColumn = str2;
            this.f123P.mIsMultiChoice = true;
            return this;
        }

        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.f123P.mItems = charSequenceArr;
            this.f123P.mOnCheckboxClickListener = onMultiChoiceClickListener;
            this.f123P.mCheckedItems = zArr;
            this.f123P.mIsMultiChoice = true;
            return this;
        }

        public Builder setNegativeButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            this.f123P.mNegativeButtonText = this.f123P.mContext.getText(i);
            this.f123P.mNegativeButtonListener = onClickListener;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.f123P.mNegativeButtonText = charSequence;
            this.f123P.mNegativeButtonListener = onClickListener;
            return this;
        }

        public Builder setNeutralButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            this.f123P.mNeutralButtonText = this.f123P.mContext.getText(i);
            this.f123P.mNeutralButtonListener = onClickListener;
            return this;
        }

        public Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.f123P.mNeutralButtonText = charSequence;
            this.f123P.mNeutralButtonListener = onClickListener;
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f123P.mOnCancelListener = onCancelListener;
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f123P.mOnDismissListener = onDismissListener;
            return this;
        }

        public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f123P.mOnItemSelectedListener = onItemSelectedListener;
            return this;
        }

        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f123P.mOnKeyListener = onKeyListener;
            return this;
        }

        public Builder setPositiveButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            this.f123P.mPositiveButtonText = this.f123P.mContext.getText(i);
            this.f123P.mPositiveButtonListener = onClickListener;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.f123P.mPositiveButtonText = charSequence;
            this.f123P.mPositiveButtonListener = onClickListener;
            return this;
        }

        public Builder setRecycleOnMeasureEnabled(boolean z) {
            this.f123P.mRecycleOnMeasure = z;
            return this;
        }

        public Builder setSingleChoiceItems(@ArrayRes int i, int i2, DialogInterface.OnClickListener onClickListener) {
            this.f123P.mItems = this.f123P.mContext.getResources().getTextArray(i);
            this.f123P.mOnClickListener = onClickListener;
            this.f123P.mCheckedItem = i2;
            this.f123P.mIsSingleChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            this.f123P.mCursor = cursor;
            this.f123P.mOnClickListener = onClickListener;
            this.f123P.mCheckedItem = i;
            this.f123P.mLabelColumn = str;
            this.f123P.mIsSingleChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            this.f123P.mAdapter = listAdapter;
            this.f123P.mOnClickListener = onClickListener;
            this.f123P.mCheckedItem = i;
            this.f123P.mIsSingleChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            this.f123P.mItems = charSequenceArr;
            this.f123P.mOnClickListener = onClickListener;
            this.f123P.mCheckedItem = i;
            this.f123P.mIsSingleChoice = true;
            return this;
        }

        public Builder setTitle(@StringRes int i) {
            this.f123P.mTitle = this.f123P.mContext.getText(i);
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.f123P.mTitle = charSequence;
            return this;
        }

        public Builder setView(int i) {
            this.f123P.mView = null;
            this.f123P.mViewLayoutResId = i;
            this.f123P.mViewSpacingSpecified = false;
            return this;
        }

        public Builder setView(View view) {
            this.f123P.mView = view;
            this.f123P.mViewLayoutResId = 0;
            this.f123P.mViewSpacingSpecified = false;
            return this;
        }

        @Deprecated
        public Builder setView(View view, int i, int i2, int i3, int i4) {
            this.f123P.mView = view;
            this.f123P.mViewLayoutResId = 0;
            this.f123P.mViewSpacingSpecified = true;
            this.f123P.mViewSpacingLeft = i;
            this.f123P.mViewSpacingTop = i2;
            this.f123P.mViewSpacingRight = i3;
            this.f123P.mViewSpacingBottom = i4;
            return this;
        }

        public AlertDialog show() {
            AlertDialog create = create();
            create.show();
            return create;
        }
    }

    protected AlertDialog(@NonNull Context context) {
        this(context, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AlertDialog(@NonNull Context context, @StyleRes int i) {
        super(context, resolveDialogTheme(context, i));
        this.mAlert = new AlertController(getContext(), this, getWindow());
    }

    protected AlertDialog(@NonNull Context context, boolean z, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int resolveDialogTheme(@NonNull Context context, @StyleRes int i) {
        if (i >= 16777216) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0176R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button getButton(int i) {
        return this.mAlert.getButton(i);
    }

    public ListView getListView() {
        return this.mAlert.getListView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p004v7.app.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mAlert.installContent();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.mAlert.onKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.mAlert.onKeyUp(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setButton(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.setButton(i, charSequence, onClickListener, null);
    }

    public void setButton(int i, CharSequence charSequence, Message message) {
        this.mAlert.setButton(i, charSequence, null, message);
    }

    void setButtonPanelLayoutHint(int i) {
        this.mAlert.setButtonPanelLayoutHint(i);
    }

    public void setCustomTitle(View view) {
        this.mAlert.setCustomTitle(view);
    }

    public void setIcon(int i) {
        this.mAlert.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        this.mAlert.setIcon(drawable);
    }

    public void setIconAttribute(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.mAlert.setIcon(typedValue.resourceId);
    }

    public void setMessage(CharSequence charSequence) {
        this.mAlert.setMessage(charSequence);
    }

    @Override // android.support.p004v7.app.AppCompatDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.mAlert.setTitle(charSequence);
    }

    public void setView(View view) {
        this.mAlert.setView(view);
    }

    public void setView(View view, int i, int i2, int i3, int i4) {
        this.mAlert.setView(view, i, i2, i3, i4);
    }
}
