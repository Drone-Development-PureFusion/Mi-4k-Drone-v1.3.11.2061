.class public Lcom/google/android/gms/drive/Contents;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/Contents;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:I

.field final b:Landroid/os/ParcelFileDescriptor;

.field final c:I

.field final d:I

.field final e:Lcom/google/android/gms/drive/DriveId;

.field final f:Z

.field final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/q;

    invoke-direct {v0}, Lcom/google/android/gms/drive/q;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/Contents;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/ParcelFileDescriptor;IILcom/google/android/gms/drive/DriveId;ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/Contents;->a:I

    iput-object p2, p0, Lcom/google/android/gms/drive/Contents;->b:Landroid/os/ParcelFileDescriptor;

    iput p3, p0, Lcom/google/android/gms/drive/Contents;->c:I

    iput p4, p0, Lcom/google/android/gms/drive/Contents;->d:I

    iput-object p5, p0, Lcom/google/android/gms/drive/Contents;->e:Lcom/google/android/gms/drive/DriveId;

    iput-boolean p6, p0, Lcom/google/android/gms/drive/Contents;->f:Z

    iput-object p7, p0, Lcom/google/android/gms/drive/Contents;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Landroid/os/ParcelFileDescriptor;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/Contents;->b:Landroid/os/ParcelFileDescriptor;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/drive/DriveId;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/Contents;->e:Lcom/google/android/gms/drive/DriveId;

    return-object v0
.end method

.method public c()Ljava/io/InputStream;
    .locals 2

    new-instance v0, Ljava/io/FileInputStream;

    iget-object v1, p0, Lcom/google/android/gms/drive/Contents;->b:Landroid/os/ParcelFileDescriptor;

    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    return-object v0
.end method

.method public d()Ljava/io/OutputStream;
    .locals 2

    new-instance v0, Ljava/io/FileOutputStream;

    iget-object v1, p0, Lcom/google/android/gms/drive/Contents;->b:Landroid/os/ParcelFileDescriptor;

    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/drive/Contents;->d:I

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/drive/Contents;->c:I

    return v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/drive/Contents;->f:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/q;->a(Lcom/google/android/gms/drive/Contents;Landroid/os/Parcel;I)V

    return-void
.end method
