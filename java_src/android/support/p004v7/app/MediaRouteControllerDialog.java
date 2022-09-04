package android.support.p004v7.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p004v7.app.OverlayListView;
import android.support.p004v7.graphics.Palette;
import android.support.p004v7.media.MediaRouteSelector;
import android.support.p004v7.media.MediaRouter;
import android.support.p004v7.mediarouter.C0203R;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p282m.framework.p285ui.widget.asyncview.AsyncImageView;
/* renamed from: android.support.v7.app.MediaRouteControllerDialog */
/* loaded from: classes.dex */
public class MediaRouteControllerDialog extends AlertDialog {
    private static final int BUTTON_DISCONNECT_RES_ID = 16908314;
    private static final int BUTTON_NEUTRAL_RES_ID = 16908315;
    private static final int BUTTON_STOP_RES_ID = 16908313;
    private static final int VOLUME_UPDATE_DELAY_MILLIS = 500;
    private Interpolator mAccelerateDecelerateInterpolator;
    private final AccessibilityManager mAccessibilityManager;
    private Bitmap mArtIconBitmap;
    private Uri mArtIconUri;
    private ImageView mArtView;
    private boolean mAttachedToWindow;
    private final MediaRouterCallback mCallback;
    private ImageButton mCloseButton;
    private Context mContext;
    private MediaControllerCallback mControllerCallback;
    private boolean mCreated;
    private FrameLayout mCustomControlLayout;
    private View mCustomControlView;
    private FrameLayout mDefaultControlLayout;
    private MediaDescriptionCompat mDescription;
    private LinearLayout mDialogAreaLayout;
    private int mDialogContentWidth;
    private Button mDisconnectButton;
    private View mDividerView;
    private FrameLayout mExpandableAreaLayout;
    private Interpolator mFastOutSlowInInterpolator;
    private FetchArtTask mFetchArtTask;
    private MediaRouteExpandCollapseButton mGroupExpandCollapseButton;
    private int mGroupListAnimationDurationMs;
    private Runnable mGroupListFadeInAnimation;
    private int mGroupListFadeInDurationMs;
    private int mGroupListFadeOutDurationMs;
    private List<MediaRouter.RouteInfo> mGroupMemberRoutes;
    private Set<MediaRouter.RouteInfo> mGroupMemberRoutesAdded;
    private Set<MediaRouter.RouteInfo> mGroupMemberRoutesAnimatingWithBitmap;
    private Set<MediaRouter.RouteInfo> mGroupMemberRoutesRemoved;
    private Interpolator mInterpolator;
    private boolean mIsGroupExpanded;
    private boolean mIsGroupListAnimating;
    private boolean mIsGroupListAnimationPending;
    private Interpolator mLinearOutSlowInInterpolator;
    private MediaControllerCompat mMediaController;
    private LinearLayout mMediaMainControlLayout;
    private ImageButton mPlayPauseButton;
    private RelativeLayout mPlaybackControlLayout;
    private final MediaRouter.RouteInfo mRoute;
    private MediaRouter.RouteInfo mRouteInVolumeSliderTouched;
    private TextView mRouteNameTextView;
    private final MediaRouter mRouter;
    private PlaybackStateCompat mState;
    private Button mStopCastingButton;
    private TextView mSubtitleView;
    private TextView mTitleView;
    private VolumeChangeListener mVolumeChangeListener;
    private boolean mVolumeControlEnabled;
    private LinearLayout mVolumeControlLayout;
    private VolumeGroupAdapter mVolumeGroupAdapter;
    private OverlayListView mVolumeGroupList;
    private int mVolumeGroupListItemHeight;
    private int mVolumeGroupListItemIconSize;
    private int mVolumeGroupListMaxHeight;
    private final int mVolumeGroupListPaddingTop;
    private SeekBar mVolumeSlider;
    private Map<MediaRouter.RouteInfo, SeekBar> mVolumeSliderMap;
    private static final String TAG = "MediaRouteCtrlDialog";
    private static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private static final int CONNECTION_TIMEOUT_MILLIS = (int) TimeUnit.SECONDS.toMillis(30);

