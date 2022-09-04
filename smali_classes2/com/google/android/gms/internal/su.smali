.class public abstract Lcom/google/android/gms/internal/su;
.super Lcom/google/android/gms/common/api/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T1::",
        "Lcom/google/android/gms/common/api/m;",
        "T2::",
        "Lcom/google/android/gms/common/api/m;",
        ">",
        "Lcom/google/android/gms/common/api/i",
        "<TT1;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/common/api/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/i",
            "<TT2;>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/common/api/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/i",
            "<TT2;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/api/i;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/su;->a:Lcom/google/android/gms/common/api/i;

    iput-object p1, p0, Lcom/google/android/gms/internal/su;->a:Lcom/google/android/gms/common/api/i;

    return-void
.end method


# virtual methods
.method public a(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/api/m;
    .locals 1
    .param p3    # Ljava/util/concurrent/TimeUnit;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TT1;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/su;->a:Lcom/google/android/gms/common/api/i;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/common/api/i;->a(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/su;->a(Lcom/google/android/gms/common/api/m;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    return-object v0
.end method

.method protected abstract a(Lcom/google/android/gms/common/api/m;)Lcom/google/android/gms/common/api/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT2;)TT1;"
        }
    .end annotation
.end method

.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/su;->a:Lcom/google/android/gms/common/api/i;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/i;->a()V

    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/n;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/common/api/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/n",
            "<-TT1;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/su;->a:Lcom/google/android/gms/common/api/i;

    new-instance v1, Lcom/google/android/gms/internal/su$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/su$1;-><init>(Lcom/google/android/gms/internal/su;Lcom/google/android/gms/common/api/n;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/i;->a(Lcom/google/android/gms/common/api/n;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/n;JLjava/util/concurrent/TimeUnit;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/common/api/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/TimeUnit;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/n",
            "<-TT1;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/su;->a:Lcom/google/android/gms/common/api/i;

    new-instance v1, Lcom/google/android/gms/internal/su$2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/su$2;-><init>(Lcom/google/android/gms/internal/su;Lcom/google/android/gms/common/api/n;)V

    invoke-virtual {v0, v1, p2, p3, p4}, Lcom/google/android/gms/common/api/i;->a(Lcom/google/android/gms/common/api/n;JLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public d()Lcom/google/android/gms/common/api/m;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT1;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/su;->a:Lcom/google/android/gms/common/api/i;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/i;->d()Lcom/google/android/gms/common/api/m;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/su;->a(Lcom/google/android/gms/common/api/m;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/su;->a:Lcom/google/android/gms/common/api/i;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/i;->e()Z

    move-result v0

    return v0
.end method
