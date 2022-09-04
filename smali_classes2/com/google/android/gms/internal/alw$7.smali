.class Lcom/google/android/gms/internal/alw$7;
.super Lcom/google/android/gms/internal/akr$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/alw;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataType;Z)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/akr$a",
        "<",
        "Lcom/google/android/gms/fitness/result/DailyTotalResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/fitness/data/DataType;

.field final synthetic b:Z

.field final synthetic c:Lcom/google/android/gms/internal/alw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/alw;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/DataType;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/alw$7;->c:Lcom/google/android/gms/internal/alw;

    iput-object p3, p0, Lcom/google/android/gms/internal/alw$7;->a:Lcom/google/android/gms/fitness/data/DataType;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/alw$7;->b:Z

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/akr$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/DailyTotalResult;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/alw$7;->a:Lcom/google/android/gms/fitness/data/DataType;

    invoke-static {p1, v0}, Lcom/google/android/gms/fitness/result/DailyTotalResult;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/result/DailyTotalResult;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/akr;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/alw$7;->a(Lcom/google/android/gms/internal/akr;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/akr;)V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/alw$7$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/alw$7$1;-><init>(Lcom/google/android/gms/internal/alw$7;)V

    new-instance v1, Lcom/google/android/gms/fitness/request/DailyTotalRequest;

    iget-object v2, p0, Lcom/google/android/gms/internal/alw$7;->a:Lcom/google/android/gms/fitness/data/DataType;

    iget-boolean v3, p0, Lcom/google/android/gms/internal/alw$7;->b:Z

    invoke-direct {v1, v0, v2, v3}, Lcom/google/android/gms/fitness/request/DailyTotalRequest;-><init>(Lcom/google/android/gms/internal/akw;Lcom/google/android/gms/fitness/data/DataType;Z)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/akr;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/alf;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/alf;->a(Lcom/google/android/gms/fitness/request/DailyTotalRequest;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/alw$7;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/DailyTotalResult;

    move-result-object v0

    return-object v0
.end method
