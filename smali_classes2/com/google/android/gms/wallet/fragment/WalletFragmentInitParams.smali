.class public final Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field private b:Ljava/lang/String;

.field private c:Lcom/google/android/gms/wallet/MaskedWalletRequest;

.field private d:I

.field private e:Lcom/google/android/gms/wallet/MaskedWallet;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/fragment/g;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/fragment/g;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->a:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->d:I

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Lcom/google/android/gms/wallet/MaskedWalletRequest;ILcom/google/android/gms/wallet/MaskedWallet;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->a:I

    iput-object p2, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->c:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput p4, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->d:I

    iput-object p5, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->e:Lcom/google/android/gms/wallet/MaskedWallet;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->d:I

    return p1
.end method

.method static synthetic a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)Lcom/google/android/gms/wallet/MaskedWallet;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->e:Lcom/google/android/gms/wallet/MaskedWallet;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;Lcom/google/android/gms/wallet/MaskedWallet;)Lcom/google/android/gms/wallet/MaskedWallet;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->e:Lcom/google/android/gms/wallet/MaskedWallet;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;Lcom/google/android/gms/wallet/MaskedWalletRequest;)Lcom/google/android/gms/wallet/MaskedWalletRequest;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->c:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    return-object p1
.end method

.method public static a()Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$a;
    .locals 3

    new-instance v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$a;

    new-instance v1, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;

    invoke-direct {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$a;-><init>(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$1;)V

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->b:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)Lcom/google/android/gms/wallet/MaskedWalletRequest;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->c:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->d:I

    return v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/wallet/MaskedWalletRequest;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->c:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->d:I

    return v0
.end method

.method public e()Lcom/google/android/gms/wallet/MaskedWallet;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->e:Lcom/google/android/gms/wallet/MaskedWallet;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/fragment/g;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;Landroid/os/Parcel;I)V

    return-void
.end method
