.class public Lcom/google/android/gms/vision/text/internal/client/g;
.super Lcom/google/android/gms/vision/internal/client/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/vision/internal/client/a",
        "<",
        "Lcom/google/android/gms/vision/text/internal/client/b;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/vision/text/internal/client/TextRecognizerOptions;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/vision/text/internal/client/TextRecognizerOptions;)V
    .locals 1

    const-string v0, "TextNativeHandle"

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/vision/internal/client/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/google/android/gms/vision/text/internal/client/g;->a:Lcom/google/android/gms/vision/text/internal/client/TextRecognizerOptions;

    invoke-virtual {p0}, Lcom/google/android/gms/vision/text/internal/client/g;->d()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/akb;Landroid/content/Context;)Lcom/google/android/gms/vision/text/internal/client/b;
    .locals 3

    const-string v0, "com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/akb;->a(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/vision/text/internal/client/c$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/vision/text/internal/client/c;

    move-result-object v0

    invoke-static {p2}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/vision/text/internal/client/g;->a:Lcom/google/android/gms/vision/text/internal/client/TextRecognizerOptions;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/vision/text/internal/client/c;->a(Lcom/google/android/gms/c/e;Lcom/google/android/gms/vision/text/internal/client/TextRecognizerOptions;)Lcom/google/android/gms/vision/text/internal/client/b;

    move-result-object v0

    return-object v0
.end method

.method protected a()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/vision/text/internal/client/g;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/vision/text/internal/client/b;

    invoke-interface {v0}, Lcom/google/android/gms/vision/text/internal/client/b;->a()V

    return-void
.end method

.method public a(Landroid/graphics/Bitmap;Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;)[Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;
    .locals 4

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/vision/text/internal/client/g;->b()Z

    move-result v0

    if-nez v0, :cond_0

    new-array v0, v3, [Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/vision/text/internal/client/g;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/vision/text/internal/client/b;

    invoke-interface {v0, v1, p2, p3}, Lcom/google/android/gms/vision/text/internal/client/b;->a(Lcom/google/android/gms/c/e;Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;Lcom/google/android/gms/vision/text/internal/client/RecognitionOptions;)[Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "TextNativeHandle"

    const-string v2, "Error calling native text recognizer"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-array v0, v3, [Lcom/google/android/gms/vision/text/internal/client/LineBoxParcel;

    goto :goto_0
.end method

.method protected synthetic b(Lcom/google/android/gms/internal/akb;Landroid/content/Context;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/vision/text/internal/client/g;->a(Lcom/google/android/gms/internal/akb;Landroid/content/Context;)Lcom/google/android/gms/vision/text/internal/client/b;

    move-result-object v0

    return-object v0
.end method
