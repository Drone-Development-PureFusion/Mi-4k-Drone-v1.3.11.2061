.class public final Lcom/google/android/gms/wallet/MaskedWallet;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/MaskedWallet$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wallet/MaskedWallet;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:[Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Lcom/google/android/gms/wallet/Address;

.field f:Lcom/google/android/gms/wallet/Address;

.field g:[Lcom/google/android/gms/wallet/LoyaltyWalletObject;

.field h:[Lcom/google/android/gms/wallet/OfferWalletObject;

.field i:Lcom/google/android/gms/identity/intents/model/UserAddress;

.field j:Lcom/google/android/gms/identity/intents/model/UserAddress;

.field k:[Lcom/google/android/gms/wallet/InstrumentInfo;

.field private final l:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/q;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/q;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/MaskedWallet;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->l:I

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/wallet/Address;Lcom/google/android/gms/wallet/Address;[Lcom/google/android/gms/wallet/LoyaltyWalletObject;[Lcom/google/android/gms/wallet/OfferWalletObject;Lcom/google/android/gms/identity/intents/model/UserAddress;Lcom/google/android/gms/identity/intents/model/UserAddress;[Lcom/google/android/gms/wallet/InstrumentInfo;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wallet/MaskedWallet;->l:I

    iput-object p2, p0, Lcom/google/android/gms/wallet/MaskedWallet;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/wallet/MaskedWallet;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/wallet/MaskedWallet;->c:[Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/wallet/MaskedWallet;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/wallet/MaskedWallet;->e:Lcom/google/android/gms/wallet/Address;

    iput-object p7, p0, Lcom/google/android/gms/wallet/MaskedWallet;->f:Lcom/google/android/gms/wallet/Address;

    iput-object p8, p0, Lcom/google/android/gms/wallet/MaskedWallet;->g:[Lcom/google/android/gms/wallet/LoyaltyWalletObject;

    iput-object p9, p0, Lcom/google/android/gms/wallet/MaskedWallet;->h:[Lcom/google/android/gms/wallet/OfferWalletObject;

    iput-object p10, p0, Lcom/google/android/gms/wallet/MaskedWallet;->i:Lcom/google/android/gms/identity/intents/model/UserAddress;

    iput-object p11, p0, Lcom/google/android/gms/wallet/MaskedWallet;->j:Lcom/google/android/gms/identity/intents/model/UserAddress;

    iput-object p12, p0, Lcom/google/android/gms/wallet/MaskedWallet;->k:[Lcom/google/android/gms/wallet/InstrumentInfo;

    return-void
.end method

.method public static a()Lcom/google/android/gms/wallet/MaskedWallet$a;
    .locals 3

    new-instance v0, Lcom/google/android/gms/wallet/MaskedWallet$a;

    new-instance v1, Lcom/google/android/gms/wallet/MaskedWallet;

    invoke-direct {v1}, Lcom/google/android/gms/wallet/MaskedWallet;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/MaskedWallet$a;-><init>(Lcom/google/android/gms/wallet/MaskedWallet;Lcom/google/android/gms/wallet/MaskedWallet$1;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/wallet/MaskedWallet;)Lcom/google/android/gms/wallet/MaskedWallet$a;
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/wallet/MaskedWallet;->a()Lcom/google/android/gms/wallet/MaskedWallet$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$a;->a(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$a;->b(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->e()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$a;->a([Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->f()[Lcom/google/android/gms/wallet/InstrumentInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$a;->a([Lcom/google/android/gms/wallet/InstrumentInfo;)Lcom/google/android/gms/wallet/MaskedWallet$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$a;->c(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->h()[Lcom/google/android/gms/wallet/LoyaltyWalletObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$a;->a([Lcom/google/android/gms/wallet/LoyaltyWalletObject;)Lcom/google/android/gms/wallet/MaskedWallet$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->i()[Lcom/google/android/gms/wallet/OfferWalletObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$a;->a([Lcom/google/android/gms/wallet/OfferWalletObject;)Lcom/google/android/gms/wallet/MaskedWallet$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->j()Lcom/google/android/gms/identity/intents/model/UserAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$a;->a(Lcom/google/android/gms/identity/intents/model/UserAddress;)Lcom/google/android/gms/wallet/MaskedWallet$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->k()Lcom/google/android/gms/identity/intents/model/UserAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$a;->b(Lcom/google/android/gms/identity/intents/model/UserAddress;)Lcom/google/android/gms/wallet/MaskedWallet$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->l:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->c:[Ljava/lang/String;

    return-object v0
.end method

.method public f()[Lcom/google/android/gms/wallet/InstrumentInfo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->k:[Lcom/google/android/gms/wallet/InstrumentInfo;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->d:Ljava/lang/String;

    return-object v0
.end method

.method public h()[Lcom/google/android/gms/wallet/LoyaltyWalletObject;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->g:[Lcom/google/android/gms/wallet/LoyaltyWalletObject;

    return-object v0
.end method

.method public i()[Lcom/google/android/gms/wallet/OfferWalletObject;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->h:[Lcom/google/android/gms/wallet/OfferWalletObject;

    return-object v0
.end method

.method public j()Lcom/google/android/gms/identity/intents/model/UserAddress;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->i:Lcom/google/android/gms/identity/intents/model/UserAddress;

    return-object v0
.end method

.method public k()Lcom/google/android/gms/identity/intents/model/UserAddress;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->j:Lcom/google/android/gms/identity/intents/model/UserAddress;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/q;->a(Lcom/google/android/gms/wallet/MaskedWallet;Landroid/os/Parcel;I)V

    return-void
.end method
