.class Lcom/google/android/gms/games/internal/a/p$f$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/multiplayer/turnbased/g$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/a/p$f;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/multiplayer/turnbased/g$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/Status;

.field final synthetic b:Lcom/google/android/gms/games/internal/a/p$f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/a/p$f;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/games/internal/a/p$f$1;->b:Lcom/google/android/gms/games/internal/a/p$f;

    iput-object p2, p0, Lcom/google/android/gms/games/internal/a/p$f$1;->a:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/a/p$f$1;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
