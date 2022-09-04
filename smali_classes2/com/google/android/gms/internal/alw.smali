.class public Lcom/google/android/gms/internal/alw;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/fitness/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/alw$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataSet;Z)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/data/DataSet;",
            "Z)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    const-string v0, "Must set the data set"

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/android/gms/fitness/data/DataSet;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Cannot use an empty data set"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    invoke-virtual {p2}, Lcom/google/android/gms/fitness/data/DataSet;->b()Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSource;->e()Lcom/google/android/gms/fitness/data/Application;

    move-result-object v0

    const-string v1, "Must set the app package name for the data source"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/alw$1;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/alw$1;-><init>(Lcom/google/android/gms/internal/alw;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataSet;Z)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataType;Z)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/data/DataType;",
            "Z)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/fitness/result/DailyTotalResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/alw$7;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/alw$7;-><init>(Lcom/google/android/gms/internal/alw;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataType;Z)V

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

    new-instance v0, Lcom/google/android/gms/internal/alw$5;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/alw$5;-><init>(Lcom/google/android/gms/internal/alw;Lcom/google/android/gms/common/api/g;Landroid/app/PendingIntent;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataSet;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/data/DataSet;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/alw;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataSet;Z)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/fitness/result/DailyTotalResult;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/alw;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataType;Z)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataDeleteRequest;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/request/DataDeleteRequest;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/alw$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/alw$2;-><init>(Lcom/google/android/gms/internal/alw;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataDeleteRequest;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataReadRequest;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/request/DataReadRequest;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/fitness/result/DataReadResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/alw$6;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/alw$6;-><init>(Lcom/google/android/gms/internal/alw;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataReadRequest;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/alw$4;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/alw$4;-><init>(Lcom/google/android/gms/internal/alw;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataUpdateListenerRegistrationRequest;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataUpdateRequest;)Lcom/google/android/gms/common/api/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/request/DataUpdateRequest;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/fitness/request/DataUpdateRequest;->c()Lcom/google/android/gms/fitness/data/DataSet;

    move-result-object v0

    const-string v1, "Must set the data set"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/android/gms/fitness/request/DataUpdateRequest;->a()J

    move-result-wide v0

    const-string v2, "Must set a non-zero value for startTimeMillis/startTime"

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/common/internal/d;->a(JLjava/lang/Object;)J

    invoke-virtual {p2}, Lcom/google/android/gms/fitness/request/DataUpdateRequest;->b()J

    move-result-wide v0

    const-string v2, "Must set a non-zero value for endTimeMillis/endTime"

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/common/internal/d;->a(JLjava/lang/Object;)J

    new-instance v0, Lcom/google/android/gms/internal/alw$3;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/alw$3;-><init>(Lcom/google/android/gms/internal/alw;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/DataUpdateRequest;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/fitness/result/DailyTotalResult;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/alw;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataType;Z)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method
