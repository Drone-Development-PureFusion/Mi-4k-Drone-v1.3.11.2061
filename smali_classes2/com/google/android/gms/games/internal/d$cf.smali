.class final Lcom/google/android/gms/games/internal/d$cf;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/multiplayer/turnbased/g$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "cf"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/api/Status;

.field private final b:Lcom/google/android/gms/games/multiplayer/turnbased/a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/Status;Landroid/os/Bundle;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/d$cf;->a:Lcom/google/android/gms/common/api/Status;

    new-instance v0, Lcom/google/android/gms/games/multiplayer/turnbased/a;

    invoke-direct {v0, p2}, Lcom/google/android/gms/games/multiplayer/turnbased/a;-><init>(Landroid/os/Bundle;)V

    iput-object v0, p0, Lcom/google/android/gms/games/internal/d$cf;->b:Lcom/google/android/gms/games/multiplayer/turnbased/a;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$cf;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$cf;->b:Lcom/google/android/gms/games/multiplayer/turnbased/a;

    invoke-virtual {v0}, Lcom/google/android/gms/games/multiplayer/turnbased/a;->f()V

    return-void
.end method

.method public c()Lcom/google/android/gms/games/multiplayer/turnbased/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$cf;->b:Lcom/google/android/gms/games/multiplayer/turnbased/a;

    return-object v0
.end method
