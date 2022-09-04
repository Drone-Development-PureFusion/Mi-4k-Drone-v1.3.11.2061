.class Lcom/google/android/gms/internal/lq;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/lq$c;,
        Lcom/google/android/gms/internal/lq$a;,
        Lcom/google/android/gms/internal/lq$b;
    }
.end annotation


# direct methods
.method static a(B)Lcom/google/android/gms/internal/lq$b;
    .locals 1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/lq$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/lq$a;-><init>()V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/lq$c;

    invoke-direct {v0}, Lcom/google/android/gms/internal/lq$c;-><init>()V

    goto :goto_0
.end method
