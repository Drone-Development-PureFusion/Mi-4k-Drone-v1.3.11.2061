.class Lcom/google/android/gms/vision/a$f;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/Camera$PictureCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "f"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/vision/a;

.field private b:Lcom/google/android/gms/vision/a$b;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/vision/a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/vision/a$f;->a:Lcom/google/android/gms/vision/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/vision/a;Lcom/google/android/gms/vision/a$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/vision/a$f;-><init>(Lcom/google/android/gms/vision/a;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/vision/a$f;Lcom/google/android/gms/vision/a$b;)Lcom/google/android/gms/vision/a$b;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/vision/a$f;->b:Lcom/google/android/gms/vision/a$b;

    return-object p1
.end method


# virtual methods
.method public onPictureTaken([BLandroid/hardware/Camera;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/vision/a$f;->b:Lcom/google/android/gms/vision/a$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/vision/a$f;->b:Lcom/google/android/gms/vision/a$b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/vision/a$b;->a([B)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/vision/a$f;->a:Lcom/google/android/gms/vision/a;

    invoke-static {v0}, Lcom/google/android/gms/vision/a;->a(Lcom/google/android/gms/vision/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/vision/a$f;->a:Lcom/google/android/gms/vision/a;

    invoke-static {v0}, Lcom/google/android/gms/vision/a;->b(Lcom/google/android/gms/vision/a;)Landroid/hardware/Camera;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/vision/a$f;->a:Lcom/google/android/gms/vision/a;

    invoke-static {v0}, Lcom/google/android/gms/vision/a;->b(Lcom/google/android/gms/vision/a;)Landroid/hardware/Camera;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V

    :cond_1
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
