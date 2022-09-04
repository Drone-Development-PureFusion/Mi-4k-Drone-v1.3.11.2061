.class Lcom/google/android/gms/vision/a$d;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/Camera$PreviewCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/vision/a;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/vision/a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/vision/a$d;->a:Lcom/google/android/gms/vision/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/vision/a;Lcom/google/android/gms/vision/a$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/vision/a$d;-><init>(Lcom/google/android/gms/vision/a;)V

    return-void
.end method


# virtual methods
.method public onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/a$d;->a:Lcom/google/android/gms/vision/a;

    invoke-static {v0}, Lcom/google/android/gms/vision/a;->c(Lcom/google/android/gms/vision/a;)Lcom/google/android/gms/vision/a$e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/vision/a$e;->a([BLandroid/hardware/Camera;)V

    return-void
.end method
