.class public final Lcom/google/android/gms/cast/d$a$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field a:Lcom/google/android/gms/cast/CastDevice;

.field b:Lcom/google/android/gms/cast/d$b;

.field c:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/d$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "CastDevice parameter cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/cast/d$a$a;->a:Lcom/google/android/gms/cast/CastDevice;

    iput-object p2, p0, Lcom/google/android/gms/cast/d$a$a;->b:Lcom/google/android/gms/cast/d$b;

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/cast/d$a$a;->c:I

    return-void
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/cast/d$a$a;
    .locals 0
    .param p1    # I
        .annotation build Lcom/google/android/gms/cast/d$d;
        .end annotation
    .end param

    iput p1, p0, Lcom/google/android/gms/cast/d$a$a;->c:I

    return-object p0
.end method

.method public a()Lcom/google/android/gms/cast/d$a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/cast/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/cast/d$a;-><init>(Lcom/google/android/gms/cast/d$a$a;Lcom/google/android/gms/cast/d$1;)V

    return-object v0
.end method
