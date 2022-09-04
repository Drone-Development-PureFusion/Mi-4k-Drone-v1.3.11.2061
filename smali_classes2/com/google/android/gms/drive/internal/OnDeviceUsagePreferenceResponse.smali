.class public Lcom/google/android/gms/drive/internal/OnDeviceUsagePreferenceResponse;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/internal/OnDeviceUsagePreferenceResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field final b:Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/internal/v;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/v;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/internal/OnDeviceUsagePreferenceResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/internal/OnDeviceUsagePreferenceResponse;->a:I

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/OnDeviceUsagePreferenceResponse;->b:Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/OnDeviceUsagePreferenceResponse;->b:Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/v;->a(Lcom/google/android/gms/drive/internal/OnDeviceUsagePreferenceResponse;Landroid/os/Parcel;I)V

    return-void
.end method
