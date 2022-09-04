package android.support.p004v7.app;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.p004v7.media.MediaRouteSelector;
import android.support.p004v7.media.MediaRouter;
import android.support.p004v7.mediarouter.C0203R;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: android.support.v7.app.MediaRouteChooserDialog */
/* loaded from: classes.dex */
public class MediaRouteChooserDialog extends Dialog {
    private static final String TAG = "MediaRouteChooserDialog";
    private RouteAdapter mAdapter;
    private boolean mAttachedToWindow;
    private final MediaRouterCallback mCallback;
    private ListView mListView;
    private AsyncTask<Void, Void, Void> mOnItemClickTask;
    private AsyncTask<Void, Void, Void> mRefreshRoutesTask;
    private final MediaRouter mRouter;
    private ArrayList<MediaRouter.RouteInfo> mRoutes;
    private MediaRouteSelector mSelector;

    /* renamed from: android.support.v7.app.MediaRouteChooserDialog$MediaRouterCallback */
    /* loaded from: classes.dex */
    private final class MediaRouterCallback extends MediaRouter.Callback {
        private MediaRouterCallback() {
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteChooserDialog.this.refreshRoutes();
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteChooserDialog.this.refreshRoutes();
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteChooserDialog.this.refreshRoutes();
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onRouteSelected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteChooserDialog.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.MediaRouteChooserDialog$RouteAdapter */
    /* loaded from: classes.dex */
    public final class RouteAdapter extends ArrayAdapter<MediaRouter.RouteInfo> implements AdapterView.OnItemClickListener {
        private final Drawable mDefaultIcon;
        private final LayoutInflater mInflater;
        private final Drawable mSpeakerGroupIcon;
        private final Drawable mSpeakerIcon;
        private final Drawable mTvIcon;

        public RouteAdapter(Context context, List<MediaRouter.RouteInfo> list) {
            super(context, 0, list);
            this.mInflater = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C0203R.attr.mediaRouteDefaultIconDrawable, C0203R.attr.mediaRouteTvIconDrawable, C0203R.attr.mediaRouteSpeakerIconDrawable, C0203R.attr.mediaRouteSpeakerGroupIconDrawable});
            this.mDefaultIcon = obtainStyledAttributes.getDrawable(0);
            this.mTvIcon = obtainStyledAttributes.getDrawable(1);
            this.mSpeakerIcon = obtainStyledAttributes.getDrawable(2);
            this.mSpeakerGroupIcon = obtainStyledAttributes.getDrawable(3);
            obtainStyledAttributes.recycle();
        }

        private Drawable getDefaultIconDrawable(MediaRouter.RouteInfo routeInfo) {
            switch (routeInfo.getDeviceType()) {
                case 1:
                    return this.mTvIcon;
                case 2:
                    return this.mSpeakerIcon;
                default:
                    return routeInfo instanceof MediaRouter.RouteGroup ? this.mSpeakerGroupIcon : this.mDefaultIcon;
            }
        }

