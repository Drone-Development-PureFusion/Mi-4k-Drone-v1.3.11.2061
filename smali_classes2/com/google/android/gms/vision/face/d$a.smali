.class public Lcom/google/android/gms/vision/face/d$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/face/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/vision/face/d;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/vision/b;Lcom/google/android/gms/vision/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/b",
            "<",
            "Lcom/google/android/gms/vision/face/a;",
            ">;",
            "Lcom/google/android/gms/vision/g",
            "<",
            "Lcom/google/android/gms/vision/face/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/vision/face/d;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/vision/face/d;-><init>(Lcom/google/android/gms/vision/b;Lcom/google/android/gms/vision/g;)V

    iput-object v0, p0, Lcom/google/android/gms/vision/face/d$a;->a:Lcom/google/android/gms/vision/face/d;

    return-void
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/vision/face/d$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/face/d$a;->a:Lcom/google/android/gms/vision/face/d;

    invoke-static {v0, p1}, Lcom/google/android/gms/vision/face/d;->a(Lcom/google/android/gms/vision/face/d;I)V

    return-object p0
.end method

.method public a()Lcom/google/android/gms/vision/face/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/face/d$a;->a:Lcom/google/android/gms/vision/face/d;

    return-object v0
.end method
