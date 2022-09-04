.class public final Lcom/google/android/gms/games/internal/e/b;
.super Lcom/google/android/gms/common/data/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/data/a",
        "<",
        "Lcom/google/android/gms/games/internal/e/a;",
        ">;"
    }
.end annotation


# virtual methods
.method public synthetic a(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/e/b;->b(I)Lcom/google/android/gms/games/internal/e/a;

    move-result-object v0

    return-object v0
.end method

.method public b(I)Lcom/google/android/gms/games/internal/e/a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/games/internal/e/c;

    iget-object v1, p0, Lcom/google/android/gms/games/internal/e/b;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/games/internal/e/c;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    return-object v0
.end method
