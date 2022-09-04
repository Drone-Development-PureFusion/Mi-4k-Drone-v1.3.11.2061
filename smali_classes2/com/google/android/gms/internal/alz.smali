.class public Lcom/google/android/gms/internal/alz;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/fitness/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/alz$c;,
        Lcom/google/android/gms/internal/alz$b;,
        Lcom/google/android/gms/internal/alz$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/y;Landroid/app/PendingIntent;Lcom/google/android/gms/internal/alz$a;)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/data/y;",
            "Landroid/app/PendingIntent;",
            "Lcom/google/android/gms/internal/alz$a;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/alz$4;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p4

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/alz$4;-><init>(Lcom/google/android/gms/internal/alz;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/alz$a;Lcom/google/android/gms/fitness/data/y;Landroid/app/PendingIntent;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/c;Lcom/google/android/gms/fitness/data/y;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/request/c;",
            "Lcom/google/android/gms/fitness/data/y;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/alz$2;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/alz$2;-><init>(Lcom/google/android/gms/internal/alz;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/c;Lcom/google/android/gms/fitness/data/y;Landroid/app/PendingIntent;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2, v0}, Lcom/google/android/gms/internal/alz;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/y;Landroid/app/PendingIntent;Lcom/google/android/gms/internal/alz$a;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataSourcesRequest;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/request/DataSourcesRequest;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/fitness/result/DataSourcesResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/alz$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/alz$1;-><init>(Lcom/google/android/gms/internal/alz;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataSourcesRequest;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/b;)Lcom/google/android/gms/common/api/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/request/b;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/fitness/request/aj$a;->a()Lcom/google/android/gms/fitness/request/aj$a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/fitness/request/aj$a;->b(Lcom/google/android/gms/fitness/request/b;)Lcom/google/android/gms/fitness/request/aj;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/j;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v1, 0x0

    new-instance v2, Lcom/google/android/gms/internal/alz$3;

    invoke-direct {v2, p0, p2}, Lcom/google/android/gms/internal/alz$3;-><init>(Lcom/google/android/gms/internal/alz;Lcom/google/android/gms/fitness/request/b;)V

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/gms/internal/alz;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/y;Landroid/app/PendingIntent;Lcom/google/android/gms/internal/alz$a;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/c;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/request/c;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/google/android/gms/internal/alz;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/c;Lcom/google/android/gms/fitness/data/y;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/c;Lcom/google/android/gms/fitness/request/b;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/request/c;",
            "Lcom/google/android/gms/fitness/request/b;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/fitness/request/aj$a;->a()Lcom/google/android/gms/fitness/request/aj$a;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/fitness/request/aj$a;->a(Lcom/google/android/gms/fitness/request/b;)Lcom/google/android/gms/fitness/request/aj;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/google/android/gms/internal/alz;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/c;Lcom/google/android/gms/fitness/data/y;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method
