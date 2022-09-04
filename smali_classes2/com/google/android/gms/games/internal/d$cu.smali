.class final Lcom/google/android/gms/games/internal/d$cu;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ail$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "cu"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ail$c",
        "<",
        "Lcom/google/android/gms/games/multiplayer/realtime/a;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/d$cu;->a:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/games/multiplayer/realtime/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$cu;->a:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;

    invoke-interface {p1, v0}, Lcom/google/android/gms/games/multiplayer/realtime/a;->a(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/multiplayer/realtime/a;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/d$cu;->a(Lcom/google/android/gms/games/multiplayer/realtime/a;)V

    return-void
.end method
