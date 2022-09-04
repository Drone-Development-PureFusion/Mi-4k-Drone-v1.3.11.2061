.class public Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/internal/client/b;


# instance fields
.field final a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:J

.field public f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/internal/client/b;

    invoke-direct {v0}, Lcom/google/android/gms/vision/internal/client/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->CREATOR:Lcom/google/android/gms/vision/internal/client/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->a:I

    return-void
.end method

.method public constructor <init>(IIIIJI)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->a:I

    iput p2, p0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->b:I

    iput p3, p0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->c:I

    iput p4, p0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->d:I

    iput-wide p5, p0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->e:J

    iput p7, p0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->f:I

    return-void
.end method

.method public static a(Lcom/google/android/gms/vision/d;)Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;
    .locals 4

    new-instance v0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;

    invoke-direct {v0}, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/vision/d;->a()Lcom/google/android/gms/vision/d$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/vision/d$b;->a()I

    move-result v1

    iput v1, v0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->b:I

    invoke-virtual {p0}, Lcom/google/android/gms/vision/d;->a()Lcom/google/android/gms/vision/d$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/vision/d$b;->b()I

    move-result v1

    iput v1, v0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->c:I

    invoke-virtual {p0}, Lcom/google/android/gms/vision/d;->a()Lcom/google/android/gms/vision/d$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/vision/d$b;->e()I

    move-result v1

    iput v1, v0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->f:I

    invoke-virtual {p0}, Lcom/google/android/gms/vision/d;->a()Lcom/google/android/gms/vision/d$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/vision/d$b;->c()I

    move-result v1

    iput v1, v0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->d:I

    invoke-virtual {p0}, Lcom/google/android/gms/vision/d;->a()Lcom/google/android/gms/vision/d$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/vision/d$b;->d()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->e:J

    return-object v0
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->CREATOR:Lcom/google/android/gms/vision/internal/client/b;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/internal/client/b;->a(Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;Landroid/os/Parcel;I)V

    return-void
.end method
