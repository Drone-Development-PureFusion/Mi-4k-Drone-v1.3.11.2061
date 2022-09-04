.class public abstract Lcom/google/android/gms/games/multiplayer/turnbased/d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/games/multiplayer/turnbased/d$a;
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(IIJ)Landroid/os/Bundle;
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "min_automatch_players"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "max_automatch_players"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "exclusive_bit_mask"

    invoke-virtual {v0, v1, p2, p3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    return-object v0
.end method

.method public static e()Lcom/google/android/gms/games/multiplayer/turnbased/d$a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/games/multiplayer/turnbased/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/games/multiplayer/turnbased/d$a;-><init>(Lcom/google/android/gms/games/multiplayer/turnbased/d$1;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()I
.end method

.method public abstract c()[Ljava/lang/String;
.end method

.method public abstract d()Landroid/os/Bundle;
.end method
