.class Lcom/google/android/gms/internal/ahw$d;
.super Lcom/google/android/gms/signin/internal/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ahw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/google/android/gms/internal/ahw;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ahw;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/signin/internal/b;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ahw$d;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/signin/internal/SignInResponse;)V
    .locals 3
    .annotation build Landroid/support/annotation/BinderThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ahw$d;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ahw;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ahw;->d(Lcom/google/android/gms/internal/ahw;)Lcom/google/android/gms/internal/aia;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ahw$d$1;

    invoke-direct {v2, p0, v0, v0, p1}, Lcom/google/android/gms/internal/ahw$d$1;-><init>(Lcom/google/android/gms/internal/ahw$d;Lcom/google/android/gms/internal/ahz;Lcom/google/android/gms/internal/ahw;Lcom/google/android/gms/signin/internal/SignInResponse;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/aia;->a(Lcom/google/android/gms/internal/aia$a;)V

    goto :goto_0
.end method
