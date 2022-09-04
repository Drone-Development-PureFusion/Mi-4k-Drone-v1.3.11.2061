.class public final Lcom/google/android/gms/wearable/internal/ad;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wearable/internal/ad$a;,
        Lcom/google/android/gms/wearable/internal/ad$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a([Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/ab$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Landroid/content/IntentFilter;",
            ")",
            "Lcom/google/android/gms/wearable/internal/ab$a",
            "<",
            "Lcom/google/android/gms/wearable/p$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/ad$3;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/ad$3;-><init>([Landroid/content/IntentFilter;)V

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/wearable/p$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/ad$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/wearable/internal/ad$1;-><init>(Lcom/google/android/gms/wearable/internal/ad;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/p$c;)Lcom/google/android/gms/common/api/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/wearable/p$c;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/content/IntentFilter;

    const/4 v1, 0x0

    const-string v2, "com.google.android.gms.wearable.NODE_CHANGED"

    invoke-static {v2}, Lcom/google/android/gms/wearable/internal/ap;->a(Ljava/lang/String;)Landroid/content/IntentFilter;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/wearable/internal/ad;->a([Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/ab$a;

    move-result-object v0

    invoke-static {p1, v0, p2}, Lcom/google/android/gms/wearable/internal/ab;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/internal/ab$a;Ljava/lang/Object;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/wearable/p$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/ad$2;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/wearable/internal/ad$2;-><init>(Lcom/google/android/gms/wearable/internal/ad;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/p$c;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/wearable/p$c;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/ad$4;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/wearable/internal/ad$4;-><init>(Lcom/google/android/gms/wearable/internal/ad;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/p$c;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method
