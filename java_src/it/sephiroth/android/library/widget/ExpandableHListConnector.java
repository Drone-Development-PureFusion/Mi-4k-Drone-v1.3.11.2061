package it.sephiroth.android.library.widget;

import android.database.DataSetObserver;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.HeterogeneousExpandableList;
import java.util.ArrayList;
import java.util.Collections;
/* loaded from: classes2.dex */
class ExpandableHListConnector extends BaseAdapter implements Filterable {

    /* renamed from: a */
    private ExpandableListAdapter f35123a;

    /* renamed from: c */
    private int f35125c;

    /* renamed from: d */
    private int f35126d = Integer.MAX_VALUE;

    /* renamed from: e */
    private final DataSetObserver f35127e = new C10923a();

    /* renamed from: b */
    private ArrayList<GroupMetadata> f35124b = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class GroupMetadata implements Parcelable, Comparable<GroupMetadata> {
        public static final Parcelable.Creator<GroupMetadata> CREATOR = new Parcelable.Creator<GroupMetadata>() { // from class: it.sephiroth.android.library.widget.ExpandableHListConnector.GroupMetadata.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public GroupMetadata createFromParcel(Parcel parcel) {
                return GroupMetadata.m2769a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public GroupMetadata[] newArray(int i) {
                return new GroupMetadata[i];
            }
        };

        /* renamed from: a */
        static final int f35128a = -1;

        /* renamed from: b */
        int f35129b;

        /* renamed from: c */
        int f35130c;

        /* renamed from: d */
        int f35131d;

        /* renamed from: e */
        long f35132e;

        private GroupMetadata() {
        }

        /* renamed from: a */
        static GroupMetadata m2769a(int i, int i2, int i3, long j) {
            GroupMetadata groupMetadata = new GroupMetadata();
            groupMetadata.f35129b = i;
            groupMetadata.f35130c = i2;
            groupMetadata.f35131d = i3;
            groupMetadata.f35132e = j;
            return groupMetadata;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(GroupMetadata groupMetadata) {
            if (groupMetadata == null) {
                throw new IllegalArgumentException();
            }
            return this.f35131d - groupMetadata.f35131d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f35129b);
            parcel.writeInt(this.f35130c);
            parcel.writeInt(this.f35131d);
            parcel.writeLong(this.f35132e);
        }
    }

