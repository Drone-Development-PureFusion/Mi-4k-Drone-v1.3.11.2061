.class public final Lcom/google/android/gms/games/internal/a/q;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/video/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/games/internal/a/q$h;,
        Lcom/google/android/gms/games/internal/a/q$g;,
        Lcom/google/android/gms/games/internal/a/q$f;,
        Lcom/google/android/gms/games/internal/a/q$e;,
        Lcom/google/android/gms/games/internal/a/q$d;,
        Lcom/google/android/gms/games/internal/a/q$c;,
        Lcom/google/android/gms/games/internal/a/q$b;,
        Lcom/google/android/gms/games/internal/a/q$a;
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
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/video/f$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/games/internal/a/q$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/internal/a/q$1;-><init>(Lcom/google/android/gms/games/internal/a/q;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;I)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "I)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/video/f$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/games/internal/a/q$11;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/games/internal/a/q$11;-><init>(Lcom/google/android/gms/games/internal/a/q;Lcom/google/android/gms/common/api/g;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/video/f$c;)V
    .locals 2

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/common/api/g;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/games/internal/d;->e(Lcom/google/android/gms/internal/ail;)V

    :cond_0
    return-void
.end method

.method public b(Lcom/google/android/gms/common/api/g;)Landroid/content/Intent;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/d;->T()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/video/f$e;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/games/internal/a/q$8;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/internal/a/q$8;-><init>(Lcom/google/android/gms/games/internal/a/q;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/google/android/gms/common/api/g;)Z
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/d;->U()Z

    move-result v0

    return v0
.end method

.method public e(Lcom/google/android/gms/common/api/g;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/d;->V()V

    :cond_0
    return-void
.end method
