.class public Lcom/google/android/gms/nearby/messages/internal/t;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/nearby/messages/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/nearby/messages/internal/t$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/common/api/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$g",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/s;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/common/api/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$b",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/s;",
            "Lcom/google/android/gms/nearby/messages/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/t;->a:Lcom/google/android/gms/common/api/a$g;

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/t$1;

    invoke-direct {v0}, Lcom/google/android/gms/nearby/messages/internal/t$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/t;->b:Lcom/google/android/gms/common/api/a$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/content/Intent;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/Update;",
            ">;"
        }
    .end annotation

    const-string v0, "com.google.android.gms.nearby.messages.UPDATES"

    invoke-static {p0, v0}, Lcom/google/android/gms/nearby/messages/internal/p;->a(Landroid/content/Intent;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static a(Ljava/lang/Iterable;Lcom/google/android/gms/nearby/messages/e;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<",
            "Lcom/google/android/gms/nearby/messages/internal/Update;",
            ">;",
            "Lcom/google/android/gms/nearby/messages/e;",
            ")V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/Update;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/google/android/gms/nearby/messages/internal/Update;->a(I)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lcom/google/android/gms/nearby/messages/internal/Update;->c:Lcom/google/android/gms/nearby/messages/Message;

    invoke-virtual {p1, v2}, Lcom/google/android/gms/nearby/messages/e;->a(Lcom/google/android/gms/nearby/messages/Message;)V

    :cond_1
    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/nearby/messages/internal/Update;->a(I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, v0, Lcom/google/android/gms/nearby/messages/internal/Update;->c:Lcom/google/android/gms/nearby/messages/Message;

    invoke-virtual {p1, v2}, Lcom/google/android/gms/nearby/messages/e;->b(Lcom/google/android/gms/nearby/messages/Message;)V

    :cond_2
    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lcom/google/android/gms/nearby/messages/internal/Update;->a(I)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, v0, Lcom/google/android/gms/nearby/messages/internal/Update;->c:Lcom/google/android/gms/nearby/messages/Message;

    iget-object v3, v0, Lcom/google/android/gms/nearby/messages/internal/Update;->d:Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;

    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/nearby/messages/e;->a(Lcom/google/android/gms/nearby/messages/Message;Lcom/google/android/gms/nearby/messages/b;)V

    :cond_3
    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Lcom/google/android/gms/nearby/messages/internal/Update;->a(I)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/google/android/gms/nearby/messages/internal/Update;->c:Lcom/google/android/gms/nearby/messages/Message;

    iget-object v0, v0, Lcom/google/android/gms/nearby/messages/internal/Update;->e:Lcom/google/android/gms/nearby/messages/internal/BleSignalImpl;

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/nearby/messages/e;->a(Lcom/google/android/gms/nearby/messages/Message;Lcom/google/android/gms/nearby/messages/a;)V

    goto :goto_0

    :cond_4
    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/t$10;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/nearby/messages/internal/t$10;-><init>(Lcom/google/android/gms/nearby/messages/internal/t;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/nearby/messages/n;->a:Lcom/google/android/gms/nearby/messages/n;

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/nearby/messages/internal/t;->a(Lcom/google/android/gms/common/api/g;Landroid/app/PendingIntent;Lcom/google/android/gms/nearby/messages/n;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Landroid/app/PendingIntent;Lcom/google/android/gms/nearby/messages/n;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Landroid/app/PendingIntent;",
            "Lcom/google/android/gms/nearby/messages/n;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/t$7;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/nearby/messages/internal/t$7;-><init>(Lcom/google/android/gms/nearby/messages/internal/t;Lcom/google/android/gms/common/api/g;Landroid/app/PendingIntent;Lcom/google/android/gms/nearby/messages/n;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/Message;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/nearby/messages/Message;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/nearby/messages/k;->a:Lcom/google/android/gms/nearby/messages/k;

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/nearby/messages/internal/t;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/Message;Lcom/google/android/gms/nearby/messages/k;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/Message;Lcom/google/android/gms/nearby/messages/k;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/nearby/messages/Message;",
            "Lcom/google/android/gms/nearby/messages/k;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/t$4;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/nearby/messages/internal/t$4;-><init>(Lcom/google/android/gms/nearby/messages/internal/t;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/Message;Lcom/google/android/gms/nearby/messages/k;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/e;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/nearby/messages/e;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/nearby/messages/n;->a:Lcom/google/android/gms/nearby/messages/n;

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/nearby/messages/internal/t;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/e;Lcom/google/android/gms/nearby/messages/n;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/e;Lcom/google/android/gms/nearby/messages/n;)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/nearby/messages/e;",
            "Lcom/google/android/gms/nearby/messages/n;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/nearby/messages/internal/t;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/s;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/s;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/e;)Lcom/google/android/gms/internal/ail;

    move-result-object v3

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/t$6;

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/nearby/messages/internal/t$6;-><init>(Lcom/google/android/gms/nearby/messages/internal/t;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/nearby/messages/e;Lcom/google/android/gms/nearby/messages/n;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/l;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/nearby/messages/l;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/nearby/messages/internal/t;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/s;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/s;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/l;)Lcom/google/android/gms/internal/ail;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/t$2;

    invoke-direct {v1, p0, p1, v0, p2}, Lcom/google/android/gms/nearby/messages/internal/t$2;-><init>(Lcom/google/android/gms/nearby/messages/internal/t;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/nearby/messages/l;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/content/Intent;Lcom/google/android/gms/nearby/messages/e;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/nearby/messages/internal/t;->a(Landroid/content/Intent;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/google/android/gms/nearby/messages/internal/t;->a(Ljava/lang/Iterable;Lcom/google/android/gms/nearby/messages/e;)V

    return-void
.end method

.method public b(Lcom/google/android/gms/common/api/g;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/t$9;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/t$9;-><init>(Lcom/google/android/gms/nearby/messages/internal/t;Lcom/google/android/gms/common/api/g;Landroid/app/PendingIntent;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/Message;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/nearby/messages/Message;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/t$5;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/t$5;-><init>(Lcom/google/android/gms/nearby/messages/internal/t;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/Message;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/e;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/nearby/messages/e;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/nearby/messages/internal/t;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/s;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/s;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/e;)Lcom/google/android/gms/internal/ail;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/t$8;

    invoke-direct {v1, p0, p1, v0, p2}, Lcom/google/android/gms/nearby/messages/internal/t$8;-><init>(Lcom/google/android/gms/nearby/messages/internal/t;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/nearby/messages/e;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/l;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/nearby/messages/l;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/nearby/messages/internal/t;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/s;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/nearby/messages/internal/s;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/l;)Lcom/google/android/gms/internal/ail;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/t$3;

    invoke-direct {v1, p0, p1, v0, p2}, Lcom/google/android/gms/nearby/messages/internal/t$3;-><init>(Lcom/google/android/gms/nearby/messages/internal/t;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/nearby/messages/l;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method
