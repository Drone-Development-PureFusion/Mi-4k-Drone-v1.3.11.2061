.class public Lcom/google/android/gms/drive/internal/OpenContentsRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/internal/OpenContentsRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field final b:Lcom/google/android/gms/drive/DriveId;

.field final c:I

.field final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/internal/aj;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/aj;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/internal/OpenContentsRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/DriveId;II)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/internal/OpenContentsRequest;->a:I

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/OpenContentsRequest;->b:Lcom/google/android/gms/drive/DriveId;

    iput p3, p0, Lcom/google/android/gms/drive/internal/OpenContentsRequest;->c:I

    iput p4, p0, Lcom/google/android/gms/drive/internal/OpenContentsRequest;->d:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/drive/DriveId;II)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/gms/drive/internal/OpenContentsRequest;-><init>(ILcom/google/android/gms/drive/DriveId;II)V

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/aj;->a(Lcom/google/android/gms/drive/internal/OpenContentsRequest;Landroid/os/Parcel;I)V

    return-void
.end method