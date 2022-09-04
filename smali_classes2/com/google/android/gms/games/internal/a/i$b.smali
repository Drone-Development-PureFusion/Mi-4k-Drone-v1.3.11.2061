.class abstract Lcom/google/android/gms/games/internal/a/i$b;
.super Lcom/google/android/gms/games/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/a/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/games/c$a",
        "<",
        "Lcom/google/android/gms/games/n$b;",
        ">;"
    }
.end annotation


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/n$b;
    .locals 2

    new-instance v0, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->i()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/common/data/DataHolder;->b(I)Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/games/internal/player/ProfileSettingsEntity;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    return-object v0
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/i$b;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/n$b;

    move-result-object v0

    return-object v0
.end method
