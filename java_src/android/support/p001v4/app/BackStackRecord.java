package android.support.p001v4.app;

import android.support.p001v4.app.FragmentManager;
import android.support.p001v4.util.LogWriter;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0437d;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.BackStackRecord */
/* loaded from: classes.dex */
public final class BackStackRecord extends FragmentTransaction implements FragmentManager.BackStackEntry, Runnable {
    static final int OP_ADD = 1;
    static final int OP_ATTACH = 7;
    static final int OP_DETACH = 6;
    static final int OP_HIDE = 4;
    static final int OP_NULL = 0;
    static final int OP_REMOVE = 3;
    static final int OP_REPLACE = 2;
    static final int OP_SHOW = 5;
    static final String TAG = "FragmentManager";
    boolean mAddToBackStack;
    int mBreadCrumbShortTitleRes;
    CharSequence mBreadCrumbShortTitleText;
    int mBreadCrumbTitleRes;
    CharSequence mBreadCrumbTitleText;
    boolean mCommitted;
    int mEnterAnim;
    int mExitAnim;
    C0045Op mHead;
    final FragmentManagerImpl mManager;
    String mName;
    int mNumOp;
    int mPopEnterAnim;
    int mPopExitAnim;
    C0045Op mTail;
    int mTransition;
    int mTransitionStyle;
    boolean mAllowAddToBackStack = true;
    int mIndex = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.BackStackRecord$Op */
    /* loaded from: classes.dex */
    public static final class C0045Op {
        int cmd;
        int enterAnim;
        int exitAnim;
        Fragment fragment;
        C0045Op next;
        int popEnterAnim;
        int popExitAnim;
        C0045Op prev;
        ArrayList<Fragment> removed;
    }

    public BackStackRecord(FragmentManagerImpl fragmentManagerImpl) {
        this.mManager = fragmentManagerImpl;
    }

