.class public Lcom/google/android/gms/fitness/request/GetFileUriRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/fitness/request/GetFileUriRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Lcom/google/android/gms/internal/ala;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/ad;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/request/ad;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/request/GetFileUriRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/IBinder;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/fitness/request/GetFileUriRequest;->a:I

    invoke-static {p2}, Lcom/google/android/gms/internal/ala$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ala;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/GetFileUriRequest;->b:Lcom/google/android/gms/internal/ala;

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/GetFileUriRequest;->a:I

    return v0
.end method

.method public b()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/GetFileUriRequest;->b:Lcom/google/android/gms/internal/ala;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ala;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v1, "GetFileUriRequest {%d, %s}"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget v4, p0, Lcom/google/android/gms/fitness/request/GetFileUriRequest;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/google/android/gms/fitness/request/GetFileUriRequest;->b:Lcom/google/android/gms/internal/ala;

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/ad;->a(Lcom/google/android/gms/fitness/request/GetFileUriRequest;Landroid/os/Parcel;I)V

    return-void
.end method
