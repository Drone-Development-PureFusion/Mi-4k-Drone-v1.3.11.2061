.class public final Lcom/google/android/gms/cast/a$c$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/a$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field a:Lcom/google/android/gms/cast/CastDevice;

.field b:Lcom/google/android/gms/cast/a$d;

.field private c:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/a$d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "CastDevice parameter cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "CastListener parameter cannot be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/cast/a$c$a;->a:Lcom/google/android/gms/cast/CastDevice;

    iput-object p2, p0, Lcom/google/android/gms/cast/a$c$a;->b:Lcom/google/android/gms/cast/a$d;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/cast/a$c$a;->c:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/cast/a$c$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/a$c$a;->c:I

    return v0
.end method


# virtual methods
.method public a(Z)Lcom/google/android/gms/cast/a$c$a;
    .locals 1

    if-eqz p1, :cond_0

    iget v0, p0, Lcom/google/android/gms/cast/a$c$a;->c:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/cast/a$c$a;->c:I

    :goto_0
    return-object p0

    :cond_0
    iget v0, p0, Lcom/google/android/gms/cast/a$c$a;->c:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/google/android/gms/cast/a$c$a;->c:I

    goto :goto_0
.end method

.method public a()Lcom/google/android/gms/cast/a$c;
    .locals 2

    new-instance v0, Lcom/google/android/gms/cast/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/cast/a$c;-><init>(Lcom/google/android/gms/cast/a$c$a;Lcom/google/android/gms/cast/a$1;)V

    return-object v0
.end method
