.class public interface abstract Lcom/google/android/gms/games/multiplayer/realtime/Room;
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
        "Lcom/google/android/gms/games/multiplayer/realtime/Room;",
        ">;",
        "Lcom/google/android/gms/games/multiplayer/j;"
    }
.end annotation


# static fields
.field public static final a:I = -0x1

.field public static final b:I = 0x0

.field public static final c:I = 0x1

.field public static final d:I = 0x2

.field public static final e:I = 0x3


# virtual methods
.method public abstract a(Ljava/lang/String;)I
.end method

.method public abstract a(Landroid/database/CharArrayBuffer;)V
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()J
.end method

.method public abstract f()I
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract h()I
.end method

.method public abstract i()Landroid/os/Bundle;
.end method

.method public abstract j()I
.end method

.method public abstract k()Ljava/util/ArrayList;
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

.method public abstract k_(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract l_(Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/Participant;
.end method
