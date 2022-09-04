.class public final Lcom/google/android/gms/games/internal/game/g;
.super Lcom/google/android/gms/common/data/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/data/a",
        "<",
        "Lcom/google/android/gms/games/internal/game/f;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/common/data/a;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    return-void
.end method


# virtual methods
.method public synthetic a(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/game/g;->b(I)Lcom/google/android/gms/games/internal/game/f;

    move-result-object v0

    return-object v0
.end method

.method public b(I)Lcom/google/android/gms/games/internal/game/f;
    .locals 2

    new-instance v0, Lcom/google/android/gms/games/internal/game/h;

    iget-object v1, p0, Lcom/google/android/gms/games/internal/game/g;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/games/internal/game/h;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    return-object v0
.end method