    /* renamed from: android.support.v7.app.MediaRouteControllerDialog$ClickListener */
    /* loaded from: classes.dex */
    private final class ClickListener implements View.OnClickListener {
        private ClickListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i = 1;
            int id = view.getId();
            if (id == MediaRouteControllerDialog.BUTTON_STOP_RES_ID || id == MediaRouteControllerDialog.BUTTON_DISCONNECT_RES_ID) {
                if (MediaRouteControllerDialog.this.mRoute.isSelected()) {
                    MediaRouter mediaRouter = MediaRouteControllerDialog.this.mRouter;
                    if (id == MediaRouteControllerDialog.BUTTON_STOP_RES_ID) {
                        i = 2;
                    }
                    mediaRouter.unselect(i);
                }
                MediaRouteControllerDialog.this.dismiss();
            } else if (id != C0203R.C0205id.mr_control_play_pause) {
                if (id != C0203R.C0205id.mr_close) {
                    return;
                }
                MediaRouteControllerDialog.this.dismiss();
            } else if (MediaRouteControllerDialog.this.mMediaController == null || MediaRouteControllerDialog.this.mState == null) {
            } else {
                if (MediaRouteControllerDialog.this.mState.getState() != 3) {
                    i = 0;
                }
                if (i != 0) {
                    MediaRouteControllerDialog.this.mMediaController.getTransportControls().pause();
                } else {
                    MediaRouteControllerDialog.this.mMediaController.getTransportControls().play();
                }
                if (MediaRouteControllerDialog.this.mAccessibilityManager == null || !MediaRouteControllerDialog.this.mAccessibilityManager.isEnabled()) {
                    return;
                }
                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                obtain.setPackageName(MediaRouteControllerDialog.this.mContext.getPackageName());
                obtain.setClassName(getClass().getName());
                obtain.getText().add(MediaRouteControllerDialog.this.mContext.getString(i != 0 ? C0203R.C0206string.mr_controller_pause : C0203R.C0206string.mr_controller_play));
                MediaRouteControllerDialog.this.mAccessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.MediaRouteControllerDialog$FetchArtTask */
    /* loaded from: classes.dex */
    public class FetchArtTask extends AsyncTask<Void, Void, Bitmap> {
        int mBackgroundColor;
        final Bitmap mIconBitmap;
        final Uri mIconUri;
        final /* synthetic */ MediaRouteControllerDialog this$0;

        FetchArtTask(MediaRouteControllerDialog mediaRouteControllerDialog) {
            Uri uri = null;
            this.this$0 = mediaRouteControllerDialog;
            this.mIconBitmap = mediaRouteControllerDialog.mDescription == null ? null : mediaRouteControllerDialog.mDescription.getIconBitmap();
            this.mIconUri = mediaRouteControllerDialog.mDescription != null ? mediaRouteControllerDialog.mDescription.getIconUri() : uri;
        }

        private boolean isIconChanged() {
            if (this.mIconBitmap != this.this$0.mArtIconBitmap) {
                return true;
            }
            return this.mIconBitmap == null && !MediaRouteControllerDialog.uriEquals(this.mIconUri, this.this$0.mArtIconUri);
        }

        private InputStream openInputStreamByScheme(Uri uri) {
            InputStream openInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                openInputStream = this.this$0.mContext.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                openConnection.setConnectTimeout(MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS);
                openConnection.setReadTimeout(MediaRouteControllerDialog.CONNECTION_TIMEOUT_MILLIS);
                openInputStream = openConnection.getInputStream();
            }
            if (openInputStream == null) {
                return null;
            }
            return new BufferedInputStream(openInputStream);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x010f  */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.Bitmap] */
        /* JADX WARN: Type inference failed for: r1v4, types: [android.graphics.Bitmap] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Bitmap doInBackground(Void... voidArr) {
            InputStream inputStream;
            Palette generate;
            int i = 0;
            Bitmap bitmap = 0;
            bitmap = 0;
            bitmap = 0;
            bitmap = 0;
            if (this.mIconBitmap != null) {
                bitmap = this.mIconBitmap;
            } else {
                try {
                    if (this.mIconUri != null) {
                        try {
                            inputStream = openInputStreamByScheme(this.mIconUri);
                            try {
                                if (inputStream == null) {
                                    Log.w(MediaRouteControllerDialog.TAG, "Unable to open: " + this.mIconUri);
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException e) {
                                        }
                                    }
                                    return null;
                                }
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeStream(inputStream, null, options);
                                if (options.outWidth == 0 || options.outHeight == 0) {
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException e2) {
                                        }
                                    }
                                    return null;
                                }
                                try {
                                    inputStream.reset();
                                } catch (IOException e3) {
                                    inputStream.close();
                                    inputStream = openInputStreamByScheme(this.mIconUri);
                                    if (inputStream == null) {
                                        Log.w(MediaRouteControllerDialog.TAG, "Unable to open: " + this.mIconUri);
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException e4) {
                                            }
                                        }
                                        return null;
                                    }
                                }
                                options.inJustDecodeBounds = false;
                                options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / this.this$0.getDesiredArtHeight(options.outWidth, options.outHeight)));
                                if (isCancelled()) {
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException e5) {
                                        }
                                    }
                                    return null;
                                }
                                bitmap = BitmapFactory.decodeStream(inputStream, null, options);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e6) {
                                    }
                                }
                            } catch (IOException e7) {
                                e = e7;
                                Log.w(MediaRouteControllerDialog.TAG, "Unable to open: " + this.mIconUri, e);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e8) {
                                    }
                                }
                                if (bitmap != 0) {
                                    generate = new Palette.Builder(bitmap).maximumColorCount(1).generate();
                                    if (!generate.getSwatches().isEmpty()) {
                                    }
                                    this.mBackgroundColor = i;
                                }
                                return bitmap;
                            }
                        } catch (IOException e9) {
                            e = e9;
                            inputStream = null;
                        } catch (Throwable th) {
                            th = th;
                            if (0 != 0) {
                                try {
                                    bitmap.close();
                                } catch (IOException e10) {
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (bitmap != 0 && bitmap.getWidth() < bitmap.getHeight()) {
                generate = new Palette.Builder(bitmap).maximumColorCount(1).generate();
                if (!generate.getSwatches().isEmpty()) {
                    i = generate.getSwatches().get(0).getRgb();
                }
                this.mBackgroundColor = i;
            }
            return bitmap;
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            this.this$0.mFetchArtTask = null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            this.this$0.mFetchArtTask = null;
            if (this.this$0.mArtIconBitmap == this.mIconBitmap && this.this$0.mArtIconUri == this.mIconUri) {
                return;
            }
            this.this$0.mArtIconBitmap = this.mIconBitmap;
            this.this$0.mArtIconUri = this.mIconUri;
            this.this$0.mArtView.setImageBitmap(bitmap);
            this.this$0.mArtView.setBackgroundColor(this.mBackgroundColor);
            this.this$0.updateLayoutHeight(true);
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            if (!isIconChanged()) {
                cancel(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.MediaRouteControllerDialog$MediaControllerCallback */
    /* loaded from: classes.dex */
    public final class MediaControllerCallback extends MediaControllerCompat.Callback {
        private MediaControllerCallback() {
        }

        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            MediaRouteControllerDialog.this.mDescription = mediaMetadataCompat == null ? null : mediaMetadataCompat.getDescription();
            MediaRouteControllerDialog.this.update(false);
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            MediaRouteControllerDialog.this.mState = playbackStateCompat;
            MediaRouteControllerDialog.this.update(false);
        }

        public void onSessionDestroyed() {
            if (MediaRouteControllerDialog.this.mMediaController != null) {
                MediaRouteControllerDialog.this.mMediaController.unregisterCallback(MediaRouteControllerDialog.this.mControllerCallback);
                MediaRouteControllerDialog.this.mMediaController = null;
            }
        }
    }

