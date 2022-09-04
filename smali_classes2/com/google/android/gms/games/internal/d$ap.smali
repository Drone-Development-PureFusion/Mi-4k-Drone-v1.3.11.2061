.class Lcom/google/android/gms/games/internal/d$ap;
.super Lcom/google/android/gms/games/internal/d/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ap"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/games/internal/d;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/games/internal/d;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/games/internal/d$ap;->a:Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p1}, Lcom/google/android/gms/games/internal/d;->B()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/games/internal/d/a;-><init>(Landroid/os/Looper;I)V

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;I)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ap;->a:Lcom/google/android/gms/games/internal/d;

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/d;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$ap;->a:Lcom/google/android/gms/games/internal/d;

    invoke-virtual {v0}, Lcom/google/android/gms/games/internal/d;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/internal/k;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/games/internal/k;->e(Ljava/lang/String;I)V

    :goto_0
    return-void

    :cond_0
    const-string v0, "GamesClientImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x59

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Unable to increment event "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " by "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " because the games client is no longer connected"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/games/internal/h;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/games/internal/d$ap;->a:Lcom/google/android/gms/games/internal/d;

    invoke-static {v1, v0}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/games/internal/d;Landroid/os/RemoteException;)V

    goto :goto_0
.end method
