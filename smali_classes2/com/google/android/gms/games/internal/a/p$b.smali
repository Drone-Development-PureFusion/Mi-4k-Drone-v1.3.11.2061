.class abstract Lcom/google/android/gms/games/internal/a/p$b;
.super Lcom/google/android/gms/games/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/a/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/games/c$a",
        "<",
        "Lcom/google/android/gms/games/multiplayer/turnbased/g$b;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>(Lcom/google/android/gms/common/api/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/c$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/games/internal/a/p$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/a/p$b;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/multiplayer/turnbased/g$b;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/a/p$b$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/internal/a/p$b$1;-><init>(Lcom/google/android/gms/games/internal/a/p$b;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/p$b;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/multiplayer/turnbased/g$b;

    move-result-object v0

    return-object v0
.end method
