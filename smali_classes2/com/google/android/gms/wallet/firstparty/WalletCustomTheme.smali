.class public Lcom/google/android/gms/wallet/firstparty/WalletCustomTheme;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wallet/firstparty/WalletCustomTheme;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field b:I

.field c:Landroid/os/Bundle;

.field d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/firstparty/j;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/firstparty/j;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/firstparty/WalletCustomTheme;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/wallet/firstparty/WalletCustomTheme;->a:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/wallet/firstparty/WalletCustomTheme;->b:I

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/wallet/firstparty/WalletCustomTheme;->c:Landroid/os/Bundle;

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/wallet/firstparty/WalletCustomTheme;->d:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(IILandroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wallet/firstparty/WalletCustomTheme;->a:I

    iput-object p3, p0, Lcom/google/android/gms/wallet/firstparty/WalletCustomTheme;->c:Landroid/os/Bundle;

    iput p2, p0, Lcom/google/android/gms/wallet/firstparty/WalletCustomTheme;->b:I

    iput-object p4, p0, Lcom/google/android/gms/wallet/firstparty/WalletCustomTheme;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/firstparty/j;->a(Lcom/google/android/gms/wallet/firstparty/WalletCustomTheme;Landroid/os/Parcel;I)V

    return-void
.end method
