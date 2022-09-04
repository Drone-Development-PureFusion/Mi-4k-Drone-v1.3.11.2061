.class Lcom/google/firebase/c/m;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Lcom/google/firebase/c/i;

.field private b:Lcom/google/android/gms/g/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/g/g",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/google/android/gms/internal/nb;


# direct methods
.method public constructor <init>(Lcom/google/firebase/c/i;Lcom/google/android/gms/g/g;)V
    .locals 4
    .param p1    # Lcom/google/firebase/c/i;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/g/g;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/c/i;",
            "Lcom/google/android/gms/g/g",
            "<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/firebase/c/m;->a:Lcom/google/firebase/c/i;

    iput-object p2, p0, Lcom/google/firebase/c/m;->b:Lcom/google/android/gms/g/g;

    new-instance v0, Lcom/google/android/gms/internal/nb;

    iget-object v1, p0, Lcom/google/firebase/c/m;->a:Lcom/google/firebase/c/i;

    invoke-virtual {v1}, Lcom/google/firebase/c/i;->f()Lcom/google/firebase/c/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/c/d;->f()Lcom/google/firebase/b;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/c/m;->a:Lcom/google/firebase/c/i;

    invoke-virtual {v2}, Lcom/google/firebase/c/i;->f()Lcom/google/firebase/c/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/c/d;->d()J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/nb;-><init>(Lcom/google/firebase/b;J)V

    iput-object v0, p0, Lcom/google/firebase/c/m;->c:Lcom/google/android/gms/internal/nb;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/c/m;->a:Lcom/google/firebase/c/i;

    invoke-virtual {v0}, Lcom/google/firebase/c/i;->h()Lcom/google/android/gms/internal/nj;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/c/m;->a:Lcom/google/firebase/c/i;

    invoke-virtual {v1}, Lcom/google/firebase/c/i;->o()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/nj;->a(Landroid/net/Uri;)Lcom/google/android/gms/internal/nk;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/c/m;->c:Lcom/google/android/gms/internal/nb;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/nb;->a(Lcom/google/android/gms/internal/nk;)V

    iget-object v1, p0, Lcom/google/firebase/c/m;->b:Lcom/google/android/gms/g/g;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/nk;->a(Lcom/google/android/gms/g/g;Ljava/lang/Object;)V

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "DeleteStorageTask"

    const-string v2, "Unable to create Firebase Storage network request."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v1, p0, Lcom/google/firebase/c/m;->b:Lcom/google/android/gms/g/g;

    invoke-static {v0}, Lcom/google/firebase/c/g;->a(Ljava/lang/Throwable;)Lcom/google/firebase/c/g;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    goto :goto_0
.end method
