.class public final Lcom/google/android/gms/common/internal/p$k;
.super Lcom/google/android/gms/common/internal/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/internal/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x14
    name = "k"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/p$a;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/google/android/gms/common/internal/p;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/internal/p;ILandroid/os/Bundle;)V
    .locals 0
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/BinderThread;
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/common/internal/p$k;->e:Lcom/google/android/gms/common/internal/p;

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/common/internal/p$a;-><init>(Lcom/google/android/gms/common/internal/p;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/p$k;->e:Lcom/google/android/gms/common/internal/p;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/p;->b(Lcom/google/android/gms/common/internal/p;)Lcom/google/android/gms/common/internal/p$f;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/common/internal/p$f;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    iget-object v0, p0, Lcom/google/android/gms/common/internal/p$k;->e:Lcom/google/android/gms/common/internal/p;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/p;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method

.method protected a()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/internal/p$k;->e:Lcom/google/android/gms/common/internal/p;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/p;->b(Lcom/google/android/gms/common/internal/p;)Lcom/google/android/gms/common/internal/p$f;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/common/ConnectionResult;->v:Lcom/google/android/gms/common/ConnectionResult;

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/internal/p$f;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    const/4 v0, 0x1

    return v0
.end method
