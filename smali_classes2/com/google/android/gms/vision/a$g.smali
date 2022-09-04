.class Lcom/google/android/gms/vision/a$g;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/Camera$ShutterCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "g"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/vision/a;

.field private b:Lcom/google/android/gms/vision/a$c;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/vision/a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/vision/a$g;->a:Lcom/google/android/gms/vision/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/vision/a;Lcom/google/android/gms/vision/a$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/vision/a$g;-><init>(Lcom/google/android/gms/vision/a;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/vision/a$g;Lcom/google/android/gms/vision/a$c;)Lcom/google/android/gms/vision/a$c;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/vision/a$g;->b:Lcom/google/android/gms/vision/a$c;

    return-object p1
.end method


# virtual methods
.method public onShutter()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/a$g;->b:Lcom/google/android/gms/vision/a$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/vision/a$g;->b:Lcom/google/android/gms/vision/a$c;

    invoke-interface {v0}, Lcom/google/android/gms/vision/a$c;->a()V

    :cond_0
    return-void
.end method
