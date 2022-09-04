.class public Lcom/google/android/gms/drive/internal/RemovePermissionRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/internal/RemovePermissionRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field final b:Lcom/google/android/gms/drive/DriveId;

.field final c:Ljava/lang/String;

.field final d:Z

.field final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/internal/ap;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/ap;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/internal/RemovePermissionRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/DriveId;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/internal/RemovePermissionRequest;->a:I

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/RemovePermissionRequest;->b:Lcom/google/android/gms/drive/DriveId;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/RemovePermissionRequest;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/drive/internal/RemovePermissionRequest;->d:Z

    iput-object p5, p0, Lcom/google/android/gms/drive/internal/RemovePermissionRequest;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/ap;->a(Lcom/google/android/gms/drive/internal/RemovePermissionRequest;Landroid/os/Parcel;I)V

    return-void
.end method
