.class public final Lcom/google/android/gms/internal/anp;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/plus/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/anp$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingRemoteException"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/anp$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/anp$1;-><init>(Lcom/google/android/gms/internal/anp;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/plus/c;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/plus/internal/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/e;->j()V

    :cond_0
    return-void
.end method

.method public c(Lcom/google/android/gms/common/api/g;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/google/android/gms/plus/c;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/plus/internal/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/e;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
