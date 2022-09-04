.class public Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/text/internal/client/d;


# instance fields
.field public final a:I

.field public final b:[Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;

.field public final c:Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;

.field public final d:Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;

.field public final e:Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;

.field public final f:Ljava/lang/String;

.field public final g:F

.field public final h:Ljava/lang/String;

.field public final i:I

.field public final j:Z

.field public final k:I

.field public final l:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/text/internal/client/d;

    invoke-direct {v0}, Lcom/google/android/gms/vision/text/internal/client/d;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->CREATOR:Lcom/google/android/gms/vision/text/internal/client/d;

    return-void
.end method

.method public constructor <init>(I[Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;Ljava/lang/String;FLjava/lang/String;IZII)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->a:I

    iput-object p2, p0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->b:[Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;

    iput-object p3, p0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->c:Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;

    iput-object p4, p0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->d:Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;

    iput-object p5, p0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->e:Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;

    iput-object p6, p0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->f:Ljava/lang/String;

    iput p7, p0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->g:F

    iput-object p8, p0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->h:Ljava/lang/String;

    iput p9, p0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->i:I

    iput-boolean p10, p0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->j:Z

    iput p11, p0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->k:I

    iput p12, p0, Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;->l:I

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/text/internal/client/d;->a(Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;Landroid/os/Parcel;I)V

    return-void
.end method
