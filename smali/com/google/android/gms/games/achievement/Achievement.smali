.class public interface abstract Lcom/google/android/gms/games/achievement/Achievement;
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
        "Lcom/google/android/gms/games/achievement/Achievement;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:I = 0x0

.field public static final b:I = 0x1

.field public static final c:I = 0x2

.field public static final d:I = 0x0

.field public static final e:I = 0x1


# virtual methods
.method public abstract a(Landroid/database/CharArrayBuffer;)V
.end method

.method public abstract b(Landroid/database/CharArrayBuffer;)V
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract c(Landroid/database/CharArrayBuffer;)V
.end method

.method public abstract d()I
.end method

.method public abstract d(Landroid/database/CharArrayBuffer;)V
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()Landroid/net/Uri;
.end method

.method public abstract getRevealedImageUrl()Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/annotation/KeepName;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract getUnlockedImageUrl()Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/annotation/KeepName;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract h()Landroid/net/Uri;
.end method

.method public abstract i()I
.end method

.method public abstract j()Ljava/lang/String;
.end method

.method public abstract k()Lcom/google/android/gms/games/Player;
.end method

.method public abstract l()I
.end method

.method public abstract m()I
.end method

.method public abstract n()Ljava/lang/String;
.end method

.method public abstract o()J
.end method

.method public abstract p()J
.end method
