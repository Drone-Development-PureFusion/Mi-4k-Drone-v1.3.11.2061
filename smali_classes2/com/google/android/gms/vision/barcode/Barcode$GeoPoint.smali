.class public Lcom/google/android/gms/vision/barcode/Barcode$GeoPoint;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/barcode/Barcode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GeoPoint"
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/barcode/i;


# instance fields
.field final a:I

.field public b:D

.field public c:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/barcode/i;

    invoke-direct {v0}, Lcom/google/android/gms/vision/barcode/i;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/barcode/Barcode$GeoPoint;->CREATOR:Lcom/google/android/gms/vision/barcode/i;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/vision/barcode/Barcode$GeoPoint;->a:I

    return-void
.end method

.method public constructor <init>(IDD)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/barcode/Barcode$GeoPoint;->a:I

    iput-wide p2, p0, Lcom/google/android/gms/vision/barcode/Barcode$GeoPoint;->b:D

    iput-wide p4, p0, Lcom/google/android/gms/vision/barcode/Barcode$GeoPoint;->c:D

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/vision/barcode/Barcode$GeoPoint;->CREATOR:Lcom/google/android/gms/vision/barcode/i;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/barcode/i;->a(Lcom/google/android/gms/vision/barcode/Barcode$GeoPoint;Landroid/os/Parcel;I)V

    return-void
.end method
