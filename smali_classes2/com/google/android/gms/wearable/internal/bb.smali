.class public Lcom/google/android/gms/wearable/internal/bb;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wearable/internal/bb$a;,
        Lcom/google/android/gms/wearable/internal/bb$e;,
        Lcom/google/android/gms/wearable/internal/bb$d;,
        Lcom/google/android/gms/wearable/internal/bb$f;,
        Lcom/google/android/gms/wearable/internal/bb$b;,
        Lcom/google/android/gms/wearable/internal/bb$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/a$c;[Landroid/content/IntentFilter;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/wearable/a$c;",
            "[",
            "Landroid/content/IntentFilter;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-static {p3}, Lcom/google/android/gms/wearable/internal/bb;->a([Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/ab$a;

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
            "Lcom/google/android/gms/wearable/a$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/bb$5;

    invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/bb$5;-><init>([Landroid/content/IntentFilter;)V

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;I)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "I)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/wearable/a$d;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    if-ne p2, v0, :cond_1

    :cond_0
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    new-instance v0, Lcom/google/android/gms/wearable/internal/bb$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/wearable/internal/bb$2;-><init>(Lcom/google/android/gms/wearable/internal/bb;Lcom/google/android/gms/common/api/g;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/a$c;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/wearable/a$c;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/bb$f;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/google/android/gms/wearable/internal/bb$f;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/a$c;Lcom/google/android/gms/wearable/internal/bb$1;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/a$c;Landroid/net/Uri;I)Lcom/google/android/gms/common/api/i;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/wearable/a$c;",
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

    const-string v0, "com.google.android.gms.wearable.CAPABILITY_CHANGED"

    invoke-static {v0, p3, p4}, Lcom/google/android/gms/wearable/internal/ap;->a(Ljava/lang/String;Landroid/net/Uri;I)Landroid/content/IntentFilter;

    move-result-object v0

    new-array v1, v1, [Landroid/content/IntentFilter;

    aput-object v0, v1, v2

    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/wearable/internal/bb;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/a$c;[Landroid/content/IntentFilter;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/a$c;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/wearable/a$c;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p3, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "capability must not be null"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    new-instance v3, Lcom/google/android/gms/wearable/internal/bb$b;

    invoke-direct {v3, p2, p3}, Lcom/google/android/gms/wearable/internal/bb$b;-><init>(Lcom/google/android/gms/wearable/a$c;Ljava/lang/String;)V

    const-string v0, "com.google.android.gms.wearable.CAPABILITY_CHANGED"

    invoke-static {v0}, Lcom/google/android/gms/wearable/internal/ap;->a(Ljava/lang/String;)Landroid/content/IntentFilter;

    move-result-object v4

    const-string v0, "/"

    invoke-virtual {p3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v5, "/"

    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v4, v0, v2}, Landroid/content/IntentFilter;->addDataPath(Ljava/lang/String;I)V

    new-array v0, v1, [Landroid/content/IntentFilter;

    aput-object v4, v0, v2

    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/wearable/internal/bb;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/a$c;[Landroid/content/IntentFilter;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v0, p3

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/wearable/a$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/bb$3;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/wearable/internal/bb$3;-><init>(Lcom/google/android/gms/wearable/internal/bb;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;I)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            "I)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/wearable/a$e;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    if-eqz p3, :cond_0

    if-ne p3, v0, :cond_1

    :cond_0
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    new-instance v0, Lcom/google/android/gms/wearable/internal/bb$1;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/wearable/internal/bb$1;-><init>(Lcom/google/android/gms/wearable/internal/bb;Lcom/google/android/gms/common/api/g;Ljava/lang/String;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/a$c;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/wearable/a$c;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/bb$b;

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/wearable/internal/bb$b;-><init>(Lcom/google/android/gms/wearable/a$c;Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/wearable/internal/bb$f;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lcom/google/android/gms/wearable/internal/bb$f;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wearable/a$c;Lcom/google/android/gms/wearable/internal/bb$1;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/wearable/a$g;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/wearable/internal/bb$4;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/wearable/internal/bb$4;-><init>(Lcom/google/android/gms/wearable/internal/bb;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method
