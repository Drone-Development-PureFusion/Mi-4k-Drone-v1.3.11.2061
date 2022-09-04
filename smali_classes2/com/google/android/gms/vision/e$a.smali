.class public Lcom/google/android/gms/vision/e$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/vision/e;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/vision/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/vision/e;-><init>(Lcom/google/android/gms/vision/e$1;)V

    iput-object v0, p0, Lcom/google/android/gms/vision/e$a;->a:Lcom/google/android/gms/vision/e;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/vision/b;)Lcom/google/android/gms/vision/e$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/b",
            "<+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/android/gms/vision/e$a;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/vision/e$a;->a:Lcom/google/android/gms/vision/e;

    invoke-static {v0}, Lcom/google/android/gms/vision/e;->a(Lcom/google/android/gms/vision/e;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public a()Lcom/google/android/gms/vision/e;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/vision/e$a;->a:Lcom/google/android/gms/vision/e;

    invoke-static {v0}, Lcom/google/android/gms/vision/e;->a(Lcom/google/android/gms/vision/e;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "No underlying detectors added to MultiDetector."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/vision/e$a;->a:Lcom/google/android/gms/vision/e;

    return-object v0
.end method
