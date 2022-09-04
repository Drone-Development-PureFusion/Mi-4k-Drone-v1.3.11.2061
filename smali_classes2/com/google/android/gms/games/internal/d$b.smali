.class abstract Lcom/google/android/gms/games/internal/d$b;
.super Lcom/google/android/gms/internal/ahs;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ahs",
        "<",
        "Lcom/google/android/gms/games/multiplayer/realtime/h;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ahs;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/games/multiplayer/realtime/h;Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    invoke-static {p2}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/common/data/DataHolder;)Lcom/google/android/gms/games/multiplayer/realtime/Room;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/common/data/DataHolder;->e()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/games/internal/d$b;->a(Lcom/google/android/gms/games/multiplayer/realtime/h;Lcom/google/android/gms/games/multiplayer/realtime/Room;I)V

    return-void
.end method

.method protected abstract a(Lcom/google/android/gms/games/multiplayer/realtime/h;Lcom/google/android/gms/games/multiplayer/realtime/Room;I)V
.end method

.method protected bridge synthetic a(Ljava/lang/Object;Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/multiplayer/realtime/h;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/games/internal/d$b;->a(Lcom/google/android/gms/games/multiplayer/realtime/h;Lcom/google/android/gms/common/data/DataHolder;)V

    return-void
.end method
