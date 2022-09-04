.class public final Lcom/google/android/gms/wallet/wobs/TimeInterval;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wallet/wobs/TimeInterval;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:J

.field b:J

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/wobs/g;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/wobs/g;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/wobs/TimeInterval;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/wallet/wobs/TimeInterval;->c:I

    return-void
.end method

.method constructor <init>(IJJ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wallet/wobs/TimeInterval;->c:I

    iput-wide p2, p0, Lcom/google/android/gms/wallet/wobs/TimeInterval;->a:J

    iput-wide p4, p0, Lcom/google/android/gms/wallet/wobs/TimeInterval;->b:J

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/wallet/wobs/TimeInterval;->c:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/wobs/g;->a(Lcom/google/android/gms/wallet/wobs/TimeInterval;Landroid/os/Parcel;I)V

    return-void
.end method
