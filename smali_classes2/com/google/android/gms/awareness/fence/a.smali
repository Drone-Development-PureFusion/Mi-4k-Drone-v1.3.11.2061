.class public final Lcom/google/android/gms/awareness/fence/a;
.super Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/Collection;)Lcom/google/android/gms/awareness/fence/AwarenessFence;
    .locals 1
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;",
            ">;)",
            "Lcom/google/android/gms/awareness/fence/AwarenessFence;"
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;

    invoke-static {v0}, Lcom/google/android/gms/awareness/fence/a;->a([Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Lcom/google/android/gms/awareness/fence/AwarenessFence;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;

    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;

    invoke-static {v0}, Lcom/google/android/gms/awareness/fence/a;->a([Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Lcom/google/android/gms/awareness/fence/AwarenessFence;

    move-result-object v0

    goto :goto_0
.end method

.method public static varargs a([Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Lcom/google/android/gms/awareness/fence/AwarenessFence;
    .locals 1
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/contextmanager/fence/internal/d;->a([Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Lcom/google/android/gms/contextmanager/fence/internal/d;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->a(Lcom/google/android/gms/contextmanager/fence/internal/d;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/util/Collection;)Lcom/google/android/gms/awareness/fence/AwarenessFence;
    .locals 1
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;",
            ">;)",
            "Lcom/google/android/gms/awareness/fence/AwarenessFence;"
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;

    invoke-static {v0}, Lcom/google/android/gms/awareness/fence/a;->b([Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Lcom/google/android/gms/awareness/fence/AwarenessFence;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;

    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;

    invoke-static {v0}, Lcom/google/android/gms/awareness/fence/a;->b([Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Lcom/google/android/gms/awareness/fence/AwarenessFence;

    move-result-object v0

    goto :goto_0
.end method

.method public static varargs b([Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Lcom/google/android/gms/awareness/fence/AwarenessFence;
    .locals 1
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/contextmanager/fence/internal/d;->b([Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Lcom/google/android/gms/contextmanager/fence/internal/d;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->a(Lcom/google/android/gms/contextmanager/fence/internal/d;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/util/Collection;)Lcom/google/android/gms/awareness/fence/AwarenessFence;
    .locals 1
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;",
            ">;)",
            "Lcom/google/android/gms/awareness/fence/AwarenessFence;"
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;

    invoke-static {v0}, Lcom/google/android/gms/awareness/fence/a;->c([Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Lcom/google/android/gms/awareness/fence/AwarenessFence;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;

    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;

    invoke-static {v0}, Lcom/google/android/gms/awareness/fence/a;->c([Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Lcom/google/android/gms/awareness/fence/AwarenessFence;

    move-result-object v0

    goto :goto_0
.end method

.method public static varargs c([Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Lcom/google/android/gms/awareness/fence/AwarenessFence;
    .locals 1
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.ACCESS_FINE_LOCATION"
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/contextmanager/fence/internal/d;->c([Lcom/google/android/gms/awareness/state/BeaconState$TypeFilter;)Lcom/google/android/gms/contextmanager/fence/internal/d;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->a(Lcom/google/android/gms/contextmanager/fence/internal/d;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    move-result-object v0

    return-object v0
.end method
