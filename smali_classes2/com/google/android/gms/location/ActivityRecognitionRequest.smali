.class public Lcom/google/android/gms/location/ActivityRecognitionRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/location/ActivityRecognitionRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private b:J

.field private c:Z

.field private d:Landroid/os/WorkSource;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private e:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private f:[I
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private g:Z
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private h:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final i:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/location/r;

    invoke-direct {v0}, Lcom/google/android/gms/location/r;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IJZLandroid/os/WorkSource;Ljava/lang/String;[IZLjava/lang/String;J)V
    .locals 0
    .param p5    # Landroid/os/WorkSource;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # [I
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->a:I

    iput-wide p2, p0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->b:J

    iput-boolean p4, p0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->c:Z

    iput-object p5, p0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->d:Landroid/os/WorkSource;

    iput-object p6, p0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->e:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->f:[I

    iput-boolean p8, p0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->g:Z

    iput-object p9, p0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->h:Ljava/lang/String;

    iput-wide p10, p0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->i:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->b:J

    return-wide v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->c:Z

    return v0
.end method

.method public c()Landroid/os/WorkSource;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->d:Landroid/os/WorkSource;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e()[I
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->f:[I

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->g:Z

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->h:Ljava/lang/String;

    return-object v0
.end method

.method public h()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->i:J

    return-wide v0
.end method

.method i()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/location/ActivityRecognitionRequest;->a:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/location/r;->a(Lcom/google/android/gms/location/ActivityRecognitionRequest;Landroid/os/Parcel;I)V

    return-void
.end method
