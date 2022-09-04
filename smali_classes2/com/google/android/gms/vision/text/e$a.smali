.class public Lcom/google/android/gms/vision/text/e$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/text/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/google/android/gms/vision/text/internal/client/TextRecognizerOptions;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/vision/text/e$a;->a:Landroid/content/Context;

    new-instance v0, Lcom/google/android/gms/vision/text/internal/client/TextRecognizerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/vision/text/internal/client/TextRecognizerOptions;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/vision/text/e$a;->b:Lcom/google/android/gms/vision/text/internal/client/TextRecognizerOptions;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/vision/text/e;
    .locals 3

    new-instance v0, Lcom/google/android/gms/vision/text/internal/client/g;

    iget-object v1, p0, Lcom/google/android/gms/vision/text/e$a;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/vision/text/e$a;->b:Lcom/google/android/gms/vision/text/internal/client/TextRecognizerOptions;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/vision/text/internal/client/g;-><init>(Landroid/content/Context;Lcom/google/android/gms/vision/text/internal/client/TextRecognizerOptions;)V

    new-instance v1, Lcom/google/android/gms/vision/text/e;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/vision/text/e;-><init>(Lcom/google/android/gms/vision/text/internal/client/g;Lcom/google/android/gms/vision/text/e$1;)V

    return-object v1
.end method
