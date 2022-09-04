.class public final Lcom/google/android/gms/wearable/internal/bp;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wearable/internal/bp$c;,
        Lcom/google/android/gms/wearable/internal/bp$b;,
        Lcom/google/android/gms/wearable/internal/bp$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/e$b;[Landroid/content/IntentFilter;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/wearable/e$b;",
            "[",
            "Landroid/content/IntentFilter;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-static {p3}, Lcom/google/android/gms/wearable/internal/bp;->a([Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/ab$a;

    move-result-object v0

    invoke-static {p1, v0, p2}, Lcom/google/android/gms/wearable/internal/ab;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/internal/ab$a;Ljava/lang/Object;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
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
            "Lcom/google/android/gms/wearable/e$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/bp$8;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/bp$8;-><init>([Landroid/content/IntentFilter;)V

    return-object v0
.end method

.method private a(Lcom/google/android/gms/wearable/Asset;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "asset is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/wearable/Asset;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid asset"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/wearable/Asset;->a()[B

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid asset"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-void
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
            "Lcom/google/android/gms/wearable/j;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/bp$3;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/wearable/internal/bp$3;-><init>(Lcom/google/android/gms/wearable/internal/bp;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Landroid/net/Uri;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Landroid/net/Uri;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/wearable/e$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/bp$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/wearable/internal/bp$2;-><init>(Lcom/google/android/gms/wearable/internal/bp;Lcom/google/android/gms/common/api/g;Landroid/net/Uri;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Landroid/net/Uri;I)Lcom/google/android/gms/common/api/i;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Landroid/net/Uri;",
            "I)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/wearable/j;",
            ">;"
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_2

    move v0, v1

    :goto_0
    const-string v3, "uri must not be null"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    if-eqz p3, :cond_0

    if-ne p3, v1, :cond_1

    :cond_0
    move v2, v1

    :cond_1
    const-string v0, "invalid filter type"

    invoke-static {v2, v0}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/wearable/internal/bp$4;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/wearable/internal/bp$4;-><init>(Lcom/google/android/gms/wearable/internal/bp;Lcom/google/android/gms/common/api/g;Landroid/net/Uri;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0

    :cond_2
    move v0, v2

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/Asset;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/wearable/Asset;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/wearable/e$e;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/bp;->a(Lcom/google/android/gms/wearable/Asset;)V

    new-instance v0, Lcom/google/android/gms/wearable/internal/bp$6;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/wearable/internal/bp$6;-><init>(Lcom/google/android/gms/wearable/internal/bp;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/Asset;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/PutDataRequest;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/wearable/PutDataRequest;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/wearable/e$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/bp$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/wearable/internal/bp$1;-><init>(Lcom/google/android/gms/wearable/internal/bp;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/PutDataRequest;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/e$b;)Lcom/google/android/gms/common/api/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/wearable/e$b;",
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

    const-string v2, "com.google.android.gms.wearable.DATA_CHANGED"

    invoke-static {v2}, Lcom/google/android/gms/wearable/internal/ap;->a(Ljava/lang/String;)Landroid/content/IntentFilter;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/wearable/internal/bp;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/e$b;[Landroid/content/IntentFilter;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/e$b;Landroid/net/Uri;I)Lcom/google/android/gms/common/api/i;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/wearable/e$b;",
            "Landroid/net/Uri;",
            "I)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v1, 0x1

    if-eqz p3, :cond_1

    move v0, v1

    :goto_0
    const-string v3, "uri must not be null"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    if-eqz p4, :cond_0

    if-ne p4, v1, :cond_2

    :cond_0
    move v0, v1

    :goto_1
    const-string v3, "invalid filter type"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    const-string v0, "com.google.android.gms.wearable.DATA_CHANGED"

    invoke-static {v0, p3, p4}, Lcom/google/android/gms/wearable/internal/ap;->a(Ljava/lang/String;Landroid/net/Uri;I)Landroid/content/IntentFilter;

    move-result-object v0

    new-array v1, v1, [Landroid/content/IntentFilter;

    aput-object v0, v1, v2

    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/wearable/internal/bp;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/e$b;[Landroid/content/IntentFilter;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/i;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/wearable/i;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/wearable/e$e;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/bp$7;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/wearable/internal/bp$7;-><init>(Lcom/google/android/gms/wearable/internal/bp;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/i;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Landroid/net/Uri;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Landroid/net/Uri;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/wearable/j;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/wearable/internal/bp;->a(Lcom/google/android/gms/common/api/g;Landroid/net/Uri;I)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Landroid/net/Uri;I)Lcom/google/android/gms/common/api/i;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Landroid/net/Uri;",
            "I)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/wearable/e$c;",
            ">;"
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_2

    move v0, v1

    :goto_0
    const-string v3, "uri must not be null"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    if-eqz p3, :cond_0

    if-ne p3, v1, :cond_1

    :cond_0
    move v2, v1

    :cond_1
    const-string v0, "invalid filter type"

    invoke-static {v2, v0}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/wearable/internal/bp$5;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/wearable/internal/bp$5;-><init>(Lcom/google/android/gms/wearable/internal/bp;Lcom/google/android/gms/common/api/g;Landroid/net/Uri;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0

    :cond_2
    move v0, v2

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/e$b;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/wearable/e$b;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/bp$9;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/wearable/internal/bp$9;-><init>(Lcom/google/android/gms/wearable/internal/bp;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/e$b;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/google/android/gms/common/api/g;Landroid/net/Uri;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Landroid/net/Uri;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/wearable/e$c;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/wearable/internal/bp;->b(Lcom/google/android/gms/common/api/g;Landroid/net/Uri;I)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method
