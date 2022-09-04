.class public Lcom/google/android/gms/internal/amc;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/fitness/a;


# static fields
.field private static final a:Lcom/google/android/gms/common/api/Status;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x138f

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/internal/amc;->a:Lcom/google/android/gms/common/api/Status;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
            "Lcom/google/android/gms/fitness/result/BleDevicesResult;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/amc;->a:Lcom/google/android/gms/common/api/Status;

    invoke-static {v0}, Lcom/google/android/gms/fitness/result/BleDevicesResult;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/BleDevicesResult;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/j;->a(Lcom/google/android/gms/common/api/m;Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/BleDevice;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/data/BleDevice;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/amc;->a:Lcom/google/android/gms/common/api/Status;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/j;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/StartBleScanRequest;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/request/StartBleScanRequest;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/amc;->a:Lcom/google/android/gms/common/api/Status;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/j;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/a;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/request/a;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/amc;->a:Lcom/google/android/gms/common/api/Status;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/j;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
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
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/amc;->a:Lcom/google/android/gms/common/api/Status;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/j;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/BleDevice;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/fitness/data/BleDevice;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/amc;->a:Lcom/google/android/gms/common/api/Status;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/j;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;

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
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/amc;->a:Lcom/google/android/gms/common/api/Status;

    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/j;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method