    /* renamed from: it.sephiroth.android.library.widget.ExpandableHListConnector$a */
    /* loaded from: classes2.dex */
    protected class C10923a extends DataSetObserver {
        protected C10923a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ExpandableHListConnector.this.m2776a(true, true);
            ExpandableHListConnector.this.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ExpandableHListConnector.this.m2776a(true, true);
            ExpandableHListConnector.this.notifyDataSetInvalidated();
        }
    }

    /* renamed from: it.sephiroth.android.library.widget.ExpandableHListConnector$b */
    /* loaded from: classes2.dex */
    public static class C10924b {

        /* renamed from: d */
        private static final int f35134d = 5;

        /* renamed from: e */
        private static ArrayList<C10924b> f35135e = new ArrayList<>(5);

        /* renamed from: a */
        public C10937b f35136a;

        /* renamed from: b */
        public GroupMetadata f35137b;

        /* renamed from: c */
        public int f35138c;

        private C10924b() {
        }

        /* renamed from: a */
        static C10924b m2764a(int i, int i2, int i3, int i4, GroupMetadata groupMetadata, int i5) {
            C10924b m2761d = m2761d();
            m2761d.f35136a = C10937b.m2651a(i2, i3, i4, i);
            m2761d.f35137b = groupMetadata;
            m2761d.f35138c = i5;
            return m2761d;
        }

        /* renamed from: c */
        private void m2762c() {
            if (this.f35136a != null) {
                this.f35136a.m2649b();
                this.f35136a = null;
            }
            this.f35137b = null;
            this.f35138c = 0;
        }

        /* renamed from: d */
        private static C10924b m2761d() {
            C10924b c10924b;
            synchronized (f35135e) {
                if (f35135e.size() > 0) {
                    c10924b = f35135e.remove(0);
                    c10924b.m2762c();
                } else {
                    c10924b = new C10924b();
                }
            }
            return c10924b;
        }

        /* renamed from: a */
        public void m2765a() {
            m2762c();
            synchronized (f35135e) {
                if (f35135e.size() < 5) {
                    f35135e.add(this);
                }
            }
        }

        /* renamed from: b */
        public boolean m2763b() {
            return this.f35137b != null;
        }
    }

    public ExpandableHListConnector(ExpandableListAdapter expandableListAdapter) {
        m2781a(expandableListAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m2776a(boolean z, boolean z2) {
        boolean z3;
        int i = 0;
        ArrayList<GroupMetadata> arrayList = this.f35124b;
        int size = arrayList.size();
        this.f35125c = 0;
        if (z2) {
            int i2 = size - 1;
            boolean z4 = false;
            while (i2 >= 0) {
                GroupMetadata groupMetadata = arrayList.get(i2);
                int m2782a = m2782a(groupMetadata.f35132e, groupMetadata.f35131d);
                if (m2782a != groupMetadata.f35131d) {
                    if (m2782a == -1) {
                        arrayList.remove(i2);
                        size--;
                    }
                    groupMetadata.f35131d = m2782a;
                    if (!z4) {
                        z3 = true;
                        i2--;
                        z4 = z3;
                    }
                }
                z3 = z4;
                i2--;
                z4 = z3;
            }
            if (z4) {
                Collections.sort(arrayList);
            }
        }
        int i3 = 0;
        int i4 = 0;
        while (i < size) {
            GroupMetadata groupMetadata2 = arrayList.get(i);
            int childrenCount = (groupMetadata2.f35130c == -1 || z) ? this.f35123a.getChildrenCount(groupMetadata2.f35131d) : groupMetadata2.f35130c - groupMetadata2.f35129b;
            this.f35125c += childrenCount;
            int i5 = i4 + (groupMetadata2.f35131d - i3);
            i3 = groupMetadata2.f35131d;
            groupMetadata2.f35129b = i5;
            int i6 = childrenCount + i5;
            groupMetadata2.f35130c = i6;
            i++;
            i4 = i6;
        }
    }

    /* renamed from: a */
    int m2782a(long j, int i) {
        int groupCount = this.f35123a.getGroupCount();
        if (groupCount == 0 || j == Long.MIN_VALUE) {
            return -1;
        }
        int min = Math.min(groupCount - 1, Math.max(0, i));
        long uptimeMillis = SystemClock.uptimeMillis() + 100;
        boolean z = false;
        ExpandableListAdapter m2784a = m2784a();
        if (m2784a == null) {
            return -1;
        }
        int i2 = min;
        int i3 = min;
        while (SystemClock.uptimeMillis() <= uptimeMillis) {
            if (m2784a.getGroupId(i3) == j) {
                return i3;
            }
            boolean z2 = min == groupCount + (-1);
            boolean z3 = i2 == 0;
            if (z2 && z3) {
                break;
            } else if (z3 || (z && !z2)) {
                min++;
                z = false;
                i3 = min;
            } else if (z2 || (!z && !z3)) {
                i2--;
                z = true;
                i3 = i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    ExpandableListAdapter m2784a() {
        return this.f35123a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C10924b m2783a(int i) {
        int i2;
        int i3;
        int i4 = 0;
        ArrayList<GroupMetadata> arrayList = this.f35124b;
        int size = arrayList.size();
        int i5 = size - 1;
        if (size == 0) {
            return C10924b.m2764a(i, 2, i, -1, null, 0);
        }
        int i6 = i5;
        int i7 = 0;
        while (i7 <= i6) {
            i4 = ((i6 - i7) / 2) + i7;
            GroupMetadata groupMetadata = arrayList.get(i4);
            if (i > groupMetadata.f35130c) {
                i7 = i4 + 1;
            } else if (i < groupMetadata.f35129b) {
                i6 = i4 - 1;
            } else if (i == groupMetadata.f35129b) {
                return C10924b.m2764a(i, 2, groupMetadata.f35131d, -1, groupMetadata, i4);
            } else {
                if (i <= groupMetadata.f35130c) {
                    return C10924b.m2764a(i, 1, groupMetadata.f35131d, i - (groupMetadata.f35129b + 1), groupMetadata, i4);
                }
            }
        }
        if (i7 > i4) {
            GroupMetadata groupMetadata2 = arrayList.get(i7 - 1);
            i3 = (i - groupMetadata2.f35130c) + groupMetadata2.f35131d;
            i2 = i7;
        } else if (i6 >= i4) {
            throw new RuntimeException("Unknown state");
        } else {
            i2 = i6 + 1;
            GroupMetadata groupMetadata3 = arrayList.get(i2);
            i3 = groupMetadata3.f35131d - (groupMetadata3.f35129b - i);
        }
        return C10924b.m2764a(i, 2, i3, -1, null, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C10924b m2778a(C10937b c10937b) {
        int i = 0;
        ArrayList<GroupMetadata> arrayList = this.f35124b;
        int size = arrayList.size();
        int i2 = size - 1;
        if (size == 0) {
            return C10924b.m2764a(c10937b.f35270c, c10937b.f35273f, c10937b.f35270c, c10937b.f35271d, null, 0);
        }
        int i3 = i2;
        int i4 = 0;
        while (i4 <= i3) {
            i = ((i3 - i4) / 2) + i4;
            GroupMetadata groupMetadata = arrayList.get(i);
            if (c10937b.f35270c > groupMetadata.f35131d) {
                i4 = i + 1;
            } else if (c10937b.f35270c < groupMetadata.f35131d) {
                i3 = i - 1;
            } else if (c10937b.f35270c == groupMetadata.f35131d) {
                if (c10937b.f35273f == 2) {
                    return C10924b.m2764a(groupMetadata.f35129b, c10937b.f35273f, c10937b.f35270c, c10937b.f35271d, groupMetadata, i);
                }
                if (c10937b.f35273f != 1) {
                    return null;
                }
                return C10924b.m2764a(groupMetadata.f35129b + c10937b.f35271d + 1, c10937b.f35273f, c10937b.f35270c, c10937b.f35271d, groupMetadata, i);
            }
        }
        if (c10937b.f35273f != 2) {
            return null;
        }
        if (i4 > i) {
            GroupMetadata groupMetadata2 = arrayList.get(i4 - 1);
            return C10924b.m2764a((c10937b.f35270c - groupMetadata2.f35131d) + groupMetadata2.f35130c, c10937b.f35273f, c10937b.f35270c, c10937b.f35271d, null, i4);
        } else if (i3 >= i) {
            return null;
        } else {
            int i5 = i3 + 1;
            GroupMetadata groupMetadata3 = arrayList.get(i5);
            return C10924b.m2764a(groupMetadata3.f35129b - (groupMetadata3.f35131d - c10937b.f35270c), c10937b.f35273f, c10937b.f35270c, c10937b.f35271d, null, i5);
        }
    }

    /* renamed from: a */
    public void m2781a(ExpandableListAdapter expandableListAdapter) {
        if (this.f35123a != null) {
            this.f35123a.unregisterDataSetObserver(this.f35127e);
        }
        this.f35123a = expandableListAdapter;
        expandableListAdapter.registerDataSetObserver(this.f35127e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2777a(ArrayList<GroupMetadata> arrayList) {
        if (arrayList == null || this.f35123a == null) {
            return;
        }
        int groupCount = this.f35123a.getGroupCount();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f35131d >= groupCount) {
                return;
            }
        }
        this.f35124b = arrayList;
        m2776a(true, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m2780a(C10924b c10924b) {
        if (c10924b.f35137b == null) {
            return false;
        }
        this.f35124b.remove(c10924b.f35137b);
        m2776a(false, false);
        notifyDataSetChanged();
        this.f35123a.onGroupCollapsed(c10924b.f35137b.f35131d);
        return true;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return this.f35123a.areAllItemsEnabled();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ArrayList<GroupMetadata> m2775b() {
        return this.f35124b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m2774b(int i) {
        C10937b m2651a = C10937b.m2651a(2, i, -1, -1);
        C10924b m2778a = m2778a(m2651a);
        m2651a.m2649b();
        if (m2778a == null) {
            return false;
        }
        boolean m2780a = m2780a(m2778a);
        m2778a.m2765a();
        return m2780a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m2773b(C10924b c10924b) {
        if (c10924b.f35136a.f35270c < 0) {
            throw new RuntimeException("Need group");
        }
        if (this.f35126d != 0 && c10924b.f35137b == null) {
            if (this.f35124b.size() >= this.f35126d) {
                GroupMetadata groupMetadata = this.f35124b.get(0);
                int indexOf = this.f35124b.indexOf(groupMetadata);
                m2774b(groupMetadata.f35131d);
                if (c10924b.f35138c > indexOf) {
                    c10924b.f35138c--;
                }
            }
            GroupMetadata m2769a = GroupMetadata.m2769a(-1, -1, c10924b.f35136a.f35270c, this.f35123a.getGroupId(c10924b.f35136a.f35270c));
            this.f35124b.add(c10924b.f35138c, m2769a);
            m2776a(false, false);
            notifyDataSetChanged();
            this.f35123a.onGroupExpanded(m2769a.f35131d);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    boolean m2772c(int i) {
        C10937b m2651a = C10937b.m2651a(2, i, -1, -1);
        C10924b m2778a = m2778a(m2651a);
        m2651a.m2649b();
        boolean m2773b = m2773b(m2778a);
        m2778a.m2765a();
        return m2773b;
    }

    /* renamed from: d */
    public boolean m2771d(int i) {
        for (int size = this.f35124b.size() - 1; size >= 0; size--) {
            if (this.f35124b.get(size).f35131d == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void m2770e(int i) {
        this.f35126d = i;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f35123a.getGroupCount() + this.f35125c;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        ExpandableListAdapter m2784a = m2784a();
        if (m2784a instanceof Filterable) {
            return ((Filterable) m2784a).getFilter();
        }
        return null;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Object child;
        C10924b m2783a = m2783a(i);
        if (m2783a.f35136a.f35273f == 2) {
            child = this.f35123a.getGroup(m2783a.f35136a.f35270c);
        } else if (m2783a.f35136a.f35273f != 1) {
            throw new RuntimeException("Flat list position is of unknown type");
        } else {
            child = this.f35123a.getChild(m2783a.f35136a.f35270c, m2783a.f35136a.f35271d);
        }
        m2783a.m2765a();
        return child;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        long combinedChildId;
        C10924b m2783a = m2783a(i);
        long groupId = this.f35123a.getGroupId(m2783a.f35136a.f35270c);
        if (m2783a.f35136a.f35273f == 2) {
            combinedChildId = this.f35123a.getCombinedGroupId(groupId);
        } else if (m2783a.f35136a.f35273f != 1) {
            throw new RuntimeException("Flat list position is of unknown type");
        } else {
            combinedChildId = this.f35123a.getCombinedChildId(groupId, this.f35123a.getChildId(m2783a.f35136a.f35270c, m2783a.f35136a.f35271d));
        }
        m2783a.m2765a();
        return combinedChildId;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        int i2;
        C10924b m2783a = m2783a(i);
        C10937b c10937b = m2783a.f35136a;
        if (this.f35123a instanceof HeterogeneousExpandableList) {
            HeterogeneousExpandableList heterogeneousExpandableList = (HeterogeneousExpandableList) this.f35123a;
            i2 = c10937b.f35273f == 2 ? heterogeneousExpandableList.getGroupType(c10937b.f35270c) : heterogeneousExpandableList.getGroupTypeCount() + heterogeneousExpandableList.getChildType(c10937b.f35270c, c10937b.f35271d);
        } else {
            i2 = c10937b.f35273f == 2 ? 0 : 1;
        }
        m2783a.m2765a();
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View childView;
        boolean z = true;
        C10924b m2783a = m2783a(i);
        if (m2783a.f35136a.f35273f == 2) {
            childView = this.f35123a.getGroupView(m2783a.f35136a.f35270c, m2783a.m2763b(), view, viewGroup);
        } else if (m2783a.f35136a.f35273f != 1) {
            throw new RuntimeException("Flat list position is of unknown type");
        } else {
            if (m2783a.f35137b.f35130c != i) {
                z = false;
            }
            childView = this.f35123a.getChildView(m2783a.f35136a.f35270c, m2783a.f35136a.f35271d, z, view, viewGroup);
        }
        m2783a.m2765a();
        return childView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        if (this.f35123a instanceof HeterogeneousExpandableList) {
            HeterogeneousExpandableList heterogeneousExpandableList = (HeterogeneousExpandableList) this.f35123a;
            return heterogeneousExpandableList.getChildTypeCount() + heterogeneousExpandableList.getGroupTypeCount();
        }
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return this.f35123a.hasStableIds();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean isEmpty() {
        ExpandableListAdapter m2784a = m2784a();
        if (m2784a != null) {
            return m2784a.isEmpty();
        }
        return true;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        boolean z = true;
        C10924b m2783a = m2783a(i);
        C10937b c10937b = m2783a.f35136a;
        if (c10937b.f35273f == 1) {
            z = this.f35123a.isChildSelectable(c10937b.f35270c, c10937b.f35271d);
        }
        m2783a.m2765a();
        return z;
    }
}
