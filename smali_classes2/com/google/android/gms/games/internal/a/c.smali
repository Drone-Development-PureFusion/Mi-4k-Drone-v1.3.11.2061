.class public final Lcom/google/android/gms/games/internal/a/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/event/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/games/internal/a/c$b;,
        Lcom/google/android/gms/games/internal/a/c$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Z)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/event/c$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/games/internal/a/c$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/games/internal/a/c$2;-><init>(Lcom/google/android/gms/games/internal/a/c;Lcom/google/android/gms/common/api/g;Z)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public varargs a(Lcom/google/android/gms/common/api/g;Z[Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Z[",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/event/c$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/games/internal/a/c$1;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/games/internal/a/c$1;-><init>(Lcom/google/android/gms/games/internal/a/c;Lcom/google/android/gms/common/api/g;Z[Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;I)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingRemoteException"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/games/c;->b(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/d;->t()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/games/internal/d;->a(Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/games/internal/a/c$3;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/games/internal/a/c$3;-><init>(Lcom/google/android/gms/games/internal/a/c;Lcom/google/android/gms/common/api/g;Ljava/lang/String;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    goto :goto_0
.end method
