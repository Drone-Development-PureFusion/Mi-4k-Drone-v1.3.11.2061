.class public Lcom/google/android/gms/internal/ez;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wallet/c;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "MissingRemoteException"
    }
.end annotation


# direct methods
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
            "Lcom/google/android/gms/common/api/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ez$7;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ez$7;-><init>(Lcom/google/android/gms/internal/ez;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wallet/IsReadyToPayRequest;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/wallet/IsReadyToPayRequest;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ez$8;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ez$8;-><init>(Lcom/google/android/gms/internal/ez;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wallet/IsReadyToPayRequest;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;I)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ez$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ez$1;-><init>(Lcom/google/android/gms/internal/ez;Lcom/google/android/gms/common/api/g;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wallet/FullWalletRequest;I)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ez$3;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/ez$3;-><init>(Lcom/google/android/gms/internal/ez;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wallet/FullWalletRequest;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ez$2;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/ez$2;-><init>(Lcom/google/android/gms/internal/ez;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ez$5;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ez$5;-><init>(Lcom/google/android/gms/internal/ez;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/ez$4;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ez$4;-><init>(Lcom/google/android/gms/internal/ez;Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    return-void
.end method

.method public b(Lcom/google/android/gms/common/api/g;I)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ez$6;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ez$6;-><init>(Lcom/google/android/gms/internal/ez;Lcom/google/android/gms/common/api/g;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    return-void
.end method
