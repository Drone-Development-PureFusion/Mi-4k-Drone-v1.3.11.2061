.class public final Lcom/google/android/gms/wallet/wobs/LoyaltyPointsBalance;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wallet/wobs/LoyaltyPointsBalance;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:I

.field b:Ljava/lang/String;

.field c:D

.field d:Ljava/lang/String;

.field e:J

.field f:I

.field private final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/wobs/d;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/wobs/d;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/wobs/LoyaltyPointsBalance;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    const/4 v1, -0x1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/wallet/wobs/LoyaltyPointsBalance;->g:I

    iput v1, p0, Lcom/google/android/gms/wallet/wobs/LoyaltyPointsBalance;->f:I

    iput v1, p0, Lcom/google/android/gms/wallet/wobs/LoyaltyPointsBalance;->a:I

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    iput-wide v0, p0, Lcom/google/android/gms/wallet/wobs/LoyaltyPointsBalance;->c:D

    return-void
.end method

.method constructor <init>(IILjava/lang/String;DLjava/lang/String;JI)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wallet/wobs/LoyaltyPointsBalance;->g:I

    iput p2, p0, Lcom/google/android/gms/wallet/wobs/LoyaltyPointsBalance;->a:I

    iput-object p3, p0, Lcom/google/android/gms/wallet/wobs/LoyaltyPointsBalance;->b:Ljava/lang/String;

    iput-wide p4, p0, Lcom/google/android/gms/wallet/wobs/LoyaltyPointsBalance;->c:D

    iput-object p6, p0, Lcom/google/android/gms/wallet/wobs/LoyaltyPointsBalance;->d:Ljava/lang/String;

    iput-wide p7, p0, Lcom/google/android/gms/wallet/wobs/LoyaltyPointsBalance;->e:J

    iput p9, p0, Lcom/google/android/gms/wallet/wobs/LoyaltyPointsBalance;->f:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/wobs/LoyaltyPointsBalance;->g:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/wobs/d;->a(Lcom/google/android/gms/wallet/wobs/LoyaltyPointsBalance;Landroid/os/Parcel;I)V

    return-void
.end method
