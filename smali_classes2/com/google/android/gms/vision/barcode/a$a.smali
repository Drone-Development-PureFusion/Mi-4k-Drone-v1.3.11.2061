.class public Lcom/google/android/gms/vision/barcode/a$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/barcode/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/vision/barcode/a$a;->a:Landroid/content/Context;

    new-instance v0, Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;

    invoke-direct {v0}, Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/vision/barcode/a$a;->b:Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;

    return-void
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/vision/barcode/a$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/barcode/a$a;->b:Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;

    iput p1, v0, Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;->b:I

    return-object p0
.end method

.method public a()Lcom/google/android/gms/vision/barcode/a;
    .locals 3

    new-instance v0, Lcom/google/android/gms/vision/barcode/internal/client/b;

    iget-object v1, p0, Lcom/google/android/gms/vision/barcode/a$a;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/vision/barcode/a$a;->b:Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/vision/barcode/internal/client/b;-><init>(Landroid/content/Context;Lcom/google/android/gms/vision/barcode/internal/client/BarcodeDetectorOptions;)V

    new-instance v1, Lcom/google/android/gms/vision/barcode/a;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/vision/barcode/a;-><init>(Lcom/google/android/gms/vision/barcode/internal/client/b;Lcom/google/android/gms/vision/barcode/a$1;)V

    return-object v1
.end method