    /* renamed from: android.support.v7.app.MediaRouteControllerDialog$MediaRouterCallback */
    /* loaded from: classes.dex */
    private final class MediaRouterCallback extends MediaRouter.Callback {
        private MediaRouterCallback() {
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteControllerDialog.this.update(true);
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onRouteUnselected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteControllerDialog.this.update(false);
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            SeekBar seekBar = (SeekBar) MediaRouteControllerDialog.this.mVolumeSliderMap.get(routeInfo);
            int volume = routeInfo.getVolume();
            if (MediaRouteControllerDialog.DEBUG) {
                Log.d(MediaRouteControllerDialog.TAG, "onRouteVolumeChanged(), route.getVolume:" + volume);
            }
            if (seekBar == null || MediaRouteControllerDialog.this.mRouteInVolumeSliderTouched == routeInfo) {
                return;
            }
            seekBar.setProgress(volume);
        }
    }

    /* renamed from: android.support.v7.app.MediaRouteControllerDialog$VolumeChangeListener */
    /* loaded from: classes.dex */
    private class VolumeChangeListener implements SeekBar.OnSeekBarChangeListener {
        private final Runnable mStopTrackingTouch;

        private VolumeChangeListener() {
            this.mStopTrackingTouch = new Runnable() { // from class: android.support.v7.app.MediaRouteControllerDialog.VolumeChangeListener.1
                @Override // java.lang.Runnable
                public void run() {
                    if (MediaRouteControllerDialog.this.mRouteInVolumeSliderTouched != null) {
                        MediaRouteControllerDialog.this.mRouteInVolumeSliderTouched = null;
                    }
                }
            };
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) seekBar.getTag();
                if (MediaRouteControllerDialog.DEBUG) {
                    Log.d(MediaRouteControllerDialog.TAG, "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(" + i + ")");
                }
                routeInfo.requestSetVolume(i);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            if (MediaRouteControllerDialog.this.mRouteInVolumeSliderTouched != null) {
                MediaRouteControllerDialog.this.mVolumeSlider.removeCallbacks(this.mStopTrackingTouch);
            }
            MediaRouteControllerDialog.this.mRouteInVolumeSliderTouched = (MediaRouter.RouteInfo) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            MediaRouteControllerDialog.this.mVolumeSlider.postDelayed(this.mStopTrackingTouch, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.MediaRouteControllerDialog$VolumeGroupAdapter */
    /* loaded from: classes.dex */
    public class VolumeGroupAdapter extends ArrayAdapter<MediaRouter.RouteInfo> {
        final float mDisabledAlpha;

        public VolumeGroupAdapter(Context context, List<MediaRouter.RouteInfo> list) {
            super(context, 0, list);
            this.mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(context);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            int i2 = 0;
            if (view == null) {
                view = LayoutInflater.from(MediaRouteControllerDialog.this.mContext).inflate(C0203R.layout.mr_controller_volume_item, viewGroup, false);
            } else {
                MediaRouteControllerDialog.this.updateVolumeGroupItemHeight(view);
            }
            MediaRouter.RouteInfo item = getItem(i);
            if (item != null) {
                boolean isEnabled = item.isEnabled();
                TextView textView = (TextView) view.findViewById(C0203R.C0205id.mr_name);
                textView.setEnabled(isEnabled);
                textView.setText(item.getName());
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(C0203R.C0205id.mr_volume_slider);
                MediaRouterThemeHelper.setVolumeSliderColor(MediaRouteControllerDialog.this.mContext, mediaRouteVolumeSlider, MediaRouteControllerDialog.this.mVolumeGroupList);
                mediaRouteVolumeSlider.setTag(item);
                MediaRouteControllerDialog.this.mVolumeSliderMap.put(item, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.setHideThumb(!isEnabled);
                mediaRouteVolumeSlider.setEnabled(isEnabled);
                if (isEnabled) {
                    if (MediaRouteControllerDialog.this.isVolumeControlAvailable(item)) {
                        mediaRouteVolumeSlider.setMax(item.getVolumeMax());
                        mediaRouteVolumeSlider.setProgress(item.getVolume());
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(MediaRouteControllerDialog.this.mVolumeChangeListener);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ((ImageView) view.findViewById(C0203R.C0205id.mr_volume_item_icon)).setAlpha(isEnabled ? 255 : (int) (255.0f * this.mDisabledAlpha));
                LinearLayout linearLayout = (LinearLayout) view.findViewById(C0203R.C0205id.volume_item_container);
                if (MediaRouteControllerDialog.this.mGroupMemberRoutesAnimatingWithBitmap.contains(item)) {
                    i2 = 4;
                }
                linearLayout.setVisibility(i2);
                if (MediaRouteControllerDialog.this.mGroupMemberRoutesAdded != null && MediaRouteControllerDialog.this.mGroupMemberRoutesAdded.contains(item)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0L);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }
    }

    public MediaRouteControllerDialog(Context context) {
        this(context, 0);
    }

    public MediaRouteControllerDialog(Context context, int i) {
        super(MediaRouterThemeHelper.createThemedContext(context, i), i);
        this.mVolumeControlEnabled = true;
        this.mGroupListFadeInAnimation = new Runnable() { // from class: android.support.v7.app.MediaRouteControllerDialog.1
            @Override // java.lang.Runnable
            public void run() {
                MediaRouteControllerDialog.this.startGroupListFadeInAnimation();
            }
        };
        this.mContext = getContext();
        this.mControllerCallback = new MediaControllerCallback();
        this.mRouter = MediaRouter.getInstance(this.mContext);
        this.mCallback = new MediaRouterCallback();
        this.mRoute = this.mRouter.getSelectedRoute();
        setMediaSession(this.mRouter.getMediaSessionToken());
        this.mVolumeGroupListPaddingTop = this.mContext.getResources().getDimensionPixelSize(C0203R.dimen.mr_controller_volume_group_list_padding_top);
        this.mAccessibilityManager = (AccessibilityManager) this.mContext.getSystemService("accessibility");
        if (Build.VERSION.SDK_INT >= 21) {
            this.mLinearOutSlowInInterpolator = AnimationUtils.loadInterpolator(context, C0203R.interpolator.mr_linear_out_slow_in);
            this.mFastOutSlowInInterpolator = AnimationUtils.loadInterpolator(context, C0203R.interpolator.mr_fast_out_slow_in);
        }
        this.mAccelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
    }

    private void animateGroupListItems(final Map<MediaRouter.RouteInfo, Rect> map, final Map<MediaRouter.RouteInfo, BitmapDrawable> map2) {
        this.mVolumeGroupList.setEnabled(false);
        this.mVolumeGroupList.requestLayout();
        this.mIsGroupListAnimating = true;
        this.mVolumeGroupList.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.app.MediaRouteControllerDialog.8
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                MediaRouteControllerDialog.this.mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                MediaRouteControllerDialog.this.animateGroupListItemsInternal(map, map2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animateGroupListItemsInternal(Map<MediaRouter.RouteInfo, Rect> map, Map<MediaRouter.RouteInfo, BitmapDrawable> map2) {
        OverlayListView.OverlayObject animationEndListener;
        if (this.mGroupMemberRoutesAdded == null || this.mGroupMemberRoutesRemoved == null) {
            return;
        }
        int size = this.mGroupMemberRoutesAdded.size() - this.mGroupMemberRoutesRemoved.size();
        boolean z = false;
        Animation.AnimationListener animationListener = new Animation.AnimationListener() { // from class: android.support.v7.app.MediaRouteControllerDialog.9
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                MediaRouteControllerDialog.this.mVolumeGroupList.startAnimationAll();
                MediaRouteControllerDialog.this.mVolumeGroupList.postDelayed(MediaRouteControllerDialog.this.mGroupListFadeInAnimation, MediaRouteControllerDialog.this.mGroupListAnimationDurationMs);
            }
        };
        int firstVisiblePosition = this.mVolumeGroupList.getFirstVisiblePosition();
        int i = 0;
        while (true) {
            int i2 = i;
            boolean z2 = z;
            if (i2 >= this.mVolumeGroupList.getChildCount()) {
                break;
            }
            View childAt = this.mVolumeGroupList.getChildAt(i2);
            MediaRouter.RouteInfo item = this.mVolumeGroupAdapter.getItem(firstVisiblePosition + i2);
            Rect rect = map.get(item);
            int top = childAt.getTop();
            int i3 = rect != null ? rect.top : (this.mVolumeGroupListItemHeight * size) + top;
            AnimationSet animationSet = new AnimationSet(true);
            if (this.mGroupMemberRoutesAdded != null && this.mGroupMemberRoutesAdded.contains(item)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(this.mGroupListFadeInDurationMs);
                animationSet.addAnimation(alphaAnimation);
                i3 = top;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i3 - top, 0.0f);
            translateAnimation.setDuration(this.mGroupListAnimationDurationMs);
            animationSet.addAnimation(translateAnimation);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setInterpolator(this.mInterpolator);
            if (!z2) {
                z = true;
                animationSet.setAnimationListener(animationListener);
            } else {
                z = z2;
            }
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
            map.remove(item);
            map2.remove(item);
            i = i2 + 1;
        }
        for (Map.Entry<MediaRouter.RouteInfo, BitmapDrawable> entry : map2.entrySet()) {
            final MediaRouter.RouteInfo key = entry.getKey();
            BitmapDrawable value = entry.getValue();
            Rect rect2 = map.get(key);
            if (this.mGroupMemberRoutesRemoved.contains(key)) {
                animationEndListener = new OverlayListView.OverlayObject(value, rect2).setAlphaAnimation(1.0f, 0.0f).setDuration(this.mGroupListFadeOutDurationMs).setInterpolator(this.mInterpolator);
            } else {
                animationEndListener = new OverlayListView.OverlayObject(value, rect2).setTranslateYAnimation(this.mVolumeGroupListItemHeight * size).setDuration(this.mGroupListAnimationDurationMs).setInterpolator(this.mInterpolator).setAnimationEndListener(new OverlayListView.OverlayObject.OnAnimationEndListener() { // from class: android.support.v7.app.MediaRouteControllerDialog.10
                    @Override // android.support.p004v7.app.OverlayListView.OverlayObject.OnAnimationEndListener
                    public void onAnimationEnd() {
                        MediaRouteControllerDialog.this.mGroupMemberRoutesAnimatingWithBitmap.remove(key);
                        MediaRouteControllerDialog.this.mVolumeGroupAdapter.notifyDataSetChanged();
                    }
                });
                this.mGroupMemberRoutesAnimatingWithBitmap.add(key);
            }
            this.mVolumeGroupList.addOverlayObject(animationEndListener);
        }
    }

    private void animateLayoutHeight(final View view, final int i) {
        final int layoutHeight = getLayoutHeight(view);
        Animation animation = new Animation() { // from class: android.support.v7.app.MediaRouteControllerDialog.7
            @Override // android.view.animation.Animation
            protected void applyTransformation(float f, Transformation transformation) {
                MediaRouteControllerDialog.setLayoutHeight(view, layoutHeight - ((int) ((layoutHeight - i) * f)));
            }
        };
        animation.setDuration(this.mGroupListAnimationDurationMs);
        if (Build.VERSION.SDK_INT >= 21) {
            animation.setInterpolator(this.mInterpolator);
        }
        view.startAnimation(animation);
    }

    private boolean canShowPlaybackControlLayout() {
        return this.mCustomControlView == null && !(this.mDescription == null && this.mState == null);
    }

    private void fadeInAddedRoutes() {
        Animation.AnimationListener animationListener = new Animation.AnimationListener() { // from class: android.support.v7.app.MediaRouteControllerDialog.12
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MediaRouteControllerDialog.this.finishAnimation(true);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        int firstVisiblePosition = this.mVolumeGroupList.getFirstVisiblePosition();
        boolean z = false;
        for (int i = 0; i < this.mVolumeGroupList.getChildCount(); i++) {
            View childAt = this.mVolumeGroupList.getChildAt(i);
            if (this.mGroupMemberRoutesAdded.contains(this.mVolumeGroupAdapter.getItem(firstVisiblePosition + i))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(this.mGroupListFadeInDurationMs);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z) {
                    alphaAnimation.setAnimationListener(animationListener);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishAnimation(boolean z) {
        this.mGroupMemberRoutesAdded = null;
        this.mGroupMemberRoutesRemoved = null;
        this.mIsGroupListAnimating = false;
        if (this.mIsGroupListAnimationPending) {
            this.mIsGroupListAnimationPending = false;
            updateLayoutHeight(z);
        }
        this.mVolumeGroupList.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getDesiredArtHeight(int i, int i2) {
        return i >= i2 ? (int) (((this.mDialogContentWidth * i2) / i) + 0.5f) : (int) (((this.mDialogContentWidth * 9.0f) / 16.0f) + 0.5f);
    }

    private MediaRouter.RouteGroup getGroup() {
        if (this.mRoute instanceof MediaRouter.RouteGroup) {
            return (MediaRouter.RouteGroup) this.mRoute;
        }
        return null;
    }

    private static int getLayoutHeight(View view) {
        return view.getLayoutParams().height;
    }

    private int getMainControllerHeight(boolean z) {
        if (z || this.mVolumeControlLayout.getVisibility() == 0) {
            int paddingTop = 0 + this.mMediaMainControlLayout.getPaddingTop() + this.mMediaMainControlLayout.getPaddingBottom();
            if (z) {
                paddingTop += this.mPlaybackControlLayout.getMeasuredHeight();
            }
            if (this.mVolumeControlLayout.getVisibility() == 0) {
                paddingTop += this.mVolumeControlLayout.getMeasuredHeight();
            }
            return (!z || this.mVolumeControlLayout.getVisibility() != 0) ? paddingTop : paddingTop + this.mDividerView.getMeasuredHeight();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isVolumeControlAvailable(MediaRouter.RouteInfo routeInfo) {
        return this.mVolumeControlEnabled && routeInfo.getVolumeHandling() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadInterpolator() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.mInterpolator = this.mIsGroupExpanded ? this.mLinearOutSlowInInterpolator : this.mFastOutSlowInInterpolator;
        } else {
            this.mInterpolator = this.mAccelerateDecelerateInterpolator;
        }
    }

    private void rebuildVolumeGroupList(boolean z) {
        List<MediaRouter.RouteInfo> routes = getGroup() == null ? null : getGroup().getRoutes();
        if (routes == null) {
            this.mGroupMemberRoutes.clear();
            this.mVolumeGroupAdapter.notifyDataSetChanged();
        } else if (MediaRouteDialogHelper.listUnorderedEquals(this.mGroupMemberRoutes, routes)) {
            this.mVolumeGroupAdapter.notifyDataSetChanged();
        } else {
            HashMap itemBoundMap = z ? MediaRouteDialogHelper.getItemBoundMap(this.mVolumeGroupList, this.mVolumeGroupAdapter) : null;
            HashMap itemBitmapMap = z ? MediaRouteDialogHelper.getItemBitmapMap(this.mContext, this.mVolumeGroupList, this.mVolumeGroupAdapter) : null;
            this.mGroupMemberRoutesAdded = MediaRouteDialogHelper.getItemsAdded(this.mGroupMemberRoutes, routes);
            this.mGroupMemberRoutesRemoved = MediaRouteDialogHelper.getItemsRemoved(this.mGroupMemberRoutes, routes);
            this.mGroupMemberRoutes.addAll(0, this.mGroupMemberRoutesAdded);
            this.mGroupMemberRoutes.removeAll(this.mGroupMemberRoutesRemoved);
            this.mVolumeGroupAdapter.notifyDataSetChanged();
            if (z && this.mIsGroupExpanded && this.mGroupMemberRoutesAdded.size() + this.mGroupMemberRoutesRemoved.size() > 0) {
                animateGroupListItems(itemBoundMap, itemBitmapMap);
                return;
            }
            this.mGroupMemberRoutesAdded = null;
            this.mGroupMemberRoutesRemoved = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setLayoutHeight(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    private void setMediaSession(MediaSessionCompat.Token token) {
        PlaybackStateCompat playbackStateCompat = null;
        if (this.mMediaController != null) {
            this.mMediaController.unregisterCallback(this.mControllerCallback);
            this.mMediaController = null;
        }
        if (token != null && this.mAttachedToWindow) {
            try {
                this.mMediaController = new MediaControllerCompat(this.mContext, token);
            } catch (RemoteException e) {
                Log.e(TAG, "Error creating media controller in setMediaSession.", e);
            }
            if (this.mMediaController != null) {
                this.mMediaController.registerCallback(this.mControllerCallback);
            }
            MediaMetadataCompat metadata = this.mMediaController == null ? null : this.mMediaController.getMetadata();
            this.mDescription = metadata == null ? null : metadata.getDescription();
            if (this.mMediaController != null) {
                playbackStateCompat = this.mMediaController.getPlaybackState();
            }
            this.mState = playbackStateCompat;
            update(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startGroupListFadeInAnimation() {
        clearGroupListAnimation(true);
        this.mVolumeGroupList.requestLayout();
        this.mVolumeGroupList.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.app.MediaRouteControllerDialog.11
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                MediaRouteControllerDialog.this.mVolumeGroupList.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                MediaRouteControllerDialog.this.startGroupListFadeInAnimationInternal();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startGroupListFadeInAnimationInternal() {
        if (this.mGroupMemberRoutesAdded == null || this.mGroupMemberRoutesAdded.size() == 0) {
            finishAnimation(true);
        } else {
            fadeInAddedRoutes();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void update(boolean z) {
        if (!this.mRoute.isSelected() || this.mRoute.isDefaultOrBluetooth()) {
            dismiss();
        } else if (!this.mCreated) {
        } else {
            this.mRouteNameTextView.setText(this.mRoute.getName());
            this.mDisconnectButton.setVisibility(this.mRoute.canDisconnect() ? 0 : 8);
            if (this.mCustomControlView == null) {
                if (this.mFetchArtTask != null) {
                    this.mFetchArtTask.cancel(true);
                }
                this.mFetchArtTask = new FetchArtTask(this);
                this.mFetchArtTask.execute(new Void[0]);
            }
            updateVolumeControlLayout();
            updatePlaybackControlLayout();
            updateLayoutHeight(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLayoutHeight(final boolean z) {
        this.mDefaultControlLayout.requestLayout();
        this.mDefaultControlLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.app.MediaRouteControllerDialog.6
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                MediaRouteControllerDialog.this.mDefaultControlLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                if (MediaRouteControllerDialog.this.mIsGroupListAnimating) {
                    MediaRouteControllerDialog.this.mIsGroupListAnimationPending = true;
                } else {
                    MediaRouteControllerDialog.this.updateLayoutHeightInternal(z);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLayoutHeightInternal(boolean z) {
        int i;
        int i2;
        int i3;
        Bitmap bitmap;
        boolean z2 = true;
        int layoutHeight = getLayoutHeight(this.mMediaMainControlLayout);
        setLayoutHeight(this.mMediaMainControlLayout, -1);
        updateMediaControlVisibility(canShowPlaybackControlLayout());
        View decorView = getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(getWindow().getAttributes().width, 1073741824), 0);
        setLayoutHeight(this.mMediaMainControlLayout, layoutHeight);
        if (this.mCustomControlView != null || !(this.mArtView.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) this.mArtView.getDrawable()).getBitmap()) == null) {
            i = 0;
        } else {
            int desiredArtHeight = getDesiredArtHeight(bitmap.getWidth(), bitmap.getHeight());
            this.mArtView.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
            i = desiredArtHeight;
        }
        int mainControllerHeight = getMainControllerHeight(canShowPlaybackControlLayout());
        int size = this.mGroupMemberRoutes.size();
        int size2 = getGroup() == null ? 0 : this.mVolumeGroupListItemHeight * getGroup().getRoutes().size();
        if (size > 0) {
            size2 += this.mVolumeGroupListPaddingTop;
        }
        int min = Math.min(size2, this.mVolumeGroupListMaxHeight);
        if (!this.mIsGroupExpanded) {
            min = 0;
        }
        int max = Math.max(i, min) + mainControllerHeight;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (this.mDialogAreaLayout.getMeasuredHeight() - this.mDefaultControlLayout.getMeasuredHeight());
        if (this.mCustomControlView != null || i <= 0 || max > height) {
            if (getLayoutHeight(this.mVolumeGroupList) + this.mMediaMainControlLayout.getMeasuredHeight() >= this.mDefaultControlLayout.getMeasuredHeight()) {
                this.mArtView.setVisibility(8);
            }
            i2 = min + mainControllerHeight;
            i3 = 0;
        } else {
            this.mArtView.setVisibility(0);
            setLayoutHeight(this.mArtView, i);
            i3 = i;
            i2 = max;
        }
        if (!canShowPlaybackControlLayout() || i2 > height) {
            this.mPlaybackControlLayout.setVisibility(8);
        } else {
            this.mPlaybackControlLayout.setVisibility(0);
        }
        updateMediaControlVisibility(this.mPlaybackControlLayout.getVisibility() == 0);
        if (this.mPlaybackControlLayout.getVisibility() != 0) {
            z2 = false;
        }
        int mainControllerHeight2 = getMainControllerHeight(z2);
        int max2 = Math.max(i3, min) + mainControllerHeight2;
        if (max2 > height) {
            min -= max2 - height;
            max2 = height;
        }
        this.mMediaMainControlLayout.clearAnimation();
        this.mVolumeGroupList.clearAnimation();
        this.mDefaultControlLayout.clearAnimation();
        if (z) {
            animateLayoutHeight(this.mMediaMainControlLayout, mainControllerHeight2);
            animateLayoutHeight(this.mVolumeGroupList, min);
            animateLayoutHeight(this.mDefaultControlLayout, max2);
        } else {
            setLayoutHeight(this.mMediaMainControlLayout, mainControllerHeight2);
            setLayoutHeight(this.mVolumeGroupList, min);
            setLayoutHeight(this.mDefaultControlLayout, max2);
        }
        setLayoutHeight(this.mExpandableAreaLayout, rect.height());
        rebuildVolumeGroupList(z);
    }

    private void updateMediaControlVisibility(boolean z) {
        int i = 8;
        this.mDividerView.setVisibility((this.mVolumeControlLayout.getVisibility() != 0 || !z) ? 8 : 0);
        LinearLayout linearLayout = this.mMediaMainControlLayout;
        if (this.mVolumeControlLayout.getVisibility() != 8 || z) {
            i = 0;
        }
        linearLayout.setVisibility(i);
    }

    private void updatePlaybackControlLayout() {
        boolean z;
        boolean z2;
        boolean z3;
        CharSequence charSequence = null;
        boolean z4 = true;
        if (canShowPlaybackControlLayout()) {
            CharSequence title = this.mDescription == null ? null : this.mDescription.getTitle();
            boolean z5 = !TextUtils.isEmpty(title);
            if (this.mDescription != null) {
                charSequence = this.mDescription.getSubtitle();
            }
            boolean z6 = !TextUtils.isEmpty(charSequence);
            if (this.mRoute.getPresentationDisplayId() != -1) {
                this.mTitleView.setText(C0203R.C0206string.mr_controller_casting_screen);
                z = false;
                z2 = true;
            } else if (this.mState == null || this.mState.getState() == 0) {
                this.mTitleView.setText(C0203R.C0206string.mr_controller_no_media_selected);
                z = false;
                z2 = true;
            } else if (z5 || z6) {
                if (z5) {
                    this.mTitleView.setText(title);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z6) {
                    this.mSubtitleView.setText(charSequence);
                    z2 = z3;
                    z = true;
                } else {
                    z2 = z3;
                    z = false;
                }
            } else {
                this.mTitleView.setText(C0203R.C0206string.mr_controller_no_info_available);
                z = false;
                z2 = true;
            }
            this.mTitleView.setVisibility(z2 ? 0 : 8);
            this.mSubtitleView.setVisibility(z ? 0 : 8);
            if (this.mState == null) {
                return;
            }
            boolean z7 = this.mState.getState() == 6 || this.mState.getState() == 3;
            boolean z8 = (this.mState.getActions() & 516) != 0;
            if ((this.mState.getActions() & 514) == 0) {
                z4 = false;
            }
            if (z7 && z4) {
                this.mPlayPauseButton.setVisibility(0);
                this.mPlayPauseButton.setImageResource(MediaRouterThemeHelper.getThemeResource(this.mContext, C0203R.attr.mediaRoutePauseDrawable));
                this.mPlayPauseButton.setContentDescription(this.mContext.getResources().getText(C0203R.C0206string.mr_controller_pause));
            } else if (z7 || !z8) {
                this.mPlayPauseButton.setVisibility(8);
            } else {
                this.mPlayPauseButton.setVisibility(0);
                this.mPlayPauseButton.setImageResource(MediaRouterThemeHelper.getThemeResource(this.mContext, C0203R.attr.mediaRoutePlayDrawable));
                this.mPlayPauseButton.setContentDescription(this.mContext.getResources().getText(C0203R.C0206string.mr_controller_play));
            }
        }
    }

    private void updateVolumeControlLayout() {
        int i = 8;
        if (!isVolumeControlAvailable(this.mRoute)) {
            this.mVolumeControlLayout.setVisibility(8);
        } else if (this.mVolumeControlLayout.getVisibility() != 8) {
        } else {
            this.mVolumeControlLayout.setVisibility(0);
            this.mVolumeSlider.setMax(this.mRoute.getVolumeMax());
            this.mVolumeSlider.setProgress(this.mRoute.getVolume());
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.mGroupExpandCollapseButton;
            if (getGroup() != null) {
                i = 0;
            }
            mediaRouteExpandCollapseButton.setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateVolumeGroupItemHeight(View view) {
        setLayoutHeight((LinearLayout) view.findViewById(C0203R.C0205id.volume_item_container), this.mVolumeGroupListItemHeight);
        View findViewById = view.findViewById(C0203R.C0205id.mr_volume_item_icon);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.width = this.mVolumeGroupListItemIconSize;
        layoutParams.height = this.mVolumeGroupListItemIconSize;
        findViewById.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean uriEquals(Uri uri, Uri uri2) {
        if (uri == null || !uri.equals(uri2)) {
            return uri == null && uri2 == null;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearGroupListAnimation(boolean z) {
        int firstVisiblePosition = this.mVolumeGroupList.getFirstVisiblePosition();
        for (int i = 0; i < this.mVolumeGroupList.getChildCount(); i++) {
            View childAt = this.mVolumeGroupList.getChildAt(i);
            MediaRouter.RouteInfo item = this.mVolumeGroupAdapter.getItem(firstVisiblePosition + i);
            if (!z || this.mGroupMemberRoutesAdded == null || !this.mGroupMemberRoutesAdded.contains(item)) {
                ((LinearLayout) childAt.findViewById(C0203R.C0205id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        this.mVolumeGroupList.stopAnimationAll();
        if (!z) {
            finishAnimation(false);
        }
    }

    public View getMediaControlView() {
        return this.mCustomControlView;
    }

    public MediaSessionCompat.Token getMediaSession() {
        if (this.mMediaController == null) {
            return null;
        }
        return this.mMediaController.getSessionToken();
    }

    public MediaRouter.RouteInfo getRoute() {
        return this.mRoute;
    }

    public boolean isVolumeControlEnabled() {
        return this.mVolumeControlEnabled;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        this.mRouter.addCallback(MediaRouteSelector.EMPTY, this.mCallback, 2);
        setMediaSession(this.mRouter.getMediaSessionToken());
    }

    @Override // android.support.p004v7.app.AlertDialog, android.support.p004v7.app.AppCompatDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(AsyncImageView.f35337a);
        setContentView(C0203R.layout.mr_controller_material_dialog_b);
        findViewById(BUTTON_NEUTRAL_RES_ID).setVisibility(8);
        ClickListener clickListener = new ClickListener();
        this.mExpandableAreaLayout = (FrameLayout) findViewById(C0203R.C0205id.mr_expandable_area);
        this.mExpandableAreaLayout.setOnClickListener(new View.OnClickListener() { // from class: android.support.v7.app.MediaRouteControllerDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MediaRouteControllerDialog.this.dismiss();
            }
        });
        this.mDialogAreaLayout = (LinearLayout) findViewById(C0203R.C0205id.mr_dialog_area);
        this.mDialogAreaLayout.setOnClickListener(new View.OnClickListener() { // from class: android.support.v7.app.MediaRouteControllerDialog.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        int buttonTextColor = MediaRouterThemeHelper.getButtonTextColor(this.mContext);
        this.mDisconnectButton = (Button) findViewById(BUTTON_DISCONNECT_RES_ID);
        this.mDisconnectButton.setText(C0203R.C0206string.mr_controller_disconnect);
        this.mDisconnectButton.setTextColor(buttonTextColor);
        this.mDisconnectButton.setOnClickListener(clickListener);
        this.mStopCastingButton = (Button) findViewById(BUTTON_STOP_RES_ID);
        this.mStopCastingButton.setText(C0203R.C0206string.mr_controller_stop);
        this.mStopCastingButton.setTextColor(buttonTextColor);
        this.mStopCastingButton.setOnClickListener(clickListener);
        this.mRouteNameTextView = (TextView) findViewById(C0203R.C0205id.mr_name);
        this.mCloseButton = (ImageButton) findViewById(C0203R.C0205id.mr_close);
        this.mCloseButton.setOnClickListener(clickListener);
        this.mCustomControlLayout = (FrameLayout) findViewById(C0203R.C0205id.mr_custom_control);
        this.mDefaultControlLayout = (FrameLayout) findViewById(C0203R.C0205id.mr_default_control);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: android.support.v7.app.MediaRouteControllerDialog.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PendingIntent sessionActivity;
                if (MediaRouteControllerDialog.this.mMediaController == null || (sessionActivity = MediaRouteControllerDialog.this.mMediaController.getSessionActivity()) == null) {
                    return;
                }
                try {
                    sessionActivity.send();
                    MediaRouteControllerDialog.this.dismiss();
                } catch (PendingIntent.CanceledException e) {
                    Log.e(MediaRouteControllerDialog.TAG, sessionActivity + " was not sent, it had been canceled.");
                }
            }
        };
        this.mArtView = (ImageView) findViewById(C0203R.C0205id.mr_art);
        this.mArtView.setOnClickListener(onClickListener);
        findViewById(C0203R.C0205id.mr_control_title_container).setOnClickListener(onClickListener);
        this.mMediaMainControlLayout = (LinearLayout) findViewById(C0203R.C0205id.mr_media_main_control);
        this.mDividerView = findViewById(C0203R.C0205id.mr_control_divider);
        this.mPlaybackControlLayout = (RelativeLayout) findViewById(C0203R.C0205id.mr_playback_control);
        this.mTitleView = (TextView) findViewById(C0203R.C0205id.mr_control_title);
        this.mSubtitleView = (TextView) findViewById(C0203R.C0205id.mr_control_subtitle);
        this.mPlayPauseButton = (ImageButton) findViewById(C0203R.C0205id.mr_control_play_pause);
        this.mPlayPauseButton.setOnClickListener(clickListener);
        this.mVolumeControlLayout = (LinearLayout) findViewById(C0203R.C0205id.mr_volume_control);
        this.mVolumeControlLayout.setVisibility(8);
        this.mVolumeSlider = (SeekBar) findViewById(C0203R.C0205id.mr_volume_slider);
        this.mVolumeSlider.setTag(this.mRoute);
        this.mVolumeChangeListener = new VolumeChangeListener();
        this.mVolumeSlider.setOnSeekBarChangeListener(this.mVolumeChangeListener);
        this.mVolumeGroupList = (OverlayListView) findViewById(C0203R.C0205id.mr_volume_group_list);
        this.mGroupMemberRoutes = new ArrayList();
        this.mVolumeGroupAdapter = new VolumeGroupAdapter(this.mContext, this.mGroupMemberRoutes);
        this.mVolumeGroupList.setAdapter((ListAdapter) this.mVolumeGroupAdapter);
        this.mGroupMemberRoutesAnimatingWithBitmap = new HashSet();
        MediaRouterThemeHelper.setMediaControlsBackgroundColor(this.mContext, this.mMediaMainControlLayout, this.mVolumeGroupList, getGroup() != null);
        MediaRouterThemeHelper.setVolumeSliderColor(this.mContext, (MediaRouteVolumeSlider) this.mVolumeSlider, this.mMediaMainControlLayout);
        this.mVolumeSliderMap = new HashMap();
        this.mVolumeSliderMap.put(this.mRoute, this.mVolumeSlider);
        this.mGroupExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(C0203R.C0205id.mr_group_expand_collapse);
        this.mGroupExpandCollapseButton.setOnClickListener(new View.OnClickListener() { // from class: android.support.v7.app.MediaRouteControllerDialog.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MediaRouteControllerDialog.this.mIsGroupExpanded = !MediaRouteControllerDialog.this.mIsGroupExpanded;
                if (MediaRouteControllerDialog.this.mIsGroupExpanded) {
                    MediaRouteControllerDialog.this.mVolumeGroupList.setVisibility(0);
                }
                MediaRouteControllerDialog.this.loadInterpolator();
                MediaRouteControllerDialog.this.updateLayoutHeight(true);
            }
        });
        loadInterpolator();
        this.mGroupListAnimationDurationMs = this.mContext.getResources().getInteger(C0203R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.mGroupListFadeInDurationMs = this.mContext.getResources().getInteger(C0203R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.mGroupListFadeOutDurationMs = this.mContext.getResources().getInteger(C0203R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.mCustomControlView = onCreateMediaControlView(bundle);
        if (this.mCustomControlView != null) {
            this.mCustomControlLayout.addView(this.mCustomControlView);
            this.mCustomControlLayout.setVisibility(0);
        }
        this.mCreated = true;
        updateLayout();
    }

    public View onCreateMediaControlView(Bundle bundle) {
        return null;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.mRouter.removeCallback(this.mCallback);
        setMediaSession(null);
        this.mAttachedToWindow = false;
        super.onDetachedFromWindow();
    }

    @Override // android.support.p004v7.app.AlertDialog, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            this.mRoute.requestUpdateVolume(i == 25 ? -1 : 1);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.support.p004v7.app.AlertDialog, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setVolumeControlEnabled(boolean z) {
        if (this.mVolumeControlEnabled != z) {
            this.mVolumeControlEnabled = z;
            if (!this.mCreated) {
                return;
            }
            updateVolumeControlLayout();
            updateLayoutHeight(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateLayout() {
        int dialogWidth = MediaRouteDialogHelper.getDialogWidth(this.mContext);
        getWindow().setLayout(dialogWidth, -2);
        View decorView = getWindow().getDecorView();
        this.mDialogContentWidth = (dialogWidth - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.mContext.getResources();
        this.mVolumeGroupListItemIconSize = resources.getDimensionPixelSize(C0203R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.mVolumeGroupListItemHeight = resources.getDimensionPixelSize(C0203R.dimen.mr_controller_volume_group_list_item_height);
        this.mVolumeGroupListMaxHeight = resources.getDimensionPixelSize(C0203R.dimen.mr_controller_volume_group_list_max_height);
        this.mArtIconBitmap = null;
        this.mArtIconUri = null;
        update(false);
    }
}
