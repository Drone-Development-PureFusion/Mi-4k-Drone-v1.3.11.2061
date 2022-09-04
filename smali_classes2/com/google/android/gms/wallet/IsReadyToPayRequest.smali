.class public final Lcom/google/android/gms/wallet/IsReadyToPayRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/IsReadyToPayRequest$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wallet/IsReadyToPayRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/n;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/n;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/IsReadyToPayRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/wallet/IsReadyToPayRequest;->a:I

    return-void
.end method

.method constructor <init>(ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wallet/IsReadyToPayRequest;->a:I

    iput-object p2, p0, Lcom/google/android/gms/wallet/IsReadyToPayRequest;->b:Ljava/util/ArrayList;

    return-void
.end method

.method public static c()Lcom/google/android/gms/wallet/IsReadyToPayRequest$a;
    .locals 3

    new-instance v0, Lcom/google/android/gms/wallet/IsReadyToPayRequest$a;

    new-instance v1, Lcom/google/android/gms/wallet/IsReadyToPayRequest;

    invoke-direct {v1}, Lcom/google/android/gms/wallet/IsReadyToPayRequest;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/IsReadyToPayRequest$a;-><init>(Lcom/google/android/gms/wallet/IsReadyToPayRequest;Lcom/google/android/gms/wallet/IsReadyToPayRequest$1;)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/IsReadyToPayRequest;->a:I

    return v0
.end method

.method public b()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/IsReadyToPayRequest;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/n;->a(Lcom/google/android/gms/wallet/IsReadyToPayRequest;Landroid/os/Parcel;I)V

    return-void
.end method
