.class public interface abstract Lcom/google/android/gms/games/request/GameRequest;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/google/android/gms/common/data/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;",
        "Lcom/google/android/gms/common/data/f",
        "<",
        "Lcom/google/android/gms/games/request/GameRequest;",
        ">;"
    }
.end annotation


# static fields
.field public static final TYPE_ALL:I = 0xffff
    .annotation build Lcom/google/android/gms/common/annotation/KeepName;
    .end annotation
.end field

.field public static final a:I = 0x1

.field public static final b:I = 0x2

.field public static final c:I = 0x0

.field public static final d:I = 0x1

.field public static final e:I = 0x0

.field public static final f:I = 0x1


# virtual methods
.method public abstract a(Ljava/lang/String;)Z
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Lcom/google/android/gms/games/Game;
.end method

.method public abstract g()Lcom/google/android/gms/games/Player;
.end method

.method public abstract i()[B
.end method

.method public abstract j()I
.end method

.method public abstract k()J
.end method

.method public abstract l()J
.end method

.method public abstract m()I
.end method

.method public abstract o()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/games/Player;",
            ">;"
        }
    .end annotation
.end method

.method public abstract p_(Ljava/lang/String;)I
.end method
