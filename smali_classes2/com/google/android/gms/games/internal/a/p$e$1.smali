.class Lcom/google/android/gms/games/internal/a/p$e$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/multiplayer/turnbased/g$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/p$e;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/multiplayer/turnbased/g$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/Status;

.field final synthetic b:Lcom/google/android/gms/games/internal/a/p$e;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/p$e;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/p$e$1;->b:Lcom/google/android/gms/games/internal/a/p$e;

    iput-object p2, p0, Lcom/google/android/gms/games/internal/a/p$e$1;->a:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/a/p$e$1;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()Lcom/google/android/gms/games/multiplayer/turnbased/a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/games/multiplayer/turnbased/a;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-direct {v0, v1}, Lcom/google/android/gms/games/multiplayer/turnbased/a;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method
