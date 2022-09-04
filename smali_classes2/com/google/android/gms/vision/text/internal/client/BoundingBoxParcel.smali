.class public Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/text/internal/client/a;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/text/internal/client/a;

    invoke-direct {v0}, Lcom/google/android/gms/vision/text/internal/client/a;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;->CREATOR:Lcom/google/android/gms/vision/text/internal/client/a;

    return-void
.end method

.method public constructor <init>(IIIIIF)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;->a:I

    iput p2, p0, Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;->b:I

    iput p3, p0, Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;->c:I

    iput p4, p0, Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;->d:I

    iput p5, p0, Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;->e:I

    iput p6, p0, Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;->f:F

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/text/internal/client/a;->a(Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;Landroid/os/Parcel;I)V

    return-void
.end method
