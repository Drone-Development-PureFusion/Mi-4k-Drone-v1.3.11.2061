.class public Lcom/google/android/gms/internal/aly;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/fitness/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/aly$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/Subscription;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/data/Subscription;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/aly$3;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/aly$3;-><init>(Lcom/google/android/gms/internal/aly;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/Subscription;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

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
            "Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/aly$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/aly$1;-><init>(Lcom/google/android/gms/internal/aly;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/fitness/data/Subscription$a;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/Subscription$a;-><init>()V

    invoke-virtual {v0, p2}, Lcom/google/android/gms/fitness/data/Subscription$a;->a(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/Subscription$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/Subscription$a;->a()Lcom/google/android/gms/fitness/data/Subscription;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/aly;->b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/Subscription;)Lcom/google/android/gms/common/api/i;

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
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/fitness/data/Subscription$a;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/Subscription$a;-><init>()V

    invoke-virtual {v0, p2}, Lcom/google/android/gms/fitness/data/Subscription$a;->a(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/data/Subscription$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/Subscription$a;->a()Lcom/google/android/gms/fitness/data/Subscription;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/aly;->b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/Subscription;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/Subscription;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/data/Subscription;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/fitness/data/Subscription;->b()Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/fitness/data/Subscription;->a()Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/aly;->b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/fitness/data/Subscription;->b()Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/aly;->b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/aly$5;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/aly$5;-><init>(Lcom/google/android/gms/internal/aly;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataSource;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

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
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/aly$4;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/aly$4;-><init>(Lcom/google/android/gms/internal/aly;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataType;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/fitness/result/ListSubscriptionsResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/aly$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/aly$2;-><init>(Lcom/google/android/gms/internal/aly;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataType;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method
