.class public final Lcom/google/android/gms/wallet/FullWalletRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/FullWalletRequest$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wallet/FullWalletRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:Lcom/google/android/gms/wallet/Cart;

.field private final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/k;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/k;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/FullWalletRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/wallet/FullWalletRequest;->d:I

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/wallet/Cart;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wallet/FullWalletRequest;->d:I

    iput-object p2, p0, Lcom/google/android/gms/wallet/FullWalletRequest;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/wallet/FullWalletRequest;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/wallet/FullWalletRequest;->c:Lcom/google/android/gms/wallet/Cart;

    return-void
.end method

.method public static a()Lcom/google/android/gms/wallet/FullWalletRequest$a;
    .locals 3

    new-instance v0, Lcom/google/android/gms/wallet/FullWalletRequest$a;

    new-instance v1, Lcom/google/android/gms/wallet/FullWalletRequest;

    invoke-direct {v1}, Lcom/google/android/gms/wallet/FullWalletRequest;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/FullWalletRequest$a;-><init>(Lcom/google/android/gms/wallet/FullWalletRequest;Lcom/google/android/gms/wallet/FullWalletRequest$1;)V

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/FullWalletRequest;->d:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/FullWalletRequest;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/FullWalletRequest;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lcom/google/android/gms/wallet/Cart;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/FullWalletRequest;->c:Lcom/google/android/gms/wallet/Cart;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/k;->a(Lcom/google/android/gms/wallet/FullWalletRequest;Landroid/os/Parcel;I)V

    return-void
.end method
