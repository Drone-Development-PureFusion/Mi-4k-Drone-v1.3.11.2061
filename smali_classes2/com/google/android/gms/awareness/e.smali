.class public interface abstract Lcom/google/android/gms/awareness/e;
.super Ljava/lang/Object;


# virtual methods
.method public abstract a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "com.google.android.gms.permission.ACTIVITY_RECOGNITION"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/b;",
            ">;"
        }
    .end annotation
.end method

.method public abstract a(Lcom/google/android/gms/common/api/g;Ljava/util/Collection;)Lcom/google/android/gms/common/api/i;
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;",
            ">;)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/a;",
            ">;"
        }
    .end annotation
.end method

.method public varargs abstract a(Lcom/google/android/gms/common/api/g;[Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Lcom/google/android/gms/common/api/i;
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "[",
            "Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/a;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/c;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/d;",
            ">;"
        }
    .end annotation
.end method

.method public abstract d(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/e;",
            ">;"
        }
    .end annotation
.end method

.method public abstract e(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/f;",
            ">;"
        }
    .end annotation
.end method
