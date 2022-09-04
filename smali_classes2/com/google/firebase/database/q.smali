.class public Lcom/google/firebase/database/q;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/database/q$a;,
        Lcom/google/firebase/database/q$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/firebase/database/q$b;
    .locals 3

    const/4 v2, 0x0

    new-instance v0, Lcom/google/firebase/database/q$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/firebase/database/q$b;-><init>(ZLcom/google/android/gms/internal/lh;Lcom/google/firebase/database/q$1;)V

    return-object v0
.end method

.method public static a(Lcom/google/firebase/database/k;)Lcom/google/firebase/database/q$b;
    .locals 4

    new-instance v0, Lcom/google/firebase/database/q$b;

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/firebase/database/k;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/firebase/database/q$b;-><init>(ZLcom/google/android/gms/internal/lh;Lcom/google/firebase/database/q$1;)V

    return-object v0
.end method
