.class public final Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$a;,
        Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$b;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field b:Ljava/lang/String;

.field c:I

.field d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/s;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/s;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->a:I

    return-void
.end method

.method constructor <init>(ILjava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->a:I

    iput-object p2, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->b:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->c:I

    iput-object p4, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->d:Ljava/lang/String;

    return-void
.end method

.method public static a()Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$a;
    .locals 3

    new-instance v0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$a;

    new-instance v1, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;

    invoke-direct {v1}, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$a;-><init>(Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$1;)V

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->a:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->c:I

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->d:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/s;->a(Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;Landroid/os/Parcel;I)V

    return-void
.end method