        private Drawable getIconDrawable(MediaRouter.RouteInfo routeInfo) {
            Uri iconUri = routeInfo.getIconUri();
            if (iconUri != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(iconUri), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e) {
                    Log.w(MediaRouteChooserDialog.TAG, "Failed to load " + iconUri, e);
                }
            }
            return getDefaultIconDrawable(routeInfo);
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            boolean z = true;
            if (view == null) {
                view = this.mInflater.inflate(C0203R.layout.mr_chooser_list_item, viewGroup, false);
            }
            MediaRouter.RouteInfo item = getItem(i);
            TextView textView = (TextView) view.findViewById(C0203R.C0205id.mr_chooser_route_name);
            TextView textView2 = (TextView) view.findViewById(C0203R.C0205id.mr_chooser_route_desc);
            textView.setText(item.getName());
            String description = item.getDescription();
            if (item.getConnectionState() != 2 && item.getConnectionState() != 1) {
                z = false;
            }
            if (!z || TextUtils.isEmpty(description)) {
                textView.setGravity(16);
                textView2.setVisibility(8);
                textView2.setText("");
            } else {
                textView.setGravity(80);
                textView2.setVisibility(0);
                textView2.setText(description);
            }
            view.setEnabled(item.isEnabled());
            ImageView imageView = (ImageView) view.findViewById(C0203R.C0205id.mr_chooser_route_icon);
            if (imageView != null) {
                imageView.setImageDrawable(getIconDrawable(item));
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return getItem(i).isEnabled();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [android.support.v7.app.MediaRouteChooserDialog$RouteAdapter$1] */
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            final MediaRouter.RouteInfo item = getItem(i);
            if (!item.isEnabled() || MediaRouteChooserDialog.this.mOnItemClickTask != null) {
                return;
            }
            MediaRouteChooserDialog.this.mOnItemClickTask = new AsyncTask<Void, Void, Void>() { // from class: android.support.v7.app.MediaRouteChooserDialog.RouteAdapter.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                public Void doInBackground(Void... voidArr) {
                    RouteComparator.getInstance(RouteAdapter.this.getContext()).storeRouteUsageScores(item.getId());
                    return null;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                public void onPostExecute(Void r3) {
                    MediaRouteChooserDialog.this.dismiss();
                    MediaRouteChooserDialog.this.mOnItemClickTask = null;
                }

                @Override // android.os.AsyncTask
                protected void onPreExecute() {
                    item.select();
                }
            }.execute(new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.MediaRouteChooserDialog$RouteComparator */
    /* loaded from: classes.dex */
    public static final class RouteComparator implements Comparator<MediaRouter.RouteInfo> {
        private static final float MIN_USAGE_SCORE = 0.1f;
        private static final String PREF_ROUTE_IDS = "android.support.v7.app.MediaRouteChooserDialog_route_ids";
        private static final String PREF_USAGE_SCORE_PREFIX = "android.support.v7.app.MediaRouteChooserDialog_route_usage_score_";
        private static final float USAGE_SCORE_DECAY_FACTOR = 0.95f;
        private static RouteComparator sInstance;
        private final SharedPreferences mPreferences;
        private final HashMap<String, Float> mRouteUsageScoreMap = new HashMap<>();

        private RouteComparator(Context context) {
            this.mPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        }

        public static RouteComparator getInstance(Context context) {
            if (sInstance == null) {
                sInstance = new RouteComparator(context);
            }
            return sInstance;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loadRouteUsageScores(List<MediaRouter.RouteInfo> list) {
            for (MediaRouter.RouteInfo routeInfo : list) {
                if (this.mRouteUsageScoreMap.get(routeInfo.getId()) == null) {
                    this.mRouteUsageScoreMap.put(routeInfo.getId(), Float.valueOf(this.mPreferences.getFloat(PREF_USAGE_SCORE_PREFIX + routeInfo.getId(), 0.0f)));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void storeRouteUsageScores(String str) {
            SharedPreferences.Editor edit = this.mPreferences.edit();
            ArrayList<String> arrayList = new ArrayList(Arrays.asList(this.mPreferences.getString(PREF_ROUTE_IDS, "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)));
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : arrayList) {
                String str3 = PREF_USAGE_SCORE_PREFIX + str2;
                float f = this.mPreferences.getFloat(str3, 0.0f) * USAGE_SCORE_DECAY_FACTOR;
                if (str.equals(str2)) {
                    f += 1.0f;
                }
                if (f < MIN_USAGE_SCORE) {
                    this.mRouteUsageScoreMap.remove(str2);
                    edit.remove(str2);
                } else {
                    this.mRouteUsageScoreMap.put(str2, Float.valueOf(f));
                    edit.putFloat(str3, f);
                    if (sb.length() > 0) {
                        sb.append(C0494h.f736x);
                    }
                    sb.append(str2);
                }
            }
            edit.putString(PREF_ROUTE_IDS, sb.toString());
            edit.commit();
        }

        @Override // java.util.Comparator
        public int compare(MediaRouter.RouteInfo routeInfo, MediaRouter.RouteInfo routeInfo2) {
            int i = -1;
            if (routeInfo == null) {
                return routeInfo2 == null ? 0 : -1;
            } else if (routeInfo2 == null) {
                return 1;
            } else {
                Float f = this.mRouteUsageScoreMap.get(routeInfo.getId());
                Float valueOf = f == null ? Float.valueOf(0.0f) : f;
                Float f2 = this.mRouteUsageScoreMap.get(routeInfo2.getId());
                if (f2 == null) {
                    f2 = Float.valueOf(0.0f);
                }
                if (valueOf.equals(f2)) {
                    return routeInfo.getName().compareTo(routeInfo2.getName());
                }
                if (valueOf.floatValue() <= f2.floatValue()) {
                    i = 1;
                }
                return i;
            }
        }
    }

    public MediaRouteChooserDialog(Context context) {
        this(context, 0);
    }

    public MediaRouteChooserDialog(Context context, int i) {
        super(MediaRouterThemeHelper.createThemedContext(context, i), i);
        this.mSelector = MediaRouteSelector.EMPTY;
        this.mRouter = MediaRouter.getInstance(getContext());
        this.mCallback = new MediaRouterCallback();
    }

    @NonNull
    public MediaRouteSelector getRouteSelector() {
        return this.mSelector;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        this.mRouter.addCallback(this.mSelector, this.mCallback, 1);
        refreshRoutes();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0203R.layout.mr_chooser_dialog);
        setTitle(C0203R.C0206string.mr_chooser_title);
        this.mRoutes = new ArrayList<>();
        this.mAdapter = new RouteAdapter(getContext(), this.mRoutes);
        this.mListView = (ListView) findViewById(C0203R.C0205id.mr_chooser_list);
        this.mListView.setAdapter((ListAdapter) this.mAdapter);
        this.mListView.setOnItemClickListener(this.mAdapter);
        this.mListView.setEmptyView(findViewById(16908292));
        updateLayout();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.mAttachedToWindow = false;
        this.mRouter.removeCallback(this.mCallback);
        super.onDetachedFromWindow();
    }

    public boolean onFilterRoute(@NonNull MediaRouter.RouteInfo routeInfo) {
        return !routeInfo.isDefaultOrBluetooth() && routeInfo.isEnabled() && routeInfo.matchesSelector(this.mSelector);
    }

    public void onFilterRoutes(@NonNull List<MediaRouter.RouteInfo> list) {
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size > 0) {
                if (!onFilterRoute(list.get(i))) {
                    list.remove(i);
                    size = i;
                } else {
                    size = i;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.support.v7.app.MediaRouteChooserDialog$1] */
    public void refreshRoutes() {
        if (this.mAttachedToWindow) {
            if (this.mRefreshRoutesTask != null) {
                this.mRefreshRoutesTask.cancel(true);
                this.mRefreshRoutesTask = null;
            }
            this.mRefreshRoutesTask = new AsyncTask<Void, Void, Void>() { // from class: android.support.v7.app.MediaRouteChooserDialog.1
                private ArrayList<MediaRouter.RouteInfo> mNewRoutes;

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                public Void doInBackground(Void... voidArr) {
                    synchronized (MediaRouteChooserDialog.this) {
                        if (!isCancelled()) {
                            RouteComparator.getInstance(MediaRouteChooserDialog.this.getContext()).loadRouteUsageScores(this.mNewRoutes);
                        }
                    }
                    return null;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                public void onPostExecute(Void r3) {
                    MediaRouteChooserDialog.this.mRoutes.clear();
                    MediaRouteChooserDialog.this.mRoutes.addAll(this.mNewRoutes);
                    Collections.sort(MediaRouteChooserDialog.this.mRoutes, RouteComparator.sInstance);
                    MediaRouteChooserDialog.this.mAdapter.notifyDataSetChanged();
                    MediaRouteChooserDialog.this.mRefreshRoutesTask = null;
                }

                @Override // android.os.AsyncTask
                protected void onPreExecute() {
                    this.mNewRoutes = new ArrayList<>(MediaRouteChooserDialog.this.mRouter.getRoutes());
                    MediaRouteChooserDialog.this.onFilterRoutes(this.mNewRoutes);
                }
            }.execute(new Void[0]);
        }
    }

    public void setRouteSelector(@NonNull MediaRouteSelector mediaRouteSelector) {
        if (mediaRouteSelector == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.mSelector.equals(mediaRouteSelector)) {
            return;
        }
        this.mSelector = mediaRouteSelector;
        if (this.mAttachedToWindow) {
            this.mRouter.removeCallback(this.mCallback);
            this.mRouter.addCallback(mediaRouteSelector, this.mCallback, 1);
        }
        refreshRoutes();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateLayout() {
        getWindow().setLayout(MediaRouteDialogHelper.getDialogWidth(getContext()), -2);
    }
}
