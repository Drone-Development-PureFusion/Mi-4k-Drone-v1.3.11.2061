.class final Lcom/google/android/gms/cast/a$1;
.super Lcom/google/android/gms/common/api/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/a$b",
        "<",
        "Lcom/google/android/gms/cast/internal/e;",
        "Lcom/google/android/gms/cast/a$c;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/api/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/cast/a$c;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/cast/internal/e;
    .locals 11

    const-string v0, "Setting the API options is required."

    invoke-static {p4, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/cast/internal/e;

    iget-object v5, p4, Lcom/google/android/gms/cast/a$c;->a:Lcom/google/android/gms/cast/CastDevice;

    invoke-static {p4}, Lcom/google/android/gms/cast/a$c;->a(Lcom/google/android/gms/cast/a$c;)I

    move-result v0

    int-to-long v6, v0

    iget-object v8, p4, Lcom/google/android/gms/cast/a$c;->b:Lcom/google/android/gms/cast/a$d;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/cast/internal/e;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/cast/CastDevice;JLcom/google/android/gms/cast/a$d;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V

    return-object v1
.end method

.method public bridge synthetic a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Ljava/lang/Object;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/common/api/a$f;
    .locals 7

    move-object v4, p4

    check-cast v4, Lcom/google/android/gms/cast/a$c;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/cast/a$1;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/cast/a$c;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/cast/internal/e;

    move-result-object v0

    return-object v0
.end method
