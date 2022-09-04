.class public Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/text/internal/client/i;


# instance fields
.field public final a:I

.field public final b:[Lcom/google/android/gms/vision/text/internal/client/SymbolBoxParcel;

.field public final c:Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;

.field public final d:Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;

.field public final e:Ljava/lang/String;

.field public final f:F

.field public final g:Ljava/lang/String;

.field public final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/text/internal/client/i;

    invoke-direct {v0}, Lcom/google/android/gms/vision/text/internal/client/i;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;->CREATOR:Lcom/google/android/gms/vision/text/internal/client/i;

    return-void
.end method

.method public constructor <init>(I[Lcom/google/android/gms/vision/text/internal/client/SymbolBoxParcel;Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;Ljava/lang/String;FLjava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;->a:I

    iput-object p2, p0, Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;->b:[Lcom/google/android/gms/vision/text/internal/client/SymbolBoxParcel;

    iput-object p3, p0, Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;->c:Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;

    iput-object p4, p0, Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;->d:Lcom/google/android/gms/vision/text/internal/client/BoundingBoxParcel;

    iput-object p5, p0, Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;->e:Ljava/lang/String;

    iput p6, p0, Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;->f:F

    iput-object p7, p0, Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;->g:Ljava/lang/String;

    iput-boolean p8, p0, Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;->h:Z

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/text/internal/client/i;->a(Lcom/google/android/gms/vision/text/internal/client/WordBoxParcel;Landroid/os/Parcel;I)V

    return-void
.end method
