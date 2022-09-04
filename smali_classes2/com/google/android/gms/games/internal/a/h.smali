.class public final Lcom/google/android/gms/games/internal/a/h;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/games/internal/a/h$c;,
        Lcom/google/android/gms/games/internal/a/h$b;,
        Lcom/google/android/gms/games/internal/a/h$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)V
    .locals 1

    const/16 v0, 0x3f

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/games/internal/a/h;->a(Lcom/google/android/gms/common/api/g;I)V

    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/g;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/games/c;->a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/games/internal/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/games/internal/d;->d(I)V

    :cond_0
    return-void
.end method
