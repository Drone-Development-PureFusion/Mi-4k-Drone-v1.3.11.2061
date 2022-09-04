.class public interface abstract Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/google/android/gms/common/data/f;
.implements Lcom/google/android/gms/games/multiplayer/j;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;",
        "Lcom/google/android/gms/common/data/f",
        "<",
        "Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;",
        ">;",
        "Lcom/google/android/gms/games/multiplayer/j;"
    }
.end annotation


# static fields
.field public static final MATCH_TURN_STATUS_ALL:[I
    .annotation build Lcom/google/android/gms/common/annotation/KeepName;
    .end annotation
.end field

.field public static final a:I = -0x1

.field public static final b:I = 0x0

.field public static final c:I = 0x1

.field public static final d:I = 0x2

.field public static final e:I = 0x3

.field public static final f:I = 0x4

.field public static final g:I = 0x0

.field public static final h:I = 0x1

.field public static final i:I = 0x2

.field public static final j:I = 0x3


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;->MATCH_TURN_STATUS_ALL:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x1
        0x2
        0x3
    .end array-data
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)I
.end method

.method public abstract a(Landroid/database/CharArrayBuffer;)V
.end method

.method public abstract c()Lcom/google/android/gms/games/Game;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()J
.end method

.method public abstract g()I
.end method

.method public abstract h()I
.end method

.method public abstract i()Ljava/lang/String;
.end method

.method public abstract j()I
.end method

.method public abstract k()Ljava/lang/String;
.end method

.method public abstract l()J
.end method

.method public abstract n()Ljava/lang/String;
.end method

.method public abstract n_(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract o()[B
.end method

.method public abstract o_(Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/Participant;
.end method

.method public abstract p()I
.end method

.method public abstract q()Z
.end method

.method public abstract r()Ljava/lang/String;
.end method

.method public abstract s()[B
.end method

.method public abstract t()I
.end method

.method public abstract u()Landroid/os/Bundle;
.end method

.method public abstract v()I
.end method

.method public abstract w()Z
.end method

.method public abstract x()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract y()Ljava/lang/String;
.end method

.method public abstract z()Lcom/google/android/gms/games/multiplayer/Participant;
.end method
