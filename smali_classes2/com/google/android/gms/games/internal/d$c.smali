.class abstract Lcom/google/android/gms/games/internal/d$c;
.super Lcom/google/android/gms/internal/ahs;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ahs",
        "<",
        "Lcom/google/android/gms/games/multiplayer/realtime/g;",
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
.method protected a(Lcom/google/android/gms/games/multiplayer/realtime/g;Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1

    invoke-static {p2}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/common/data/DataHolder;)Lcom/google/android/gms/games/multiplayer/realtime/Room;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/games/internal/d$c;->a(Lcom/google/android/gms/games/multiplayer/realtime/g;Lcom/google/android/gms/games/multiplayer/realtime/Room;)V

    return-void
.end method

.method protected abstract a(Lcom/google/android/gms/games/multiplayer/realtime/g;Lcom/google/android/gms/games/multiplayer/realtime/Room;)V
.end method

.method protected bridge synthetic a(Ljava/lang/Object;Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/multiplayer/realtime/g;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/games/internal/d$c;->a(Lcom/google/android/gms/games/multiplayer/realtime/g;Lcom/google/android/gms/common/data/DataHolder;)V

    return-void
.end method