    private void doAddOp(int i, Fragment fragment, String str, int i2) {
        fragment.mFragmentManager = this.mManager;
        if (str != null) {
            if (fragment.mTag != null && !str.equals(fragment.mTag)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (fragment.mFragmentId != 0 && fragment.mFragmentId != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        C0045Op c0045Op = new C0045Op();
        c0045Op.cmd = i2;
        c0045Op.fragment = fragment;
        addOp(c0045Op);
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction add(int i, Fragment fragment) {
        doAddOp(i, fragment, null, 1);
        return this;
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction add(int i, Fragment fragment, String str) {
        doAddOp(i, fragment, str, 1);
        return this;
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction add(Fragment fragment, String str) {
        doAddOp(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addOp(C0045Op c0045Op) {
        if (this.mHead == null) {
            this.mTail = c0045Op;
            this.mHead = c0045Op;
        } else {
            c0045Op.prev = this.mTail;
            this.mTail.next = c0045Op;
            this.mTail = c0045Op;
        }
        c0045Op.enterAnim = this.mEnterAnim;
        c0045Op.exitAnim = this.mExitAnim;
        c0045Op.popEnterAnim = this.mPopEnterAnim;
        c0045Op.popExitAnim = this.mPopExitAnim;
        this.mNumOp++;
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction addToBackStack(String str) {
        if (!this.mAllowAddToBackStack) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.mAddToBackStack = true;
        this.mName = str;
        return this;
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction attach(Fragment fragment) {
        C0045Op c0045Op = new C0045Op();
        c0045Op.cmd = 7;
        c0045Op.fragment = fragment;
        addOp(c0045Op);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void bumpBackStackNesting(int i) {
        if (!this.mAddToBackStack) {
            return;
        }
        if (FragmentManagerImpl.DEBUG) {
            Log.v(TAG, "Bump nesting in " + this + " by " + i);
        }
        for (C0045Op c0045Op = this.mHead; c0045Op != null; c0045Op = c0045Op.next) {
            if (c0045Op.fragment != null) {
                c0045Op.fragment.mBackStackNesting += i;
                if (FragmentManagerImpl.DEBUG) {
                    Log.v(TAG, "Bump nesting of " + c0045Op.fragment + " to " + c0045Op.fragment.mBackStackNesting);
                }
            }
            if (c0045Op.removed != null) {
                for (int size = c0045Op.removed.size() - 1; size >= 0; size--) {
                    Fragment fragment = c0045Op.removed.get(size);
                    fragment.mBackStackNesting += i;
                    if (FragmentManagerImpl.DEBUG) {
                        Log.v(TAG, "Bump nesting of " + fragment + " to " + fragment.mBackStackNesting);
                    }
                }
            }
        }
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public int commit() {
        return commitInternal(false);
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public int commitAllowingStateLoss() {
        return commitInternal(true);
    }

    int commitInternal(boolean z) {
        if (this.mCommitted) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManagerImpl.DEBUG) {
            Log.v(TAG, "Commit: " + this);
            dump("  ", null, new PrintWriter(new LogWriter(TAG)), null);
        }
        this.mCommitted = true;
        if (this.mAddToBackStack) {
            this.mIndex = this.mManager.allocBackStackIndex(this);
        } else {
            this.mIndex = -1;
        }
        this.mManager.enqueueAction(this, z);
        return this.mIndex;
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction detach(Fragment fragment) {
        C0045Op c0045Op = new C0045Op();
        c0045Op.cmd = 6;
        c0045Op.fragment = fragment;
        addOp(c0045Op);
        return this;
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction disallowAddToBackStack() {
        if (this.mAddToBackStack) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.mAllowAddToBackStack = false;
        return this;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        dump(str, printWriter, true);
    }

    public void dump(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.mName);
            printWriter.print(" mIndex=");
            printWriter.print(this.mIndex);
            printWriter.print(" mCommitted=");
            printWriter.println(this.mCommitted);
            if (this.mTransition != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.mTransition));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.mTransitionStyle));
            }
            if (this.mEnterAnim != 0 || this.mExitAnim != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mEnterAnim));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.mExitAnim));
            }
            if (this.mPopEnterAnim != 0 || this.mPopExitAnim != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mPopEnterAnim));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.mPopExitAnim));
            }
            if (this.mBreadCrumbTitleRes != 0 || this.mBreadCrumbTitleText != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbTitleRes));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.mBreadCrumbTitleText);
            }
            if (this.mBreadCrumbShortTitleRes != 0 || this.mBreadCrumbShortTitleText != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbShortTitleRes));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.mBreadCrumbShortTitleText);
            }
        }
        if (this.mHead != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str3 = str + "    ";
            int i = 0;
            C0045Op c0045Op = this.mHead;
            while (c0045Op != null) {
                switch (c0045Op.cmd) {
                    case 0:
                        str2 = AbstractC0437d.f576k;
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    default:
                        str2 = "cmd=" + c0045Op.cmd;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c0045Op.fragment);
                if (z) {
                    if (c0045Op.enterAnim != 0 || c0045Op.exitAnim != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c0045Op.enterAnim));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c0045Op.exitAnim));
                    }
                    if (c0045Op.popEnterAnim != 0 || c0045Op.popExitAnim != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c0045Op.popEnterAnim));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c0045Op.popExitAnim));
                    }
                }
                if (c0045Op.removed != null && c0045Op.removed.size() > 0) {
                    for (int i2 = 0; i2 < c0045Op.removed.size(); i2++) {
                        printWriter.print(str3);
                        if (c0045Op.removed.size() == 1) {
                            printWriter.print("Removed: ");
                        } else {
                            if (i2 == 0) {
                                printWriter.println("Removed:");
                            }
                            printWriter.print(str3);
                            printWriter.print("  #");
                            printWriter.print(i2);
                            printWriter.print(": ");
                        }
                        printWriter.println(c0045Op.removed.get(i2));
                    }
                }
                c0045Op = c0045Op.next;
                i++;
            }
        }
    }

    @Override // android.support.p001v4.app.FragmentManager.BackStackEntry
    public CharSequence getBreadCrumbShortTitle() {
        return this.mBreadCrumbShortTitleRes != 0 ? this.mManager.mActivity.getText(this.mBreadCrumbShortTitleRes) : this.mBreadCrumbShortTitleText;
    }

    @Override // android.support.p001v4.app.FragmentManager.BackStackEntry
    public int getBreadCrumbShortTitleRes() {
        return this.mBreadCrumbShortTitleRes;
    }

    @Override // android.support.p001v4.app.FragmentManager.BackStackEntry
    public CharSequence getBreadCrumbTitle() {
        return this.mBreadCrumbTitleRes != 0 ? this.mManager.mActivity.getText(this.mBreadCrumbTitleRes) : this.mBreadCrumbTitleText;
    }

    @Override // android.support.p001v4.app.FragmentManager.BackStackEntry
    public int getBreadCrumbTitleRes() {
        return this.mBreadCrumbTitleRes;
    }

    @Override // android.support.p001v4.app.FragmentManager.BackStackEntry
    public int getId() {
        return this.mIndex;
    }

    @Override // android.support.p001v4.app.FragmentManager.BackStackEntry
    public String getName() {
        return this.mName;
    }

    public int getTransition() {
        return this.mTransition;
    }

    public int getTransitionStyle() {
        return this.mTransitionStyle;
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction hide(Fragment fragment) {
        C0045Op c0045Op = new C0045Op();
        c0045Op.cmd = 4;
        c0045Op.fragment = fragment;
        addOp(c0045Op);
        return this;
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public boolean isAddToBackStackAllowed() {
        return this.mAllowAddToBackStack;
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public boolean isEmpty() {
        return this.mNumOp == 0;
    }

    public void popFromBackStack(boolean z) {
        if (FragmentManagerImpl.DEBUG) {
            Log.v(TAG, "popFromBackStack: " + this);
            dump("  ", null, new PrintWriter(new LogWriter(TAG)), null);
        }
        bumpBackStackNesting(-1);
        for (C0045Op c0045Op = this.mTail; c0045Op != null; c0045Op = c0045Op.prev) {
            switch (c0045Op.cmd) {
                case 1:
                    Fragment fragment = c0045Op.fragment;
                    fragment.mNextAnim = c0045Op.popExitAnim;
                    this.mManager.removeFragment(fragment, FragmentManagerImpl.reverseTransit(this.mTransition), this.mTransitionStyle);
                    break;
                case 2:
                    Fragment fragment2 = c0045Op.fragment;
                    if (fragment2 != null) {
                        fragment2.mNextAnim = c0045Op.popExitAnim;
                        this.mManager.removeFragment(fragment2, FragmentManagerImpl.reverseTransit(this.mTransition), this.mTransitionStyle);
                    }
                    if (c0045Op.removed != null) {
                        for (int i = 0; i < c0045Op.removed.size(); i++) {
                            Fragment fragment3 = c0045Op.removed.get(i);
                            fragment3.mNextAnim = c0045Op.popEnterAnim;
                            this.mManager.addFragment(fragment3, false);
                        }
                        break;
                    } else {
                        break;
                    }
                case 3:
                    Fragment fragment4 = c0045Op.fragment;
                    fragment4.mNextAnim = c0045Op.popEnterAnim;
                    this.mManager.addFragment(fragment4, false);
                    break;
                case 4:
                    Fragment fragment5 = c0045Op.fragment;
                    fragment5.mNextAnim = c0045Op.popEnterAnim;
                    this.mManager.showFragment(fragment5, FragmentManagerImpl.reverseTransit(this.mTransition), this.mTransitionStyle);
                    break;
                case 5:
                    Fragment fragment6 = c0045Op.fragment;
                    fragment6.mNextAnim = c0045Op.popExitAnim;
                    this.mManager.hideFragment(fragment6, FragmentManagerImpl.reverseTransit(this.mTransition), this.mTransitionStyle);
                    break;
                case 6:
                    Fragment fragment7 = c0045Op.fragment;
                    fragment7.mNextAnim = c0045Op.popEnterAnim;
                    this.mManager.attachFragment(fragment7, FragmentManagerImpl.reverseTransit(this.mTransition), this.mTransitionStyle);
                    break;
                case 7:
                    Fragment fragment8 = c0045Op.fragment;
                    fragment8.mNextAnim = c0045Op.popEnterAnim;
                    this.mManager.detachFragment(fragment8, FragmentManagerImpl.reverseTransit(this.mTransition), this.mTransitionStyle);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0045Op.cmd);
            }
        }
        if (z) {
            this.mManager.moveToState(this.mManager.mCurState, FragmentManagerImpl.reverseTransit(this.mTransition), this.mTransitionStyle, true);
        }
        if (this.mIndex >= 0) {
            this.mManager.freeBackStackIndex(this.mIndex);
            this.mIndex = -1;
        }
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction remove(Fragment fragment) {
        C0045Op c0045Op = new C0045Op();
        c0045Op.cmd = 3;
        c0045Op.fragment = fragment;
        addOp(c0045Op);
        return this;
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction replace(int i, Fragment fragment) {
        return replace(i, fragment, null);
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction replace(int i, Fragment fragment, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        doAddOp(i, fragment, str, 2);
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        Fragment fragment;
        if (FragmentManagerImpl.DEBUG) {
            Log.v(TAG, "Run: " + this);
        }
        if (!this.mAddToBackStack || this.mIndex >= 0) {
            bumpBackStackNesting(1);
            for (C0045Op c0045Op = this.mHead; c0045Op != null; c0045Op = c0045Op.next) {
                switch (c0045Op.cmd) {
                    case 1:
                        Fragment fragment2 = c0045Op.fragment;
                        fragment2.mNextAnim = c0045Op.enterAnim;
                        this.mManager.addFragment(fragment2, false);
                        break;
                    case 2:
                        Fragment fragment3 = c0045Op.fragment;
                        if (this.mManager.mAdded != null) {
                            fragment = fragment3;
                            for (int i = 0; i < this.mManager.mAdded.size(); i++) {
                                Fragment fragment4 = this.mManager.mAdded.get(i);
                                if (FragmentManagerImpl.DEBUG) {
                                    Log.v(TAG, "OP_REPLACE: adding=" + fragment + " old=" + fragment4);
                                }
                                if (fragment == null || fragment4.mContainerId == fragment.mContainerId) {
                                    if (fragment4 == fragment) {
                                        fragment = null;
                                        c0045Op.fragment = null;
                                    } else {
                                        if (c0045Op.removed == null) {
                                            c0045Op.removed = new ArrayList<>();
                                        }
                                        c0045Op.removed.add(fragment4);
                                        fragment4.mNextAnim = c0045Op.exitAnim;
                                        if (this.mAddToBackStack) {
                                            fragment4.mBackStackNesting++;
                                            if (FragmentManagerImpl.DEBUG) {
                                                Log.v(TAG, "Bump nesting of " + fragment4 + " to " + fragment4.mBackStackNesting);
                                            }
                                        }
                                        this.mManager.removeFragment(fragment4, this.mTransition, this.mTransitionStyle);
                                    }
                                }
                            }
                        } else {
                            fragment = fragment3;
                        }
                        if (fragment != null) {
                            fragment.mNextAnim = c0045Op.enterAnim;
                            this.mManager.addFragment(fragment, false);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        Fragment fragment5 = c0045Op.fragment;
                        fragment5.mNextAnim = c0045Op.exitAnim;
                        this.mManager.removeFragment(fragment5, this.mTransition, this.mTransitionStyle);
                        break;
                    case 4:
                        Fragment fragment6 = c0045Op.fragment;
                        fragment6.mNextAnim = c0045Op.exitAnim;
                        this.mManager.hideFragment(fragment6, this.mTransition, this.mTransitionStyle);
                        break;
                    case 5:
                        Fragment fragment7 = c0045Op.fragment;
                        fragment7.mNextAnim = c0045Op.enterAnim;
                        this.mManager.showFragment(fragment7, this.mTransition, this.mTransitionStyle);
                        break;
                    case 6:
                        Fragment fragment8 = c0045Op.fragment;
                        fragment8.mNextAnim = c0045Op.exitAnim;
                        this.mManager.detachFragment(fragment8, this.mTransition, this.mTransitionStyle);
                        break;
                    case 7:
                        Fragment fragment9 = c0045Op.fragment;
                        fragment9.mNextAnim = c0045Op.enterAnim;
                        this.mManager.attachFragment(fragment9, this.mTransition, this.mTransitionStyle);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + c0045Op.cmd);
                }
            }
            this.mManager.moveToState(this.mManager.mCurState, this.mTransition, this.mTransitionStyle, true);
            if (!this.mAddToBackStack) {
                return;
            }
            this.mManager.addBackStackState(this);
            return;
        }
        throw new IllegalStateException("addToBackStack() called after commit()");
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction setBreadCrumbShortTitle(int i) {
        this.mBreadCrumbShortTitleRes = i;
        this.mBreadCrumbShortTitleText = null;
        return this;
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction setBreadCrumbShortTitle(CharSequence charSequence) {
        this.mBreadCrumbShortTitleRes = 0;
        this.mBreadCrumbShortTitleText = charSequence;
        return this;
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction setBreadCrumbTitle(int i) {
        this.mBreadCrumbTitleRes = i;
        this.mBreadCrumbTitleText = null;
        return this;
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction setBreadCrumbTitle(CharSequence charSequence) {
        this.mBreadCrumbTitleRes = 0;
        this.mBreadCrumbTitleText = charSequence;
        return this;
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction setCustomAnimations(int i, int i2) {
        return setCustomAnimations(i, i2, 0, 0);
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction setCustomAnimations(int i, int i2, int i3, int i4) {
        this.mEnterAnim = i;
        this.mExitAnim = i2;
        this.mPopEnterAnim = i3;
        this.mPopExitAnim = i4;
        return this;
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction setTransition(int i) {
        this.mTransition = i;
        return this;
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction setTransitionStyle(int i) {
        this.mTransitionStyle = i;
        return this;
    }

    @Override // android.support.p001v4.app.FragmentTransaction
    public FragmentTransaction show(Fragment fragment) {
        C0045Op c0045Op = new C0045Op();
        c0045Op.cmd = 5;
        c0045Op.fragment = fragment;
        addOp(c0045Op);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.mIndex >= 0) {
            sb.append(" #");
            sb.append(this.mIndex);
        }
        if (this.mName != null) {
            sb.append(" ");
            sb.append(this.mName);
        }
        sb.append("}");
        return sb.toString();
    }
}
