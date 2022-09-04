.class public Lcom/google/android/gms/wallet/firstparty/ExecuteBuyFlowRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wallet/firstparty/ExecuteBuyFlowRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:[B

.field b:[B

.field c:Lcom/google/android/gms/wallet/firstparty/WalletCustomTheme;

.field private final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/firstparty/a;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/firstparty/a;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/firstparty/ExecuteBuyFlowRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(I[B[BLcom/google/android/gms/wallet/firstparty/WalletCustomTheme;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wallet/firstparty/ExecuteBuyFlowRequest;->d:I

    iput-object p2, p0, Lcom/google/android/gms/wallet/firstparty/ExecuteBuyFlowRequest;->a:[B

    iput-object p3, p0, Lcom/google/android/gms/wallet/firstparty/ExecuteBuyFlowRequest;->b:[B

    iput-object p4, p0, Lcom/google/android/gms/wallet/firstparty/ExecuteBuyFlowRequest;->c:Lcom/google/android/gms/wallet/firstparty/WalletCustomTheme;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/firstparty/ExecuteBuyFlowRequest;->d:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/firstparty/a;->a(Lcom/google/android/gms/wallet/firstparty/ExecuteBuyFlowRequest;Landroid/os/Parcel;I)V

    return-void
.end method
