.class public Lcom/google/android/gms/drive/DriveFileRange;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/DriveFileRange;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field final b:J

.field final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/r;

    invoke-direct {v0}, Lcom/google/android/gms/drive/r;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/DriveFileRange;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IJJ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/DriveFileRange;->a:I

    iput-wide p2, p0, Lcom/google/android/gms/drive/DriveFileRange;->b:J

    iput-wide p4, p0, Lcom/google/android/gms/drive/DriveFileRange;->c:J

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/r;->a(Lcom/google/android/gms/drive/DriveFileRange;Landroid/os/Parcel;I)V

    return-void
.end method
