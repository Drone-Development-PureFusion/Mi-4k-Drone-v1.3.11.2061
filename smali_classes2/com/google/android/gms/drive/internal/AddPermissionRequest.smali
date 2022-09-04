.class public Lcom/google/android/gms/drive/internal/AddPermissionRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/internal/AddPermissionRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field final b:Lcom/google/android/gms/drive/DriveId;

.field final c:Lcom/google/android/gms/drive/Permission;

.field final d:Z

.field final e:Ljava/lang/String;

.field final f:Z

.field final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/internal/ab;

    invoke-direct {v0}, Lcom/google/android/gms/drive/internal/ab;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/internal/AddPermissionRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/Permission;ZLjava/lang/String;ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/internal/AddPermissionRequest;->a:I

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/AddPermissionRequest;->b:Lcom/google/android/gms/drive/DriveId;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/AddPermissionRequest;->c:Lcom/google/android/gms/drive/Permission;

    iput-boolean p4, p0, Lcom/google/android/gms/drive/internal/AddPermissionRequest;->d:Z

    iput-object p5, p0, Lcom/google/android/gms/drive/internal/AddPermissionRequest;->e:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/google/android/gms/drive/internal/AddPermissionRequest;->f:Z

    iput-object p7, p0, Lcom/google/android/gms/drive/internal/AddPermissionRequest;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/ab;->a(Lcom/google/android/gms/drive/internal/AddPermissionRequest;Landroid/os/Parcel;I)V

    return-void
.end method
