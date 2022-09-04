.class public final Lcom/google/android/gms/vision/face/internal/client/LandmarkParcel;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/face/internal/client/f;


# instance fields
.field public final a:I

.field public final b:F

.field public final c:F

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/face/internal/client/f;

    invoke-direct {v0}, Lcom/google/android/gms/vision/face/internal/client/f;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/face/internal/client/LandmarkParcel;->CREATOR:Lcom/google/android/gms/vision/face/internal/client/f;

    return-void
.end method

.method public constructor <init>(IFFI)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/face/internal/client/LandmarkParcel;->a:I

    iput p2, p0, Lcom/google/android/gms/vision/face/internal/client/LandmarkParcel;->b:F

    iput p3, p0, Lcom/google/android/gms/vision/face/internal/client/LandmarkParcel;->c:F

    iput p4, p0, Lcom/google/android/gms/vision/face/internal/client/LandmarkParcel;->d:I

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/face/internal/client/f;->a(Lcom/google/android/gms/vision/face/internal/client/LandmarkParcel;Landroid/os/Parcel;I)V

    return-void
.end method
