.class final Lcom/google/android/gms/identity/intents/a$1;
.super Lcom/google/android/gms/common/api/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/identity/intents/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/a$b",
        "<",
        "Lcom/google/android/gms/internal/amn;",
        "Lcom/google/android/gms/identity/intents/a$a;",
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
.method public bridge synthetic a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Ljava/lang/Object;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/common/api/a$f;
    .locals 7

    move-object v4, p4

    check-cast v4, Lcom/google/android/gms/identity/intents/a$a;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/identity/intents/a$1;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/identity/intents/a$a;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/internal/amn;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/identity/intents/a$a;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/internal/amn;
    .locals 7

    instance-of v0, p1, Landroid/app/Activity;

    const-string v1, "An Activity must be used for Address APIs"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    if-nez p4, :cond_0

    new-instance p4, Lcom/google/android/gms/identity/intents/a$a;

    invoke-direct {p4}, Lcom/google/android/gms/identity/intents/a$a;-><init>()V

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/amn;

    move-object v1, p1

    check-cast v1, Landroid/app/Activity;

    iget v4, p4, Lcom/google/android/gms/identity/intents/a$a;->a:I

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/amn;-><init>(Landroid/app/Activity;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;ILcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V

    return-object v0
.end method
