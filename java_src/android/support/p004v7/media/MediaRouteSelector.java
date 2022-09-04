package android.support.p004v7.media;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* renamed from: android.support.v7.media.MediaRouteSelector */
/* loaded from: classes.dex */
public final class MediaRouteSelector {
    public static final MediaRouteSelector EMPTY = new MediaRouteSelector(new Bundle(), null);
    private static final String KEY_CONTROL_CATEGORIES = "controlCategories";
    private final Bundle mBundle;
    private List<String> mControlCategories;

    /* renamed from: android.support.v7.media.MediaRouteSelector$Builder */
    /* loaded from: classes.dex */
    public static final class Builder {
        private ArrayList<String> mControlCategories;

        public Builder() {
        }

        public Builder(@NonNull MediaRouteSelector mediaRouteSelector) {
            if (mediaRouteSelector == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            mediaRouteSelector.ensureControlCategories();
            if (mediaRouteSelector.mControlCategories.isEmpty()) {
                return;
            }
            this.mControlCategories = new ArrayList<>(mediaRouteSelector.mControlCategories);
        }

        @NonNull
        public Builder addControlCategories(@NonNull Collection<String> collection) {
            if (collection == null) {
                throw new IllegalArgumentException("categories must not be null");
            }
            if (!collection.isEmpty()) {
                for (String str : collection) {
                    addControlCategory(str);
                }
            }
            return this;
        }

        @NonNull
        public Builder addControlCategory(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            if (this.mControlCategories == null) {
                this.mControlCategories = new ArrayList<>();
            }
            if (!this.mControlCategories.contains(str)) {
                this.mControlCategories.add(str);
            }
            return this;
        }

        @NonNull
        public Builder addSelector(@NonNull MediaRouteSelector mediaRouteSelector) {
            if (mediaRouteSelector == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            addControlCategories(mediaRouteSelector.getControlCategories());
            return this;
        }

        @NonNull
        public MediaRouteSelector build() {
            if (this.mControlCategories == null) {
                return MediaRouteSelector.EMPTY;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(MediaRouteSelector.KEY_CONTROL_CATEGORIES, this.mControlCategories);
            return new MediaRouteSelector(bundle, this.mControlCategories);
        }
    }

    private MediaRouteSelector(Bundle bundle, List<String> list) {
        this.mBundle = bundle;
        this.mControlCategories = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ensureControlCategories() {
        if (this.mControlCategories == null) {
            this.mControlCategories = this.mBundle.getStringArrayList(KEY_CONTROL_CATEGORIES);
            if (this.mControlCategories != null && !this.mControlCategories.isEmpty()) {
                return;
            }
            this.mControlCategories = Collections.emptyList();
        }
    }

    public static MediaRouteSelector fromBundle(@Nullable Bundle bundle) {
        if (bundle != null) {
            return new MediaRouteSelector(bundle, null);
        }
        return null;
    }

    public Bundle asBundle() {
        return this.mBundle;
    }

    public boolean contains(MediaRouteSelector mediaRouteSelector) {
        if (mediaRouteSelector != null) {
            ensureControlCategories();
            mediaRouteSelector.ensureControlCategories();
            return this.mControlCategories.containsAll(mediaRouteSelector.mControlCategories);
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof MediaRouteSelector) {
            MediaRouteSelector mediaRouteSelector = (MediaRouteSelector) obj;
            ensureControlCategories();
            mediaRouteSelector.ensureControlCategories();
            return this.mControlCategories.equals(mediaRouteSelector.mControlCategories);
        }
        return false;
    }

    public List<String> getControlCategories() {
        ensureControlCategories();
        return this.mControlCategories;
    }

    public boolean hasControlCategory(String str) {
        if (str != null) {
            ensureControlCategories();
            int size = this.mControlCategories.size();
            for (int i = 0; i < size; i++) {
                if (this.mControlCategories.get(i).equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        ensureControlCategories();
        return this.mControlCategories.hashCode();
    }

    public boolean isEmpty() {
        ensureControlCategories();
        return this.mControlCategories.isEmpty();
    }

    public boolean isValid() {
        ensureControlCategories();
        return !this.mControlCategories.contains(null);
    }

    public boolean matchesControlFilters(List<IntentFilter> list) {
        if (list != null) {
            ensureControlCategories();
            int size = this.mControlCategories.size();
            if (size != 0) {
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    IntentFilter intentFilter = list.get(i);
                    if (intentFilter != null) {
                        for (int i2 = 0; i2 < size; i2++) {
                            if (intentFilter.hasCategory(this.mControlCategories.get(i2))) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouteSelector{ ");
        sb.append("controlCategories=").append(Arrays.toString(getControlCategories().toArray()));
        sb.append(" }");
        return sb.toString();
    }
}
