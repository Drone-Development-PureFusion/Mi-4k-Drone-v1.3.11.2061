.class public Lcom/google/android/gms/wearable/internal/PutDataResponse;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wearable/internal/PutDataResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Lcom/google/android/gms/wearable/internal/DataItemParcelable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/ah;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/ah;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/internal/PutDataResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IILcom/google/android/gms/wearable/internal/DataItemParcelable;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wearable/internal/PutDataResponse;->a:I

    iput p2, p0, Lcom/google/android/gms/wearable/internal/PutDataResponse;->b:I

    iput-object p3, p0, Lcom/google/android/gms/wearable/internal/PutDataResponse;->c:Lcom/google/android/gms/wearable/internal/DataItemParcelable;

    return-void
.end method

.method public constructor <init>(ILcom/google/android/gms/wearable/internal/DataItemParcelable;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/wearable/internal/PutDataResponse;-><init>(IILcom/google/android/gms/wearable/internal/DataItemParcelable;)V

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/ah;->a(Lcom/google/android/gms/wearable/internal/PutDataResponse;Landroid/os/Parcel;I)V

    return-void
.end method
