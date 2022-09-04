.class public final Lcom/google/android/gms/wallet/ProxyCard;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wallet/ProxyCard;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:I

.field d:I

.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/w;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/w;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/ProxyCard;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wallet/ProxyCard;->e:I

    iput-object p2, p0, Lcom/google/android/gms/wallet/ProxyCard;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/wallet/ProxyCard;->b:Ljava/lang/String;

    iput p4, p0, Lcom/google/android/gms/wallet/ProxyCard;->c:I

    iput p5, p0, Lcom/google/android/gms/wallet/ProxyCard;->d:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/ProxyCard;->e:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/ProxyCard;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/ProxyCard;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/ProxyCard;->c:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/ProxyCard;->d:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/w;->a(Lcom/google/android/gms/wallet/ProxyCard;Landroid/os/Parcel;I)V

    return-void
.end method
