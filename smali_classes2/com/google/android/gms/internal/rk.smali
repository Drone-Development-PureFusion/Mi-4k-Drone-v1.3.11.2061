.class public Lcom/google/android/gms/internal/rk;
.super Landroid/support/customtabs/CustomTabsServiceConnection;


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/google/android/gms/internal/rl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/rl;)V
    .locals 1

    invoke-direct {p0}, Landroid/support/customtabs/CustomTabsServiceConnection;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/rk;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/ComponentName;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/rk;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/rl;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/rl;->a()V

    :cond_0
    return-void
.end method

.method public a(Landroid/content/ComponentName;Landroid/support/customtabs/CustomTabsClient;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/rk;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/rl;

    if-eqz v0, :cond_0

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/rl;->a(Landroid/support/customtabs/CustomTabsClient;)V

    :cond_0
    return-void
.end method
